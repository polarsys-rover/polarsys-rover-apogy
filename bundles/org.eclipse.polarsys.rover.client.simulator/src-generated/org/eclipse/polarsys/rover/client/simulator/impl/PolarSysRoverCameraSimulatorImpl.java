/**
 * Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Olivier L. Larouche (Olivier.llarouche@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */
package org.eclipse.polarsys.rover.client.simulator.impl;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Date;
import java.util.Random;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.polarsys.rover.client.impl.PolarSysCameraImpl;
import org.eclipse.polarsys.rover.client.simulator.Activator;
import org.eclipse.polarsys.rover.client.simulator.PolarSysRoverCameraSimulator;
import org.eclipse.polarsys.rover.client.simulator.PolarSysRoverClientSimulatorPackage;

import ca.gc.asc_csa.apogy.addons.sensors.SensorStatus;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ApogyAddonsSensorsFOVFacade;
import ca.gc.asc_csa.apogy.addons.sensors.fov.RectangularFrustrumFieldOfView;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.ApogyAddonsSensorsImagingFactory;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.ImageSnapshot;
import ca.gc.asc_csa.apogy.common.images.ApogyCommonImagesFactory;
import ca.gc.asc_csa.apogy.common.images.EImage;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Polar Sys Rover Camera Simulator</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PolarSysRoverCameraSimulatorImpl extends PolarSysCameraImpl implements PolarSysRoverCameraSimulator {
	
	/**
	 * This constant specifies the prefix that the target image files are
	 * expected to have; this is used in conjunction with other constants
	 * to define an expected series of image filenames, one of which is
	 * supposed to be extracted and returned whenever a snapshot is requested.
	 * 
	 * More specifically, the name of the image files should be in the format:
	 *  "<IMAGE_FNAME_PREFIX>fileCounter<IMAGE_FNAME_SUFFIX>"
	 *  where fileCounter is in [0,IMAGE_FNAME_MAX_NO]
	 *  
	 * @see #IMAGE_FNAME_SUFFIX
	 * @see #IMAGE_FNAME_MAX_NO
	 * @see #fileCounter
	 * @see #takeImage()
	 */
	protected static final String IMAGE_FNAME_PREFIX = "image_";
	
	/**
	 * This constant specifies the suffix that the target image files are
	 * expected to have; this is used in conjunction with other constants
	 * to define an expected series of image filenames, one of which is
	 * supposed to be extracted and returned whenever a snapshot is requested.
	 * 
	 * More specifically, the name of the image files should be in the format:
	 *  "<IMAGE_FNAME_PREFIX>fileCounter<IMAGE_FNAME_SUFFIX>"
	 *  where fileCounter is in [0,IMAGE_FNAME_MAX_NO]
	 *  
	 * @see #IMAGE_FNAME_PREFIX
	 * @see #IMAGE_FNAME_MAX_NO
	 * @see #fileCounter
	 * @see #takeImage()
	 */
	protected static final String IMAGE_FNAME_SUFFIX = ".jpg";
	
	/**
	 * This constant specifies the largest number that fileCounter can be;
	 * this is used to conjunction with other constants to define an
	 * expected series of image filenames, one of which is supposed to be
	 * extracted and returned whenever a snapshot is requested.
	 * 
	 * More specifically, the name of the image files should be in the format:
	 * 	"<IMAGE_FNAME_PREFIX>fileCounter<IMAGE_FNAME_SUFFIX>"
	 * where fileCounter is in [0,IMAGE_FNAME_MAX_NO]
	 * 
	 * @see #IMAGE_FNAME_PREFIX
	 * @see #IMAGE_FNAME_SUFFIX
	 * @see #fileCounter
	 * @see #takeImage()
	 */
	protected static final int IMAGE_FNAME_MAX_NO = 71;
	
	/**
	 * This constant specifies the directory in the (local) plugin
	 * that the images (as explained in the description of IMAGE_FNAME_MAX_NO
	 * and other constants) are expected to reside.  This is then used in
	 * IMAGE_DIR_URL to comprise the complete URL to the image directory,
	 * from which one of the image files is selected when a snapshot is requested.
	 * @see #IMAGE_FNAME_MAX_NO
	 * @see #IMAGE_DIR_URL
	 * @see #takeImage()
	 */
	protected static final String IMAGE_DIR = "/images/";
	
	/**
	 * This constant specifies the entire URL to the image file directory,
	 * where image files with names matching the structure explained in
	 * IMAGE_FNAME_MAX_NO are expected to reside.  Both the image filename
	 * and this constant are then combined to obtain a path to the actual
	 * desired image file.
	 * @see #IMAGE_FNAME_MAX_NO
	 * @see #IMAGE_DIR
	 * @see #takeImage()
	 */
	protected static final String IMAGE_DIR_URL = "platform:/plugin/" +
													Activator.ID + IMAGE_DIR;
	
	/**
	 * This keeps track of the number of the next image file to
	 * extracted and returned when a snapshot is requested.  Note
	 * that this value will always be in the range [0,IMAGE_FNAME_MAX_NO].
	 * @see #IMAGE_FNAME_MAX_NO
	 * @see #takeImage()
	 */
	protected int fileCounter = -1;
	
	/**
	 * This constant specifies the maximum horizontal size (in degrees)
	 * of the rectangular frustrum field of view.
	 * @see #MAXIMUM_VERTICAL_FOV_DEGREES
	 * @see #calculateHorizontalFOVAngle()
	 * @see #updateFov()
	 */
	protected static final double MAXIMUM_HORIZONTAL_FOV_DEGREES = 45;
	
	/**
	 * This constant specifies the maximum vertical size (in degrees)
	 * of the rectangular frustrum field of view.
	 * @see #MAXIMUM_HORIZONTAL_FOV_DEGREES
	 * @see #calculateVerticalFOVAngle()
	 * @see #updateFov()
	 */
	protected static final double MAXIMUM_VERTICAL_FOV_DEGREES = 33.75;
	
	/**
	 * This constant specified the default minimum range for the camera's
	 * field of view (FOV).
	 * <p>
	 * Note: This will be used to construct a rectangular frustrum FOV ONLY
	 * if there is no other field of view provided (i.e. it's null) and
	 * getFov() is called.
	 * @see #getFov()
	 */
	protected static final double FOV_DEF_MINIMUM_RANGE = 0.0;
	
	/**
	 * This constant specified the default maximum range for the camera's
	 * field of view (FOV).
	 * <p>
	 * Note: This will be used to construct a rectangular frustrum FOV ONLY
	 * if there is no other field of view provided (i.e. it's null) and
	 * getFov() is called.
	 * @see #getFov()
	 */
	protected static final double FOV_DEF_MAXIMUM_RANGE = 10.0;
	
	protected Job imageStreamingJob = null;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolarSysRoverCameraSimulatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolarSysRoverClientSimulatorPackage.Literals.POLAR_SYS_ROVER_CAMERA_SIMULATOR;
	}

	@Override
	public boolean init() {
		String logPrefix = this.getClass().getSimpleName() + ".init(): ";

		// If the camera has already been initialized
		if (this.isInitialized() == true) {
			// Log this fact
			String message = logPrefix + "Ignored; init() has already been successfully called.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.WARNING);

			// Indicate that the camera was already initialized
			return true;
		}
		// Otherwise, the camera hasn't been initialized yet
		else {
			// Perform the required operations

			// Indicate the camera is now ready
			setStatus(SensorStatus.READY);

			// Log the successful init()
			String message = logPrefix + "The camera has been initialized.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);

			// Indicate that the camera has now been initialized
			this.setInitialized(true);

			// Return true
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_not
	 */
	public boolean commandStreaming(boolean streamingEnabled) {
		String logPrefix = this.getClass().getSimpleName() + ".commandStreaming(" + streamingEnabled + "): ";

		// If streaming is now enabled and we were previously enabled
		if (!this.isStreamingEnabled() && streamingEnabled) {
			// We are enabling
			this.setStreamingEnabled(true);

			// Schedule the job to run
			getImageStreamingJob().schedule();

			// Log this event
			String message = logPrefix + "The streaming for the camera has now been activated.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);

			// Return true
			return true;
		}
		// Else if streaming is now disabled and we were previously disabled
		else if (this.isStreamingEnabled() && !streamingEnabled) {
			// We are disabling.
			this.setStreamingEnabled(false);

			// Reset the job.
			imageStreamingJob = null;

			// Log this event
			String message = logPrefix + "The streaming for the camera has now been deactivated.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);

			// Return true
			return true;
		}
		// Else we are already in the commanded mode
		else {
			// Just return false
			return false;
		}
	}
	
	/**
	 * This private helper method is used to generate an image for use in snapshots
	 * (takeSnapshot() in particular.)
	 * 
	 * Note: As this is a virtual camera, the camera will not actually take a picture
	 * of its virtual environment; instead, it will use one of the preexisting photos
	 * in the plugin (located in the IMAGE_DIR directory.)  As a result, the images
	 * returned from this have no resemblance to the camera in its virtual environment.
	 * @return An image representing one of the pictures in the plugin
	 */
	private EImage takeImage()
	{ 
		InputStream inputStream = null;
		BufferedImage bufferedImage = null;
		
		// If the file counter has not been initialize, initialize it.
		if(fileCounter < 0) fileCounter = initializeFileCounter();
		
		// Get the filename of the image that it to be returned
		String imageFilename = IMAGE_FNAME_PREFIX + this.fileCounter + IMAGE_FNAME_SUFFIX; 
					
		try 
		{
			// Get a URL pointing to the location of the image file
			URL url = new URL(IMAGE_DIR_URL + imageFilename);
				
			// Open to a connection to that URL and get a stream for reading
		    inputStream = url.openConnection().getInputStream();
			    
		    // Read an image from the given URL
		    bufferedImage = javax.imageio.ImageIO.read(inputStream);
		    
		    // The image was read successfully; move to the next image file
			this.fileCounter++;
			
			// If the counter would go to an image that doesn't exist 
			if (this.fileCounter > IMAGE_FNAME_MAX_NO)
			{
				// Restart at 0
				this.fileCounter = 0;
			}
		}
		catch (IOException ex) 
		{
			// Print out the stack trace
			ex.printStackTrace();
		}
		finally
		{
			// If the file was actually opened for reading
			if (inputStream != null)
			{
				try
				{
					// Close it
					inputStream.close();
				}
				catch (IOException ex)
				{
					// Print out the stack trace
					ex.printStackTrace();
				}
			}
		}
		
		// Create an EImage and use the extracted BufferedImage (if the read was successful)
		EImage image = ApogyCommonImagesFactory.eINSTANCE.createEImage();
		image.setImageContent(bufferedImage);
				
		// Return the new EImage
		return image;
	}
	
	/**
	 * This method is used to order the camera to take and return a snapshot.
	 * Note that as this is a virtual implementation, the image component of
	 * the snapshot will be a one of a series of preexisting photos.
	 * @return A snapshot taken by the camera.
	 * @generated_NOT
	 */
	public ImageSnapshot takeSnapshot() 
	{
		String logPrefix = this.getClass().getSimpleName() + ".takeSnapshot(): ";
		
		// If the camera has not been initialized yet
		if (this.isInitialized() == false)
		{
			// Generate the error message
			String message = logPrefix + "Rejected; the camera is not initialized (with init()).";
			
			// Throw an exception to indicate that the operation has failed; this will
			// be caught and logged by Apogy
			throw new RuntimeException(message);
		}
		// Get an image for the snapshot.  Note this image will NOT be generated live;
		// it is actually one of the images in the IMAGE_DIR directory of this plugin.
		EImage image = takeImage();
		
		// If there was a problem with the image content (e.g. couldn't be read from file) 
		if (image.getImageContent() == null)
		{
			// Generate the error message
			String message = this.getClass().getSimpleName() +
					".takeSnapshot(): There was a problem retrieving the image for the snapshot;" +
					" most likely, the image file could not be located.";
			
			// Throw an exception to indicate that the operation has failed; this will
			// be caught and logged by Apogy
			throw new RuntimeException(message);
		}		
		// Otherwise, there actually was image content
		else
		{
			// Log this fact
			String message = this.getClass().getSimpleName() +
					".takeSnapshot(): The camera successfully took and returned a snapshot," +
					" as well as updated the latest image snapshot.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);

			// Create an image snapshot
			ImageSnapshot imageSnapshot = ApogyAddonsSensorsImagingFactory.eINSTANCE.createImageSnapshot();
			
			// Set the time of the snapshot to the current date and time
			imageSnapshot.setTime(new Date());
					
			// Save a copy of the current field of view
			imageSnapshot.setFieldOfView(ApogyAddonsSensorsFOVFacade.INSTANCE.createRectangularFrustrumFieldOfView(getFieldOfView()));
						
			// Save the image in the snapshot
			imageSnapshot.setImage(image);
			
			// Update latest snapshot accordingly
			this.setLatestImageSnapshot(imageSnapshot);
			System.out.println("TakeSnapshot6");
			// Return the generated snapshot
			return imageSnapshot;
		}
	}

	/**
	 * This method is used to randomize the number of the image
	 * @return a random number from 0 to a set maximum
	 */
	private int initializeFileCounter()
	{
		Random random = new Random(System.currentTimeMillis());
		
		int fileCounter = (int) Math.floor((random.nextDouble() * IMAGE_FNAME_MAX_NO));
		if(fileCounter < 0) fileCounter = 0;
		if(fileCounter > IMAGE_FNAME_MAX_NO) fileCounter = IMAGE_FNAME_MAX_NO;
				
		
		return fileCounter;
	}
	
	/**
	 * This method creates a job that takes a snapshot every second to simulate a video stream
	 * @return a job taking snapshot every 1 second
	 */
	private Job getImageStreamingJob() 
	{
		if(imageStreamingJob == null)
		{
			imageStreamingJob = new Job("Image Streaming") 
			{
				
				@Override
				protected IStatus run(IProgressMonitor monitor) 
				{	
					
					while(isStreamingEnabled())
					{
						// Acquire an image.
						takeSnapshot();
						
						try 
						{
							Thread.sleep(1000);
						} 
						catch (InterruptedException e) 
						{						
							e.printStackTrace();
						}
					}
					
					return Status.OK_STATUS;
				}
			};
		}
		return imageStreamingJob;
	}
	


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public RectangularFrustrumFieldOfView getFieldOfView() {
		return this.getFov();
	}
	
	/**
	 * This is a slightly different implementation of getFov();
	 * in this version, if the field of view (FOV) is not present
	 * (i.e. it's null), one will automatically be created and updated.
	 * If it is present, then this will just return it.
	 * @return The camera's rectangular FOV
	 * @generated_NOT
	 */
	@Override
	public RectangularFrustrumFieldOfView getFov()
	{
		// Call the super class's (basic) version
		RectangularFrustrumFieldOfView tmp = super.getFov();
	  
		// If there currently is no FOV
		if(tmp == null)
		{
			// Create one with certain default parameters
			tmp = ApogyAddonsSensorsFOVFacade.INSTANCE.createRectangularFrustrumFieldOfView(FOV_DEF_MINIMUM_RANGE,
																		  FOV_DEF_MAXIMUM_RANGE,
																		  calculateHorizontalFOVAngle(),
																		  calculateVerticalFOVAngle());
			// Set it as the camera's FOV
			setFov(tmp);
		}
		
		// Return the camera's field of view
		return tmp;
	}
	
	/**
	 * This is a slightly different implementation of setFov();
	 * in this version, the field of view (FOV) angles are updated,
	 * in accordance with the current zoom level, whenever this is
	 * set.
	 * @param newFov The camera's new rectangular FOV
	 * @generated_NOT
	 */
	@Override
	public void setFov(RectangularFrustrumFieldOfView newFov)
	{
		// Call the superclass's version (required to handle notifications)
		super.setFov(newFov);
		
		// Update the angles of the FOV, given the current zoom level
		this.updateFov();
	}
	
	
	protected double calculateHorizontalFOVAngle()
	{
		// Calculate and return the horizontal FOV angle
		return Math.toRadians(MAXIMUM_HORIZONTAL_FOV_DEGREES);
	}

	/**
	 * This helper method is used to calculated the vertical angle (in
	 * radians) of the field of view.  This calculation is based on both
	 * the current zoom level (which is in [getMinimumZoom(), getMaximumZoom()])
	 * as well as a constant specifying the maximum vertical angle.
	 * @return The vertical field of view angle (in radians)
	 * @see #calculateHorizontalFOVAngle()
	 * @see #updateFov()
	 */
	protected double calculateVerticalFOVAngle()
	{
		// Calculate and return the vertical FOV angle
		return Math.toRadians(MAXIMUM_VERTICAL_FOV_DEGREES);
	}
	
	/**
	 * This helper method is used to update the both the horizontal and
	 * vertical angles (in radians) of the rectangular frustrum field of view,
	 * based on the current level of zoom.
	 * @see #calculateHorizontalFOVAngle()
	 * @see #calculateVerticalFOVAngle()
	 */
	protected void updateFov()
	{
		// Calculate the new field of view (FOV) angles and
		// update the FOV accordingly.
		getFov().setHorizontalFieldOfViewAngle(calculateHorizontalFOVAngle());
		getFov().setVerticalFieldOfViewAngle(calculateVerticalFOVAngle());
	}

} //PolarSysRoverCameraSimulatorImpl
