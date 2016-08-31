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
package org.eclipse.polarsys.rover.client.mqtt.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverClientMqttPackage;
import org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverPlatformClientMqtt;

import org.eclipse.polarsys.rover.client.provider.PolarSysRoverPlatformClientItemProvider;

/**
 * This is the item provider adapter for a {@link org.eclipse.polarsys.rover.client.mqtt.PolarSysRoverPlatformClientMqtt} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PolarSysRoverPlatformClientMqttItemProvider extends PolarSysRoverPlatformClientItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolarSysRoverPlatformClientMqttItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addBrokerPropertyDescriptor(object);
			addQosPropertyDescriptor(object);
			addClientIdPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Broker feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBrokerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolarSysRoverPlatformClientMqtt_broker_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolarSysRoverPlatformClientMqtt_broker_feature", "_UI_PolarSysRoverPlatformClientMqtt_type"),
				 PolarSysRoverClientMqttPackage.Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__BROKER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Qos feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQosPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolarSysRoverPlatformClientMqtt_qos_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolarSysRoverPlatformClientMqtt_qos_feature", "_UI_PolarSysRoverPlatformClientMqtt_type"),
				 PolarSysRoverClientMqttPackage.Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__QOS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Client Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClientIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolarSysRoverPlatformClientMqtt_clientId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolarSysRoverPlatformClientMqtt_clientId_feature", "_UI_PolarSysRoverPlatformClientMqtt_type"),
				 PolarSysRoverClientMqttPackage.Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__CLIENT_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns PolarSysRoverPlatformClientMqtt.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PolarSysRoverPlatformClientMqtt"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		PolarSysRoverPlatformClientMqtt polarSysRoverPlatformClientMqtt = (PolarSysRoverPlatformClientMqtt)object;
		return getString("_UI_PolarSysRoverPlatformClientMqtt_type") + " " + polarSysRoverPlatformClientMqtt.isInitialized();
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(PolarSysRoverPlatformClientMqtt.class)) {
			case PolarSysRoverClientMqttPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__BROKER:
			case PolarSysRoverClientMqttPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__QOS:
			case PolarSysRoverClientMqttPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_MQTT__CLIENT_ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
