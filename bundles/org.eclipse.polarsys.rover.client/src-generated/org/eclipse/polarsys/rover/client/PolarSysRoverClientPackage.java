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

import ca.gc.asc_csa.apogy.addons.sensors.imaging.ApogyAddonsSensorsImagingPackage;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;

import org.eclipse.emf.ecore.EAttribute;
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
	 * The meta object id for the '{@link org.eclipse.polarsys.rover.client.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.polarsys.rover.client.impl.PositionImpl
	 * @see org.eclipse.polarsys.rover.client.impl.PolarSysRoverClientPackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__Y = 1;

	/**
	 * The feature id for the '<em><b>Theta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__THETA = 2;

	/**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.polarsys.rover.client.impl.PolarSysCameraImpl <em>Polar Sys Camera</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.polarsys.rover.client.impl.PolarSysCameraImpl
	 * @see org.eclipse.polarsys.rover.client.impl.PolarSysRoverClientPackageImpl#getPolarSysCamera()
	 * @generated
	 */
	int POLAR_SYS_CAMERA = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_CAMERA__PARENT = ApogyAddonsSensorsImagingPackage.ABSTRACT_CAMERA__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_CAMERA__DESCRIPTION = ApogyAddonsSensorsImagingPackage.ABSTRACT_CAMERA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_CAMERA__NODE_ID = ApogyAddonsSensorsImagingPackage.ABSTRACT_CAMERA__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_CAMERA__CHILDREN = ApogyAddonsSensorsImagingPackage.ABSTRACT_CAMERA__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_CAMERA__AGGREGATED_CHILDREN = ApogyAddonsSensorsImagingPackage.ABSTRACT_CAMERA__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_CAMERA__STATUS = ApogyAddonsSensorsImagingPackage.ABSTRACT_CAMERA__STATUS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_CAMERA__NAME = ApogyAddonsSensorsImagingPackage.ABSTRACT_CAMERA__NAME;

	/**
	 * The feature id for the '<em><b>Latest Image Snapshot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_CAMERA__LATEST_IMAGE_SNAPSHOT = ApogyAddonsSensorsImagingPackage.ABSTRACT_CAMERA__LATEST_IMAGE_SNAPSHOT;

	/**
	 * The feature id for the '<em><b>Fov</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_CAMERA__FOV = ApogyAddonsSensorsImagingPackage.ABSTRACT_CAMERA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_CAMERA__INITIALIZED = ApogyAddonsSensorsImagingPackage.ABSTRACT_CAMERA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Streaming Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_CAMERA__STREAMING_ENABLED = ApogyAddonsSensorsImagingPackage.ABSTRACT_CAMERA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Polar Sys Camera</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_CAMERA_FEATURE_COUNT = ApogyAddonsSensorsImagingPackage.ABSTRACT_CAMERA_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_CAMERA___ACCEPT__INODEVISITOR = ApogyAddonsSensorsImagingPackage.ABSTRACT_CAMERA___ACCEPT__INODEVISITOR;

	/**
	 * The operation id for the '<em>Take Snapshot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_CAMERA___TAKE_SNAPSHOT = ApogyAddonsSensorsImagingPackage.ABSTRACT_CAMERA___TAKE_SNAPSHOT;

	/**
	 * The operation id for the '<em>Get Field Of View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_CAMERA___GET_FIELD_OF_VIEW = ApogyAddonsSensorsImagingPackage.ABSTRACT_CAMERA___GET_FIELD_OF_VIEW;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_CAMERA___INIT = ApogyAddonsSensorsImagingPackage.ABSTRACT_CAMERA_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Command Streaming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_CAMERA___COMMAND_STREAMING__BOOLEAN = ApogyAddonsSensorsImagingPackage.ABSTRACT_CAMERA_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Polar Sys Camera</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_CAMERA_OPERATION_COUNT = ApogyAddonsSensorsImagingPackage.ABSTRACT_CAMERA_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.polarsys.rover.client.impl.PolarSysRoverPlatformClientImpl <em>Polar Sys Rover Platform Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.polarsys.rover.client.impl.PolarSysRoverPlatformClientImpl
	 * @see org.eclipse.polarsys.rover.client.impl.PolarSysRoverClientPackageImpl#getPolarSysRoverPlatformClient()
	 * @generated
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT = 2;

	/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT__INITIALIZED = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Disposed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT__DISPOSED = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Position Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT__POSITION_ERROR = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Left Power Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT__LEFT_POWER_LEVEL = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Right Power Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT__RIGHT_POWER_LEVEL = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Left Wheel Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT__LEFT_WHEEL_POSITION = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Right Wheel Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT__RIGHT_WHEEL_POSITION = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Front Sonar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_SONAR = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT__POSITION = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Front Camera</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_CAMERA = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Wheel Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT__WHEEL_RADIUS = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Wheel Track</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT__WHEEL_TRACK = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Move Wait Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT__MOVE_WAIT_PERIOD = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Move To Min Lin Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT__MOVE_TO_MIN_LIN_SPEED = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Error Per Meter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT__ERROR_PER_METER = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Max Power Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT__MAX_POWER_LEVEL = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Max Ctr Power Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT__MAX_CTR_POWER_LEVEL = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Max Ang Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT__MAX_ANG_VELOCITY = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Max Lin Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT__MAX_LIN_VELOCITY = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Distance Between Wheels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT__DISTANCE_BETWEEN_WHEELS = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>Polar Sys Rover Platform Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_FEATURE_COUNT = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 20;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT___DISPOSE = ApogyCommonEMFPackage.DISPOSABLE___DISPOSE;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT___INIT = ApogyCommonEMFPackage.DISPOSABLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Reset Position</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT___RESET_POSITION__POSITION = ApogyCommonEMFPackage.DISPOSABLE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Clear Position Error</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT___CLEAR_POSITION_ERROR = ApogyCommonEMFPackage.DISPOSABLE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT___STOP = ApogyCommonEMFPackage.DISPOSABLE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Cmd Velocities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT___CMD_VELOCITIES__DOUBLE_DOUBLE = ApogyCommonEMFPackage.DISPOSABLE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Cmd Power Level</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT___CMD_POWER_LEVEL__DOUBLE_DOUBLE = ApogyCommonEMFPackage.DISPOSABLE_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Polar Sys Rover Platform Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_OPERATION_COUNT = ApogyCommonEMFPackage.DISPOSABLE_OPERATION_COUNT + 6;


	/**
	 * Returns the meta object for class '{@link org.eclipse.polarsys.rover.client.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see org.eclipse.polarsys.rover.client.Position
	 * @generated
	 */
	EClass getPosition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.polarsys.rover.client.Position#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.eclipse.polarsys.rover.client.Position#getX()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_X();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.polarsys.rover.client.Position#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.eclipse.polarsys.rover.client.Position#getY()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.polarsys.rover.client.Position#getTheta <em>Theta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Theta</em>'.
	 * @see org.eclipse.polarsys.rover.client.Position#getTheta()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Theta();

	/**
	 * Returns the meta object for class '{@link org.eclipse.polarsys.rover.client.PolarSysCamera <em>Polar Sys Camera</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polar Sys Camera</em>'.
	 * @see org.eclipse.polarsys.rover.client.PolarSysCamera
	 * @generated
	 */
	EClass getPolarSysCamera();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.polarsys.rover.client.PolarSysCamera#getFov <em>Fov</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fov</em>'.
	 * @see org.eclipse.polarsys.rover.client.PolarSysCamera#getFov()
	 * @see #getPolarSysCamera()
	 * @generated
	 */
	EReference getPolarSysCamera_Fov();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.polarsys.rover.client.PolarSysCamera#isInitialized <em>Initialized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initialized</em>'.
	 * @see org.eclipse.polarsys.rover.client.PolarSysCamera#isInitialized()
	 * @see #getPolarSysCamera()
	 * @generated
	 */
	EAttribute getPolarSysCamera_Initialized();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.polarsys.rover.client.PolarSysCamera#isStreamingEnabled <em>Streaming Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Streaming Enabled</em>'.
	 * @see org.eclipse.polarsys.rover.client.PolarSysCamera#isStreamingEnabled()
	 * @see #getPolarSysCamera()
	 * @generated
	 */
	EAttribute getPolarSysCamera_StreamingEnabled();

	/**
	 * Returns the meta object for the '{@link org.eclipse.polarsys.rover.client.PolarSysCamera#init() <em>Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init</em>' operation.
	 * @see org.eclipse.polarsys.rover.client.PolarSysCamera#init()
	 * @generated
	 */
	EOperation getPolarSysCamera__Init();

	/**
	 * Returns the meta object for the '{@link org.eclipse.polarsys.rover.client.PolarSysCamera#commandStreaming(boolean) <em>Command Streaming</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Command Streaming</em>' operation.
	 * @see org.eclipse.polarsys.rover.client.PolarSysCamera#commandStreaming(boolean)
	 * @generated
	 */
	EOperation getPolarSysCamera__CommandStreaming__boolean();

	/**
	 * Returns the meta object for class '{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient <em>Polar Sys Rover Platform Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polar Sys Rover Platform Client</em>'.
	 * @see org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient
	 * @generated
	 */
	EClass getPolarSysRoverPlatformClient();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#isInitialized <em>Initialized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initialized</em>'.
	 * @see org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#isInitialized()
	 * @see #getPolarSysRoverPlatformClient()
	 * @generated
	 */
	EAttribute getPolarSysRoverPlatformClient_Initialized();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#isDisposed <em>Disposed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disposed</em>'.
	 * @see org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#isDisposed()
	 * @see #getPolarSysRoverPlatformClient()
	 * @generated
	 */
	EAttribute getPolarSysRoverPlatformClient_Disposed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getPositionError <em>Position Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Error</em>'.
	 * @see org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getPositionError()
	 * @see #getPolarSysRoverPlatformClient()
	 * @generated
	 */
	EAttribute getPolarSysRoverPlatformClient_PositionError();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getLeftPowerLevel <em>Left Power Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left Power Level</em>'.
	 * @see org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getLeftPowerLevel()
	 * @see #getPolarSysRoverPlatformClient()
	 * @generated
	 */
	EAttribute getPolarSysRoverPlatformClient_LeftPowerLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getRightPowerLevel <em>Right Power Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right Power Level</em>'.
	 * @see org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getRightPowerLevel()
	 * @see #getPolarSysRoverPlatformClient()
	 * @generated
	 */
	EAttribute getPolarSysRoverPlatformClient_RightPowerLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getLeftWheelPosition <em>Left Wheel Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left Wheel Position</em>'.
	 * @see org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getLeftWheelPosition()
	 * @see #getPolarSysRoverPlatformClient()
	 * @generated
	 */
	EAttribute getPolarSysRoverPlatformClient_LeftWheelPosition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getRightWheelPosition <em>Right Wheel Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right Wheel Position</em>'.
	 * @see org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getRightWheelPosition()
	 * @see #getPolarSysRoverPlatformClient()
	 * @generated
	 */
	EAttribute getPolarSysRoverPlatformClient_RightWheelPosition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getFrontSonar <em>Front Sonar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Front Sonar</em>'.
	 * @see org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getFrontSonar()
	 * @see #getPolarSysRoverPlatformClient()
	 * @generated
	 */
	EAttribute getPolarSysRoverPlatformClient_FrontSonar();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getPosition()
	 * @see #getPolarSysRoverPlatformClient()
	 * @generated
	 */
	EReference getPolarSysRoverPlatformClient_Position();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getFrontCamera <em>Front Camera</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Front Camera</em>'.
	 * @see org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getFrontCamera()
	 * @see #getPolarSysRoverPlatformClient()
	 * @generated
	 */
	EReference getPolarSysRoverPlatformClient_FrontCamera();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getWheelRadius <em>Wheel Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wheel Radius</em>'.
	 * @see org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getWheelRadius()
	 * @see #getPolarSysRoverPlatformClient()
	 * @generated
	 */
	EAttribute getPolarSysRoverPlatformClient_WheelRadius();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getWheelTrack <em>Wheel Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wheel Track</em>'.
	 * @see org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getWheelTrack()
	 * @see #getPolarSysRoverPlatformClient()
	 * @generated
	 */
	EAttribute getPolarSysRoverPlatformClient_WheelTrack();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getMoveWaitPeriod <em>Move Wait Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Move Wait Period</em>'.
	 * @see org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getMoveWaitPeriod()
	 * @see #getPolarSysRoverPlatformClient()
	 * @generated
	 */
	EAttribute getPolarSysRoverPlatformClient_MoveWaitPeriod();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getMoveToMinLinSpeed <em>Move To Min Lin Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Move To Min Lin Speed</em>'.
	 * @see org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getMoveToMinLinSpeed()
	 * @see #getPolarSysRoverPlatformClient()
	 * @generated
	 */
	EAttribute getPolarSysRoverPlatformClient_MoveToMinLinSpeed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getErrorPerMeter <em>Error Per Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Per Meter</em>'.
	 * @see org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getErrorPerMeter()
	 * @see #getPolarSysRoverPlatformClient()
	 * @generated
	 */
	EAttribute getPolarSysRoverPlatformClient_ErrorPerMeter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getMaxPowerLevel <em>Max Power Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Power Level</em>'.
	 * @see org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getMaxPowerLevel()
	 * @see #getPolarSysRoverPlatformClient()
	 * @generated
	 */
	EAttribute getPolarSysRoverPlatformClient_MaxPowerLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getMaxCtrPowerLevel <em>Max Ctr Power Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Ctr Power Level</em>'.
	 * @see org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getMaxCtrPowerLevel()
	 * @see #getPolarSysRoverPlatformClient()
	 * @generated
	 */
	EAttribute getPolarSysRoverPlatformClient_MaxCtrPowerLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getMaxAngVelocity <em>Max Ang Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Ang Velocity</em>'.
	 * @see org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getMaxAngVelocity()
	 * @see #getPolarSysRoverPlatformClient()
	 * @generated
	 */
	EAttribute getPolarSysRoverPlatformClient_MaxAngVelocity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getMaxLinVelocity <em>Max Lin Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Lin Velocity</em>'.
	 * @see org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getMaxLinVelocity()
	 * @see #getPolarSysRoverPlatformClient()
	 * @generated
	 */
	EAttribute getPolarSysRoverPlatformClient_MaxLinVelocity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getDistanceBetweenWheels <em>Distance Between Wheels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance Between Wheels</em>'.
	 * @see org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getDistanceBetweenWheels()
	 * @see #getPolarSysRoverPlatformClient()
	 * @generated
	 */
	EAttribute getPolarSysRoverPlatformClient_DistanceBetweenWheels();

	/**
	 * Returns the meta object for the '{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#init() <em>Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init</em>' operation.
	 * @see org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#init()
	 * @generated
	 */
	EOperation getPolarSysRoverPlatformClient__Init();

	/**
	 * Returns the meta object for the '{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#resetPosition(org.eclipse.polarsys.rover.client.Position) <em>Reset Position</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reset Position</em>' operation.
	 * @see org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#resetPosition(org.eclipse.polarsys.rover.client.Position)
	 * @generated
	 */
	EOperation getPolarSysRoverPlatformClient__ResetPosition__Position();

	/**
	 * Returns the meta object for the '{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#clearPositionError() <em>Clear Position Error</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clear Position Error</em>' operation.
	 * @see org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#clearPositionError()
	 * @generated
	 */
	EOperation getPolarSysRoverPlatformClient__ClearPositionError();

	/**
	 * Returns the meta object for the '{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#stop() <em>Stop</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop</em>' operation.
	 * @see org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#stop()
	 * @generated
	 */
	EOperation getPolarSysRoverPlatformClient__Stop();

	/**
	 * Returns the meta object for the '{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#cmdVelocities(double, double) <em>Cmd Velocities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cmd Velocities</em>' operation.
	 * @see org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#cmdVelocities(double, double)
	 * @generated
	 */
	EOperation getPolarSysRoverPlatformClient__CmdVelocities__double_double();

	/**
	 * Returns the meta object for the '{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#cmdPowerLevel(double, double) <em>Cmd Power Level</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cmd Power Level</em>' operation.
	 * @see org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#cmdPowerLevel(double, double)
	 * @generated
	 */
	EOperation getPolarSysRoverPlatformClient__CmdPowerLevel__double_double();

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
		 * The meta object literal for the '{@link org.eclipse.polarsys.rover.client.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.polarsys.rover.client.impl.PositionImpl
		 * @see org.eclipse.polarsys.rover.client.impl.PolarSysRoverClientPackageImpl#getPosition()
		 * @generated
		 */
		EClass POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__X = eINSTANCE.getPosition_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__Y = eINSTANCE.getPosition_Y();

		/**
		 * The meta object literal for the '<em><b>Theta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__THETA = eINSTANCE.getPosition_Theta();

		/**
		 * The meta object literal for the '{@link org.eclipse.polarsys.rover.client.impl.PolarSysCameraImpl <em>Polar Sys Camera</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.polarsys.rover.client.impl.PolarSysCameraImpl
		 * @see org.eclipse.polarsys.rover.client.impl.PolarSysRoverClientPackageImpl#getPolarSysCamera()
		 * @generated
		 */
		EClass POLAR_SYS_CAMERA = eINSTANCE.getPolarSysCamera();

		/**
		 * The meta object literal for the '<em><b>Fov</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLAR_SYS_CAMERA__FOV = eINSTANCE.getPolarSysCamera_Fov();

		/**
		 * The meta object literal for the '<em><b>Initialized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLAR_SYS_CAMERA__INITIALIZED = eINSTANCE.getPolarSysCamera_Initialized();

		/**
		 * The meta object literal for the '<em><b>Streaming Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLAR_SYS_CAMERA__STREAMING_ENABLED = eINSTANCE.getPolarSysCamera_StreamingEnabled();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POLAR_SYS_CAMERA___INIT = eINSTANCE.getPolarSysCamera__Init();

		/**
		 * The meta object literal for the '<em><b>Command Streaming</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POLAR_SYS_CAMERA___COMMAND_STREAMING__BOOLEAN = eINSTANCE.getPolarSysCamera__CommandStreaming__boolean();

		/**
		 * The meta object literal for the '{@link org.eclipse.polarsys.rover.client.impl.PolarSysRoverPlatformClientImpl <em>Polar Sys Rover Platform Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.polarsys.rover.client.impl.PolarSysRoverPlatformClientImpl
		 * @see org.eclipse.polarsys.rover.client.impl.PolarSysRoverClientPackageImpl#getPolarSysRoverPlatformClient()
		 * @generated
		 */
		EClass POLAR_SYS_ROVER_PLATFORM_CLIENT = eINSTANCE.getPolarSysRoverPlatformClient();

		/**
		 * The meta object literal for the '<em><b>Initialized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLAR_SYS_ROVER_PLATFORM_CLIENT__INITIALIZED = eINSTANCE.getPolarSysRoverPlatformClient_Initialized();

		/**
		 * The meta object literal for the '<em><b>Disposed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLAR_SYS_ROVER_PLATFORM_CLIENT__DISPOSED = eINSTANCE.getPolarSysRoverPlatformClient_Disposed();

		/**
		 * The meta object literal for the '<em><b>Position Error</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLAR_SYS_ROVER_PLATFORM_CLIENT__POSITION_ERROR = eINSTANCE.getPolarSysRoverPlatformClient_PositionError();

		/**
		 * The meta object literal for the '<em><b>Left Power Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLAR_SYS_ROVER_PLATFORM_CLIENT__LEFT_POWER_LEVEL = eINSTANCE.getPolarSysRoverPlatformClient_LeftPowerLevel();

		/**
		 * The meta object literal for the '<em><b>Right Power Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLAR_SYS_ROVER_PLATFORM_CLIENT__RIGHT_POWER_LEVEL = eINSTANCE.getPolarSysRoverPlatformClient_RightPowerLevel();

		/**
		 * The meta object literal for the '<em><b>Left Wheel Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLAR_SYS_ROVER_PLATFORM_CLIENT__LEFT_WHEEL_POSITION = eINSTANCE.getPolarSysRoverPlatformClient_LeftWheelPosition();

		/**
		 * The meta object literal for the '<em><b>Right Wheel Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLAR_SYS_ROVER_PLATFORM_CLIENT__RIGHT_WHEEL_POSITION = eINSTANCE.getPolarSysRoverPlatformClient_RightWheelPosition();

		/**
		 * The meta object literal for the '<em><b>Front Sonar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_SONAR = eINSTANCE.getPolarSysRoverPlatformClient_FrontSonar();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLAR_SYS_ROVER_PLATFORM_CLIENT__POSITION = eINSTANCE.getPolarSysRoverPlatformClient_Position();

		/**
		 * The meta object literal for the '<em><b>Front Camera</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_CAMERA = eINSTANCE.getPolarSysRoverPlatformClient_FrontCamera();

		/**
		 * The meta object literal for the '<em><b>Wheel Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLAR_SYS_ROVER_PLATFORM_CLIENT__WHEEL_RADIUS = eINSTANCE.getPolarSysRoverPlatformClient_WheelRadius();

		/**
		 * The meta object literal for the '<em><b>Wheel Track</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLAR_SYS_ROVER_PLATFORM_CLIENT__WHEEL_TRACK = eINSTANCE.getPolarSysRoverPlatformClient_WheelTrack();

		/**
		 * The meta object literal for the '<em><b>Move Wait Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLAR_SYS_ROVER_PLATFORM_CLIENT__MOVE_WAIT_PERIOD = eINSTANCE.getPolarSysRoverPlatformClient_MoveWaitPeriod();

		/**
		 * The meta object literal for the '<em><b>Move To Min Lin Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLAR_SYS_ROVER_PLATFORM_CLIENT__MOVE_TO_MIN_LIN_SPEED = eINSTANCE.getPolarSysRoverPlatformClient_MoveToMinLinSpeed();

		/**
		 * The meta object literal for the '<em><b>Error Per Meter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLAR_SYS_ROVER_PLATFORM_CLIENT__ERROR_PER_METER = eINSTANCE.getPolarSysRoverPlatformClient_ErrorPerMeter();

		/**
		 * The meta object literal for the '<em><b>Max Power Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLAR_SYS_ROVER_PLATFORM_CLIENT__MAX_POWER_LEVEL = eINSTANCE.getPolarSysRoverPlatformClient_MaxPowerLevel();

		/**
		 * The meta object literal for the '<em><b>Max Ctr Power Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLAR_SYS_ROVER_PLATFORM_CLIENT__MAX_CTR_POWER_LEVEL = eINSTANCE.getPolarSysRoverPlatformClient_MaxCtrPowerLevel();

		/**
		 * The meta object literal for the '<em><b>Max Ang Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLAR_SYS_ROVER_PLATFORM_CLIENT__MAX_ANG_VELOCITY = eINSTANCE.getPolarSysRoverPlatformClient_MaxAngVelocity();

		/**
		 * The meta object literal for the '<em><b>Max Lin Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLAR_SYS_ROVER_PLATFORM_CLIENT__MAX_LIN_VELOCITY = eINSTANCE.getPolarSysRoverPlatformClient_MaxLinVelocity();

		/**
		 * The meta object literal for the '<em><b>Distance Between Wheels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLAR_SYS_ROVER_PLATFORM_CLIENT__DISTANCE_BETWEEN_WHEELS = eINSTANCE.getPolarSysRoverPlatformClient_DistanceBetweenWheels();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POLAR_SYS_ROVER_PLATFORM_CLIENT___INIT = eINSTANCE.getPolarSysRoverPlatformClient__Init();

		/**
		 * The meta object literal for the '<em><b>Reset Position</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POLAR_SYS_ROVER_PLATFORM_CLIENT___RESET_POSITION__POSITION = eINSTANCE.getPolarSysRoverPlatformClient__ResetPosition__Position();

		/**
		 * The meta object literal for the '<em><b>Clear Position Error</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POLAR_SYS_ROVER_PLATFORM_CLIENT___CLEAR_POSITION_ERROR = eINSTANCE.getPolarSysRoverPlatformClient__ClearPositionError();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POLAR_SYS_ROVER_PLATFORM_CLIENT___STOP = eINSTANCE.getPolarSysRoverPlatformClient__Stop();

		/**
		 * The meta object literal for the '<em><b>Cmd Velocities</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POLAR_SYS_ROVER_PLATFORM_CLIENT___CMD_VELOCITIES__DOUBLE_DOUBLE = eINSTANCE.getPolarSysRoverPlatformClient__CmdVelocities__double_double();

		/**
		 * The meta object literal for the '<em><b>Cmd Power Level</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POLAR_SYS_ROVER_PLATFORM_CLIENT___CMD_POWER_LEVEL__DOUBLE_DOUBLE = eINSTANCE.getPolarSysRoverPlatformClient__CmdPowerLevel__double_double();

	}

} //PolarSysRoverClientPackage
