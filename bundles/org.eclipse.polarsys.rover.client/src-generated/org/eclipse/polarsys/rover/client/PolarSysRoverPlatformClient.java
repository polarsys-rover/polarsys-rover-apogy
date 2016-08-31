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

import ca.gc.asc_csa.apogy.common.emf.Disposable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polar Sys Rover Platform Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents the PolarSys Rover Platform client.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#isInitialized <em>Initialized</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#isDisposed <em>Disposed</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getPositionError <em>Position Error</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getLinearVelocity <em>Linear Velocity</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getAngularVelocity <em>Angular Velocity</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getFrontLeftWheelPosition <em>Front Left Wheel Position</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getFrontRightWheelPosition <em>Front Right Wheel Position</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getRearLeftWheelPosition <em>Rear Left Wheel Position</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getRearRightWheelPosition <em>Rear Right Wheel Position</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see org.eclipse.polarsys.rover.client.PolarSysRoverClientPackage#getPolarSysRoverPlatformClient()
 * @model abstract="true"
 * @generated
 */
public interface PolarSysRoverPlatformClient extends Disposable {

	/**
	 * Returns the value of the '<em><b>Initialized</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is whether or not the mobile platform has
	 * been initialized; initially false.
	 * @see #init()
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initialized</em>' attribute.
	 * @see #setInitialized(boolean)
	 * @see org.eclipse.polarsys.rover.client.PolarSysRoverClientPackage#getPolarSysRoverPlatformClient_Initialized()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' property='Readonly' propertyCategory='Status'"
	 * @generated
	 */
	boolean isInitialized();

	/**
	 * Sets the value of the '{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#isInitialized <em>Initialized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialized</em>' attribute.
	 * @see #isInitialized()
	 * @generated
	 */
	void setInitialized(boolean value);

	/**
	 * Returns the value of the '<em><b>Disposed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is whether or not the mobile platform has
	 * been disposed; initially false.
	 * @see #dispose()
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disposed</em>' attribute.
	 * @see #setDisposed(boolean)
	 * @see org.eclipse.polarsys.rover.client.PolarSysRoverClientPackage#getPolarSysRoverPlatformClient_Disposed()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' property='Readonly' propertyCategory='Status'"
	 * @generated
	 */
	boolean isDisposed();

	/**
	 * Sets the value of the '{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#isDisposed <em>Disposed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disposed</em>' attribute.
	 * @see #isDisposed()
	 * @generated
	 */
	void setDisposed(boolean value);

	/**
	 * Returns the value of the '<em><b>Position Error</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the mobile platform's current estimate of the error
	 * in its position (given in metres.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position Error</em>' attribute.
	 * @see #setPositionError(double)
	 * @see org.eclipse.polarsys.rover.client.PolarSysRoverClientPackage#getPolarSysRoverPlatformClient_PositionError()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly' propertyCategory='Position' apogy_units='m'"
	 * @generated
	 */
	double getPositionError();

	/**
	 * Sets the value of the '{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getPositionError <em>Position Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Error</em>' attribute.
	 * @see #getPositionError()
	 * @generated
	 */
	void setPositionError(double value);

	/**
	 * Returns the value of the '<em><b>Linear Velocity</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the mobile platform's current linear velocity
	 * (in metres per second)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Linear Velocity</em>' attribute.
	 * @see #setLinearVelocity(double)
	 * @see org.eclipse.polarsys.rover.client.PolarSysRoverClientPackage#getPolarSysRoverPlatformClient_LinearVelocity()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly' propertyCategory='Velocities' apogy_units='m/s'"
	 * @generated
	 */
	double getLinearVelocity();

	/**
	 * Sets the value of the '{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getLinearVelocity <em>Linear Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Velocity</em>' attribute.
	 * @see #getLinearVelocity()
	 * @generated
	 */
	void setLinearVelocity(double value);

	/**
	 * Returns the value of the '<em><b>Angular Velocity</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the mobile platform's current angular velocity
	 * (in radians per second).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angular Velocity</em>' attribute.
	 * @see #setAngularVelocity(double)
	 * @see org.eclipse.polarsys.rover.client.PolarSysRoverClientPackage#getPolarSysRoverPlatformClient_AngularVelocity()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly' propertyCategory='Velocities' apogy_units='rad/s'"
	 * @generated
	 */
	double getAngularVelocity();

	/**
	 * Sets the value of the '{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getAngularVelocity <em>Angular Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angular Velocity</em>' attribute.
	 * @see #getAngularVelocity()
	 * @generated
	 */
	void setAngularVelocity(double value);

	/**
	 * Returns the value of the '<em><b>Front Left Wheel Position</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the current angular position (in radians) of
	 * the mobile platform's front left wheels.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Front Left Wheel Position</em>' attribute.
	 * @see #setFrontLeftWheelPosition(double)
	 * @see org.eclipse.polarsys.rover.client.PolarSysRoverClientPackage#getPolarSysRoverPlatformClient_FrontLeftWheelPosition()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly' propertyCategory='Position' apogy_units='rad'"
	 * @generated
	 */
	double getFrontLeftWheelPosition();

	/**
	 * Sets the value of the '{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getFrontLeftWheelPosition <em>Front Left Wheel Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Front Left Wheel Position</em>' attribute.
	 * @see #getFrontLeftWheelPosition()
	 * @generated
	 */
	void setFrontLeftWheelPosition(double value);

