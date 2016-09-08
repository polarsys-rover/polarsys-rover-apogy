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
package org.eclipse.polarsys.rover.client.simulator;

import org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polar Sys Rover Client Simulator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.polarsys.rover.client.simulator.PolarSysRoverPlatformClientSimulator#getWheelRadius <em>Wheel Radius</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.simulator.PolarSysRoverPlatformClientSimulator#getDegreeSYM <em>Degree SYM</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.simulator.PolarSysRoverPlatformClientSimulator#getWheelTrack <em>Wheel Track</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.simulator.PolarSysRoverPlatformClientSimulator#getMoveWaitPeriod <em>Move Wait Period</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.simulator.PolarSysRoverPlatformClientSimulator#getMoveToMinLinSpeed <em>Move To Min Lin Speed</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.simulator.PolarSysRoverPlatformClientSimulator#getErrorPerMeter <em>Error Per Meter</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.simulator.PolarSysRoverPlatformClientSimulator#getMaxPowerLevel <em>Max Power Level</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.simulator.PolarSysRoverPlatformClientSimulator#getMinPowerLevel <em>Min Power Level</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.simulator.PolarSysRoverPlatformClientSimulator#getMaxCtrPowerLevel <em>Max Ctr Power Level</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.simulator.PolarSysRoverPlatformClientSimulator#getMinCtrPowerLevel <em>Min Ctr Power Level</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.simulator.PolarSysRoverPlatformClientSimulator#getMaxAngVelocity <em>Max Ang Velocity</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.simulator.PolarSysRoverPlatformClientSimulator#getMinAngVelocity <em>Min Ang Velocity</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.simulator.PolarSysRoverPlatformClientSimulator#getMaxLinVelocity <em>Max Lin Velocity</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.simulator.PolarSysRoverPlatformClientSimulator#getMinLinVelocity <em>Min Lin Velocity</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.simulator.PolarSysRoverPlatformClientSimulator#getDistanceBetweenWheels <em>Distance Between Wheels</em>}</li>
 * </ul>
 *
 * @see org.eclipse.polarsys.rover.client.simulator.PolarSysRoverClientSimulatorPackage#getPolarSysRoverPlatformClientSimulator()
 * @model annotation="http://www.eclipse.org/emf/2002/GenModel dynamic='false'"
 * @generated
 */
public interface PolarSysRoverPlatformClientSimulator extends PolarSysRoverPlatformClient {

	/**
	 * Returns the value of the '<em><b>Wheel Radius</b></em>' attribute.
	 * The default value is <code>"0.25"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the radius (in m) of the mobile platform's wheels.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wheel Radius</em>' attribute.
	 * @see org.eclipse.polarsys.rover.client.simulator.PolarSysRoverClientSimulatorPackage#getPolarSysRoverPlatformClientSimulator_WheelRadius()
	 * @model default="0.25" unique="false" transient="true" changeable="false"
	 * @generated
	 */
	double getWheelRadius();

	/**
	 * Returns the value of the '<em><b>Degree SYM</b></em>' attribute.
	 * The default value is <code>"\u00b0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * This is the degree symbol, as expressed in unicode
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Degree SYM</em>' attribute.
	 * @see org.eclipse.polarsys.rover.client.simulator.PolarSysRoverClientSimulatorPackage#getPolarSysRoverPlatformClientSimulator_DegreeSYM()
	 * @model default="\u00b0" unique="false" transient="true" changeable="false"
	 * @generated
	 */
	String getDegreeSYM();

	/**
	 * Returns the value of the '<em><b>Wheel Track</b></em>' attribute.
	 * The default value is <code>"0.64"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * This is the length (in m) of the mobile platform's track
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wheel Track</em>' attribute.
	 * @see org.eclipse.polarsys.rover.client.simulator.PolarSysRoverClientSimulatorPackage#getPolarSysRoverPlatformClientSimulator_WheelTrack()
	 * @model default="0.64" unique="false" transient="true" changeable="false"
	 * @generated
	 */
	double getWheelTrack();

	/**
	 * Returns the value of the '<em><b>Move Wait Period</b></em>' attribute.
	 * The default value is <code>"30"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * This is the time (in milliseconds) between subsequent movement steps of
	 * the mobile platform.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Move Wait Period</em>' attribute.
	 * @see org.eclipse.polarsys.rover.client.simulator.PolarSysRoverClientSimulatorPackage#getPolarSysRoverPlatformClientSimulator_MoveWaitPeriod()
	 * @model default="30" unique="false" transient="true" changeable="false"
	 * @generated
	 */
	int getMoveWaitPeriod();

	/**
	 * Returns the value of the '<em><b>Move To Min Lin Speed</b></em>' attribute.
	 * The default value is <code>"1.5"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * This is the minimum linear velocity (in metres / second) that a moveTo()
	 * operates at.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Move To Min Lin Speed</em>' attribute.
	 * @see org.eclipse.polarsys.rover.client.simulator.PolarSysRoverClientSimulatorPackage#getPolarSysRoverPlatformClientSimulator_MoveToMinLinSpeed()
	 * @model default="1.5" unique="false" transient="true" changeable="false"
	 * @generated
	 */
	double getMoveToMinLinSpeed();

