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

import org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polar Sys Rover Client Mqtt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverPlatformClientMqtt#getBroker <em>Broker</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverPlatformClientMqtt#getQos <em>Qos</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverPlatformClientMqtt#getClientId <em>Client Id</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverPlatformClientMqtt#getFrontCameraTopic <em>Front Camera Topic</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverPlatformClientMqtt#getSensorsTopic <em>Sensors Topic</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverPlatformClientMqtt#getControlsTopic <em>Controls Topic</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverPlatformClientMqtt#getFrontCameraHorizontalFOV <em>Front Camera Horizontal FOV</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverPlatformClientMqtt#getFrontCameraVerticalFOV <em>Front Camera Vertical FOV</em>}</li>
 * </ul>
 *
 * @see org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverClientMqttPackage#getPolarSysRoverPlatformClientMqtt()
 * @model
 * @generated
 */
public interface PolarSysRoverPlatformClientMqtt extends PolarSysRoverPlatformClient {

	/**
	 * Returns the value of the '<em><b>Broker</b></em>' attribute.
	 * The default value is <code>"tcp://192.168.0.151:1883"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Broker</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Broker</em>' attribute.
	 * @see #setBroker(String)
	 * @see org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverClientMqttPackage#getPolarSysRoverPlatformClientMqtt_Broker()
	 * @model default="tcp://192.168.0.151:1883" unique="false"
	 * @generated
	 */
	String getBroker();

	/**
	 * Sets the value of the '{@link org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverPlatformClientMqtt#getBroker <em>Broker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Broker</em>' attribute.
	 * @see #getBroker()
	 * @generated
	 */
	void setBroker(String value);

	/**
	 * Returns the value of the '<em><b>Qos</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qos</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qos</em>' attribute.
	 * @see #setQos(byte)
	 * @see org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverClientMqttPackage#getPolarSysRoverPlatformClientMqtt_Qos()
	 * @model default="2" unique="false"
	 * @generated
	 */
	byte getQos();

	/**
	 * Sets the value of the '{@link org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverPlatformClientMqtt#getQos <em>Qos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qos</em>' attribute.
	 * @see #getQos()
	 * @generated
	 */
	void setQos(byte value);

	/**
	 * Returns the value of the '<em><b>Client Id</b></em>' attribute.
	 * The default value is <code>"Default"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Id</em>' attribute.
	 * @see #setClientId(String)
	 * @see org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverClientMqttPackage#getPolarSysRoverPlatformClientMqtt_ClientId()
	 * @model default="Default" unique="false"
	 * @generated
	 */
	String getClientId();

	/**
	 * Sets the value of the '{@link org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverPlatformClientMqtt#getClientId <em>Client Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Id</em>' attribute.
	 * @see #getClientId()
	 * @generated
	 */
	void setClientId(String value);

	/**
	 * Returns the value of the '<em><b>Front Camera Topic</b></em>' attribute.
	 * The default value is <code>"/polarsys-rover/front-camera"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Front Camera Topic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Front Camera Topic</em>' attribute.
	 * @see #setFrontCameraTopic(String)
	 * @see org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverClientMqttPackage#getPolarSysRoverPlatformClientMqtt_FrontCameraTopic()
	 * @model default="/polarsys-rover/front-camera" unique="false"
	 * @generated
	 */
	String getFrontCameraTopic();

	/**
	 * Sets the value of the '{@link org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverPlatformClientMqtt#getFrontCameraTopic <em>Front Camera Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Front Camera Topic</em>' attribute.
	 * @see #getFrontCameraTopic()
	 * @generated
	 */
	void setFrontCameraTopic(String value);

	/**
	 * Returns the value of the '<em><b>Sensors Topic</b></em>' attribute.
	 * The default value is <code>"/polarsys-rover/sensors"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensors Topic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensors Topic</em>' attribute.
	 * @see #setSensorsTopic(String)
	 * @see org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverClientMqttPackage#getPolarSysRoverPlatformClientMqtt_SensorsTopic()
	 * @model default="/polarsys-rover/sensors" unique="false"
	 * @generated
	 */
	String getSensorsTopic();

	/**
	 * Sets the value of the '{@link org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverPlatformClientMqtt#getSensorsTopic <em>Sensors Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensors Topic</em>' attribute.
	 * @see #getSensorsTopic()
	 * @generated
	 */
	void setSensorsTopic(String value);

	/**
	 * Returns the value of the '<em><b>Controls Topic</b></em>' attribute.
	 * The default value is <code>"/polarsys-rover/controls"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controls Topic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controls Topic</em>' attribute.
	 * @see #setControlsTopic(String)
	 * @see org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverClientMqttPackage#getPolarSysRoverPlatformClientMqtt_ControlsTopic()
	 * @model default="/polarsys-rover/controls" unique="false"
	 * @generated
	 */
	String getControlsTopic();

	/**
	 * Sets the value of the '{@link org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverPlatformClientMqtt#getControlsTopic <em>Controls Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controls Topic</em>' attribute.
	 * @see #getControlsTopic()
	 * @generated
	 */
	void setControlsTopic(String value);

	/**
	 * Returns the value of the '<em><b>Front Camera Horizontal FOV</b></em>' attribute.
	 * The default value is <code>"53.5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Front Camera Horizontal FOV</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Front Camera Horizontal FOV</em>' attribute.
	 * @see #setFrontCameraHorizontalFOV(double)
	 * @see org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverClientMqttPackage#getPolarSysRoverPlatformClientMqtt_FrontCameraHorizontalFOV()
	 * @model default="53.5" unique="false"
	 * @generated
	 */
	double getFrontCameraHorizontalFOV();

	/**
	 * Sets the value of the '{@link org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverPlatformClientMqtt#getFrontCameraHorizontalFOV <em>Front Camera Horizontal FOV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Front Camera Horizontal FOV</em>' attribute.
	 * @see #getFrontCameraHorizontalFOV()
	 * @generated
	 */
	void setFrontCameraHorizontalFOV(double value);

	/**
	 * Returns the value of the '<em><b>Front Camera Vertical FOV</b></em>' attribute.
	 * The default value is <code>"41.4"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Front Camera Vertical FOV</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Front Camera Vertical FOV</em>' attribute.
	 * @see #setFrontCameraVerticalFOV(double)
	 * @see org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverClientMqttPackage#getPolarSysRoverPlatformClientMqtt_FrontCameraVerticalFOV()
	 * @model default="41.4" unique="false"
	 * @generated
	 */
	double getFrontCameraVerticalFOV();

	/**
	 * Sets the value of the '{@link org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverPlatformClientMqtt#getFrontCameraVerticalFOV <em>Front Camera Vertical FOV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Front Camera Vertical FOV</em>' attribute.
	 * @see #getFrontCameraVerticalFOV()
	 * @generated
	 */
	void setFrontCameraVerticalFOV(double value);
} // PolarSysRoverClientMqtt
