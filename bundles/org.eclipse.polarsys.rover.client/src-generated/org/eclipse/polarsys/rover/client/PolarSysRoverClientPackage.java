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
	 * The meta object id for the '{@link org.eclipse.polarsys.rover.client.impl.PolarSysRoverPlatformClientImpl <em>Polar Sys Rover Platform Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.polarsys.rover.client.impl.PolarSysRoverPlatformClientImpl
	 * @see org.eclipse.polarsys.rover.client.impl.PolarSysRoverClientPackageImpl#getPolarSysRoverPlatformClient()
	 * @generated
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT = 1;

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
	 * The feature id for the '<em><b>Linear Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT__LINEAR_VELOCITY = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Angular Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT__ANGULAR_VELOCITY = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Front Left Wheel Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_LEFT_WHEEL_POSITION = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Front Right Wheel Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_RIGHT_WHEEL_POSITION = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Rear Left Wheel Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT__REAR_LEFT_WHEEL_POSITION = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Rear Right Wheel Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT__REAR_RIGHT_WHEEL_POSITION = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT__POSITION = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Polar Sys Rover Platform Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_FEATURE_COUNT = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 10;

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
	 * The number of operations of the '<em>Polar Sys Rover Platform Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_OPERATION_COUNT = ApogyCommonEMFPackage.DISPOSABLE_OPERATION_COUNT + 5;


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
	 * Returns the meta object for the attribute '{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getLinearVelocity <em>Linear Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Linear Velocity</em>'.
	 * @see org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getLinearVelocity()
	 * @see #getPolarSysRoverPlatformClient()
	 * @generated
	 */
	EAttribute getPolarSysRoverPlatformClient_LinearVelocity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getAngularVelocity <em>Angular Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angular Velocity</em>'.
	 * @see org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getAngularVelocity()
	 * @see #getPolarSysRoverPlatformClient()
	 * @generated
	 */
	EAttribute getPolarSysRoverPlatformClient_AngularVelocity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getFrontLeftWheelPosition <em>Front Left Wheel Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Front Left Wheel Position</em>'.
	 * @see org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getFrontLeftWheelPosition()
	 * @see #getPolarSysRoverPlatformClient()
	 * @generated
	 */
	EAttribute getPolarSysRoverPlatformClient_FrontLeftWheelPosition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getFrontRightWheelPosition <em>Front Right Wheel Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Front Right Wheel Position</em>'.
	 * @see org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getFrontRightWheelPosition()
	 * @see #getPolarSysRoverPlatformClient()
	 * @generated
	 */
	EAttribute getPolarSysRoverPlatformClient_FrontRightWheelPosition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getRearLeftWheelPosition <em>Rear Left Wheel Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rear Left Wheel Position</em>'.
	 * @see org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getRearLeftWheelPosition()
	 * @see #getPolarSysRoverPlatformClient()
	 * @generated
	 */
	EAttribute getPolarSysRoverPlatformClient_RearLeftWheelPosition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getRearRightWheelPosition <em>Rear Right Wheel Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rear Right Wheel Position</em>'.
	 * @see org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getRearRightWheelPosition()
	 * @see #getPolarSysRoverPlatformClient()
	 * @generated
	 */
	EAttribute getPolarSysRoverPlatformClient_RearRightWheelPosition();

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
		 * The meta object literal for the '<em><b>Linear Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLAR_SYS_ROVER_PLATFORM_CLIENT__LINEAR_VELOCITY = eINSTANCE.getPolarSysRoverPlatformClient_LinearVelocity();

		/**
		 * The meta object literal for the '<em><b>Angular Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLAR_SYS_ROVER_PLATFORM_CLIENT__ANGULAR_VELOCITY = eINSTANCE.getPolarSysRoverPlatformClient_AngularVelocity();

		/**
		 * The meta object literal for the '<em><b>Front Left Wheel Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_LEFT_WHEEL_POSITION = eINSTANCE.getPolarSysRoverPlatformClient_FrontLeftWheelPosition();

		/**
		 * The meta object literal for the '<em><b>Front Right Wheel Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_RIGHT_WHEEL_POSITION = eINSTANCE.getPolarSysRoverPlatformClient_FrontRightWheelPosition();

		/**
		 * The meta object literal for the '<em><b>Rear Left Wheel Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLAR_SYS_ROVER_PLATFORM_CLIENT__REAR_LEFT_WHEEL_POSITION = eINSTANCE.getPolarSysRoverPlatformClient_RearLeftWheelPosition();

		/**
		 * The meta object literal for the '<em><b>Rear Right Wheel Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLAR_SYS_ROVER_PLATFORM_CLIENT__REAR_RIGHT_WHEEL_POSITION = eINSTANCE.getPolarSysRoverPlatformClient_RearRightWheelPosition();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLAR_SYS_ROVER_PLATFORM_CLIENT__POSITION = eINSTANCE.getPolarSysRoverPlatformClient_Position();

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

	}

} //PolarSysRoverClientPackage
