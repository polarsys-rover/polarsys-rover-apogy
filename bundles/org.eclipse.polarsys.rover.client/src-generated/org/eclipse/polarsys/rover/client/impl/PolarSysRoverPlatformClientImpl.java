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
import org.eclipse.polarsys.rover.client.Camera;
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
 *   <li>{@link org.eclipse.polarsys.rover.client.impl.PolarSysRoverPlatformClientImpl#getLeftPowerLevel <em>Left Power Level</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.impl.PolarSysRoverPlatformClientImpl#getRightPowerLevel <em>Right Power Level</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.impl.PolarSysRoverPlatformClientImpl#getLeftWheelPosition <em>Left Wheel Position</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.impl.PolarSysRoverPlatformClientImpl#getRightWheelPosition <em>Right Wheel Position</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.impl.PolarSysRoverPlatformClientImpl#getFrontSonar <em>Front Sonar</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.impl.PolarSysRoverPlatformClientImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.impl.PolarSysRoverPlatformClientImpl#getFrontCamera <em>Front Camera</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.impl.PolarSysRoverPlatformClientImpl#getWheelRadius <em>Wheel Radius</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.impl.PolarSysRoverPlatformClientImpl#getWheelTrack <em>Wheel Track</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.impl.PolarSysRoverPlatformClientImpl#getMoveWaitPeriod <em>Move Wait Period</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.impl.PolarSysRoverPlatformClientImpl#getMoveToMinLinSpeed <em>Move To Min Lin Speed</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.impl.PolarSysRoverPlatformClientImpl#getErrorPerMeter <em>Error Per Meter</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.impl.PolarSysRoverPlatformClientImpl#getMaxPowerLevel <em>Max Power Level</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.impl.PolarSysRoverPlatformClientImpl#getMaxCtrPowerLevel <em>Max Ctr Power Level</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.impl.PolarSysRoverPlatformClientImpl#getMaxAngVelocity <em>Max Ang Velocity</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.impl.PolarSysRoverPlatformClientImpl#getMaxLinVelocity <em>Max Lin Velocity</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.impl.PolarSysRoverPlatformClientImpl#getDistanceBetweenWheels <em>Distance Between Wheels</em>}</li>
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
	 * The default value of the '{@link #getLeftPowerLevel() <em>Left Power Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftPowerLevel()
	 * @generated
	 * @ordered
	 */
	protected static final double LEFT_POWER_LEVEL_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getLeftPowerLevel() <em>Left Power Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftPowerLevel()
	 * @generated
	 * @ordered
	 */
	protected double leftPowerLevel = LEFT_POWER_LEVEL_EDEFAULT;
	/**
	 * The default value of the '{@link #getRightPowerLevel() <em>Right Power Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightPowerLevel()
	 * @generated
	 * @ordered
	 */
	protected static final double RIGHT_POWER_LEVEL_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getRightPowerLevel() <em>Right Power Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightPowerLevel()
	 * @generated
	 * @ordered
	 */
	protected double rightPowerLevel = RIGHT_POWER_LEVEL_EDEFAULT;
	/**
	 * The default value of the '{@link #getLeftWheelPosition() <em>Left Wheel Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftWheelPosition()
	 * @generated
	 * @ordered
	 */
	protected static final double LEFT_WHEEL_POSITION_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getLeftWheelPosition() <em>Left Wheel Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftWheelPosition()
	 * @generated
	 * @ordered
	 */
	protected double leftWheelPosition = LEFT_WHEEL_POSITION_EDEFAULT;
	/**
	 * The default value of the '{@link #getRightWheelPosition() <em>Right Wheel Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightWheelPosition()
	 * @generated
	 * @ordered
	 */
	protected static final double RIGHT_WHEEL_POSITION_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getRightWheelPosition() <em>Right Wheel Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightWheelPosition()
	 * @generated
	 * @ordered
	 */
	protected double rightWheelPosition = RIGHT_WHEEL_POSITION_EDEFAULT;
	/**
	 * The default value of the '{@link #getFrontSonar() <em>Front Sonar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrontSonar()
	 * @generated
	 * @ordered
	 */
	protected static final int FRONT_SONAR_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getFrontSonar() <em>Front Sonar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrontSonar()
	 * @generated
	 * @ordered
	 */
	protected int frontSonar = FRONT_SONAR_EDEFAULT;
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
	 * The cached value of the '{@link #getFrontCamera() <em>Front Camera</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrontCamera()
	 * @generated
	 * @ordered
	 */
	protected Camera frontCamera;

	/**
	 * The default value of the '{@link #getWheelRadius() <em>Wheel Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWheelRadius()
	 * @generated
	 * @ordered
	 */
	protected static final double WHEEL_RADIUS_EDEFAULT = 0.25;
	/**
	 * The cached value of the '{@link #getWheelRadius() <em>Wheel Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWheelRadius()
	 * @generated
	 * @ordered
	 */
	protected double wheelRadius = WHEEL_RADIUS_EDEFAULT;
	/**
	 * The default value of the '{@link #getWheelTrack() <em>Wheel Track</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWheelTrack()
	 * @generated
	 * @ordered
	 */
	protected static final double WHEEL_TRACK_EDEFAULT = 0.64;
	/**
	 * The cached value of the '{@link #getWheelTrack() <em>Wheel Track</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWheelTrack()
	 * @generated
	 * @ordered
	 */
	protected double wheelTrack = WHEEL_TRACK_EDEFAULT;
	/**
	 * The default value of the '{@link #getMoveWaitPeriod() <em>Move Wait Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoveWaitPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final int MOVE_WAIT_PERIOD_EDEFAULT = 30;
	/**
	 * The cached value of the '{@link #getMoveWaitPeriod() <em>Move Wait Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoveWaitPeriod()
	 * @generated
	 * @ordered
	 */
	protected int moveWaitPeriod = MOVE_WAIT_PERIOD_EDEFAULT;
	/**
	 * The default value of the '{@link #getMoveToMinLinSpeed() <em>Move To Min Lin Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoveToMinLinSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final double MOVE_TO_MIN_LIN_SPEED_EDEFAULT = 1.5;
	/**
	 * The cached value of the '{@link #getMoveToMinLinSpeed() <em>Move To Min Lin Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoveToMinLinSpeed()
	 * @generated
	 * @ordered
	 */
	protected double moveToMinLinSpeed = MOVE_TO_MIN_LIN_SPEED_EDEFAULT;
	/**
	 * The default value of the '{@link #getErrorPerMeter() <em>Error Per Meter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorPerMeter()
	 * @generated
	 * @ordered
	 */
	protected static final double ERROR_PER_METER_EDEFAULT = 0.05;
	/**
	 * The cached value of the '{@link #getErrorPerMeter() <em>Error Per Meter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorPerMeter()
	 * @generated
	 * @ordered
	 */
	protected double errorPerMeter = ERROR_PER_METER_EDEFAULT;
	/**
	 * The default value of the '{@link #getMaxPowerLevel() <em>Max Power Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPowerLevel()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_POWER_LEVEL_EDEFAULT = 1.0;
	/**
	 * The cached value of the '{@link #getMaxPowerLevel() <em>Max Power Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPowerLevel()
	 * @generated
	 * @ordered
	 */
	protected double maxPowerLevel = MAX_POWER_LEVEL_EDEFAULT;
	/**
	 * The default value of the '{@link #getMaxCtrPowerLevel() <em>Max Ctr Power Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCtrPowerLevel()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_CTR_POWER_LEVEL_EDEFAULT = 100.0;
	/**
	 * The cached value of the '{@link #getMaxCtrPowerLevel() <em>Max Ctr Power Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCtrPowerLevel()
	 * @generated
	 * @ordered
	 */
	protected double maxCtrPowerLevel = MAX_CTR_POWER_LEVEL_EDEFAULT;
	/**
	 * The default value of the '{@link #getMaxAngVelocity() <em>Max Ang Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAngVelocity()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_ANG_VELOCITY_EDEFAULT = 2.0;
	/**
	 * The cached value of the '{@link #getMaxAngVelocity() <em>Max Ang Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAngVelocity()
	 * @generated
	 * @ordered
	 */
	protected double maxAngVelocity = MAX_ANG_VELOCITY_EDEFAULT;
	/**
	 * The default value of the '{@link #getMaxLinVelocity() <em>Max Lin Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLinVelocity()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_LIN_VELOCITY_EDEFAULT = 2.0;
	/**
	 * The cached value of the '{@link #getMaxLinVelocity() <em>Max Lin Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLinVelocity()
	 * @generated
	 * @ordered
	 */
	protected double maxLinVelocity = MAX_LIN_VELOCITY_EDEFAULT;
	/**
	 * The default value of the '{@link #getDistanceBetweenWheels() <em>Distance Between Wheels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceBetweenWheels()
	 * @generated
	 * @ordered
	 */
	protected static final double DISTANCE_BETWEEN_WHEELS_EDEFAULT = 2.0;
	/**
	 * The cached value of the '{@link #getDistanceBetweenWheels() <em>Distance Between Wheels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceBetweenWheels()
	 * @generated
	 * @ordered
	 */
	protected double distanceBetweenWheels = DISTANCE_BETWEEN_WHEELS_EDEFAULT;

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
	public double getLeftPowerLevel() {
		return leftPowerLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftPowerLevel(double newLeftPowerLevel) {
		double oldLeftPowerLevel = leftPowerLevel;
		leftPowerLevel = newLeftPowerLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__LEFT_POWER_LEVEL, oldLeftPowerLevel, leftPowerLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRightPowerLevel() {
		return rightPowerLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightPowerLevel(double newRightPowerLevel) {
		double oldRightPowerLevel = rightPowerLevel;
		rightPowerLevel = newRightPowerLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__RIGHT_POWER_LEVEL, oldRightPowerLevel, rightPowerLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLeftWheelPosition() {
		return leftWheelPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftWheelPosition(double newLeftWheelPosition) {
		double oldLeftWheelPosition = leftWheelPosition;
		leftWheelPosition = newLeftWheelPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__LEFT_WHEEL_POSITION, oldLeftWheelPosition, leftWheelPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRightWheelPosition() {
		return rightWheelPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightWheelPosition(double newRightWheelPosition) {
		double oldRightWheelPosition = rightWheelPosition;
		rightWheelPosition = newRightWheelPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__RIGHT_WHEEL_POSITION, oldRightWheelPosition, rightWheelPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFrontSonar() {
		return frontSonar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrontSonar(int newFrontSonar) {
		int oldFrontSonar = frontSonar;
		frontSonar = newFrontSonar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_SONAR, oldFrontSonar, frontSonar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position getPositionGen() {
		return position;
	}

	public Position getPosition() {		
		Position position = getPositionGen();
		if (position == null){
			setPosition(PolarSysRoverClientFactory.eINSTANCE.createPosition());
		}		
		return getPositionGen();
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
	 * @generated
	 */
	public Camera getFrontCamera() {
		return frontCamera;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrontCamera(Camera newFrontCamera, NotificationChain msgs) {
		Camera oldFrontCamera = frontCamera;
		frontCamera = newFrontCamera;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_CAMERA, oldFrontCamera, newFrontCamera);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrontCamera(Camera newFrontCamera) {
		if (newFrontCamera != frontCamera) {
			NotificationChain msgs = null;
			if (frontCamera != null)
				msgs = ((InternalEObject)frontCamera).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_CAMERA, null, msgs);
			if (newFrontCamera != null)
				msgs = ((InternalEObject)newFrontCamera).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_CAMERA, null, msgs);
			msgs = basicSetFrontCamera(newFrontCamera, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_CAMERA, newFrontCamera, newFrontCamera));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWheelRadius() {
		return wheelRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWheelTrack() {
		return wheelTrack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMoveWaitPeriod() {
		return moveWaitPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMoveToMinLinSpeed() {
		return moveToMinLinSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getErrorPerMeter() {
		return errorPerMeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxPowerLevel() {
		return maxPowerLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxCtrPowerLevel() {
		return maxCtrPowerLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxAngVelocity() {
		return maxAngVelocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxLinVelocity() {
		return maxLinVelocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDistanceBetweenWheels() {
		return distanceBetweenWheels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public boolean init(){
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
	 * @generated_NOT
	 */
	abstract public void cmdPowerLevel(double leftPowerLevel, double rightPowerLevel);

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
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_CAMERA:
				return basicSetFrontCamera(null, msgs);
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
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__LEFT_POWER_LEVEL:
				return getLeftPowerLevel();
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__RIGHT_POWER_LEVEL:
				return getRightPowerLevel();
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__LEFT_WHEEL_POSITION:
				return getLeftWheelPosition();
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__RIGHT_WHEEL_POSITION:
				return getRightWheelPosition();
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_SONAR:
				return getFrontSonar();
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__POSITION:
				return getPosition();
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_CAMERA:
				return getFrontCamera();
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__WHEEL_RADIUS:
				return getWheelRadius();
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__WHEEL_TRACK:
				return getWheelTrack();
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__MOVE_WAIT_PERIOD:
				return getMoveWaitPeriod();
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__MOVE_TO_MIN_LIN_SPEED:
				return getMoveToMinLinSpeed();
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__ERROR_PER_METER:
				return getErrorPerMeter();
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__MAX_POWER_LEVEL:
				return getMaxPowerLevel();
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__MAX_CTR_POWER_LEVEL:
				return getMaxCtrPowerLevel();
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__MAX_ANG_VELOCITY:
				return getMaxAngVelocity();
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__MAX_LIN_VELOCITY:
				return getMaxLinVelocity();
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__DISTANCE_BETWEEN_WHEELS:
				return getDistanceBetweenWheels();
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
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__LEFT_POWER_LEVEL:
				setLeftPowerLevel((Double)newValue);
				return;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__RIGHT_POWER_LEVEL:
				setRightPowerLevel((Double)newValue);
				return;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__LEFT_WHEEL_POSITION:
				setLeftWheelPosition((Double)newValue);
				return;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__RIGHT_WHEEL_POSITION:
				setRightWheelPosition((Double)newValue);
				return;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_SONAR:
				setFrontSonar((Integer)newValue);
				return;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__POSITION:
				setPosition((Position)newValue);
				return;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_CAMERA:
				setFrontCamera((Camera)newValue);
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
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__LEFT_POWER_LEVEL:
				setLeftPowerLevel(LEFT_POWER_LEVEL_EDEFAULT);
				return;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__RIGHT_POWER_LEVEL:
				setRightPowerLevel(RIGHT_POWER_LEVEL_EDEFAULT);
				return;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__LEFT_WHEEL_POSITION:
				setLeftWheelPosition(LEFT_WHEEL_POSITION_EDEFAULT);
				return;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__RIGHT_WHEEL_POSITION:
				setRightWheelPosition(RIGHT_WHEEL_POSITION_EDEFAULT);
				return;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_SONAR:
				setFrontSonar(FRONT_SONAR_EDEFAULT);
				return;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__POSITION:
				setPosition((Position)null);
				return;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_CAMERA:
				setFrontCamera((Camera)null);
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
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__LEFT_POWER_LEVEL:
				return leftPowerLevel != LEFT_POWER_LEVEL_EDEFAULT;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__RIGHT_POWER_LEVEL:
				return rightPowerLevel != RIGHT_POWER_LEVEL_EDEFAULT;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__LEFT_WHEEL_POSITION:
				return leftWheelPosition != LEFT_WHEEL_POSITION_EDEFAULT;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__RIGHT_WHEEL_POSITION:
				return rightWheelPosition != RIGHT_WHEEL_POSITION_EDEFAULT;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_SONAR:
				return frontSonar != FRONT_SONAR_EDEFAULT;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__POSITION:
				return position != null;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_CAMERA:
				return frontCamera != null;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__WHEEL_RADIUS:
				return wheelRadius != WHEEL_RADIUS_EDEFAULT;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__WHEEL_TRACK:
				return wheelTrack != WHEEL_TRACK_EDEFAULT;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__MOVE_WAIT_PERIOD:
				return moveWaitPeriod != MOVE_WAIT_PERIOD_EDEFAULT;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__MOVE_TO_MIN_LIN_SPEED:
				return moveToMinLinSpeed != MOVE_TO_MIN_LIN_SPEED_EDEFAULT;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__ERROR_PER_METER:
				return errorPerMeter != ERROR_PER_METER_EDEFAULT;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__MAX_POWER_LEVEL:
				return maxPowerLevel != MAX_POWER_LEVEL_EDEFAULT;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__MAX_CTR_POWER_LEVEL:
				return maxCtrPowerLevel != MAX_CTR_POWER_LEVEL_EDEFAULT;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__MAX_ANG_VELOCITY:
				return maxAngVelocity != MAX_ANG_VELOCITY_EDEFAULT;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__MAX_LIN_VELOCITY:
				return maxLinVelocity != MAX_LIN_VELOCITY_EDEFAULT;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__DISTANCE_BETWEEN_WHEELS:
				return distanceBetweenWheels != DISTANCE_BETWEEN_WHEELS_EDEFAULT;
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
		result.append(", leftPowerLevel: ");
		result.append(leftPowerLevel);
		result.append(", rightPowerLevel: ");
		result.append(rightPowerLevel);
		result.append(", leftWheelPosition: ");
		result.append(leftWheelPosition);
		result.append(", rightWheelPosition: ");
		result.append(rightWheelPosition);
		result.append(", frontSonar: ");
		result.append(frontSonar);
		result.append(", wheelRadius: ");
		result.append(wheelRadius);
		result.append(", wheelTrack: ");
		result.append(wheelTrack);
		result.append(", moveWaitPeriod: ");
		result.append(moveWaitPeriod);
		result.append(", moveToMinLinSpeed: ");
		result.append(moveToMinLinSpeed);
		result.append(", ErrorPerMeter: ");
		result.append(errorPerMeter);
		result.append(", maxPowerLevel: ");
		result.append(maxPowerLevel);
		result.append(", maxCtrPowerLevel: ");
		result.append(maxCtrPowerLevel);
		result.append(", maxAngVelocity: ");
		result.append(maxAngVelocity);
		result.append(", maxLinVelocity: ");
		result.append(maxLinVelocity);
		result.append(", distanceBetweenWheels: ");
		result.append(distanceBetweenWheels);
		result.append(')');
		return result.toString();
	}

} //PolarSysRoverPlatformClientImpl
