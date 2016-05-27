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
package org.eclipse.polarsys.rover.client;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
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
 * <!-- end-model-doc -->
 * @see org.eclipse.polarsys.rover.client.PolarSysRoverClientFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='PolarSysRoverClient' copyrightText='Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation' modelName='PolarSysRoverClient' childCreationExtenders='true' extensibleProviderFactory='true' suppressGenModelAnnotations='false' dynamicTemplates='true' templateDirectory='platform:/plugin/ca.gc.asc_csa.apogy.common.emf.templates' modelDirectory='/org.eclipse.polarsys.rover.client/src-generated' editDirectory='/org.eclipse.polarsys.rover.client.edit/src-generated' basePackage='org.eclipse.polarsys.rover'"
 * @generated
 */
public interface PolarSysRoverClientPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "client";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.eclipse.polarsys.rover.client";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "client";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PolarSysRoverClientPackage eINSTANCE = org.eclipse.polarsys.rover.client.impl.PolarSysRoverClientPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.polarsys.rover.client.impl.PolarSysRoverClientImpl <em>Polar Sys Rover Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.polarsys.rover.client.impl.PolarSysRoverClientImpl
	 * @see org.eclipse.polarsys.rover.client.impl.PolarSysRoverClientPackageImpl#getPolarSysRoverClient()
	 * @generated
	 */
	int POLAR_SYS_ROVER_CLIENT = 0;

	/**
	 * The number of structural features of the '<em>Polar Sys Rover Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_CLIENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Polar Sys Rover Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_CLIENT_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.eclipse.polarsys.rover.client.impl.PolarSysRoverClientSimulatorImpl <em>Simulator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.polarsys.rover.client.impl.PolarSysRoverClientSimulatorImpl
	 * @see org.eclipse.polarsys.rover.client.impl.PolarSysRoverClientPackageImpl#getPolarSysRoverClientSimulator()
	 * @generated
	 */
	int POLAR_SYS_ROVER_CLIENT_SIMULATOR = 1;

	/**
	 * The number of structural features of the '<em>Simulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_CLIENT_SIMULATOR_FEATURE_COUNT = POLAR_SYS_ROVER_CLIENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_CLIENT_SIMULATOR_OPERATION_COUNT = POLAR_SYS_ROVER_CLIENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.polarsys.rover.client.PolarSysRoverClient <em>Polar Sys Rover Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polar Sys Rover Client</em>'.
	 * @see org.eclipse.polarsys.rover.client.PolarSysRoverClient
	 * @generated
	 */
	EClass getPolarSysRoverClient();

	/**
	 * Returns the meta object for class '{@link org.eclipse.polarsys.rover.client.PolarSysRoverClientSimulator <em>Simulator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simulator</em>'.
	 * @see org.eclipse.polarsys.rover.client.PolarSysRoverClientSimulator
	 * @generated
	 */
	EClass getPolarSysRoverClientSimulator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PolarSysRoverClientFactory getPolarSysRoverClientFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.polarsys.rover.client.impl.PolarSysRoverClientImpl <em>Polar Sys Rover Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.polarsys.rover.client.impl.PolarSysRoverClientImpl
		 * @see org.eclipse.polarsys.rover.client.impl.PolarSysRoverClientPackageImpl#getPolarSysRoverClient()
		 * @generated
		 */
		EClass POLAR_SYS_ROVER_CLIENT = eINSTANCE.getPolarSysRoverClient();
		/**
		 * The meta object literal for the '{@link org.eclipse.polarsys.rover.client.impl.PolarSysRoverClientSimulatorImpl <em>Simulator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.polarsys.rover.client.impl.PolarSysRoverClientSimulatorImpl
		 * @see org.eclipse.polarsys.rover.client.impl.PolarSysRoverClientPackageImpl#getPolarSysRoverClientSimulator()
		 * @generated
		 */
		EClass POLAR_SYS_ROVER_CLIENT_SIMULATOR = eINSTANCE.getPolarSysRoverClientSimulator();

	}

} //PolarSysRoverClientPackage
