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
import org.eclipse.polarsys.rover.client.impl.PolarSysRoverPlatformClientImpl;
import org.eclipse.polarsys.rover.client.ros.PolarSysRoverClientRos;
import org.eclipse.polarsys.rover.client.ros.PolarSysRoverClientRosPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Polar Sys Rover Client Ros</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PolarSysRoverClientRosImpl extends PolarSysRoverPlatformClientImpl implements PolarSysRoverClientRos {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolarSysRoverClientRosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolarSysRoverClientRosPackage.Literals.POLAR_SYS_ROVER_CLIENT_ROS;
	}

	@Override
	public boolean init() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void cmdVelocities(double linearVelocity, double angularVelocity) {
		// TODO Auto-generated method stub
		
	}

} //PolarSysRoverClientRosImpl