	/**
	 * Returns the value of the '<em><b>Error Per Meter</b></em>' attribute.
	 * The default value is <code>"0.05"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * This is the amount of error is taking place per metre of distance
	 * traveled by the mobile platform.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Per Meter</em>' attribute.
	 * @see org.eclipse.polarsys.rover.client.simulator.PolarSysRoverClientSimulatorPackage#getPolarSysRoverPlatformClientSimulator_ErrorPerMeter()
	 * @model default="0.05" unique="false" transient="true" changeable="false"
	 * @generated
	 */
	double getErrorPerMeter();

	/**
	 * Returns the value of the '<em><b>Max Power Level</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Power Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Power Level</em>' attribute.
	 * @see org.eclipse.polarsys.rover.client.simulator.PolarSysRoverClientSimulatorPackage#getPolarSysRoverPlatformClientSimulator_MaxPowerLevel()
	 * @model default="1" unique="false" transient="true" changeable="false"
	 * @generated
	 */
	double getMaxPowerLevel();

	/**
	 * Returns the value of the '<em><b>Min Power Level</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Power Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Power Level</em>' attribute.
	 * @see org.eclipse.polarsys.rover.client.simulator.PolarSysRoverClientSimulatorPackage#getPolarSysRoverPlatformClientSimulator_MinPowerLevel()
	 * @model default="-1" unique="false" transient="true" changeable="false"
	 * @generated
	 */
	double getMinPowerLevel();

	/**
	 * Returns the value of the '<em><b>Max Ctr Power Level</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Ctr Power Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Ctr Power Level</em>' attribute.
	 * @see org.eclipse.polarsys.rover.client.simulator.PolarSysRoverClientSimulatorPackage#getPolarSysRoverPlatformClientSimulator_MaxCtrPowerLevel()
	 * @model default="100" unique="false" transient="true" changeable="false"
	 * @generated
	 */
	double getMaxCtrPowerLevel();

	/**
	 * Returns the value of the '<em><b>Min Ctr Power Level</b></em>' attribute.
	 * The default value is <code>"-100"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Ctr Power Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Ctr Power Level</em>' attribute.
	 * @see org.eclipse.polarsys.rover.client.simulator.PolarSysRoverClientSimulatorPackage#getPolarSysRoverPlatformClientSimulator_MinCtrPowerLevel()
	 * @model default="-100" unique="false" transient="true" changeable="false"
	 * @generated
	 */
	double getMinCtrPowerLevel();

	/**
	 * Returns the value of the '<em><b>Max Ang Velocity</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Ang Velocity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Ang Velocity</em>' attribute.
	 * @see org.eclipse.polarsys.rover.client.simulator.PolarSysRoverClientSimulatorPackage#getPolarSysRoverPlatformClientSimulator_MaxAngVelocity()
	 * @model default="2" unique="false" transient="true" changeable="false"
	 * @generated
	 */
	double getMaxAngVelocity();

	/**
	 * Returns the value of the '<em><b>Min Ang Velocity</b></em>' attribute.
	 * The default value is <code>"-2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Ang Velocity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Ang Velocity</em>' attribute.
	 * @see org.eclipse.polarsys.rover.client.simulator.PolarSysRoverClientSimulatorPackage#getPolarSysRoverPlatformClientSimulator_MinAngVelocity()
	 * @model default="-2" unique="false" transient="true" changeable="false"
	 * @generated
	 */
	double getMinAngVelocity();

	/**
	 * Returns the value of the '<em><b>Max Lin Velocity</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Lin Velocity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Lin Velocity</em>' attribute.
	 * @see org.eclipse.polarsys.rover.client.simulator.PolarSysRoverClientSimulatorPackage#getPolarSysRoverPlatformClientSimulator_MaxLinVelocity()
	 * @model default="2" unique="false" transient="true" changeable="false"
	 * @generated
	 */
	double getMaxLinVelocity();

	/**
	 * Returns the value of the '<em><b>Min Lin Velocity</b></em>' attribute.
	 * The default value is <code>"-2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Lin Velocity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Lin Velocity</em>' attribute.
	 * @see org.eclipse.polarsys.rover.client.simulator.PolarSysRoverClientSimulatorPackage#getPolarSysRoverPlatformClientSimulator_MinLinVelocity()
	 * @model default="-2" unique="false" transient="true" changeable="false"
	 * @generated
	 */
	double getMinLinVelocity();

	/**
	 * Returns the value of the '<em><b>Distance Between Wheels</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance Between Wheels</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance Between Wheels</em>' attribute.
	 * @see org.eclipse.polarsys.rover.client.simulator.PolarSysRoverClientSimulatorPackage#getPolarSysRoverPlatformClientSimulator_DistanceBetweenWheels()
	 * @model default="2" unique="false" transient="true" changeable="false"
	 * @generated
	 */
	double getDistanceBetweenWheels();
} // PolarSysRoverClientSimulator
