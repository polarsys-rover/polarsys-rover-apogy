/**
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */
package org.eclipse.polarsys.rover.client.simulator.impl;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.polarsys.rover.client.PolarSysRoverClientFactory;
import org.eclipse.polarsys.rover.client.Position;
import org.eclipse.polarsys.rover.client.impl.PolarSysRoverPlatformClientImpl;
import org.eclipse.polarsys.rover.client.simulator.Activator;
import org.eclipse.polarsys.rover.client.simulator.PolarSysRoverPlatformClientSimulator;
import org.eclipse.polarsys.rover.client.simulator.PolarSysRoverClientSimulatorPackage;

import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Polar Sys Rover Client Simulator</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.polarsys.rover.client.simulator.impl.PolarSysRoverPlatformClientSimulatorImpl#getDegreeSYM <em>Degree SYM</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PolarSysRoverPlatformClientSimulatorImpl extends PolarSysRoverPlatformClientImpl
		implements PolarSysRoverPlatformClientSimulator {

	/**
	 * The default value of the '{@link #getDegreeSYM() <em>Degree SYM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegreeSYM()
	 * @generated
	 * @ordered
	 */
	protected static final String DEGREE_SYM_EDEFAULT = "\u00b0";

	/**
	 * The cached value of the '{@link #getDegreeSYM() <em>Degree SYM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegreeSYM()
	 * @generated
	 * @ordered
	 */
	protected String degreeSYM = DEGREE_SYM_EDEFAULT;
	

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	/**
	 * This is the job used to handle moving the mobile platform
	 */
	private CmdPowerLevelJob cmdPowerLevelJob;

	/**
	 * This is used to stop concurrent R/W access to the platform's relevant
	 * fields
	 */
	private final Lock lock;

	/**
	 * This is used to keep track of whether or not the mobile platform in the
	 * midst of a moveTo()
	 */
	private boolean doingMoveTo;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	protected PolarSysRoverPlatformClientSimulatorImpl() {
		super();

		// Initialize the lock
		this.lock = new ReentrantLock();

		// Initialize the move job
		this.cmdPowerLevelJob = null;

		// Initialize whether or not the mobile platform is doing an explicit
		// move
		this.doingMoveTo = false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolarSysRoverClientSimulatorPackage.Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDegreeSYM() {
		return degreeSYM;
	}
	
	
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PolarSysRoverClientSimulatorPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__DEGREE_SYM:
				return getDegreeSYM();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PolarSysRoverClientSimulatorPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__DEGREE_SYM:
				return DEGREE_SYM_EDEFAULT == null ? degreeSYM != null : !DEGREE_SYM_EDEFAULT.equals(degreeSYM);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (degreeSYM: ");
		result.append(degreeSYM);
		result.append(')');
		return result.toString();
	}

	@Override
	public boolean init() {
		final String LOG_PREFIX = this.getClass().getSimpleName() + ".init(): ";
		
		super.init();

		// If the mobile platform has already been disposed
		if (this.isDisposed() == true) {
			// Log this event
			String message = LOG_PREFIX + "Rejected; the mobile platform has "
					+ "already been dprivate Job moveJob;isposed (with dispose()).";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.ERROR);

			// Indicate that it wasn't initialized
			return false;
		}
		// Otherwise, if the mobile platform has already been initialized
		else if (this.isInitialized() == true) {
			// Log this event
			String message = LOG_PREFIX + "Ignored; the mobile platform has "
					+ "already been initialized (with init()).";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.WARNING);

			// Indicate that it was already initialized
			return true;
		} else {
			// Log the start of the initialization process
			String message = LOG_PREFIX + "Mobile platform initialization started.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);

			// Perform the required initialization

			// All of the subcomponents were initialized

			// Perform whatever initialization needs to be done for the mobile
			// platform

			// Create and schedule the mobile platform's move job
			this.cmdPowerLevelJob = new CmdPowerLevelJob(this, "Mobile Platform Move Job");
			this.cmdPowerLevelJob.schedule();

			// Indicate the success of the initialization
			this.setInitialized(true);

			// Log this successful completion of the initialization process
			message = LOG_PREFIX + "Mobile platform initialization complete.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
						
			// Initialize the camera
			setFrontCamera(new PolarSysRoverCameraSimulatorImpl());
			frontCamera.init();
			
			// Start the random sonar
			Timer timer = new Timer();

			timer.schedule(new TimerTask() {
				@Override
				public void run() {
					setFrontSonar((int)(Math.random() * 100));  
				}
			}, 500, 1000);

			
			// Just return true
			return true;		
		}
	}

	/**
	 * The operation is used to change the mobile platform's linear and
	 * angular velocities, which are in metres / second and radians / second,
	 * respectively.
	 * <p>
	 * Note 1: Unlike the traditional definition of linear velocity as a vector,
	 * this is simply a signed scalar; a positive value indicates the speed
	 * forward while a negative value is the speed backwards.  Zero means there
	 * is no movement.
	 * <p>
	 * Note 2: Unlike the traditional definition of angular velocity as a vector,
	 * this is simply a signed scalar; a positive value is the rotation in the
	 * clockwise direction while a negative value implies the rotation is in the
	 * counter-clockwise direction.  Zero means there is no rotation.
	 * 
	 * @param linearVelocity The commanded linear velocity.
	 * @param angularVelocity The commanded angular velocity.
	 * @see #cmdLinearVelocity(double)
	 * @see #cmdAngularVelocity(double)
	 * @generated_NOT
	 */
	

	@Override
	public void cmdVelocities(double linearVelocity,
							  double angularVelocity)
	{
		final String LOG_PREFIX = this.getClass().getSimpleName() +
									".cmdVelocities(" + linearVelocity + ", " +
									Math.toDegrees(angularVelocity) +
									"(" + DEGREE_SYM_EDEFAULT + "/s)): ";
		// If the mobile platform has been disposed
		if (this.isDisposed() == true)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the mobile platform has already " +
								"been disposed (with dispose()).";
			
			// Throw an exception to indicate that the operation has failed; this will
			// be caught and logged by Apogy
			throw new RuntimeException(message);
		}
		// Otherwise, if the mobile platform has not been initialized
		else if (this.isInitialized() == false)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the mobile platform is not " +
								"initialized (with init()).";
			
			// Throw an exception to indicate that the operation has failed; this will
			// be caught and logged by Apogy
			throw new RuntimeException(message);
		}
		// Otherwise, the platform is initialized and not yet disposed
		else
		{
			// Acquire the internal lock
			this.lock.lock();
		
				
			// Set power levels using the resolved skid steering model equations
			// Power left = Linear velocity + (Angular velocity * Distance between the wheels) / 2
			// Power right = LInear velocity - (Angular velocity * Distance between the wheels) / 2
			if(linearVelocity >= 0){
				this.setLeftPowerLevel(maxPowerLevel* linearVelocity / maxLinVelocity
						+ (this.distanceBetweenWheels * maxPowerLevel * angularVelocity / maxAngVelocity / 2));
				this.setRightPowerLevel(maxPowerLevel * linearVelocity / maxLinVelocity
						- (this.distanceBetweenWheels * maxPowerLevel * angularVelocity / maxAngVelocity / 2));  
			}
			// Otherwise, if the linear velocity is negative, the angular velocity changes sign
			else{
				this.setLeftPowerLevel(maxPowerLevel * linearVelocity / maxLinVelocity
						- (this.distanceBetweenWheels * maxPowerLevel * angularVelocity / maxAngVelocity / 2));
				this.setRightPowerLevel(maxPowerLevel * linearVelocity / maxLinVelocity
						+ (this.distanceBetweenWheels * maxPowerLevel * angularVelocity / maxAngVelocity / 2)); 
			}
				
			
			// Release the internal lock
			this.lock.unlock();
		}
	}
	

	/**
	 * This operation is used to clear the mobile platform's positional
	 * error; this could be used to indicate that all error should now
	 * be taken in respect to the robot's current position.
	 * 
	 * @generated_NOT
	 */
	@Override
	public void stop()
	{
		final String LOG_PREFIX = this.getClass().getSimpleName() +
									".stop(): ";
		
		// If the mobile platform has already been disposed
		if (this.isDisposed() == true)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the mobile platform has already " +
								"been disposed (with dispose()).";
			
			// Throw an exception to indicate that the operation has failed; this will
			// be caught and logged by Apogy
			throw new RuntimeException(message);
		}
		// Otherwise if the mobile platform has not been initialized
		else if (this.isInitialized() == false)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the mobile platform is not " +
								"initialized (with init()).";
			
			// Throw an exception to indicate that the operation has failed; this will
			// be caught and logged by Apogy
			throw new RuntimeException(message);
		}
		// Otherwise, the platform should stop
		else
		{
			// Log this event
			String message = LOG_PREFIX +
								"The mobile platform is stopping.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
			
			// Acquire the internal lock
			this.lock.lock();
			
			// Change both the left and right power levels to 0
			this.setLeftPowerLevel(0.0);
			this.setRightPowerLevel(0.0);
				
			// Release the internal lock
			this.lock.unlock();
		}
	}

	/**
	 * This operation is used to change the mobile platform to
	 * have the coordinates and pose matching the given position.
	 * That new position will be considered the new starting place
	 * for the mobile platform and as such, the accumulated error will
	 * be cleared; all error will be relative to that new position.
	 * 
	 * @param position The mobile platform's new desired position
	 * @generated_NOT
	 */
	@Override
	public void clearPositionError()
	{
		final String LOG_PREFIX = this.getClass().getSimpleName() + 
									".clearPositionError(): ";
		
		// If the mobile platform has already been disposed
		if (this.isDisposed() == true)
		{
			// Generate the error message
			String message = LOG_PREFIX + 
								"Rejected; the mobile platform has already " +
								"been disposed (with dispose()).";
			
			// Throw an exception to indicate that the operation has failed; this will
			// be caught and logged by Apogy
			throw new RuntimeException(message);
		}
		// Otherwise if the mobile platform has not been initialized
		else if (this.isInitialized() == false)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the mobile platform is not " + 
								"initialized (with init()).";
			
			// Throw an exception to indicate that the operation has failed; this will
			// be caught and logged by Apogy
			throw new RuntimeException(message);
		}
		// Otherwise, the error in position can be cleared
		else
		{
			// Log this event
			String message = LOG_PREFIX +
								"The mobile platform's position error " +
								"has been cleared.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
			
			// Acquire the internal lock
			this.lock.lock();
			
			// Clear the platform's position error
			this.setPositionError(0.0);
			
			// Release the value lock
			this.lock.unlock();
		}	
	}


	/**
	 * This operation is used to change the mobile platform to
	 * have the coordinates and pose matching the given position.
	 * That new position will be considered the new starting place
	 * for the mobile platform and as such, the accumulated error will
	 * be cleared; all error will be relative to that new position.
	 * 
	 * @param position The mobile platform's new desired position
	 * @generated_NOT
	 */
	@Override
	public void resetPosition(Position position)
	{
		final String LOG_PREFIX = this.getClass().getSimpleName() +
									".resetPosition(Position(X=" + 
									position.getX() + ", Y=" + 
									position.getY() + ", Theta=" +
									Math.toDegrees(position.getTheta()) +
									DEGREE_SYM_EDEFAULT + ")): ";
		
		// If the mobile platform has already been disposed
		if (this.isDisposed() == true)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the mobile platform has already " +
								"been disposed (with dispose()).";
			
			// Throw an exception to indicate that the operation has failed; this will
			// be caught and logged by Apogy
			throw new RuntimeException(message);
		}
		// Otherwise, if the mobile platform has not been initialized
		else if (this.isInitialized() == false)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the mobile platform is not " +
								"initialized (with init()).";
			
			// Throw an exception to indicate that the operation has failed; this will
			// be caught and logged by Apogy
			throw new RuntimeException(message);
		}
		// Otherwise, the platform is initialized and not yet disposed
		else
		{
			// Acquire the internal lock
			this.lock.lock();
			
			// If there is currently a moveTo() taking place
			if (this.doingMoveTo == true)
			{
				// Just release the internal lock
				this.lock.unlock();
				
				// Generate the error message
				String message = LOG_PREFIX +
									"Rejected; the mobile platform is currently " +
									"in the midst of a moveTo() operation.";
				
				// Throw an exception to indicate that the operation has failed; this will
				// be caught and logged by Apogy
				throw new RuntimeException(message);
			}
			// Otherwise, there is no move operation in progress
			else
			{
				// Update the position
				this.setPosition(position);
				
				// Reset the position error
				this.setPositionError(0.0);
				
				// Release the internal lock
				this.lock.unlock();
				
				// Log that the position has been update and the error reset
				String message = LOG_PREFIX +
									"The mobile platform's position has been changed " +
									"accordingly and its position error has been reset.";
				Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
			}
		}
	}
	

	/**
	 * This class is used to facilitate the movement of the
	 * mobile platform, in cases other than moveTo().  In
	 * particular, while there is a linear and velocity are
	 * both not zero, it will move the platform, updating its
	 * location and pose accordingly to reflect the movement. 
	 */
	class CmdPowerLevelJob extends Job
	{
		/**
		 * This is the change in time (in seconds)
		 * between subsequent movement steps of the job
		 */
		private final static double DELTA_T = (((double)PolarSysRoverPlatformClientSimulatorImpl.MOVE_WAIT_PERIOD_EDEFAULT) / 1000.0);

		/**
		 * This is the platform upon which the movement
		 * job is being performed.
		 */
		private PolarSysRoverPlatformClientSimulatorImpl platform;
		
		/**
		 * This is the constructor for the MobilePlatformSimulatedMoveJob class
		 * and as such, it performs the required initialization operations.
		 * @param platform The platform which is to be moved
		 * @param name The name of the job (used by superclass)
		 */
		protected CmdPowerLevelJob(PolarSysRoverPlatformClientSimulatorImpl platform,
												 String name)
		{
			// Call the superclass's constructor
			super(name);
			
			// Keep track of the appropriate platform
			this.platform = platform;
		}
		
		/**
		 * This is where the actually movement of the mobile platform
		 * takes place.  As long as one of the platform's linear or
		 * angular velocity is non-zero, the platform will move, updating
		 * its position and various other values accordingly.
		 * 
		 * @param monitor This has many uses but here it is primarily used to check for cancellation..
		 * @return The status of the job when it returned.
		 */
		@Override
		protected IStatus run(IProgressMonitor monitor)
		{
			// While the job has not been cancelled.
			while (monitor.isCanceled() == false)
			{
				// Acquire the internal lock
				this.platform.lock.lock();
				
				// If there isn't a moveTo() command running
				// and either the platform's linear or angular
				// velocity is non-zero
				if ((this.platform.doingMoveTo == false) &&
					 ((this.platform.getLeftPowerLevel() != 0.0) ||
						(this.platform.getRightPowerLevel() != 0.0)))	 
						/*	 ((this.platform.getLinearVelocity() != 0.0) ||
					  (this.platform.getAngularVelocity() != 0.0)))*/
				{
					// Perform the move
					
					// Get the power levels
					double leftPow = this.platform.getLeftPowerLevel();
					double rightPow = this.platform.getRightPowerLevel();
					// Create the velocities for the simulator
					double linVel  = 0;
					double angVel = 0;
					
					// Set the linear velocities using the skid steering model equations
					// Linear velocity = (Right power + Left power) / 2
					// Angular velocity = (Right power - Left power) / Distance between the wheels
					linVel = (maxLinVelocity * rightPow / maxPowerLevel
								+ maxLinVelocity * leftPow / maxPowerLevel) / 2;
					angVel = (maxAngVelocity * rightPow / maxPowerLevel
								- maxAngVelocity * leftPow / maxPowerLevel) / distanceBetweenWheels;
													
					// Get all the values which need to be updated
					double newX = this.platform.getPosition().getX();
					double newY = this.platform.getPosition().getY();
					double newTheta = this.platform.getPosition().getTheta();
					
					double newLeftWheelPos = this.platform.getLeftWheelPosition();
					double newRightWheelPos = this.platform.getRightWheelPosition();
					
					double newPosError = this.platform.getPositionError();

					// Computes distance traveled during time interval,
					// which is based on the linear velocity and DELTA_T
					double displacement = linVel * DELTA_T;

					// Add an offset to the positional error,
					// which is dependent on the displacement (m) and
					// ERROR_PER_METER
					newPosError = newPosError + (Math.abs(displacement) *
							PolarSysRoverPlatformClientSimulatorImpl.ERROR_PER_METER_EDEFAULT);
					
					// Add a rotation angle to the theta,
					// which is based on the angular velocity and DELTA_T
					newTheta = newTheta + (angVel * DELTA_T);

					// Calculate offsets for the X and Y coordinates,
					// which are based on the displacement and angle.
					// Add the offsets to the current coords.
					newX = newX + (displacement * Math.cos(newTheta));
					newY = newY + (displacement * Math.sin(newTheta));
					
					// Extract the linear velocities of the wheels
					double rightWheelVel = (angVel *
											 (PolarSysRoverPlatformClientSimulatorImpl.WHEEL_TRACK_EDEFAULT / 2.0)) + linVel;
					double leftWheelVel = (2 * linVel) - rightWheelVel;

					// Get the wheels' angular velocities
					double rightWheelAngVel = (rightWheelVel / getWheelRadius());
					double leftWheelAngVel = (leftWheelVel / getWheelRadius());

					// Add a offset to the wheel positions,
					// which is dependent on the wheels' angular
					// velocities and DELTA_T 
					newLeftWheelPos = newLeftWheelPos + (DELTA_T * leftWheelAngVel);					
					newRightWheelPos = newRightWheelPos + (DELTA_T * rightWheelAngVel);				
					
					// Create a new position and populate it with new values
					Position newPosition = PolarSysRoverClientFactory.eINSTANCE
							.createPosition();
					newPosition.setX(newX);
					newPosition.setY(newY);
					newPosition.setTheta(newTheta);
					
					// Update the platform with the new values 
					this.platform.setPosition(newPosition);
					this.platform.setPositionError(newPosError);
					
					// Left Wheels
					this.platform.setLeftWheelPosition(newLeftWheelPos);
					
					// Right Wheels
					this.platform.setRightWheelPosition(newRightWheelPos);
				}
				
				// Release the internal lock
				this.platform.lock.unlock();
				
				try
				{
					// Sleep for a short period of time (this makes it far easier
					// to visualize and follow the movement of the mobile platform)
					Thread.sleep(PolarSysRoverPlatformClientSimulatorImpl.MOVE_WAIT_PERIOD_EDEFAULT);
				}
				catch (InterruptedException e)
				{
					// Print the stack trace
					e.printStackTrace();
				}
			}
			
			// Indicate that the job finished successfully
			return Status.OK_STATUS;
		}
	}

	/**
	 * This operation is used to dispose of the mobile platform
	 * and as such, it will perform the steps required to
	 * shutdown the platform and any resources it uses.  Note
	 * that implicitly, this means that the mobile platform won't
	 * be available after it has been disposed.
	 * 
	 * @generated_NOT
	 */
	@Override
	public void dispose()
	{
		final String LOG_PREFIX = this.getClass().getSimpleName() +
									".dispose(): ";
		
		// If the mobile platform has already been disposed
		if (this.isDisposed() == true)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Ignored; the mobile platform has already " +
								"been disposed (with dispose()).";
			
			// Throw an exception to indicate that the operation failed; this will
			// be caught and handled by Apogy
			throw new RuntimeException(message);
		}
		// Otherwise, the platform hasn't been disposed yet 
		else
		{
			// Perform the necessary disposal actions
			
			// Cancel the movement job
			if (cmdPowerLevelJob != null){
				this.cmdPowerLevelJob.cancel();
			}
			
			// Indicate that the mobile platform is now disposed
			this.setDisposed(true);
			
			// Log this event
			String message = LOG_PREFIX +
								"Mobile platform has been successfully disposed.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
		}
	}
	
	/** 
	 * The operation is used to change the power levels of the left and right wheels
	 * respectively.
	 * 
	 * @param leftPowerLevel The commanded left power level.
	 * @param rightPowerLevel The commanded right power level.
	 * @generated_NOT
	 */
	@Override
	public void cmdPowerLevel(double leftPowerLevel, double rightPowerLevel) {
		
		
		final String LOG_PREFIX = this.getClass().getSimpleName() + 
									".cmdPowerLevel( " + leftPowerLevel + ", " +
									rightPowerLevel + "):";
		
		// If the mobile platform has been disposed 
		if (this.isDisposed() == true){
			String message = LOG_PREFIX + 
								"Rejected; the mobile platform has already " +
								"been disposed (with dispose()).";
			
			// Throw an exception to indicate that the operation has failed; this will
			// be caught by Apogy
			throw new RuntimeException(message);
		}
		
		// Otherwise, if the mobile platform had not been initialized
		else if (this.isInitialized() == false) {
			String message = LOG_PREFIX + 
								"Rejected; the mobile platform is " +
								"not initialized (with init()).";

			// Throw an exception to indicate that the operation has failed;
			// this will be caught by Apogy
			throw new RuntimeException(message);
		}
		
		// Otherwise, the platform is initialized and not yet disposed 
		else{
			
			// Acquire the internal lock
			this.lock.lock();
			
			// Update the left power level proportionally to MAX/MIN power levels
			if(leftPowerLevel >=0){
				this.setLeftPowerLevel(maxPowerLevel*leftPowerLevel/maxCtrPowerLevel);
			}else{
				this.setLeftPowerLevel(-maxPowerLevel*leftPowerLevel/-maxCtrPowerLevel);
			}
			
			// Update the right power level proportionally to MAX/MIN power levels
			if(rightPowerLevel >=0){
				this.setRightPowerLevel(maxPowerLevel*rightPowerLevel/maxCtrPowerLevel);
			}else{
				this.setRightPowerLevel(maxPowerLevel*rightPowerLevel/maxCtrPowerLevel);
			}
								
			// Release the internal lock
			this.lock.unlock();
			
		}
	}
	
} // PolarSysRoverClientSimulatorImpl
