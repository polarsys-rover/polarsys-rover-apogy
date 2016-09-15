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

import org.eclipse.emf.ecore.EAttribute;
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
 * *
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
 *     Olivier L. Larouche (olivier.llarouche@canada.ca),
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
	 * The feature id for the '<em><b>Left Power Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__LEFT_POWER_LEVEL = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__LEFT_POWER_LEVEL;

	/**
	 * The feature id for the '<em><b>Right Power Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__RIGHT_POWER_LEVEL = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__RIGHT_POWER_LEVEL;

	/**
	 * The feature id for the '<em><b>Left Wheel Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__LEFT_WHEEL_POSITION = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__LEFT_WHEEL_POSITION;

	/**
	 * The feature id for the '<em><b>Right Wheel Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__RIGHT_WHEEL_POSITION = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__RIGHT_WHEEL_POSITION;

	/**
	 * The feature id for the '<em><b>Front Sonar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__FRONT_SONAR = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_SONAR;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__POSITION = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__POSITION;

	/**
	 * The feature id for the '<em><b>Front Camera</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__FRONT_CAMERA = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_CAMERA;

	/**
	 * The feature id for the '<em><b>Wheel Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__WHEEL_RADIUS = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__WHEEL_RADIUS;

	/**
	 * The feature id for the '<em><b>Wheel Track</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__WHEEL_TRACK = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__WHEEL_TRACK;

	/**
	 * The feature id for the '<em><b>Move Wait Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__MOVE_WAIT_PERIOD = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__MOVE_WAIT_PERIOD;

	/**
	 * The feature id for the '<em><b>Move To Min Lin Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__MOVE_TO_MIN_LIN_SPEED = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__MOVE_TO_MIN_LIN_SPEED;

	/**
	 * The feature id for the '<em><b>Error Per Meter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__ERROR_PER_METER = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__ERROR_PER_METER;

	/**
	 * The feature id for the '<em><b>Max Power Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__MAX_POWER_LEVEL = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__MAX_POWER_LEVEL;

	/**
	 * The feature id for the '<em><b>Max Ctr Power Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__MAX_CTR_POWER_LEVEL = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__MAX_CTR_POWER_LEVEL;

	/**
	 * The feature id for the '<em><b>Max Ang Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__MAX_ANG_VELOCITY = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__MAX_ANG_VELOCITY;

	/**
	 * The feature id for the '<em><b>Max Lin Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__MAX_LIN_VELOCITY = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__MAX_LIN_VELOCITY;

	/**
	 * The feature id for the '<em><b>Distance Between Wheels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__DISTANCE_BETWEEN_WHEELS = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__DISTANCE_BETWEEN_WHEELS;

	/**
	 * The feature id for the '<em><b>Degree SYM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__DEGREE_SYM = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Polar Sys Rover Platform Client Simulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR_FEATURE_COUNT = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_FEATURE_COUNT + 1;

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
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR___CMD_POWER_LEVEL__DOUBLE_DOUBLE = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT___CMD_POWER_LEVEL__DOUBLE_DOUBLE;

	/**
	 * The number of operations of the '<em>Polar Sys Rover Platform Client Simulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR_OPERATION_COUNT = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.eclipse.polarsys.rover.client.simulator.impl.PolarSysRoverCameraSimulatorImpl <em>Polar Sys Rover Camera Simulator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.polarsys.rover.client.simulator.impl.PolarSysRoverCameraSimulatorImpl
	 * @see org.eclipse.polarsys.rover.client.simulator.impl.PolarSysRoverClientSimulatorPackageImpl#getPolarSysRoverCameraSimulator()
	 * @generated
	 */
	int POLAR_SYS_ROVER_CAMERA_SIMULATOR = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_CAMERA_SIMULATOR__PARENT = PolarSysRoverClientPackage.POLAR_SYS_CAMERA__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_CAMERA_SIMULATOR__DESCRIPTION = PolarSysRoverClientPackage.POLAR_SYS_CAMERA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_CAMERA_SIMULATOR__NODE_ID = PolarSysRoverClientPackage.POLAR_SYS_CAMERA__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_CAMERA_SIMULATOR__CHILDREN = PolarSysRoverClientPackage.POLAR_SYS_CAMERA__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_CAMERA_SIMULATOR__AGGREGATED_CHILDREN = PolarSysRoverClientPackage.POLAR_SYS_CAMERA__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_CAMERA_SIMULATOR__STATUS = PolarSysRoverClientPackage.POLAR_SYS_CAMERA__STATUS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_CAMERA_SIMULATOR__NAME = PolarSysRoverClientPackage.POLAR_SYS_CAMERA__NAME;

	/**
	 * The feature id for the '<em><b>Latest Image Snapshot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_CAMERA_SIMULATOR__LATEST_IMAGE_SNAPSHOT = PolarSysRoverClientPackage.POLAR_SYS_CAMERA__LATEST_IMAGE_SNAPSHOT;

	/**
	 * The feature id for the '<em><b>Fov</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_CAMERA_SIMULATOR__FOV = PolarSysRoverClientPackage.POLAR_SYS_CAMERA__FOV;

	/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_CAMERA_SIMULATOR__INITIALIZED = PolarSysRoverClientPackage.POLAR_SYS_CAMERA__INITIALIZED;

	/**
	 * The feature id for the '<em><b>Streaming Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_CAMERA_SIMULATOR__STREAMING_ENABLED = PolarSysRoverClientPackage.POLAR_SYS_CAMERA__STREAMING_ENABLED;

	/**
	 * The number of structural features of the '<em>Polar Sys Rover Camera Simulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_CAMERA_SIMULATOR_FEATURE_COUNT = PolarSysRoverClientPackage.POLAR_SYS_CAMERA_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_CAMERA_SIMULATOR___ACCEPT__INODEVISITOR = PolarSysRoverClientPackage.POLAR_SYS_CAMERA___ACCEPT__INODEVISITOR;

	/**
	 * The operation id for the '<em>Take Snapshot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_CAMERA_SIMULATOR___TAKE_SNAPSHOT = PolarSysRoverClientPackage.POLAR_SYS_CAMERA___TAKE_SNAPSHOT;

	/**
	 * The operation id for the '<em>Get Field Of View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_CAMERA_SIMULATOR___GET_FIELD_OF_VIEW = PolarSysRoverClientPackage.POLAR_SYS_CAMERA___GET_FIELD_OF_VIEW;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_CAMERA_SIMULATOR___INIT = PolarSysRoverClientPackage.POLAR_SYS_CAMERA___INIT;

	/**
	 * The operation id for the '<em>Command Streaming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_CAMERA_SIMULATOR___COMMAND_STREAMING__BOOLEAN = PolarSysRoverClientPackage.POLAR_SYS_CAMERA___COMMAND_STREAMING__BOOLEAN;

	/**
	 * The number of operations of the '<em>Polar Sys Rover Camera Simulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_CAMERA_SIMULATOR_OPERATION_COUNT = PolarSysRoverClientPackage.POLAR_SYS_CAMERA_OPERATION_COUNT + 0;


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
	 * Returns the meta object for the attribute '{@link org.eclipse.polarsys.rover.client.simulator.PolarSysRoverPlatformClientSimulator#getDegreeSYM <em>Degree SYM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Degree SYM</em>'.
	 * @see org.eclipse.polarsys.rover.client.simulator.PolarSysRoverPlatformClientSimulator#getDegreeSYM()
	 * @see #getPolarSysRoverPlatformClientSimulator()
	 * @generated
	 */
	EAttribute getPolarSysRoverPlatformClientSimulator_DegreeSYM();

	/**
	 * Returns the meta object for class '{@link org.eclipse.polarsys.rover.client.simulator.PolarSysRoverCameraSimulator <em>Polar Sys Rover Camera Simulator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polar Sys Rover Camera Simulator</em>'.
	 * @see org.eclipse.polarsys.rover.client.simulator.PolarSysRoverCameraSimulator
	 * @generated
	 */
	EClass getPolarSysRoverCameraSimulator();

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
		/**
		 * The meta object literal for the '<em><b>Degree SYM</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__DEGREE_SYM = eINSTANCE.getPolarSysRoverPlatformClientSimulator_DegreeSYM();
		/**
		 * The meta object literal for the '{@link org.eclipse.polarsys.rover.client.simulator.impl.PolarSysRoverCameraSimulatorImpl <em>Polar Sys Rover Camera Simulator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.polarsys.rover.client.simulator.impl.PolarSysRoverCameraSimulatorImpl
		 * @see org.eclipse.polarsys.rover.client.simulator.impl.PolarSysRoverClientSimulatorPackageImpl#getPolarSysRoverCameraSimulator()
		 * @generated
		 */
		EClass POLAR_SYS_ROVER_CAMERA_SIMULATOR = eINSTANCE.getPolarSysRoverCameraSimulator();

	}

} //PolarSysRoverClientSimulatorPackage
