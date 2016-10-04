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

import ca.gc.asc_csa.apogy.addons.sensors.fov.ApogyAddonsSensorsFOVPackage;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.ApogyAddonsSensorsImagingPackage;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.polarsys.rover.client.PolarSysCamera;
import org.eclipse.polarsys.rover.client.PolarSysRoverClientFactory;
import org.eclipse.polarsys.rover.client.PolarSysRoverClientPackage;
import org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient;
import org.eclipse.polarsys.rover.client.Position;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PolarSysRoverClientPackageImpl extends EPackageImpl implements PolarSysRoverClientPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polarSysCameraEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polarSysRoverPlatformClientEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.polarsys.rover.client.PolarSysRoverClientPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PolarSysRoverClientPackageImpl() {
		super(eNS_URI, PolarSysRoverClientFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PolarSysRoverClientPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PolarSysRoverClientPackage init() {
		if (isInited) return (PolarSysRoverClientPackage)EPackage.Registry.INSTANCE.getEPackage(PolarSysRoverClientPackage.eNS_URI);

		// Obtain or create and register package
		PolarSysRoverClientPackageImpl thePolarSysRoverClientPackage = (PolarSysRoverClientPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PolarSysRoverClientPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PolarSysRoverClientPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyAddonsSensorsImagingPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePolarSysRoverClientPackage.createPackageContents();

		// Initialize created meta-data
		thePolarSysRoverClientPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePolarSysRoverClientPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PolarSysRoverClientPackage.eNS_URI, thePolarSysRoverClientPackage);
		return thePolarSysRoverClientPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPosition() {
		return positionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPosition_X() {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPosition_Y() {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPosition_Theta() {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolarSysCamera() {
		return polarSysCameraEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolarSysCamera_Fov() {
		return (EReference)polarSysCameraEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarSysCamera_Initialized() {
		return (EAttribute)polarSysCameraEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarSysCamera_StreamingEnabled() {
		return (EAttribute)polarSysCameraEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPolarSysCamera__Init() {
		return polarSysCameraEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPolarSysCamera__CommandStreaming__boolean() {
		return polarSysCameraEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolarSysRoverPlatformClient() {
		return polarSysRoverPlatformClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarSysRoverPlatformClient_Initialized() {
		return (EAttribute)polarSysRoverPlatformClientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarSysRoverPlatformClient_Disposed() {
		return (EAttribute)polarSysRoverPlatformClientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarSysRoverPlatformClient_PositionError() {
		return (EAttribute)polarSysRoverPlatformClientEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarSysRoverPlatformClient_LeftPowerLevel() {
		return (EAttribute)polarSysRoverPlatformClientEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarSysRoverPlatformClient_RightPowerLevel() {
		return (EAttribute)polarSysRoverPlatformClientEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarSysRoverPlatformClient_LeftWheelPosition() {
		return (EAttribute)polarSysRoverPlatformClientEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarSysRoverPlatformClient_RightWheelPosition() {
		return (EAttribute)polarSysRoverPlatformClientEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarSysRoverPlatformClient_FrontSonar() {
		return (EAttribute)polarSysRoverPlatformClientEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolarSysRoverPlatformClient_Position() {
		return (EReference)polarSysRoverPlatformClientEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolarSysRoverPlatformClient_FrontCamera() {
		return (EReference)polarSysRoverPlatformClientEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarSysRoverPlatformClient_WheelRadius() {
		return (EAttribute)polarSysRoverPlatformClientEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarSysRoverPlatformClient_WheelTrack() {
		return (EAttribute)polarSysRoverPlatformClientEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarSysRoverPlatformClient_MoveWaitPeriod() {
		return (EAttribute)polarSysRoverPlatformClientEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarSysRoverPlatformClient_MoveToMinLinSpeed() {
		return (EAttribute)polarSysRoverPlatformClientEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarSysRoverPlatformClient_ErrorPerMeter() {
		return (EAttribute)polarSysRoverPlatformClientEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarSysRoverPlatformClient_MaxPowerLevel() {
		return (EAttribute)polarSysRoverPlatformClientEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarSysRoverPlatformClient_MaxCtrPowerLevel() {
		return (EAttribute)polarSysRoverPlatformClientEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarSysRoverPlatformClient_MaxAngVelocity() {
		return (EAttribute)polarSysRoverPlatformClientEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarSysRoverPlatformClient_MaxLinVelocity() {
		return (EAttribute)polarSysRoverPlatformClientEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarSysRoverPlatformClient_DistanceBetweenWheels() {
		return (EAttribute)polarSysRoverPlatformClientEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPolarSysRoverPlatformClient__Init() {
		return polarSysRoverPlatformClientEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPolarSysRoverPlatformClient__ResetPosition__Position() {
		return polarSysRoverPlatformClientEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPolarSysRoverPlatformClient__ClearPositionError() {
		return polarSysRoverPlatformClientEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPolarSysRoverPlatformClient__Stop() {
		return polarSysRoverPlatformClientEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPolarSysRoverPlatformClient__CmdVelocities__double_double() {
		return polarSysRoverPlatformClientEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPolarSysRoverPlatformClient__CmdPowerLevel__double_double() {
		return polarSysRoverPlatformClientEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolarSysRoverClientFactory getPolarSysRoverClientFactory() {
		return (PolarSysRoverClientFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		positionEClass = createEClass(POSITION);
		createEAttribute(positionEClass, POSITION__X);
		createEAttribute(positionEClass, POSITION__Y);
		createEAttribute(positionEClass, POSITION__THETA);

		polarSysCameraEClass = createEClass(POLAR_SYS_CAMERA);
		createEReference(polarSysCameraEClass, POLAR_SYS_CAMERA__FOV);
		createEAttribute(polarSysCameraEClass, POLAR_SYS_CAMERA__INITIALIZED);
		createEAttribute(polarSysCameraEClass, POLAR_SYS_CAMERA__STREAMING_ENABLED);
		createEOperation(polarSysCameraEClass, POLAR_SYS_CAMERA___INIT);
		createEOperation(polarSysCameraEClass, POLAR_SYS_CAMERA___COMMAND_STREAMING__BOOLEAN);

		polarSysRoverPlatformClientEClass = createEClass(POLAR_SYS_ROVER_PLATFORM_CLIENT);
		createEAttribute(polarSysRoverPlatformClientEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT__INITIALIZED);
		createEAttribute(polarSysRoverPlatformClientEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT__DISPOSED);
		createEAttribute(polarSysRoverPlatformClientEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT__POSITION_ERROR);
		createEAttribute(polarSysRoverPlatformClientEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT__LEFT_POWER_LEVEL);
		createEAttribute(polarSysRoverPlatformClientEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT__RIGHT_POWER_LEVEL);
		createEAttribute(polarSysRoverPlatformClientEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT__LEFT_WHEEL_POSITION);
		createEAttribute(polarSysRoverPlatformClientEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT__RIGHT_WHEEL_POSITION);
		createEAttribute(polarSysRoverPlatformClientEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_SONAR);
		createEReference(polarSysRoverPlatformClientEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT__POSITION);
		createEReference(polarSysRoverPlatformClientEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_CAMERA);
		createEAttribute(polarSysRoverPlatformClientEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT__WHEEL_RADIUS);
		createEAttribute(polarSysRoverPlatformClientEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT__WHEEL_TRACK);
		createEAttribute(polarSysRoverPlatformClientEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT__MOVE_WAIT_PERIOD);
		createEAttribute(polarSysRoverPlatformClientEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT__MOVE_TO_MIN_LIN_SPEED);
		createEAttribute(polarSysRoverPlatformClientEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT__ERROR_PER_METER);
		createEAttribute(polarSysRoverPlatformClientEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT__MAX_POWER_LEVEL);
		createEAttribute(polarSysRoverPlatformClientEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT__MAX_CTR_POWER_LEVEL);
		createEAttribute(polarSysRoverPlatformClientEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT__MAX_ANG_VELOCITY);
		createEAttribute(polarSysRoverPlatformClientEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT__MAX_LIN_VELOCITY);
		createEAttribute(polarSysRoverPlatformClientEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT__DISTANCE_BETWEEN_WHEELS);
		createEOperation(polarSysRoverPlatformClientEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT___INIT);
		createEOperation(polarSysRoverPlatformClientEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT___RESET_POSITION__POSITION);
		createEOperation(polarSysRoverPlatformClientEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT___CLEAR_POSITION_ERROR);
		createEOperation(polarSysRoverPlatformClientEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT___STOP);
		createEOperation(polarSysRoverPlatformClientEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT___CMD_VELOCITIES__DOUBLE_DOUBLE);
		createEOperation(polarSysRoverPlatformClientEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT___CMD_POWER_LEVEL__DOUBLE_DOUBLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ApogyAddonsSensorsImagingPackage theApogyAddonsSensorsImagingPackage = (ApogyAddonsSensorsImagingPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyAddonsSensorsImagingPackage.eNS_URI);
		ApogyAddonsSensorsFOVPackage theApogyAddonsSensorsFOVPackage = (ApogyAddonsSensorsFOVPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyAddonsSensorsFOVPackage.eNS_URI);
		ApogyCommonEMFPackage theApogyCommonEMFPackage = (ApogyCommonEMFPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonEMFPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		polarSysCameraEClass.getESuperTypes().add(theApogyAddonsSensorsImagingPackage.getAbstractCamera());
		polarSysRoverPlatformClientEClass.getESuperTypes().add(theApogyCommonEMFPackage.getDisposable());

		// Initialize classes, features, and operations; add parameters
		initEClass(positionEClass, Position.class, "Position", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPosition_X(), theEcorePackage.getEDouble(), "x", "0.0", 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosition_Y(), theEcorePackage.getEDouble(), "y", "0.0", 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosition_Theta(), theEcorePackage.getEDouble(), "theta", "0.0", 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(polarSysCameraEClass, PolarSysCamera.class, "PolarSysCamera", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPolarSysCamera_Fov(), theApogyAddonsSensorsFOVPackage.getRectangularFrustrumFieldOfView(), null, "fov", null, 1, 1, PolarSysCamera.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolarSysCamera_Initialized(), theEcorePackage.getEBoolean(), "initialized", "false", 0, 1, PolarSysCamera.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolarSysCamera_StreamingEnabled(), theEcorePackage.getEBoolean(), "streamingEnabled", "false", 0, 1, PolarSysCamera.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPolarSysCamera__Init(), theEcorePackage.getEBoolean(), "init", 0, 1, !IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getPolarSysCamera__CommandStreaming__boolean(), theEcorePackage.getEBoolean(), "commandStreaming", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "streamingEnabled", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(polarSysRoverPlatformClientEClass, PolarSysRoverPlatformClient.class, "PolarSysRoverPlatformClient", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPolarSysRoverPlatformClient_Initialized(), theEcorePackage.getEBoolean(), "initialized", "false", 0, 1, PolarSysRoverPlatformClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolarSysRoverPlatformClient_Disposed(), theEcorePackage.getEBoolean(), "disposed", "false", 0, 1, PolarSysRoverPlatformClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolarSysRoverPlatformClient_PositionError(), theEcorePackage.getEDouble(), "positionError", "0.0", 0, 1, PolarSysRoverPlatformClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolarSysRoverPlatformClient_LeftPowerLevel(), theEcorePackage.getEDouble(), "leftPowerLevel", "0.0", 0, 1, PolarSysRoverPlatformClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolarSysRoverPlatformClient_RightPowerLevel(), theEcorePackage.getEDouble(), "rightPowerLevel", "0.0", 0, 1, PolarSysRoverPlatformClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolarSysRoverPlatformClient_LeftWheelPosition(), theEcorePackage.getEDouble(), "leftWheelPosition", "0.0", 0, 1, PolarSysRoverPlatformClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolarSysRoverPlatformClient_RightWheelPosition(), theEcorePackage.getEDouble(), "rightWheelPosition", "0.0", 0, 1, PolarSysRoverPlatformClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolarSysRoverPlatformClient_FrontSonar(), theEcorePackage.getEInt(), "frontSonar", "0", 0, 1, PolarSysRoverPlatformClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolarSysRoverPlatformClient_Position(), this.getPosition(), null, "position", null, 1, 1, PolarSysRoverPlatformClient.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolarSysRoverPlatformClient_FrontCamera(), this.getPolarSysCamera(), null, "frontCamera", null, 1, 1, PolarSysRoverPlatformClient.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolarSysRoverPlatformClient_WheelRadius(), theEcorePackage.getEDouble(), "wheelRadius", "0.25", 0, 1, PolarSysRoverPlatformClient.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolarSysRoverPlatformClient_WheelTrack(), theEcorePackage.getEDouble(), "wheelTrack", "0.64", 0, 1, PolarSysRoverPlatformClient.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolarSysRoverPlatformClient_MoveWaitPeriod(), theEcorePackage.getEInt(), "moveWaitPeriod", "30", 0, 1, PolarSysRoverPlatformClient.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolarSysRoverPlatformClient_MoveToMinLinSpeed(), theEcorePackage.getEDouble(), "moveToMinLinSpeed", "1.5", 0, 1, PolarSysRoverPlatformClient.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolarSysRoverPlatformClient_ErrorPerMeter(), theEcorePackage.getEDouble(), "ErrorPerMeter", "0.05", 0, 1, PolarSysRoverPlatformClient.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolarSysRoverPlatformClient_MaxPowerLevel(), theEcorePackage.getEDouble(), "maxPowerLevel", "1", 0, 1, PolarSysRoverPlatformClient.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolarSysRoverPlatformClient_MaxCtrPowerLevel(), theEcorePackage.getEDouble(), "maxCtrPowerLevel", "100", 0, 1, PolarSysRoverPlatformClient.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolarSysRoverPlatformClient_MaxAngVelocity(), theEcorePackage.getEDouble(), "maxAngVelocity", "2", 0, 1, PolarSysRoverPlatformClient.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolarSysRoverPlatformClient_MaxLinVelocity(), theEcorePackage.getEDouble(), "maxLinVelocity", "2", 0, 1, PolarSysRoverPlatformClient.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolarSysRoverPlatformClient_DistanceBetweenWheels(), theEcorePackage.getEDouble(), "distanceBetweenWheels", "2", 0, 1, PolarSysRoverPlatformClient.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPolarSysRoverPlatformClient__Init(), theEcorePackage.getEBoolean(), "init", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPolarSysRoverPlatformClient__ResetPosition__Position(), null, "resetPosition", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPosition(), "position", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getPolarSysRoverPlatformClient__ClearPositionError(), null, "clearPositionError", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getPolarSysRoverPlatformClient__Stop(), null, "stop", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPolarSysRoverPlatformClient__CmdVelocities__double_double(), null, "cmdVelocities", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "linearVelocity", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "angularVelocity", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPolarSysRoverPlatformClient__CmdPowerLevel__double_double(), null, "cmdPowerLevel", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "leftPowerLevel", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "rightPowerLevel", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "documentation", "Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca),\n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation",
			 "prefix", "PolarSysRoverClient",
			 "copyrightText", "Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation",
			 "modelName", "PolarSysRoverClient",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "suppressGenModelAnnotations", "false",
			 "dynamicTemplates", "true",
			 "templateDirectory", "platform:/plugin/ca.gc.asc_csa.apogy.common.emf.templates",
			 "modelDirectory", "/org.eclipse.polarsys.rover.client/src-generated",
			 "editDirectory", "/org.eclipse.polarsys.rover.client.edit/src-generated",
			 "basePackage", "org.eclipse.polarsys.rover"
		   });	
		addAnnotation
		  (positionEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class is used to represent a position of a particular object\nin space.  In particular, this provides both a Cartesian coordinate\nlocation as well as an angle corresponding to the object\'s pose."
		   });	
		addAnnotation
		  (getPosition_X(), 
		   source, 
		   new String[] {
			 "documentation", "This is the position\'s X coordinate (given in metres)",
			 "children", "false",
			 "notify", "true",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getPosition_Y(), 
		   source, 
		   new String[] {
			 "documentation", "This is the position\'s Y coordinate (given in metres)",
			 "children", "false",
			 "notify", "true",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getPosition_Theta(), 
		   source, 
		   new String[] {
			 "documentation", "This is the pose angle (in radians) of an object, which\nspecifies a rotation around the Z axis.",
			 "children", "false",
			 "notify", "true",
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getPolarSysCamera__Init(), 
		   source, 
		   new String[] {
			 "documentation", "This operation performs any required initialization\noperations for the camera.  This is typically called\nbefore any other operation.\n@return True if the initialization was successful, false otherwise."
		   });	
		addAnnotation
		  (getPolarSysCamera__CommandStreaming__boolean(), 
		   source, 
		   new String[] {
			 "documentation", "This operation enables or disables image streaming.\nWhen image streaming is enabled, images are updated at about 1 Hz."
		   });	
		addAnnotation
		  (getPolarSysCamera_Fov(), 
		   source, 
		   new String[] {
			 "documentation", "The field of view for this particular camera",
			 "notify", "true",
			 "propertyCategory", "Field Of View"
		   });	
		addAnnotation
		  (getPolarSysCamera_Initialized(), 
		   source, 
		   new String[] {
			 "documentation", "This is whether or not the camera has been\nsuccessfully initialized; initially false\n@see #init()",
			 "children", "false",
			 "notify", "true",
			 "propertyCategory", "Status"
		   });	
		addAnnotation
		  (getPolarSysCamera_StreamingEnabled(), 
		   source, 
		   new String[] {
			 "documentation", "Whether or not image streaming is enabled.",
			 "children", "false",
			 "notify", "true",
			 "propertyCategory", "Status"
		   });	
		addAnnotation
		  (polarSysRoverPlatformClientEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class represents the PolarSys Rover Platform client."
		   });	
		addAnnotation
		  (getPolarSysRoverPlatformClient__Init(), 
		   source, 
		   new String[] {
			 "documentation", "This operation is used to initialize the mobile platform\nand as such, it will perform the required creation and\ninitialization steps.\n\n@return Whether or not the mobile platform was successfully initialized"
		   });	
		addAnnotation
		  (getPolarSysRoverPlatformClient__ResetPosition__Position(), 
		   source, 
		   new String[] {
			 "documentation", "This operation is used to change the mobile platform to\nhave the coordinates and pose matching the given position.\nThat new position will be considered the new starting place\nfor the mobile platform and as such, the accumulated error will\nbe cleared; all error will be relative to that new position.\n\n@param position The mobile platform\'s new desired position"
		   });	
		addAnnotation
		  (getPolarSysRoverPlatformClient__ClearPositionError(), 
		   source, 
		   new String[] {
			 "documentation", "This operation is used to clear the mobile platform\'s positional\nerror; this could be used to indicate that all error should now\nbe taken in respect to the robot\'s current position."
		   });	
		addAnnotation
		  (getPolarSysRoverPlatformClient__Stop(), 
		   source, 
		   new String[] {
			 "documentation", "This operation is used to stop the mobile platform, if it is\ncurrently moving."
		   });	
		addAnnotation
		  (getPolarSysRoverPlatformClient__CmdVelocities__double_double(), 
		   source, 
		   new String[] {
			 "documentation", "The operation is used to change the mobile platform\'s linear and\nangular velocities, which are in metres / second and radians / second,\nrespectively.\n<p>\nNote 1: Unlike the traditional definition of linear velocity as a vector,\nthis is simply a signed scalar; a positive value indicates the speed\nforward while a negative value is the speed backwards.  Zero means there\nis no movement.\n<p>\nNote 2: Unlike the traditional definition of angular velocity as a vector,\nthis is simply a signed scalar; a positive value is the rotation in the\nclockwise direction while a negative value implies the rotation is in the\ncounter-clockwise direction.  Zero means there is no rotation.\n\n@param linearVelocity The commanded linear velocity.\n@param angularVelocity The commanded angular velocity.\n@see #cmdLinearVelocity(double)\n@see #cmdAngularVelocity(double)"
		   });	
		addAnnotation
		  ((getPolarSysRoverPlatformClient__CmdVelocities__double_double()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "apogy_units", "m/s"
		   });	
		addAnnotation
		  ((getPolarSysRoverPlatformClient__CmdVelocities__double_double()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "apogy_units", "rad/s"
		   });	
		addAnnotation
		  (getPolarSysRoverPlatformClient_Initialized(), 
		   source, 
		   new String[] {
			 "documentation", "This is whether or not the mobile platform has\nbeen initialized; initially false.\n@see #init()",
			 "children", "false",
			 "property", "Readonly",
			 "propertyCategory", "Status"
		   });	
		addAnnotation
		  (getPolarSysRoverPlatformClient_Disposed(), 
		   source, 
		   new String[] {
			 "documentation", "This is whether or not the mobile platform has\nbeen disposed; initially false.\n@see #dispose()",
			 "children", "false",
			 "property", "Readonly",
			 "propertyCategory", "Status"
		   });	
		addAnnotation
		  (getPolarSysRoverPlatformClient_PositionError(), 
		   source, 
		   new String[] {
			 "documentation", "This is the mobile platform\'s current estimate of the error\nin its position (given in metres.)",
			 "children", "false",
			 "notify", "true",
			 "property", "Readonly",
			 "propertyCategory", "Position",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getPolarSysRoverPlatformClient_LeftPowerLevel(), 
		   source, 
		   new String[] {
			 "documentation", "This is the current angular position (in radians) of\nthe mobile platform\'s front left wheels.",
			 "children", "false",
			 "notify", "true",
			 "property", "Readonly",
			 "propertyCategory", "PowerLevels",
			 "apogy_units", "%"
		   });	
		addAnnotation
		  (getPolarSysRoverPlatformClient_RightPowerLevel(), 
		   source, 
		   new String[] {
			 "documentation", "This is the current angular position (in radians) of\nthe mobile platform\'s front left wheels.",
			 "children", "false",
			 "notify", "true",
			 "property", "Readonly",
			 "propertyCategory", "PowerLevels",
			 "apogy_units", "%"
		   });	
		addAnnotation
		  (getPolarSysRoverPlatformClient_LeftWheelPosition(), 
		   source, 
		   new String[] {
			 "documentation", "This is the current angular position (in radians) of\nthe mobile platform\'s front left wheels.",
			 "children", "false",
			 "notify", "true",
			 "property", "Readonly",
			 "propertyCategory", "Position",
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getPolarSysRoverPlatformClient_RightWheelPosition(), 
		   source, 
		   new String[] {
			 "documentation", "This is the current angular position (in radians) of\nthe mobile platform\'s front right wheels.",
			 "children", "false",
			 "notify", "true",
			 "property", "Readonly",
			 "propertyCategory", "Position",
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getPolarSysRoverPlatformClient_FrontSonar(), 
		   source, 
		   new String[] {
			 "documentation", "Front Sonar Level."
		   });	
		addAnnotation
		  (getPolarSysRoverPlatformClient_Position(), 
		   source, 
		   new String[] {
			 "documentation", "This is the mobile platform\'s current position",
			 "notify", "true",
			 "propertyCategory", "Position"
		   });	
		addAnnotation
		  (getPolarSysRoverPlatformClient_FrontCamera(), 
		   source, 
		   new String[] {
			 "documentation", "Front Camera.",
			 "notify", "true",
			 "propertyCategory", "Camera"
		   });	
		addAnnotation
		  (getPolarSysRoverPlatformClient_WheelRadius(), 
		   source, 
		   new String[] {
			 "documentation", "This is the radius (in m) of the mobile platform\'s wheels."
		   });	
		addAnnotation
		  (getPolarSysRoverPlatformClient_WheelTrack(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThis is the length (in m) of the mobile platform\'s track"
		   });	
		addAnnotation
		  (getPolarSysRoverPlatformClient_MoveWaitPeriod(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThis is the time (in milliseconds) between subsequent movement steps of\nthe mobile platform."
		   });	
		addAnnotation
		  (getPolarSysRoverPlatformClient_MoveToMinLinSpeed(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThis is the minimum linear velocity (in metres / second) that a moveTo()\noperates at."
		   });	
		addAnnotation
		  (getPolarSysRoverPlatformClient_ErrorPerMeter(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThis is the amount of error is taking place per metre of distance\ntraveled by the mobile platform."
		   });	
		addAnnotation
		  (getPolarSysRoverPlatformClient_MaxPowerLevel(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThis is the maximum power level that can be sent to the rover"
		   });	
		addAnnotation
		  (getPolarSysRoverPlatformClient_MaxCtrPowerLevel(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThis is the maximum power level that the controller sends"
		   });	
		addAnnotation
		  (getPolarSysRoverPlatformClient_MaxAngVelocity(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThis is the maximum angular velocity that the controller sends"
		   });	
		addAnnotation
		  (getPolarSysRoverPlatformClient_MaxLinVelocity(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThis is the maximum linear velocity that the controller sends"
		   });	
		addAnnotation
		  (getPolarSysRoverPlatformClient_DistanceBetweenWheels(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThis is the distance between the wheels"
		   });
	}

} //PolarSysRoverClientPackageImpl
