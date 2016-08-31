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

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.polarsys.rover.client.PolarSysRoverClientFactory;
import org.eclipse.polarsys.rover.client.PolarSysRoverClientPackage;
import org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient;
import org.eclipse.polarsys.rover.client.Position;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Polar Sys Rover Platform Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.polarsys.rover.client.impl.PolarSysRoverPlatformClientImpl#isInitialized <em>Initialized</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.impl.PolarSysRoverPlatformClientImpl#isDisposed <em>Disposed</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.impl.PolarSysRoverPlatformClientImpl#getPositionError <em>Position Error</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.impl.PolarSysRoverPlatformClientImpl#getLinearVelocity <em>Linear Velocity</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.impl.PolarSysRoverPlatformClientImpl#getAngularVelocity <em>Angular Velocity</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.impl.PolarSysRoverPlatformClientImpl#getFrontLeftWheelPosition <em>Front Left Wheel Position</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.impl.PolarSysRoverPlatformClientImpl#getFrontRightWheelPosition <em>Front Right Wheel Position</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.impl.PolarSysRoverPlatformClientImpl#getRearLeftWheelPosition <em>Rear Left Wheel Position</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.impl.PolarSysRoverPlatformClientImpl#getRearRightWheelPosition <em>Rear Right Wheel Position</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.impl.PolarSysRoverPlatformClientImpl#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PolarSysRoverPlatformClientImpl extends MinimalEObjectImpl.Container implements PolarSysRoverPlatformClient {
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
	 * The default value of the '{@link #isDisposed() <em>Disposed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisposed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISPOSED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isDisposed() <em>Disposed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisposed()
	 * @generated
	 * @ordered
	 */
	protected boolean disposed = DISPOSED_EDEFAULT;
	/**
	 * The default value of the '{@link #getPositionError() <em>Position Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionError()
	 * @generated
	 * @ordered
	 */
	protected static final double POSITION_ERROR_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getPositionError() <em>Position Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionError()
	 * @generated
	 * @ordered
	 */
	protected double positionError = POSITION_ERROR_EDEFAULT;
	/**
	 * The default value of the '{@link #getLinearVelocity() <em>Linear Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearVelocity()
	 * @generated
	 * @ordered
	 */
	protected static final double LINEAR_VELOCITY_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getLinearVelocity() <em>Linear Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearVelocity()
	 * @generated
	 * @ordered
	 */
	protected double linearVelocity = LINEAR_VELOCITY_EDEFAULT;
	/**
	 * The default value of the '{@link #getAngularVelocity() <em>Angular Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngularVelocity()
	 * @generated
	 * @ordered
	 */
	protected static final double ANGULAR_VELOCITY_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getAngularVelocity() <em>Angular Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngularVelocity()
	 * @generated
	 * @ordered
	 */
	protected double angularVelocity = ANGULAR_VELOCITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrontLeftWheelPosition() <em>Front Left Wheel Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrontLeftWheelPosition()
	 * @generated
	 * @ordered
	 */
	protected static final double FRONT_LEFT_WHEEL_POSITION_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getFrontLeftWheelPosition() <em>Front Left Wheel Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrontLeftWheelPosition()
	 * @generated
	 * @ordered
	 */
	protected double frontLeftWheelPosition = FRONT_LEFT_WHEEL_POSITION_EDEFAULT;
	/**
	 * The default value of the '{@link #getFrontRightWheelPosition() <em>Front Right Wheel Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrontRightWheelPosition()
	 * @generated
	 * @ordered
	 */
	protected static final double FRONT_RIGHT_WHEEL_POSITION_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getFrontRightWheelPosition() <em>Front Right Wheel Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrontRightWheelPosition()
	 * @generated
	 * @ordered
	 */
	protected double frontRightWheelPosition = FRONT_RIGHT_WHEEL_POSITION_EDEFAULT;
	/**
	 * The default value of the '{@link #getRearLeftWheelPosition() <em>Rear Left Wheel Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRearLeftWheelPosition()
	 * @generated
	 * @ordered
	 */
	protected static final double REAR_LEFT_WHEEL_POSITION_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getRearLeftWheelPosition() <em>Rear Left Wheel Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRearLeftWheelPosition()
	 * @generated
	 * @ordered
	 */
	protected double rearLeftWheelPosition = REAR_LEFT_WHEEL_POSITION_EDEFAULT;
	/**
	 * The default value of the '{@link #getRearRightWheelPosition() <em>Rear Right Wheel Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRearRightWheelPosition()
	 * @generated
	 * @ordered
	 */
	protected static final double REAR_RIGHT_WHEEL_POSITION_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getRearRightWheelPosition() <em>Rear Right Wheel Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRearRightWheelPosition()
	 * @generated
	 * @ordered
	 */
	protected double rearRightWheelPosition = REAR_RIGHT_WHEEL_POSITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Position position;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolarSysRoverPlatformClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolarSysRoverClientPackage.Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__INITIALIZED, oldInitialized, initialized));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisposed() {
		return disposed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisposed(boolean newDisposed) {
		boolean oldDisposed = disposed;
		disposed = newDisposed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__DISPOSED, oldDisposed, disposed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPositionError() {
		return positionError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositionError(double newPositionError) {
		double oldPositionError = positionError;
		positionError = newPositionError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__POSITION_ERROR, oldPositionError, positionError));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLinearVelocity() {
		return linearVelocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearVelocity(double newLinearVelocity) {
		double oldLinearVelocity = linearVelocity;
		linearVelocity = newLinearVelocity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__LINEAR_VELOCITY, oldLinearVelocity, linearVelocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAngularVelocity() {
		return angularVelocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngularVelocity(double newAngularVelocity) {
		double oldAngularVelocity = angularVelocity;
		angularVelocity = newAngularVelocity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__ANGULAR_VELOCITY, oldAngularVelocity, angularVelocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFrontLeftWheelPosition() {
		return frontLeftWheelPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrontLeftWheelPosition(double newFrontLeftWheelPosition) {
		double oldFrontLeftWheelPosition = frontLeftWheelPosition;
		frontLeftWheelPosition = newFrontLeftWheelPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_LEFT_WHEEL_POSITION, oldFrontLeftWheelPosition, frontLeftWheelPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFrontRightWheelPosition() {
		return frontRightWheelPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrontRightWheelPosition(double newFrontRightWheelPosition) {
		double oldFrontRightWheelPosition = frontRightWheelPosition;
		frontRightWheelPosition = newFrontRightWheelPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_RIGHT_WHEEL_POSITION, oldFrontRightWheelPosition, frontRightWheelPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRearLeftWheelPosition() {
		return rearLeftWheelPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRearLeftWheelPosition(double newRearLeftWheelPosition) {
		double oldRearLeftWheelPosition = rearLeftWheelPosition;
		rearLeftWheelPosition = newRearLeftWheelPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__REAR_LEFT_WHEEL_POSITION, oldRearLeftWheelPosition, rearLeftWheelPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRearRightWheelPosition() {
		return rearRightWheelPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRearRightWheelPosition(double newRearRightWheelPosition) {
		double oldRearRightWheelPosition = rearRightWheelPosition;
		rearRightWheelPosition = newRearRightWheelPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__REAR_RIGHT_WHEEL_POSITION, oldRearRightWheelPosition, rearRightWheelPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPosition(Position newPosition, NotificationChain msgs) {
		Position oldPosition = position;
		position = newPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__POSITION, oldPosition, newPosition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(Position newPosition) {
		if (newPosition != position) {
			NotificationChain msgs = null;
			if (position != null)
				msgs = ((InternalEObject)position).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__POSITION, null, msgs);
			if (newPosition != null)
				msgs = ((InternalEObject)newPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__POSITION, null, msgs);
			msgs = basicSetPosition(newPosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__POSITION, newPosition, newPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public boolean init(){
		setPosition(PolarSysRoverClientFactory.eINSTANCE.createPosition());
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	abstract public void resetPosition(Position position);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	abstract public void clearPositionError();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	abstract public void stop();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	abstract public void cmdVelocities(double linearVelocity, double angularVelocity);
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void cmdPowerLevel(double leftPowerLevel, double rightPowerLevel) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	abstract public void dispose();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__POSITION:
				return basicSetPosition(null, msgs);
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
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__INITIALIZED:
				return isInitialized();
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__DISPOSED:
				return isDisposed();
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__POSITION_ERROR:
				return getPositionError();
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__LINEAR_VELOCITY:
				return getLinearVelocity();
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__ANGULAR_VELOCITY:
				return getAngularVelocity();
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_LEFT_WHEEL_POSITION:
				return getFrontLeftWheelPosition();
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_RIGHT_WHEEL_POSITION:
				return getFrontRightWheelPosition();
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__REAR_LEFT_WHEEL_POSITION:
				return getRearLeftWheelPosition();
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__REAR_RIGHT_WHEEL_POSITION:
				return getRearRightWheelPosition();
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__POSITION:
				return getPosition();
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
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__INITIALIZED:
				setInitialized((Boolean)newValue);
				return;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__DISPOSED:
				setDisposed((Boolean)newValue);
				return;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__POSITION_ERROR:
				setPositionError((Double)newValue);
				return;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__LINEAR_VELOCITY:
				setLinearVelocity((Double)newValue);
				return;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__ANGULAR_VELOCITY:
				setAngularVelocity((Double)newValue);
				return;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_LEFT_WHEEL_POSITION:
				setFrontLeftWheelPosition((Double)newValue);
				return;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_RIGHT_WHEEL_POSITION:
				setFrontRightWheelPosition((Double)newValue);
				return;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__REAR_LEFT_WHEEL_POSITION:
				setRearLeftWheelPosition((Double)newValue);
				return;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__REAR_RIGHT_WHEEL_POSITION:
				setRearRightWheelPosition((Double)newValue);
				return;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__POSITION:
				setPosition((Position)newValue);
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
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__INITIALIZED:
				setInitialized(INITIALIZED_EDEFAULT);
				return;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__DISPOSED:
				setDisposed(DISPOSED_EDEFAULT);
				return;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__POSITION_ERROR:
				setPositionError(POSITION_ERROR_EDEFAULT);
				return;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__LINEAR_VELOCITY:
				setLinearVelocity(LINEAR_VELOCITY_EDEFAULT);
				return;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__ANGULAR_VELOCITY:
				setAngularVelocity(ANGULAR_VELOCITY_EDEFAULT);
				return;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_LEFT_WHEEL_POSITION:
				setFrontLeftWheelPosition(FRONT_LEFT_WHEEL_POSITION_EDEFAULT);
				return;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_RIGHT_WHEEL_POSITION:
				setFrontRightWheelPosition(FRONT_RIGHT_WHEEL_POSITION_EDEFAULT);
				return;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__REAR_LEFT_WHEEL_POSITION:
				setRearLeftWheelPosition(REAR_LEFT_WHEEL_POSITION_EDEFAULT);
				return;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__REAR_RIGHT_WHEEL_POSITION:
				setRearRightWheelPosition(REAR_RIGHT_WHEEL_POSITION_EDEFAULT);
				return;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__POSITION:
				setPosition((Position)null);
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
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__INITIALIZED:
				return initialized != INITIALIZED_EDEFAULT;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__DISPOSED:
				return disposed != DISPOSED_EDEFAULT;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__POSITION_ERROR:
				return positionError != POSITION_ERROR_EDEFAULT;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__LINEAR_VELOCITY:
				return linearVelocity != LINEAR_VELOCITY_EDEFAULT;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__ANGULAR_VELOCITY:
				return angularVelocity != ANGULAR_VELOCITY_EDEFAULT;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_LEFT_WHEEL_POSITION:
				return frontLeftWheelPosition != FRONT_LEFT_WHEEL_POSITION_EDEFAULT;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_RIGHT_WHEEL_POSITION:
				return frontRightWheelPosition != FRONT_RIGHT_WHEEL_POSITION_EDEFAULT;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__REAR_LEFT_WHEEL_POSITION:
				return rearLeftWheelPosition != REAR_LEFT_WHEEL_POSITION_EDEFAULT;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__REAR_RIGHT_WHEEL_POSITION:
				return rearRightWheelPosition != REAR_RIGHT_WHEEL_POSITION_EDEFAULT;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__POSITION:
				return position != null;
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
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT___INIT:
				return init();
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT___RESET_POSITION__POSITION:
				resetPosition((Position)arguments.get(0));
				return null;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT___CLEAR_POSITION_ERROR:
				clearPositionError();
				return null;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT___STOP:
				stop();
				return null;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT___CMD_VELOCITIES__DOUBLE_DOUBLE:
				cmdVelocities((Double)arguments.get(0), (Double)arguments.get(1));
				return null;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT___CMD_POWER_LEVEL__DOUBLE_DOUBLE:
				cmdPowerLevel((Double)arguments.get(0), (Double)arguments.get(1));
				return null;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT___DISPOSE:
				dispose();
				return null;
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
		result.append(", disposed: ");
		result.append(disposed);
		result.append(", positionError: ");
		result.append(positionError);
		result.append(", linearVelocity: ");
		result.append(linearVelocity);
		result.append(", angularVelocity: ");
		result.append(angularVelocity);
		result.append(", frontLeftWheelPosition: ");
		result.append(frontLeftWheelPosition);
		result.append(", frontRightWheelPosition: ");
		result.append(frontRightWheelPosition);
		result.append(", rearLeftWheelPosition: ");
		result.append(rearLeftWheelPosition);
		result.append(", rearRightWheelPosition: ");
		result.append(rearRightWheelPosition);
		result.append(')');
		return result.toString();
	}

} //PolarSysRoverPlatformClientImpl
