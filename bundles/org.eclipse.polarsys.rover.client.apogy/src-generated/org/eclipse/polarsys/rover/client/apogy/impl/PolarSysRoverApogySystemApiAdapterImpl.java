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
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */
package org.eclipse.polarsys.rover.client.apogy.impl;

import javax.vecmath.Matrix4d;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.polarsys.rover.client.PolarSysRoverClient;
import org.eclipse.polarsys.rover.client.apogy.PolarSysRoverApogySystemApiAdapter;
import org.eclipse.polarsys.rover.client.apogy.PolarSysRoverClientApogyFactory;
import org.eclipse.polarsys.rover.client.apogy.PolarSysRoverClientApogyPackage;
import org.eclipse.polarsys.rover.client.apogy.PolarSysRoverData;

import ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehicleFactory;
import ca.gc.asc_csa.apogy.addons.vehicle.VehiclePoseCorrector;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade;
import ca.gc.asc_csa.apogy.common.math.Matrix4x4;
import ca.gc.asc_csa.apogy.core.impl.ApogySystemApiAdapterImpl;
import ca.gc.asc_csa.apogy.core.invocator.AbstractInitializationData;
import ca.gc.asc_csa.apogy.core.invocator.Environment;
import ca.gc.asc_csa.apogy.core.invocator.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Polar Sys Rover Apogy System Api Adapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PolarSysRoverApogySystemApiAdapterImpl extends ApogySystemApiAdapterImpl implements PolarSysRoverApogySystemApiAdapter 
{
	/**
	 * This is the adapter used to receive notifications to the
	 * changes in the PolarSys pose.
	 */
	private Adapter poseAdapter = null;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolarSysRoverApogySystemApiAdapterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolarSysRoverClientApogyPackage.Literals.POLAR_SYS_ROVER_APOGY_SYSTEM_API_ADAPTER;
	}
	
	/**
	 * Utility method that return the PolarSysRoverClient currently managed by this PolarSysRoverApogySystemApiAdapter.
	 * @return The PolarSysRoverClient.
	 */
	protected PolarSysRoverClient getPolarSysRoverClient()
	{
		return (PolarSysRoverClient) getInstance();				
	}
	
	/**
	 * This is the callback method that is called by the API adapter
	 * when the mobile platform instance is being initialized by Apogy.
	 * 
	 * @param environment The environment in which Apogy and its components are operating.
	 * @param elementType The type (e.g. class) of the given instance.
	 * @param instance The instance which is being handled by this API adapter.
	 */
	@Override
	public void init(Environment environment, Type elementType, EObject instance)
	{
		// Call the superclass's version of this method
		super.init(environment, elementType, instance);

		// Create the position adapter
		this.poseAdapter = new PoseAdapter(this);
		
		// Add the position adapter to the PolarSys rover  
		this.getPolarSysRoverClient().eAdapters().add(this.poseAdapter);

		// Create a vehicle pose corrector to perform the required changes to update the pose of the PolarSys rover
		VehiclePoseCorrector corrector = ApogyAddonsVehicleFactory.eINSTANCE.createVehiclePoseCorrector();
		
		// Indicate that the corrector is using wheels when determining contact points
		corrector.setContactProvider(ApogyAddonsVehicleFactory.eINSTANCE.createWheelContactProvider());
		
		// Set the pose corrector for the mobile platform
		setPoseCorrector(corrector);		
	}
	
	@Override
	public void dispose() 
	{
		// If the PolarSys instance has been created.
		if(getPolarSysRoverClient() != null)
		{
			// Remove the position adapter from the mobile platform
			this.getPolarSysRoverClient().eAdapters().remove(this.poseAdapter);
			
			// Put other cleanup code here.
		}
		
		// Removes the pose corrector from the API adapter
		setPoseCorrector(null);
		
		// Call the superclass's version of this method 
		super.dispose();
	}
	
	/**
	 * This is a factory method that can be used to generate
	 * initialization data instances of an appropriate type
	 * for this adapter.
	 * 
	 * @return The newly created initialization data object
	 */
	@Override
	public AbstractInitializationData createInitializationData() 
	{
		return PolarSysRoverClientApogyFactory.eINSTANCE.createPolarSysRoverData();
	}
	
	@Override
	public void collect(AbstractInitializationData initializationData) 
	{
		// Call the superclass's version of this method
		super.collect(initializationData);
		
		if(initializationData instanceof PolarSysRoverData)
		{
			// TODO Collect PolarSys Rover specific initialization data.
		}
	}
	
	@Override
	public void apply(AbstractInitializationData initializationData) 
	{	
		// Call the superclass's version of this method
		super.apply(initializationData);
		
		if(initializationData instanceof PolarSysRoverData)
		{
			// TODO Apply PolarSys Rover specific initialization data.
		}
	}
	
	/**
	 * This class is an adapter which is specialized to check
	 * for changes to the PolarSys rover instance's pose.
	 */
	class PoseAdapter extends AdapterImpl
	{
		/**
		 * The PolarSysRoverApogySystemApiAdapter managing the PolarSys rover.
		 */
		private PolarSysRoverApogySystemApiAdapter polarSysRoverApogySystemApiAdapter;
		
		public PoseAdapter(PolarSysRoverApogySystemApiAdapter polarSysRoverApogySystemApiAdapter)
		{
			this.polarSysRoverApogySystemApiAdapter = polarSysRoverApogySystemApiAdapter; 
		}
		
		@Override
		public void notifyChanged(Notification msg) 
		{			
			try
			{				
				if(msg.getNotifier() instanceof PolarSysRoverClient)
				{
					int featureID = msg.getFeatureID(PolarSysRoverClient.class);
					// TODO : Update pose when the rover pose changes.
				}
			}
			catch(Throwable t)
			{
				t.printStackTrace();
			}
		}
		
		/**
		 * This private helper method is used to update the pose
		 * transform of the API adapter which is associated to the
		 * PolarSys rover instance which raised the notification. 
		 * @param position The new position of the mobile platform instance
		 */
		private void updatePose() 
		{
			// TODO : Fill matrix m with the pose of the PolarSys rover.
			Matrix4d m = new Matrix4d();
			m.setIdentity();
			
			// Create a EObject wrapper for the matrix
			Matrix4x4 matrix = ApogyCommonMathFacade.INSTANCE.createMatrix4x4(m);
			
			// Update the API Adapter's pose transform accordingly,
			// which is ultimately the transform at the root of the
			// instance's topology.
			this.polarSysRoverApogySystemApiAdapter.setPoseTransform(matrix);
		}
	}
} //PolarSysRoverApogySystemApiAdapterImpl
