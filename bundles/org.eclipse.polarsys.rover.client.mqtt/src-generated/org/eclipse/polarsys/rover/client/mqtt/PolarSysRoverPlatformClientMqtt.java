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
 * </ul>
 *
 * @see org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverClientMqttPackage#getPolarSysRoverPlatformClientMqtt()
 * @model
 * @generated
 */
public interface PolarSysRoverPlatformClientMqtt extends PolarSysRoverPlatformClient {

	/**
	 * Returns the value of the '<em><b>Broker</b></em>' attribute.
	 * The default value is <code>"tcp://192.168.0.150:1883"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Broker</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Broker</em>' attribute.
	 * @see #setBroker(String)
	 * @see org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverClientMqttPackage#getPolarSysRoverPlatformClientMqtt_Broker()
	 * @model default="tcp://192.168.0.150:1883" unique="false"
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
} // PolarSysRoverClientMqtt
