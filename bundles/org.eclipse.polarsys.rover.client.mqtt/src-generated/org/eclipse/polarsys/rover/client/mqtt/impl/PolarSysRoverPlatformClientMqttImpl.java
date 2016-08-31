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
package org.eclipse.polarsys.rover.client.mqtt.impl;

import java.sql.Timestamp;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;
import org.eclipse.polarsys.rover.client.Position;
import org.eclipse.polarsys.rover.client.impl.PolarSysRoverPlatformClientImpl;
import org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverClientMqttPackage;
import org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverPlatformClientMqtt;
import org.eclipse.polarsys.rover.client.mqtt.proto.Controls;
import org.eclipse.polarsys.rover.client.mqtt.proto.Controls.RoverControls;
import org.eclipse.polarsys.rover.client.mqtt.proto.Controls.RoverControls.Builder;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Polar Sys Rover Client Mqtt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.polarsys.rover.client.mqtt.impl.PolarSysRoverPlatformClientMqttImpl#getBroker <em>Broker</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.mqtt.impl.PolarSysRoverPlatformClientMqttImpl#getQos <em>Qos</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.mqtt.impl.PolarSysRoverPlatformClientMqttImpl#getClientId <em>Client Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PolarSysRoverPlatformClientMqttImpl extends PolarSysRoverPlatformClientImpl implements PolarSysRoverPlatformClientMqtt {
	/**
	 * The default value of the '{@link #getBroker() <em>Broker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBroker()
	 * @generated
	 * @ordered
	 */
	protected static final String BROKER_EDEFAULT = "tcp://192.168.0.150:1883";
	/**
	 * The cached value of the '{@link #getBroker() <em>Broker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBroker()
	 * @generated
	 * @ordered
	 */
	protected String broker = BROKER_EDEFAULT;

	/**
	 * The default value of the '{@link #getQos() <em>Qos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQos()
	 * @generated
	 * @ordered
	 */
	protected static final byte QOS_EDEFAULT = 0x02;
	/**
	 * The cached value of the '{@link #getQos() <em>Qos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQos()
	 * @generated
	 * @ordered
	 */
	protected byte qos = QOS_EDEFAULT;
	/**
	 * The default value of the '{@link #getClientId() <em>Client Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientId()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_ID_EDEFAULT = "Default";
	/**
	 * The cached value of the '{@link #getClientId() <em>Client Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientId()
	 * @generated
	 * @ordered
	 */
	protected String clientId = CLIENT_ID_EDEFAULT;
	private MqttClient sampleClient;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolarSysRoverPlatformClientMqttImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolarSysRoverClientMqttPackage.Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBroker() {
		return broker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBroker(String newBroker) {
		String oldBroker = broker;
		broker = newBroker;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolarSysRoverClientMqttPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__BROKER, oldBroker, broker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getQos() {
		return qos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQos(byte newQos) {
		byte oldQos = qos;
		qos = newQos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolarSysRoverClientMqttPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__QOS, oldQos, qos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClientId() {
		return clientId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientId(String newClientId) {
		String oldClientId = clientId;
		clientId = newClientId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolarSysRoverClientMqttPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__CLIENT_ID, oldClientId, clientId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PolarSysRoverClientMqttPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__BROKER:
				return getBroker();
			case PolarSysRoverClientMqttPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__QOS:
				return getQos();
			case PolarSysRoverClientMqttPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__CLIENT_ID:
				return getClientId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PolarSysRoverClientMqttPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__BROKER:
				setBroker((String)newValue);
				return;
			case PolarSysRoverClientMqttPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__QOS:
				setQos((Byte)newValue);
				return;
			case PolarSysRoverClientMqttPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__CLIENT_ID:
				setClientId((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PolarSysRoverClientMqttPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__BROKER:
				setBroker(BROKER_EDEFAULT);
				return;
			case PolarSysRoverClientMqttPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__QOS:
				setQos(QOS_EDEFAULT);
				return;
			case PolarSysRoverClientMqttPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__CLIENT_ID:
				setClientId(CLIENT_ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PolarSysRoverClientMqttPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__BROKER:
				return BROKER_EDEFAULT == null ? broker != null : !BROKER_EDEFAULT.equals(broker);
			case PolarSysRoverClientMqttPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__QOS:
				return qos != QOS_EDEFAULT;
			case PolarSysRoverClientMqttPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__CLIENT_ID:
				return CLIENT_ID_EDEFAULT == null ? clientId != null : !CLIENT_ID_EDEFAULT.equals(clientId);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (broker: ");
		result.append(broker);
		result.append(", qos: ");
		result.append(qos);
		result.append(", clientId: ");
		result.append(clientId);
		result.append(')');
		return result.toString();
	}

	@Override
	public boolean init() {
		boolean result = super.init();
		
		MemoryPersistence persistence = new MemoryPersistence();		
		try {
			sampleClient = new MqttClient(broker, clientId, persistence);			
			sampleClient.setCallback(new MqttCallback() {
				
				@Override
				public void messageArrived(String topic, MqttMessage message) throws Exception {
			        String time = new Timestamp(System.currentTimeMillis()).toString();
			        System.out.println("\nReceived a Message!" +
			            "\n\tTime:    " + time +
			            "\n\tTopic:   " + topic +
			            "\n\tMessage: " + new String(message.getPayload()) +
			            "\n\tQoS:     " + message.getQos() + "\n");				
				}
				
				@Override
				public void deliveryComplete(IMqttDeliveryToken arg0) {
				}
				
				@Override
				public void connectionLost(Throwable arg0) {
				}
			});
			
			sampleClient.subscribe("/polarsys-rover/sensors", 0);
			
	        MqttConnectOptions connOpts = new MqttConnectOptions();
	        connOpts.setCleanSession(true);
	        System.out.println("Connecting to broker: "+broker);
	        sampleClient.connect(connOpts);
	        System.out.println("Connected");			
		} catch (MqttException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public void cmdVelocities(double linearVelocity, double angularVelocity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resetPosition(Position position) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clearPositionError() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		cmdPowerLevel(0, 0);
	}

	@Override
	public void dispose() {
		try {
			sampleClient.disconnect();
		} catch (MqttException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void cmdPowerLevel(double leftPowerLevel, double rightPowerLevel) {
		Builder builder = Controls.RoverControls.newBuilder();
		RoverControls content = builder.setLeft((int) leftPowerLevel)
			.setRight((int) rightPowerLevel).build();
		
		MqttMessage message = new MqttMessage(content.toByteArray());
		
      message.setQos(qos);
      
      String topic        = "/polarsys-rover/controls";
      try {
		sampleClient.publish(topic, message);
	} catch (MqttException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
	
//	
//	@Override
//	public void cmdLeftPowerLevel(byte powerLevel) {
//		
//		Builder builder = Controls.RoverControls.newBuilder();
//				.setLeft(powerLevel)
//				.build();
//		
//        MqttMessage message = new MqttMessage(content.getBytes());
//        message.setQos(qos);
//        sampleClient.publish(topic, message);
//        System.out.println("Message published");
//        sampleClient.disconnect();
//        System.out.println("Disconnected");
//        System.exit(0);		
//	}
//	
//	@Override
//	public void cmdRightPowerLevel(byte powerLevel) {
//		// TODO Auto-generated method stub
//		super.cmdRightPowerLevel(powerLevel);
//	}

} //PolarSysRoverClientMqttImpl
