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
package org.eclipse.polarsys.rover.client.ui;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 *     Olivier L. Larouche (Olivier.llarouche@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 * <!-- end-model-doc -->
 * @see org.eclipse.polarsys.rover.client.ui.PolarSysRoverClientUIFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='PolarSysRoverClientUI' copyrightText='Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n    Pierre Allard (Pierre.Allard@canada.ca), \r\n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\r\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\r\n\tOlivier L. Larouche (Olivier.llarouche@canada.ca),\r\n    Canadian Space Agency (CSA) - Initial API and implementation' modelName='PolarSysRoverClientUi' childCreationExtenders='true' extensibleProviderFactory='true' suppressGenModelAnnotations='false' dynamicTemplates='true' templateDirectory='platform:/plugin/ca.gc.asc_csa.apogy.common.emf.templates' modelDirectory='/org.eclipse.polarsys.rover.client.ui/src-generated' editDirectory='/org.eclipse.polarsys.rover.client.ui.edit/src-generated' basePackage='org.eclipse.polarsys.rover.client'"
 * @generated
 */
public interface PolarSysRoverClientUIPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ui";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.eclipse.polarsys.rover.client.ui";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ui";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PolarSysRoverClientUIPackage eINSTANCE = org.eclipse.polarsys.rover.client.ui.impl.PolarSysRoverClientUIPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.polarsys.rover.client.ui.impl.PolarSysRoverPlatformClientUiFacadeImpl <em>Polar Sys Rover Platform Client Ui Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.polarsys.rover.client.ui.impl.PolarSysRoverPlatformClientUiFacadeImpl
	 * @see org.eclipse.polarsys.rover.client.ui.impl.PolarSysRoverClientUIPackageImpl#getPolarSysRoverPlatformClientUiFacade()
	 * @generated
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_UI_FACADE = 0;

	/**
	 * The feature id for the '<em><b>Active Polar Sys Rover Platform Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_UI_FACADE__ACTIVE_POLAR_SYS_ROVER_PLATFORM_CLIENT = 0;

	/**
	 * The number of structural features of the '<em>Polar Sys Rover Platform Client Ui Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_UI_FACADE_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_UI_FACADE___START = 0;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_UI_FACADE___STOP = 1;

	/**
	 * The number of operations of the '<em>Polar Sys Rover Platform Client Ui Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_UI_FACADE_OPERATION_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.polarsys.rover.client.ui.PolarSysRoverPlatformClientUiFacade <em>Polar Sys Rover Platform Client Ui Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polar Sys Rover Platform Client Ui Facade</em>'.
	 * @see org.eclipse.polarsys.rover.client.ui.PolarSysRoverPlatformClientUiFacade
	 * @generated
	 */
	EClass getPolarSysRoverPlatformClientUiFacade();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.polarsys.rover.client.ui.PolarSysRoverPlatformClientUiFacade#getActivePolarSysRoverPlatformClient <em>Active Polar Sys Rover Platform Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Active Polar Sys Rover Platform Client</em>'.
	 * @see org.eclipse.polarsys.rover.client.ui.PolarSysRoverPlatformClientUiFacade#getActivePolarSysRoverPlatformClient()
	 * @see #getPolarSysRoverPlatformClientUiFacade()
	 * @generated
	 */
	EReference getPolarSysRoverPlatformClientUiFacade_ActivePolarSysRoverPlatformClient();

	/**
	 * Returns the meta object for the '{@link org.eclipse.polarsys.rover.client.ui.PolarSysRoverPlatformClientUiFacade#start() <em>Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start</em>' operation.
	 * @see org.eclipse.polarsys.rover.client.ui.PolarSysRoverPlatformClientUiFacade#start()
	 * @generated
	 */
	EOperation getPolarSysRoverPlatformClientUiFacade__Start();

	/**
	 * Returns the meta object for the '{@link org.eclipse.polarsys.rover.client.ui.PolarSysRoverPlatformClientUiFacade#stop() <em>Stop</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop</em>' operation.
	 * @see org.eclipse.polarsys.rover.client.ui.PolarSysRoverPlatformClientUiFacade#stop()
	 * @generated
	 */
	EOperation getPolarSysRoverPlatformClientUiFacade__Stop();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PolarSysRoverClientUIFactory getPolarSysRoverClientUIFactory();

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
		 * The meta object literal for the '{@link org.eclipse.polarsys.rover.client.ui.impl.PolarSysRoverPlatformClientUiFacadeImpl <em>Polar Sys Rover Platform Client Ui Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.polarsys.rover.client.ui.impl.PolarSysRoverPlatformClientUiFacadeImpl
		 * @see org.eclipse.polarsys.rover.client.ui.impl.PolarSysRoverClientUIPackageImpl#getPolarSysRoverPlatformClientUiFacade()
		 * @generated
		 */
		EClass POLAR_SYS_ROVER_PLATFORM_CLIENT_UI_FACADE = eINSTANCE.getPolarSysRoverPlatformClientUiFacade();

		/**
		 * The meta object literal for the '<em><b>Active Polar Sys Rover Platform Client</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLAR_SYS_ROVER_PLATFORM_CLIENT_UI_FACADE__ACTIVE_POLAR_SYS_ROVER_PLATFORM_CLIENT = eINSTANCE.getPolarSysRoverPlatformClientUiFacade_ActivePolarSysRoverPlatformClient();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POLAR_SYS_ROVER_PLATFORM_CLIENT_UI_FACADE___START = eINSTANCE.getPolarSysRoverPlatformClientUiFacade__Start();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POLAR_SYS_ROVER_PLATFORM_CLIENT_UI_FACADE___STOP = eINSTANCE.getPolarSysRoverPlatformClientUiFacade__Stop();

	}

} //PolarSysRoverClientUIPackage
