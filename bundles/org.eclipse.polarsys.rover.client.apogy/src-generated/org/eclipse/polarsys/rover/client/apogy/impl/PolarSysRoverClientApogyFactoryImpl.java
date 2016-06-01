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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.polarsys.rover.client.apogy.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PolarSysRoverClientApogyFactoryImpl extends EFactoryImpl implements PolarSysRoverClientApogyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PolarSysRoverClientApogyFactory init() {
		try {
			PolarSysRoverClientApogyFactory thePolarSysRoverClientApogyFactory = (PolarSysRoverClientApogyFactory)EPackage.Registry.INSTANCE.getEFactory(PolarSysRoverClientApogyPackage.eNS_URI);
			if (thePolarSysRoverClientApogyFactory != null) {
				return thePolarSysRoverClientApogyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PolarSysRoverClientApogyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolarSysRoverClientApogyFactoryImpl() {
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
			case PolarSysRoverClientApogyPackage.POLAR_SYS_ROVER_PLATFORM_APOGY_SYSTEM_API_ADAPTER: return createPolarSysRoverPlatformApogySystemApiAdapter();
			case PolarSysRoverClientApogyPackage.POLAR_SYS_ROVER_PLATFORM_DATA: return createPolarSysRoverPlatformData();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolarSysRoverPlatformApogySystemApiAdapter createPolarSysRoverPlatformApogySystemApiAdapter() {
		PolarSysRoverPlatformApogySystemApiAdapterImpl polarSysRoverPlatformApogySystemApiAdapter = new PolarSysRoverPlatformApogySystemApiAdapterImpl();
		return polarSysRoverPlatformApogySystemApiAdapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolarSysRoverPlatformData createPolarSysRoverPlatformData() {
		PolarSysRoverPlatformDataImpl polarSysRoverPlatformData = new PolarSysRoverPlatformDataImpl();
		return polarSysRoverPlatformData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolarSysRoverClientApogyPackage getPolarSysRoverClientApogyPackage() {
		return (PolarSysRoverClientApogyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PolarSysRoverClientApogyPackage getPackage() {
		return PolarSysRoverClientApogyPackage.eINSTANCE;
	}

} //PolarSysRoverClientApogyFactoryImpl
