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
package org.eclipse.polarsys.rover.client.mqtt;

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
 * @see org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverClientMqttFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='PolarSysRoverClientMqtt' copyrightText='Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation' modelName='PolarSysRoverClientMqtt' childCreationExtenders='true' extensibleProviderFactory='true' suppressGenModelAnnotations='false' dynamicTemplates='true' templateDirectory='platform:/plugin/ca.gc.asc_csa.apogy.common.emf.templates' modelDirectory='/org.eclipse.polarsys.rover.client.mqtt/src-generated' editDirectory='/org.eclipse.polarsys.rover.client.mqtt.edit/src-generated' basePackage='org.eclipse.polarsys.rover.client'"
 * @generated
 */
public interface PolarSysRoverClientMqttPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mqtt";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.eclipse.polarsys.rover.client.mqtt";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mqtt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PolarSysRoverClientMqttPackage eINSTANCE = org.eclipse.polarsys.rover.client.mqtt.impl.PolarSysRoverClientMqttPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.polarsys.rover.client.mqtt.impl.PolarSysRoverPlatformClientMqttImpl <em>Polar Sys Rover Platform Client Mqtt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.polarsys.rover.client.mqtt.impl.PolarSysRoverPlatformClientMqttImpl
	 * @see org.eclipse.polarsys.rover.client.mqtt.impl.PolarSysRoverClientMqttPackageImpl#getPolarSysRoverPlatformClientMqtt()
	 * @generated
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT = 0;

	/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__INITIALIZED = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__INITIALIZED;

	/**
	 * The feature id for the '<em><b>Disposed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__DISPOSED = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__DISPOSED;

	/**
	 * The feature id for the '<em><b>Position Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__POSITION_ERROR = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__POSITION_ERROR;

	/**
	 * The feature id for the '<em><b>Linear Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__LINEAR_VELOCITY = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__LINEAR_VELOCITY;

	/**
	 * The feature id for the '<em><b>Angular Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__ANGULAR_VELOCITY = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__ANGULAR_VELOCITY;

	/**
	 * The feature id for the '<em><b>Left Wheel Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__LEFT_WHEEL_POSITION = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__LEFT_WHEEL_POSITION;

	/**
	 * The feature id for the '<em><b>Right Wheel Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__RIGHT_WHEEL_POSITION = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__RIGHT_WHEEL_POSITION;

	/**
	 * The feature id for the '<em><b>Front Sonar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__FRONT_SONAR = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_SONAR;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__POSITION = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__POSITION;

	/**
	 * The feature id for the '<em><b>Front Camera</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__FRONT_CAMERA = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_CAMERA;

	/**
	 * The feature id for the '<em><b>Broker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__BROKER = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Qos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__QOS = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Client Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__CLIENT_ID = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Front Camera Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__FRONT_CAMERA_TOPIC = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sensors Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__SENSORS_TOPIC = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Controls Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__CONTROLS_TOPIC = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Front Camera Horizontal FOV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__FRONT_CAMERA_HORIZONTAL_FOV = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Front Camera Vertical FOV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__FRONT_CAMERA_VERTICAL_FOV = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Polar Sys Rover Platform Client Mqtt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT_FEATURE_COUNT = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT___DISPOSE = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT___DISPOSE;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT___INIT = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT___INIT;

	/**
	 * The operation id for the '<em>Reset Position</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT___RESET_POSITION__POSITION = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT___RESET_POSITION__POSITION;

	/**
	 * The operation id for the '<em>Clear Position Error</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT___CLEAR_POSITION_ERROR = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT___CLEAR_POSITION_ERROR;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT___STOP = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT___STOP;

	/**
	 * The operation id for the '<em>Cmd Velocities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT___CMD_VELOCITIES__DOUBLE_DOUBLE = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT___CMD_VELOCITIES__DOUBLE_DOUBLE;

	/**
	 * The operation id for the '<em>Cmd Power Level</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT___CMD_POWER_LEVEL__DOUBLE_DOUBLE = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT___CMD_POWER_LEVEL__DOUBLE_DOUBLE;

	/**
	 * The number of operations of the '<em>Polar Sys Rover Platform Client Mqtt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT_OPERATION_COUNT = PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverPlatformClientMqtt <em>Polar Sys Rover Platform Client Mqtt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polar Sys Rover Platform Client Mqtt</em>'.
	 * @see org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverPlatformClientMqtt
	 * @generated
	 */
	EClass getPolarSysRoverPlatformClientMqtt();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverPlatformClientMqtt#getBroker <em>Broker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Broker</em>'.
	 * @see org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverPlatformClientMqtt#getBroker()
	 * @see #getPolarSysRoverPlatformClientMqtt()
	 * @generated
	 */
	EAttribute getPolarSysRoverPlatformClientMqtt_Broker();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverPlatformClientMqtt#getQos <em>Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qos</em>'.
	 * @see org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverPlatformClientMqtt#getQos()
	 * @see #getPolarSysRoverPlatformClientMqtt()
	 * @generated
	 */
	EAttribute getPolarSysRoverPlatformClientMqtt_Qos();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverPlatformClientMqtt#getClientId <em>Client Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Id</em>'.
	 * @see org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverPlatformClientMqtt#getClientId()
	 * @see #getPolarSysRoverPlatformClientMqtt()
	 * @generated
	 */
	EAttribute getPolarSysRoverPlatformClientMqtt_ClientId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverPlatformClientMqtt#getFrontCameraTopic <em>Front Camera Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Front Camera Topic</em>'.
	 * @see org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverPlatformClientMqtt#getFrontCameraTopic()
	 * @see #getPolarSysRoverPlatformClientMqtt()
	 * @generated
	 */
	EAttribute getPolarSysRoverPlatformClientMqtt_FrontCameraTopic();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverPlatformClientMqtt#getSensorsTopic <em>Sensors Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sensors Topic</em>'.
	 * @see org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverPlatformClientMqtt#getSensorsTopic()
	 * @see #getPolarSysRoverPlatformClientMqtt()
	 * @generated
	 */
	EAttribute getPolarSysRoverPlatformClientMqtt_SensorsTopic();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverPlatformClientMqtt#getControlsTopic <em>Controls Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Controls Topic</em>'.
	 * @see org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverPlatformClientMqtt#getControlsTopic()
	 * @see #getPolarSysRoverPlatformClientMqtt()
	 * @generated
	 */
	EAttribute getPolarSysRoverPlatformClientMqtt_ControlsTopic();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverPlatformClientMqtt#getFrontCameraHorizontalFOV <em>Front Camera Horizontal FOV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Front Camera Horizontal FOV</em>'.
	 * @see org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverPlatformClientMqtt#getFrontCameraHorizontalFOV()
	 * @see #getPolarSysRoverPlatformClientMqtt()
	 * @generated
	 */
	EAttribute getPolarSysRoverPlatformClientMqtt_FrontCameraHorizontalFOV();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverPlatformClientMqtt#getFrontCameraVerticalFOV <em>Front Camera Vertical FOV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Front Camera Vertical FOV</em>'.
	 * @see org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverPlatformClientMqtt#getFrontCameraVerticalFOV()
	 * @see #getPolarSysRoverPlatformClientMqtt()
	 * @generated
	 */
	EAttribute getPolarSysRoverPlatformClientMqtt_FrontCameraVerticalFOV();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PolarSysRoverClientMqttFactory getPolarSysRoverClientMqttFactory();

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
		 * The meta object literal for the '{@link org.eclipse.polarsys.rover.client.mqtt.impl.PolarSysRoverPlatformClientMqttImpl <em>Polar Sys Rover Platform Client Mqtt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.polarsys.rover.client.mqtt.impl.PolarSysRoverPlatformClientMqttImpl
		 * @see org.eclipse.polarsys.rover.client.mqtt.impl.PolarSysRoverClientMqttPackageImpl#getPolarSysRoverPlatformClientMqtt()
		 * @generated
		 */
		EClass POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT = eINSTANCE.getPolarSysRoverPlatformClientMqtt();
		/**
		 * The meta object literal for the '<em><b>Broker</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__BROKER = eINSTANCE.getPolarSysRoverPlatformClientMqtt_Broker();
		/**
		 * The meta object literal for the '<em><b>Qos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__QOS = eINSTANCE.getPolarSysRoverPlatformClientMqtt_Qos();
		/**
		 * The meta object literal for the '<em><b>Client Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__CLIENT_ID = eINSTANCE.getPolarSysRoverPlatformClientMqtt_ClientId();
		/**
		 * The meta object literal for the '<em><b>Front Camera Topic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__FRONT_CAMERA_TOPIC = eINSTANCE.getPolarSysRoverPlatformClientMqtt_FrontCameraTopic();
		/**
		 * The meta object literal for the '<em><b>Sensors Topic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__SENSORS_TOPIC = eINSTANCE.getPolarSysRoverPlatformClientMqtt_SensorsTopic();
		/**
		 * The meta object literal for the '<em><b>Controls Topic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__CONTROLS_TOPIC = eINSTANCE.getPolarSysRoverPlatformClientMqtt_ControlsTopic();
		/**
		 * The meta object literal for the '<em><b>Front Camera Horizontal FOV</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__FRONT_CAMERA_HORIZONTAL_FOV = eINSTANCE.getPolarSysRoverPlatformClientMqtt_FrontCameraHorizontalFOV();
		/**
		 * The meta object literal for the '<em><b>Front Camera Vertical FOV</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__FRONT_CAMERA_VERTICAL_FOV = eINSTANCE.getPolarSysRoverPlatformClientMqtt_FrontCameraVerticalFOV();

	}

} //PolarSysRoverClientMqttPackage