	/**
	 * Returns the value of the '<em><b>Front Right Wheel Position</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the current angular position (in radians) of
	 * the mobile platform's front right wheels.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Front Right Wheel Position</em>' attribute.
	 * @see #setFrontRightWheelPosition(double)
	 * @see org.eclipse.polarsys.rover.client.PolarSysRoverClientPackage#getPolarSysRoverPlatformClient_FrontRightWheelPosition()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly' propertyCategory='Position' apogy_units='rad'"
	 * @generated
	 */
	double getFrontRightWheelPosition();

	/**
	 * Sets the value of the '{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getFrontRightWheelPosition <em>Front Right Wheel Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Front Right Wheel Position</em>' attribute.
	 * @see #getFrontRightWheelPosition()
	 * @generated
	 */
	void setFrontRightWheelPosition(double value);

	/**
	 * Returns the value of the '<em><b>Rear Left Wheel Position</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the current angular position (in radians) of
	 * the mobile platform's rear left wheels.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rear Left Wheel Position</em>' attribute.
	 * @see #setRearLeftWheelPosition(double)
	 * @see org.eclipse.polarsys.rover.client.PolarSysRoverClientPackage#getPolarSysRoverPlatformClient_RearLeftWheelPosition()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly' propertyCategory='Position' apogy_units='rad'"
	 * @generated
	 */
	double getRearLeftWheelPosition();

	/**
	 * Sets the value of the '{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getRearLeftWheelPosition <em>Rear Left Wheel Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rear Left Wheel Position</em>' attribute.
	 * @see #getRearLeftWheelPosition()
	 * @generated
	 */
	void setRearLeftWheelPosition(double value);

	/**
	 * Returns the value of the '<em><b>Rear Right Wheel Position</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the current angular position (in radians) of
	 * the mobile platform's rear right wheels.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rear Right Wheel Position</em>' attribute.
	 * @see #setRearRightWheelPosition(double)
	 * @see org.eclipse.polarsys.rover.client.PolarSysRoverClientPackage#getPolarSysRoverPlatformClient_RearRightWheelPosition()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly' propertyCategory='Position' apogy_units='rad'"
	 * @generated
	 */
	double getRearRightWheelPosition();

	/**
	 * Sets the value of the '{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getRearRightWheelPosition <em>Rear Right Wheel Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rear Right Wheel Position</em>' attribute.
	 * @see #getRearRightWheelPosition()
	 * @generated
	 */
	void setRearRightWheelPosition(double value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the mobile platform's current position
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(Position)
	 * @see org.eclipse.polarsys.rover.client.PolarSysRoverClientPackage#getPolarSysRoverPlatformClient_Position()
	 * @model containment="true" required="true" transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' propertyCategory='Position'"
	 * @generated
	 */
	Position getPosition();

	/**
	 * Sets the value of the '{@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Position value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This operation is used to initialize the mobile platform
	 * and as such, it will perform the required creation and
	 * initialization steps.
	 * 
	 * @return Whether or not the mobile platform was successfully initialized
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 * @generated
	 */
	boolean init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This operation is used to change the mobile platform to
	 * have the coordinates and pose matching the given position.
	 * That new position will be considered the new starting place
	 * for the mobile platform and as such, the accumulated error will
	 * be cleared; all error will be relative to that new position.
	 * 
	 * @param position The mobile platform's new desired position
	 * <!-- end-model-doc -->
	 * @model positionUnique="false"
	 * @generated
	 */
	void resetPosition(Position position);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This operation is used to clear the mobile platform's positional
	 * error; this could be used to indicate that all error should now
	 * be taken in respect to the robot's current position.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void clearPositionError();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This operation is used to stop the mobile platform, if it is
	 * currently moving.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void stop();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operation is used to change the mobile platform's linear and
	 * angular velocities, which are in metres / second and radians / second,
	 * respectively.
	 * <p>
	 * Note 1: Unlike the traditional definition of linear velocity as a vector,
	 * this is simply a signed scalar; a positive value indicates the speed
	 * forward while a negative value is the speed backwards.  Zero means there
	 * is no movement.
	 * <p>
	 * Note 2: Unlike the traditional definition of angular velocity as a vector,
	 * this is simply a signed scalar; a positive value is the rotation in the
	 * clockwise direction while a negative value implies the rotation is in the
	 * counter-clockwise direction.  Zero means there is no rotation.
	 * 
	 * @param linearVelocity The commanded linear velocity.
	 * @param angularVelocity The commanded angular velocity.
	 * @see #cmdLinearVelocity(double)
	 * @see #cmdAngularVelocity(double)
	 * <!-- end-model-doc -->
	 * @model linearVelocityUnique="false"
	 *        linearVelocityAnnotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='m/s'" angularVelocityUnique="false"
	 *        angularVelocityAnnotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='rad/s'"
	 * @generated
	 */
	void cmdVelocities(double linearVelocity, double angularVelocity);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model powerLevelUnique="false"
	 * @generated
	 */
	void cmdLeftPowerLevel(byte powerLevel);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model powerLevelUnique="false"
	 * @generated
	 */
	void cmdRightPowerLevel(byte powerLevel);
} // PolarSysRoverPlatformClient
