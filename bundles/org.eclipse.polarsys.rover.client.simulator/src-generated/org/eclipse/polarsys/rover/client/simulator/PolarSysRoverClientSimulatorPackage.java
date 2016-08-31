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
package org.eclipse.polarsys.rover.client.simulator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.polarsys.rover.client.PolarSysRoverClientPackage;

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
 * @see org.eclipse.polarsys.rover.client.simulator.PolarSysRoverClientSimulatorFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='PolarSysRoverClientSimulator' copyrightText='Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation' modelName='PolarSysRoverClient' childCreationExtenders='true' extensibleProviderFactory='true' suppressGenModelAnnotations='false' dynamicTemplates='true' templateDirectory='platform:/plugin/ca.gc.asc_csa.apogy.common.emf.templates' modelDirectory='/org.eclipse.polarsys.rover.client.simulator/src-generated' editDirectory='/org.eclipse.polarsys.rover.client.simulator.edit/src-generated' basePackage='org.eclipse.polarsys.rover.client'"
 * @generated
 */
public interface PolarSysRoverClientSimulatorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "simulator";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.eclipse.polarsys.rover.client.simulator";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "simulator";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PolarSysRoverClientSimulatorPackage eINSTANCE = org.eclipse.polarsys.rover.client.simulator.impl.PolarSysRoverClientSimulatorPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.polarsys.rover.client.simulator.impl.PolarSysRoverPlatformClientSimulatorImpl <em>Polar Sys Rover Platform Client Simulator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.polarsys.rover.client.simulator.impl.PolarSysRoverPlatformClientSimulatorImpl
	 * @see org.eclipse.polarsys.rover.client.simulator.impl.PolarSysRoverClientSimulatorPackageImpl#getPolarSysRoverPlatformClientSimulator()
	 * @generated
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR = 0;

	/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__INITIALIZED = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__INITIALIZED;

	/**
	 * The feature id for the '<em><b>Disposed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__DISPOSED = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__DISPOSED;

	/**
	 * The feature id for the '<em><b>Position Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__POSITION_ERROR = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__POSITION_ERROR;

	/**
	 * The feature id for the '<em><b>Linear Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__LINEAR_VELOCITY = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__LINEAR_VELOCITY;

	/**
	 * The feature id for the '<em><b>Angular Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__ANGULAR_VELOCITY = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__ANGULAR_VELOCITY;

	/**
	 * The feature id for the '<em><b>Front Left Wheel Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__FRONT_LEFT_WHEEL_POSITION = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_LEFT_WHEEL_POSITION;

	/**
	 * The feature id for the '<em><b>Front Right Wheel Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__FRONT_RIGHT_WHEEL_POSITION = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_RIGHT_WHEEL_POSITION;

	/**
	 * The feature id for the '<em><b>Rear Left Wheel Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__REAR_LEFT_WHEEL_POSITION = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__REAR_LEFT_WHEEL_POSITION;

	/**
	 * The feature id for the '<em><b>Rear Right Wheel Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__REAR_RIGHT_WHEEL_POSITION = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__REAR_RIGHT_WHEEL_POSITION;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__POSITION = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__POSITION;

	/**
	 * The number of structural features of the '<em>Polar Sys Rover Platform Client Simulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR_FEATURE_COUNT = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR___DISPOSE = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT___DISPOSE;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR___INIT = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT___INIT;

	/**
	 * The operation id for the '<em>Reset Position</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR___RESET_POSITION__POSITION = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT___RESET_POSITION__POSITION;

	/**
	 * The operation id for the '<em>Clear Position Error</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR___CLEAR_POSITION_ERROR = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT___CLEAR_POSITION_ERROR;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR___STOP = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT___STOP;

	/**
	 * The operation id for the '<em>Cmd Velocities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR___CMD_VELOCITIES__DOUBLE_DOUBLE = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT___CMD_VELOCITIES__DOUBLE_DOUBLE;

	/**
	 * The operation id for the '<em>Cmd Power Level</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR___CMD_POWER_LEVEL__BYTE_BYTE = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT___CMD_POWER_LEVEL__BYTE_BYTE;

	/**
	 * The number of operations of the '<em>Polar Sys Rover Platform Client Simulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR_OPERATION_COUNT = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.polarsys.rover.client.simulator.PolarSysRoverPlatformClientSimulator <em>Polar Sys Rover Platform Client Simulator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polar Sys Rover Platform Client Simulator</em>'.
	 * @see org.eclipse.polarsys.rover.client.simulator.PolarSysRoverPlatformClientSimulator
	 * @generated
	 */
	EClass getPolarSysRoverPlatformClientSimulator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PolarSysRoverClientSimulatorFactory getPolarSysRoverClientSimulatorFactory();

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
		 * The meta object literal for the '{@link org.eclipse.polarsys.rover.client.simulator.impl.PolarSysRoverPlatformClientSimulatorImpl <em>Polar Sys Rover Platform Client Simulator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.polarsys.rover.client.simulator.impl.PolarSysRoverPlatformClientSimulatorImpl
		 * @see org.eclipse.polarsys.rover.client.simulator.impl.PolarSysRoverClientSimulatorPackageImpl#getPolarSysRoverPlatformClientSimulator()
		 * @generated
		 */
		EClass POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR = eINSTANCE.getPolarSysRoverPlatformClientSimulator();

	}

} //PolarSysRoverClientSimulatorPackage
