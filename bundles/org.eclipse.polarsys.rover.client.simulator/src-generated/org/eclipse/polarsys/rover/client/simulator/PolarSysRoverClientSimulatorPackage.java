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
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__WHEEL_RADIUS = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Degree SYM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__DEGREE_SYM = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Wheel Track</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__WHEEL_TRACK = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Move Wait Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__MOVE_WAIT_PERIOD = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Move To Min Lin Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__MOVE_TO_MIN_LIN_SPEED = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Error Per Meter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__ERROR_PER_METER = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Max Power Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__MAX_POWER_LEVEL = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Min Power Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__MIN_POWER_LEVEL = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Max Ctr Power Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__MAX_CTR_POWER_LEVEL = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Min Ctr Power Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__MIN_CTR_POWER_LEVEL = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Max Ang Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__MAX_ANG_VELOCITY = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Min Ang Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__MIN_ANG_VELOCITY = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Max Lin Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__MAX_LIN_VELOCITY = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Min Lin Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__MIN_LIN_VELOCITY = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Distance Between Wheels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__DISTANCE_BETWEEN_WHEELS = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Polar Sys Rover Platform Client Simulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR_FEATURE_COUNT = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_FEATURE_COUNT + 15;

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
	 * Returns the meta object for class '{@link org.eclipse.polarsys.rover.client.simulator.PolarSysRoverPlatformClientSimulator <em>Polar Sys Rover Platform Client Simulator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polar Sys Rover Platform Client Simulator</em>'.
	 * @see org.eclipse.polarsys.rover.client.simulator.PolarSysRoverPlatformClientSimulator
	 * @generated
	 */
	EClass getPolarSysRoverPlatformClientSimulator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.polarsys.rover.client.simulator.PolarSysRoverPlatformClientSimulator#getWheelRadius <em>Wheel Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wheel Radius</em>'.
	 * @see org.eclipse.polarsys.rover.client.simulator.PolarSysRoverPlatformClientSimulator#getWheelRadius()
	 * @see #getPolarSysRoverPlatformClientSimulator()
	 * @generated
	 */
	EAttribute getPolarSysRoverPlatformClientSimulator_WheelRadius();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.polarsys.rover.client.simulator.PolarSysRoverPlatformClientSimulator#getWheelTrack <em>Wheel Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wheel Track</em>'.
	 * @see org.eclipse.polarsys.rover.client.simulator.PolarSysRoverPlatformClientSimulator#getWheelTrack()
	 * @see #getPolarSysRoverPlatformClientSimulator()
	 * @generated
	 */
	EAttribute getPolarSysRoverPlatformClientSimulator_WheelTrack();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.polarsys.rover.client.simulator.PolarSysRoverPlatformClientSimulator#getMoveWaitPeriod <em>Move Wait Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Move Wait Period</em>'.
	 * @see org.eclipse.polarsys.rover.client.simulator.PolarSysRoverPlatformClientSimulator#getMoveWaitPeriod()
	 * @see #getPolarSysRoverPlatformClientSimulator()
	 * @generated
	 */
	EAttribute getPolarSysRoverPlatformClientSimulator_MoveWaitPeriod();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.polarsys.rover.client.simulator.PolarSysRoverPlatformClientSimulator#getMoveToMinLinSpeed <em>Move To Min Lin Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Move To Min Lin Speed</em>'.
	 * @see org.eclipse.polarsys.rover.client.simulator.PolarSysRoverPlatformClientSimulator#getMoveToMinLinSpeed()
	 * @see #getPolarSysRoverPlatformClientSimulator()
	 * @generated
	 */
	EAttribute getPolarSysRoverPlatformClientSimulator_MoveToMinLinSpeed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.polarsys.rover.client.simulator.PolarSysRoverPlatformClientSimulator#getErrorPerMeter <em>Error Per Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Per Meter</em>'.
	 * @see org.eclipse.polarsys.rover.client.simulator.PolarSysRoverPlatformClientSimulator#getErrorPerMeter()
	 * @see #getPolarSysRoverPlatformClientSimulator()
	 * @generated
	 */
	EAttribute getPolarSysRoverPlatformClientSimulator_ErrorPerMeter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.polarsys.rover.client.simulator.PolarSysRoverPlatformClientSimulator#getMaxPowerLevel <em>Max Power Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Power Level</em>'.
	 * @see org.eclipse.polarsys.rover.client.simulator.PolarSysRoverPlatformClientSimulator#getMaxPowerLevel()
	 * @see #getPolarSysRoverPlatformClientSimulator()
	 * @generated
	 */
	EAttribute getPolarSysRoverPlatformClientSimulator_MaxPowerLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.polarsys.rover.client.simulator.PolarSysRoverPlatformClientSimulator#getMinPowerLevel <em>Min Power Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Power Level</em>'.
	 * @see org.eclipse.polarsys.rover.client.simulator.PolarSysRoverPlatformClientSimulator#getMinPowerLevel()
	 * @see #getPolarSysRoverPlatformClientSimulator()
	 * @generated
	 */
	EAttribute getPolarSysRoverPlatformClientSimulator_MinPowerLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.polarsys.rover.client.simulator.PolarSysRoverPlatformClientSimulator#getMaxCtrPowerLevel <em>Max Ctr Power Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Ctr Power Level</em>'.
	 * @see org.eclipse.polarsys.rover.client.simulator.PolarSysRoverPlatformClientSimulator#getMaxCtrPowerLevel()
	 * @see #getPolarSysRoverPlatformClientSimulator()
	 * @generated
	 */
	EAttribute getPolarSysRoverPlatformClientSimulator_MaxCtrPowerLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.polarsys.rover.client.simulator.PolarSysRoverPlatformClientSimulator#getMinCtrPowerLevel <em>Min Ctr Power Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Ctr Power Level</em>'.
	 * @see org.eclipse.polarsys.rover.client.simulator.PolarSysRoverPlatformClientSimulator#getMinCtrPowerLevel()
	 * @see #getPolarSysRoverPlatformClientSimulator()
	 * @generated
	 */
	EAttribute getPolarSysRoverPlatformClientSimulator_MinCtrPowerLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.polarsys.rover.client.simulator.PolarSysRoverPlatformClientSimulator#getMaxAngVelocity <em>Max Ang Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Ang Velocity</em>'.
	 * @see org.eclipse.polarsys.rover.client.simulator.PolarSysRoverPlatformClientSimulator#getMaxAngVelocity()
	 * @see #getPolarSysRoverPlatformClientSimulator()
	 * @generated
	 */
	EAttribute getPolarSysRoverPlatformClientSimulator_MaxAngVelocity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.polarsys.rover.client.simulator.PolarSysRoverPlatformClientSimulator#getMinAngVelocity <em>Min Ang Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Ang Velocity</em>'.
	 * @see org.eclipse.polarsys.rover.client.simulator.PolarSysRoverPlatformClientSimulator#getMinAngVelocity()
	 * @see #getPolarSysRoverPlatformClientSimulator()
	 * @generated
	 */
	EAttribute getPolarSysRoverPlatformClientSimulator_MinAngVelocity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.polarsys.rover.client.simulator.PolarSysRoverPlatformClientSimulator#getMaxLinVelocity <em>Max Lin Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Lin Velocity</em>'.
	 * @see org.eclipse.polarsys.rover.client.simulator.PolarSysRoverPlatformClientSimulator#getMaxLinVelocity()
	 * @see #getPolarSysRoverPlatformClientSimulator()
	 * @generated
	 */
	EAttribute getPolarSysRoverPlatformClientSimulator_MaxLinVelocity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.polarsys.rover.client.simulator.PolarSysRoverPlatformClientSimulator#getMinLinVelocity <em>Min Lin Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Lin Velocity</em>'.
	 * @see org.eclipse.polarsys.rover.client.simulator.PolarSysRoverPlatformClientSimulator#getMinLinVelocity()
	 * @see #getPolarSysRoverPlatformClientSimulator()
	 * @generated
	 */
	EAttribute getPolarSysRoverPlatformClientSimulator_MinLinVelocity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.polarsys.rover.client.simulator.PolarSysRoverPlatformClientSimulator#getDistanceBetweenWheels <em>Distance Between Wheels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance Between Wheels</em>'.
	 * @see org.eclipse.polarsys.rover.client.simulator.PolarSysRoverPlatformClientSimulator#getDistanceBetweenWheels()
	 * @see #getPolarSysRoverPlatformClientSimulator()
	 * @generated
	 */
	EAttribute getPolarSysRoverPlatformClientSimulator_DistanceBetweenWheels();

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
		 * The meta object literal for the '<em><b>Wheel Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__WHEEL_RADIUS = eINSTANCE.getPolarSysRoverPlatformClientSimulator_WheelRadius();
		/**
		 * The meta object literal for the '<em><b>Degree SYM</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__DEGREE_SYM = eINSTANCE.getPolarSysRoverPlatformClientSimulator_DegreeSYM();
		/**
		 * The meta object literal for the '<em><b>Wheel Track</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__WHEEL_TRACK = eINSTANCE.getPolarSysRoverPlatformClientSimulator_WheelTrack();
		/**
		 * The meta object literal for the '<em><b>Move Wait Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__MOVE_WAIT_PERIOD = eINSTANCE.getPolarSysRoverPlatformClientSimulator_MoveWaitPeriod();
		/**
		 * The meta object literal for the '<em><b>Move To Min Lin Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__MOVE_TO_MIN_LIN_SPEED = eINSTANCE.getPolarSysRoverPlatformClientSimulator_MoveToMinLinSpeed();
		/**
		 * The meta object literal for the '<em><b>Error Per Meter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__ERROR_PER_METER = eINSTANCE.getPolarSysRoverPlatformClientSimulator_ErrorPerMeter();
		/**
		 * The meta object literal for the '<em><b>Max Power Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__MAX_POWER_LEVEL = eINSTANCE.getPolarSysRoverPlatformClientSimulator_MaxPowerLevel();
		/**
		 * The meta object literal for the '<em><b>Min Power Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__MIN_POWER_LEVEL = eINSTANCE.getPolarSysRoverPlatformClientSimulator_MinPowerLevel();
		/**
		 * The meta object literal for the '<em><b>Max Ctr Power Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__MAX_CTR_POWER_LEVEL = eINSTANCE.getPolarSysRoverPlatformClientSimulator_MaxCtrPowerLevel();
		/**
		 * The meta object literal for the '<em><b>Min Ctr Power Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__MIN_CTR_POWER_LEVEL = eINSTANCE.getPolarSysRoverPlatformClientSimulator_MinCtrPowerLevel();
		/**
		 * The meta object literal for the '<em><b>Max Ang Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__MAX_ANG_VELOCITY = eINSTANCE.getPolarSysRoverPlatformClientSimulator_MaxAngVelocity();
		/**
		 * The meta object literal for the '<em><b>Min Ang Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__MIN_ANG_VELOCITY = eINSTANCE.getPolarSysRoverPlatformClientSimulator_MinAngVelocity();
		/**
		 * The meta object literal for the '<em><b>Max Lin Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__MAX_LIN_VELOCITY = eINSTANCE.getPolarSysRoverPlatformClientSimulator_MaxLinVelocity();
		/**
		 * The meta object literal for the '<em><b>Min Lin Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__MIN_LIN_VELOCITY = eINSTANCE.getPolarSysRoverPlatformClientSimulator_MinLinVelocity();
		/**
		 * The meta object literal for the '<em><b>Distance Between Wheels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__DISTANCE_BETWEEN_WHEELS = eINSTANCE.getPolarSysRoverPlatformClientSimulator_DistanceBetweenWheels();

	}

} //PolarSysRoverClientSimulatorPackage
