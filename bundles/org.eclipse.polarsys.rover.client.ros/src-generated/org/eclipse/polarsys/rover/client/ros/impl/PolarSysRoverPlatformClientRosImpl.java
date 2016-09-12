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
package org.eclipse.polarsys.rover.client.ros.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.polarsys.rover.client.Position;
import org.eclipse.polarsys.rover.client.impl.PolarSysRoverPlatformClientImpl;
import org.eclipse.polarsys.rover.client.ros.PolarSysRoverPlatformClientRos;
import org.eclipse.polarsys.rover.client.ros.PolarSysRoverClientRosPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Polar Sys Rover Client Ros</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PolarSysRoverPlatformClientRosImpl extends PolarSysRoverPlatformClientImpl implements PolarSysRoverPlatformClientRos {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolarSysRoverPlatformClientRosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolarSysRoverClientRosPackage.Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT_ROS;
	}

	@Override
	public boolean init() {
		return super.init();
	}

	@Override
	public void cmdVelocities(double linearVelocity, double angularVelocity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resetPosition(Position position) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clearPositionError() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cmdPowerLevel(double leftPowerLevel, double rightPowerLevel) {
		// TODO Auto-generated method stub
		
	}

} //PolarSysRoverClientRosImpl
