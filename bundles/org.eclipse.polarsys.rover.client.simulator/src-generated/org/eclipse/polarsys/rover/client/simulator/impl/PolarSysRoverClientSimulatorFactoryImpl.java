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
package org.eclipse.polarsys.rover.client.simulator.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.polarsys.rover.client.simulator.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PolarSysRoverClientSimulatorFactoryImpl extends EFactoryImpl implements PolarSysRoverClientSimulatorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PolarSysRoverClientSimulatorFactory init() {
		try {
			PolarSysRoverClientSimulatorFactory thePolarSysRoverClientSimulatorFactory = (PolarSysRoverClientSimulatorFactory)EPackage.Registry.INSTANCE.getEFactory(PolarSysRoverClientSimulatorPackage.eNS_URI);
			if (thePolarSysRoverClientSimulatorFactory != null) {
				return thePolarSysRoverClientSimulatorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PolarSysRoverClientSimulatorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolarSysRoverClientSimulatorFactoryImpl() {
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
			case PolarSysRoverClientSimulatorPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR: return createPolarSysRoverPlatformClientSimulator();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolarSysRoverPlatformClientSimulator createPolarSysRoverPlatformClientSimulator() {
		PolarSysRoverPlatformClientSimulatorImpl polarSysRoverPlatformClientSimulator = new PolarSysRoverPlatformClientSimulatorImpl();
		return polarSysRoverPlatformClientSimulator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolarSysRoverClientSimulatorPackage getPolarSysRoverClientSimulatorPackage() {
		return (PolarSysRoverClientSimulatorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PolarSysRoverClientSimulatorPackage getPackage() {
		return PolarSysRoverClientSimulatorPackage.eINSTANCE;
	}

} //PolarSysRoverClientSimulatorFactoryImpl
