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
 * 	Olivier L. Larouche (Olivier.llarouche@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */
package org.eclipse.polarsys.rover.client.ui.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.polarsys.rover.client.ui.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PolarSysRoverClientUIFactoryImpl extends EFactoryImpl implements PolarSysRoverClientUIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PolarSysRoverClientUIFactory init() {
		try {
			PolarSysRoverClientUIFactory thePolarSysRoverClientUIFactory = (PolarSysRoverClientUIFactory)EPackage.Registry.INSTANCE.getEFactory(PolarSysRoverClientUIPackage.eNS_URI);
			if (thePolarSysRoverClientUIFactory != null) {
				return thePolarSysRoverClientUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PolarSysRoverClientUIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolarSysRoverClientUIFactoryImpl() {
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
			case PolarSysRoverClientUIPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_UI_FACADE: return createPolarSysRoverPlatformClientUiFacade();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolarSysRoverPlatformClientUiFacade createPolarSysRoverPlatformClientUiFacade() {
		PolarSysRoverPlatformClientUiFacadeImpl polarSysRoverPlatformClientUiFacade = new PolarSysRoverPlatformClientUiFacadeImpl();
		return polarSysRoverPlatformClientUiFacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolarSysRoverClientUIPackage getPolarSysRoverClientUIPackage() {
		return (PolarSysRoverClientUIPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PolarSysRoverClientUIPackage getPackage() {
		return PolarSysRoverClientUIPackage.eINSTANCE;
	}

} //PolarSysRoverClientUIFactoryImpl
