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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.polarsys.rover.client.ros.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PolarSysRoverClientRosFactoryImpl extends EFactoryImpl implements PolarSysRoverClientRosFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PolarSysRoverClientRosFactory init() {
		try {
			PolarSysRoverClientRosFactory thePolarSysRoverClientRosFactory = (PolarSysRoverClientRosFactory)EPackage.Registry.INSTANCE.getEFactory(PolarSysRoverClientRosPackage.eNS_URI);
			if (thePolarSysRoverClientRosFactory != null) {
				return thePolarSysRoverClientRosFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PolarSysRoverClientRosFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolarSysRoverClientRosFactoryImpl() {
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
			case PolarSysRoverClientRosPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_ROS: return createPolarSysRoverPlatformClientRos();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolarSysRoverPlatformClientRos createPolarSysRoverPlatformClientRos() {
		PolarSysRoverPlatformClientRosImpl polarSysRoverPlatformClientRos = new PolarSysRoverPlatformClientRosImpl();
		return polarSysRoverPlatformClientRos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolarSysRoverClientRosPackage getPolarSysRoverClientRosPackage() {
		return (PolarSysRoverClientRosPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PolarSysRoverClientRosPackage getPackage() {
		return PolarSysRoverClientRosPackage.eINSTANCE;
	}

} //PolarSysRoverClientRosFactoryImpl
