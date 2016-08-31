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

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.sql.Timestamp;
import javax.imageio.ImageIO;

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
import org.eclipse.polarsys.rover.client.mqtt.proto.Sensors;
import org.eclipse.polarsys.rover.client.mqtt.proto.Sensors.RoverSensors;

import ca.gc.asc_csa.apogy.addons.sensors.fov.ApogyAddonsSensorsFOVFacade;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.ApogyAddonsSensorsImagingFactory;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.ImageSnapshot;
import ca.gc.asc_csa.apogy.common.images.ApogyCommonImagesFactory;
import ca.gc.asc_csa.apogy.common.images.EImage;

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
 *   <li>{@link org.eclipse.polarsys.rover.client.mqtt.impl.PolarSysRoverPlatformClientMqttImpl#getFrontCameraTopic <em>Front Camera Topic</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.mqtt.impl.PolarSysRoverPlatformClientMqttImpl#getSensorsTopic <em>Sensors Topic</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.mqtt.impl.PolarSysRoverPlatformClientMqttImpl#getControlsTopic <em>Controls Topic</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.mqtt.impl.PolarSysRoverPlatformClientMqttImpl#getFrontCameraHorizontalFOV <em>Front Camera Horizontal FOV</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.mqtt.impl.PolarSysRoverPlatformClientMqttImpl#getFrontCameraVerticalFOV <em>Front Camera Vertical FOV</em>}</li>
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
	protected static final String BROKER_EDEFAULT = "tcp://192.168.0.151:1883";
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
	/**
	 * The default value of the '{@link #getFrontCameraTopic() <em>Front Camera Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrontCameraTopic()
	 * @generated
	 * @ordered
	 */
	protected static final String FRONT_CAMERA_TOPIC_EDEFAULT = "/polarsys-rover/front-camera";
	/**
	 * The cached value of the '{@link #getFrontCameraTopic() <em>Front Camera Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrontCameraTopic()
	 * @generated
	 * @ordered
	 */
	protected String frontCameraTopic = FRONT_CAMERA_TOPIC_EDEFAULT;
	/**
	 * The default value of the '{@link #getSensorsTopic() <em>Sensors Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorsTopic()
	 * @generated
	 * @ordered
	 */
	protected static final String SENSORS_TOPIC_EDEFAULT = "/polarsys-rover/sensors";
	/**
	 * The cached value of the '{@link #getSensorsTopic() <em>Sensors Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorsTopic()
	 * @generated
	 * @ordered
	 */
	protected String sensorsTopic = SENSORS_TOPIC_EDEFAULT;
	/**
	 * The default value of the '{@link #getControlsTopic() <em>Controls Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlsTopic()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTROLS_TOPIC_EDEFAULT = "/polarsys-rover/controls";
	/**
	 * The cached value of the '{@link #getControlsTopic() <em>Controls Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlsTopic()
	 * @generated
	 * @ordered
	 */
	protected String controlsTopic = CONTROLS_TOPIC_EDEFAULT;
	/**
	 * The default value of the '{@link #getFrontCameraHorizontalFOV() <em>Front Camera Horizontal FOV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrontCameraHorizontalFOV()
	 * @generated
	 * @ordered
	 */
	protected static final double FRONT_CAMERA_HORIZONTAL_FOV_EDEFAULT = 53.5;
	/**
	 * The cached value of the '{@link #getFrontCameraHorizontalFOV() <em>Front Camera Horizontal FOV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrontCameraHorizontalFOV()
	 * @generated
	 * @ordered
	 */
	protected double frontCameraHorizontalFOV = FRONT_CAMERA_HORIZONTAL_FOV_EDEFAULT;
	/**
	 * The default value of the '{@link #getFrontCameraVerticalFOV() <em>Front Camera Vertical FOV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrontCameraVerticalFOV()
	 * @generated
	 * @ordered
	 */
	protected static final double FRONT_CAMERA_VERTICAL_FOV_EDEFAULT = 41.4;
	/**
	 * The cached value of the '{@link #getFrontCameraVerticalFOV() <em>Front Camera Vertical FOV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrontCameraVerticalFOV()
	 * @generated
	 * @ordered
	 */
	protected double frontCameraVerticalFOV = FRONT_CAMERA_VERTICAL_FOV_EDEFAULT;
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
	public String getFrontCameraTopic() {
		return frontCameraTopic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrontCameraTopic(String newFrontCameraTopic) {
		String oldFrontCameraTopic = frontCameraTopic;
		frontCameraTopic = newFrontCameraTopic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolarSysRoverClientMqttPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__FRONT_CAMERA_TOPIC, oldFrontCameraTopic, frontCameraTopic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSensorsTopic() {
		return sensorsTopic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensorsTopic(String newSensorsTopic) {
		String oldSensorsTopic = sensorsTopic;
		sensorsTopic = newSensorsTopic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolarSysRoverClientMqttPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__SENSORS_TOPIC, oldSensorsTopic, sensorsTopic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getControlsTopic() {
		return controlsTopic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlsTopic(String newControlsTopic) {
		String oldControlsTopic = controlsTopic;
		controlsTopic = newControlsTopic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolarSysRoverClientMqttPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__CONTROLS_TOPIC, oldControlsTopic, controlsTopic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFrontCameraHorizontalFOV() {
		return frontCameraHorizontalFOV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrontCameraHorizontalFOV(double newFrontCameraHorizontalFOV) {
		double oldFrontCameraHorizontalFOV = frontCameraHorizontalFOV;
		frontCameraHorizontalFOV = newFrontCameraHorizontalFOV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolarSysRoverClientMqttPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__FRONT_CAMERA_HORIZONTAL_FOV, oldFrontCameraHorizontalFOV, frontCameraHorizontalFOV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFrontCameraVerticalFOV() {
		return frontCameraVerticalFOV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrontCameraVerticalFOV(double newFrontCameraVerticalFOV) {
		double oldFrontCameraVerticalFOV = frontCameraVerticalFOV;
		frontCameraVerticalFOV = newFrontCameraVerticalFOV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolarSysRoverClientMqttPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__FRONT_CAMERA_VERTICAL_FOV, oldFrontCameraVerticalFOV, frontCameraVerticalFOV));
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
			case PolarSysRoverClientMqttPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__FRONT_CAMERA_TOPIC:
				return getFrontCameraTopic();
			case PolarSysRoverClientMqttPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__SENSORS_TOPIC:
				return getSensorsTopic();
			case PolarSysRoverClientMqttPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__CONTROLS_TOPIC:
				return getControlsTopic();
			case PolarSysRoverClientMqttPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__FRONT_CAMERA_HORIZONTAL_FOV:
				return getFrontCameraHorizontalFOV();
			case PolarSysRoverClientMqttPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__FRONT_CAMERA_VERTICAL_FOV:
				return getFrontCameraVerticalFOV();
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
			case PolarSysRoverClientMqttPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__FRONT_CAMERA_TOPIC:
				setFrontCameraTopic((String)newValue);
				return;
			case PolarSysRoverClientMqttPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__SENSORS_TOPIC:
				setSensorsTopic((String)newValue);
				return;
			case PolarSysRoverClientMqttPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__CONTROLS_TOPIC:
				setControlsTopic((String)newValue);
				return;
			case PolarSysRoverClientMqttPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__FRONT_CAMERA_HORIZONTAL_FOV:
				setFrontCameraHorizontalFOV((Double)newValue);
				return;
			case PolarSysRoverClientMqttPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__FRONT_CAMERA_VERTICAL_FOV:
				setFrontCameraVerticalFOV((Double)newValue);
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
			case PolarSysRoverClientMqttPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__FRONT_CAMERA_TOPIC:
				setFrontCameraTopic(FRONT_CAMERA_TOPIC_EDEFAULT);
				return;
			case PolarSysRoverClientMqttPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__SENSORS_TOPIC:
				setSensorsTopic(SENSORS_TOPIC_EDEFAULT);
				return;
			case PolarSysRoverClientMqttPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__CONTROLS_TOPIC:
				setControlsTopic(CONTROLS_TOPIC_EDEFAULT);
				return;
			case PolarSysRoverClientMqttPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__FRONT_CAMERA_HORIZONTAL_FOV:
				setFrontCameraHorizontalFOV(FRONT_CAMERA_HORIZONTAL_FOV_EDEFAULT);
				return;
			case PolarSysRoverClientMqttPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__FRONT_CAMERA_VERTICAL_FOV:
				setFrontCameraVerticalFOV(FRONT_CAMERA_VERTICAL_FOV_EDEFAULT);
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
			case PolarSysRoverClientMqttPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__FRONT_CAMERA_TOPIC:
				return FRONT_CAMERA_TOPIC_EDEFAULT == null ? frontCameraTopic != null : !FRONT_CAMERA_TOPIC_EDEFAULT.equals(frontCameraTopic);
			case PolarSysRoverClientMqttPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__SENSORS_TOPIC:
				return SENSORS_TOPIC_EDEFAULT == null ? sensorsTopic != null : !SENSORS_TOPIC_EDEFAULT.equals(sensorsTopic);
			case PolarSysRoverClientMqttPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__CONTROLS_TOPIC:
				return CONTROLS_TOPIC_EDEFAULT == null ? controlsTopic != null : !CONTROLS_TOPIC_EDEFAULT.equals(controlsTopic);
			case PolarSysRoverClientMqttPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__FRONT_CAMERA_HORIZONTAL_FOV:
				return frontCameraHorizontalFOV != FRONT_CAMERA_HORIZONTAL_FOV_EDEFAULT;
			case PolarSysRoverClientMqttPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__FRONT_CAMERA_VERTICAL_FOV:
				return frontCameraVerticalFOV != FRONT_CAMERA_VERTICAL_FOV_EDEFAULT;
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
		result.append(", frontCameraTopic: ");
		result.append(frontCameraTopic);
		result.append(", sensorsTopic: ");
		result.append(sensorsTopic);
		result.append(", controlsTopic: ");
		result.append(controlsTopic);
		result.append(", frontCameraHorizontalFOV: ");
		result.append(frontCameraHorizontalFOV);
		result.append(", frontCameraVerticalFOV: ");
		result.append(frontCameraVerticalFOV);
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
				            "\n\tQoS:     " + message.getQos() + "\n");				
					
					if (topic.equals(getSensorsTopic())){
						// Sensors Message.
						RoverSensors sensors = Sensors.RoverSensors.parseFrom(message.getPayload());
						
						if (sensors.hasSonar()) {
							setFrontSonar(sensors.getSonar());
						}
						
					}else if (topic.equals(getControlsTopic())){
						// Controls Message.
						
					}else if (topic.equals(getFrontCameraTopic())){
						// Front Camera Message.
						byte[] imageBytes = message.getPayload();
						
						if (imageBytes != null && imageBytes.length > 0) {
							// Deserialize image and create an EImage with it
							EImage eImage = ApogyCommonImagesFactory.eINSTANCE.createEImage();
							
							InputStream imageInputStream = new ByteArrayInputStream(imageBytes);

							// Read the byte array and write out the image
							BufferedImage convertedImage = ImageIO.read(imageInputStream);													
							eImage.setImageContent(convertedImage);

							// Set latest image snapshot to deserialized image
							ImageSnapshot imageSnapshot = ApogyAddonsSensorsImagingFactory.eINSTANCE.createImageSnapshot();
							imageSnapshot.setImage(eImage);
							imageSnapshot.setFieldOfView(ApogyAddonsSensorsFOVFacade.INSTANCE
									.createRectangularFrustrumFieldOfView(0, 100, Math.toRadians(getFrontCameraHorizontalFOV()), Math.toRadians(getFrontCameraVerticalFOV())));
							getFrontCamera().setLatestImageSnapshot(imageSnapshot);
						}						
					}
				}
				
				@Override
				public void deliveryComplete(IMqttDeliveryToken arg0) {
				}
				
				@Override
				public void connectionLost(Throwable arg0) {
				}
			});
			
			
	        MqttConnectOptions connOpts = new MqttConnectOptions();
	        connOpts.setCleanSession(true);
	        System.out.println("Connecting to broker: "+broker);
	        sampleClient.connect(connOpts);
	        System.out.println("Connected");	
	        sampleClient.subscribe(getControlsTopic(), 0);
	        sampleClient.subscribe(getFrontCameraTopic(), 0);
	        System.out.println("Subscribed");
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
      
      try {
		sampleClient.publish(getControlsTopic(), message);
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
