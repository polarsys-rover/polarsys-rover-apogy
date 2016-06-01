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
package org.eclipse.polarsys.rover.client.mqtt.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.polarsys.rover.client.Position;
import org.eclipse.polarsys.rover.client.impl.PolarSysRoverPlatformClientImpl;
import org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverPlatformClientMqtt;
import org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverClientMqttPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Polar Sys Rover Client Mqtt</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PolarSysRoverPlatformClientMqttImpl extends PolarSysRoverPlatformClientImpl implements PolarSysRoverPlatformClientMqtt {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolarSysRoverPlatformClientMqttImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolarSysRoverClientMqttPackage.Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT;
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

} //PolarSysRoverClientMqttImpl
