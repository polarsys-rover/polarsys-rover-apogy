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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.polarsys.rover.client.mqtt.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PolarSysRoverClientMqttFactoryImpl extends EFactoryImpl implements PolarSysRoverClientMqttFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PolarSysRoverClientMqttFactory init() {
		try {
			PolarSysRoverClientMqttFactory thePolarSysRoverClientMqttFactory = (PolarSysRoverClientMqttFactory)EPackage.Registry.INSTANCE.getEFactory(PolarSysRoverClientMqttPackage.eNS_URI);
			if (thePolarSysRoverClientMqttFactory != null) {
				return thePolarSysRoverClientMqttFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PolarSysRoverClientMqttFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolarSysRoverClientMqttFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PolarSysRoverClientMqttPackage.POLAR_SYS_ROVER_CLIENT_MQTT: return createPolarSysRoverClientMqtt();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolarSysRoverClientMqtt createPolarSysRoverClientMqtt() {
		PolarSysRoverClientMqttImpl polarSysRoverClientMqtt = new PolarSysRoverClientMqttImpl();
		return polarSysRoverClientMqtt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolarSysRoverClientMqttPackage getPolarSysRoverClientMqttPackage() {
		return (PolarSysRoverClientMqttPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PolarSysRoverClientMqttPackage getPackage() {
		return PolarSysRoverClientMqttPackage.eINSTANCE;
	}

} //PolarSysRoverClientMqttFactoryImpl
