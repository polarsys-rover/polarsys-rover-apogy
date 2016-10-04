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
package org.eclipse.polarsys.rover.client.impl;

import ca.gc.asc_csa.apogy.addons.sensors.fov.RectangularFrustrumFieldOfView;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.impl.AbstractCameraImpl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.polarsys.rover.client.PolarSysCamera;
import org.eclipse.polarsys.rover.client.PolarSysRoverClientPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Polar Sys Camera</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.polarsys.rover.client.impl.PolarSysCameraImpl#getFov <em>Fov</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.impl.PolarSysCameraImpl#isInitialized <em>Initialized</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.impl.PolarSysCameraImpl#isStreamingEnabled <em>Streaming Enabled</em>}</li>
 * </ul>
 *
 * @generated
 */
abstract public class PolarSysCameraImpl extends AbstractCameraImpl implements PolarSysCamera {
	/**
	 * The cached value of the '{@link #getFov() <em>Fov</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFov()
	 * @generated
	 * @ordered
	 */
	protected RectangularFrustrumFieldOfView fov;

	/**
	 * The default value of the '{@link #isInitialized() <em>Initialized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitialized()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INITIALIZED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInitialized() <em>Initialized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitialized()
	 * @generated
	 * @ordered
	 */
	protected boolean initialized = INITIALIZED_EDEFAULT;

	/**
	 * The default value of the '{@link #isStreamingEnabled() <em>Streaming Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStreamingEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STREAMING_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStreamingEnabled() <em>Streaming Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStreamingEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean streamingEnabled = STREAMING_ENABLED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolarSysCameraImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolarSysRoverClientPackage.Literals.POLAR_SYS_CAMERA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectangularFrustrumFieldOfView getFov() {
		return fov;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFov(RectangularFrustrumFieldOfView newFov, NotificationChain msgs) {
		RectangularFrustrumFieldOfView oldFov = fov;
		fov = newFov;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PolarSysRoverClientPackage.POLAR_SYS_CAMERA__FOV, oldFov, newFov);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFov(RectangularFrustrumFieldOfView newFov) {
		if (newFov != fov) {
			NotificationChain msgs = null;
			if (fov != null)
				msgs = ((InternalEObject)fov).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PolarSysRoverClientPackage.POLAR_SYS_CAMERA__FOV, null, msgs);
			if (newFov != null)
				msgs = ((InternalEObject)newFov).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PolarSysRoverClientPackage.POLAR_SYS_CAMERA__FOV, null, msgs);
			msgs = basicSetFov(newFov, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolarSysRoverClientPackage.POLAR_SYS_CAMERA__FOV, newFov, newFov));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInitialized() {
		return initialized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialized(boolean newInitialized) {
		boolean oldInitialized = initialized;
		initialized = newInitialized;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolarSysRoverClientPackage.POLAR_SYS_CAMERA__INITIALIZED, oldInitialized, initialized));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStreamingEnabled() {
		return streamingEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStreamingEnabled(boolean newStreamingEnabled) {
		boolean oldStreamingEnabled = streamingEnabled;
		streamingEnabled = newStreamingEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolarSysRoverClientPackage.POLAR_SYS_CAMERA__STREAMING_ENABLED, oldStreamingEnabled, streamingEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	abstract public boolean init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	abstract public boolean commandStreaming(boolean streamingEnabled);


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PolarSysRoverClientPackage.POLAR_SYS_CAMERA__FOV:
				return basicSetFov(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PolarSysRoverClientPackage.POLAR_SYS_CAMERA__FOV:
				return getFov();
			case PolarSysRoverClientPackage.POLAR_SYS_CAMERA__INITIALIZED:
				return isInitialized();
			case PolarSysRoverClientPackage.POLAR_SYS_CAMERA__STREAMING_ENABLED:
				return isStreamingEnabled();
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
			case PolarSysRoverClientPackage.POLAR_SYS_CAMERA__FOV:
				setFov((RectangularFrustrumFieldOfView)newValue);
				return;
			case PolarSysRoverClientPackage.POLAR_SYS_CAMERA__INITIALIZED:
				setInitialized((Boolean)newValue);
				return;
			case PolarSysRoverClientPackage.POLAR_SYS_CAMERA__STREAMING_ENABLED:
				setStreamingEnabled((Boolean)newValue);
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
			case PolarSysRoverClientPackage.POLAR_SYS_CAMERA__FOV:
				setFov((RectangularFrustrumFieldOfView)null);
				return;
			case PolarSysRoverClientPackage.POLAR_SYS_CAMERA__INITIALIZED:
				setInitialized(INITIALIZED_EDEFAULT);
				return;
			case PolarSysRoverClientPackage.POLAR_SYS_CAMERA__STREAMING_ENABLED:
				setStreamingEnabled(STREAMING_ENABLED_EDEFAULT);
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
			case PolarSysRoverClientPackage.POLAR_SYS_CAMERA__FOV:
				return fov != null;
			case PolarSysRoverClientPackage.POLAR_SYS_CAMERA__INITIALIZED:
				return initialized != INITIALIZED_EDEFAULT;
			case PolarSysRoverClientPackage.POLAR_SYS_CAMERA__STREAMING_ENABLED:
				return streamingEnabled != STREAMING_ENABLED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PolarSysRoverClientPackage.POLAR_SYS_CAMERA___INIT:
				return init();
			case PolarSysRoverClientPackage.POLAR_SYS_CAMERA___COMMAND_STREAMING__BOOLEAN:
				return commandStreaming((Boolean)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (initialized: ");
		result.append(initialized);
		result.append(", streamingEnabled: ");
		result.append(streamingEnabled);
		result.append(')');
		return result.toString();
	}

} //PolarSysCameraImpl
