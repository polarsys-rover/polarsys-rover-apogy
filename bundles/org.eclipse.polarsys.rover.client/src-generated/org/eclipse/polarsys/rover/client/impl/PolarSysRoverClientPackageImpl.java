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

import ca.gc.asc_csa.apogy.addons.sensors.imaging.ApogyAddonsSensorsImagingPackage;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.polarsys.rover.client.Camera;
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
	private EClass cameraEClass = null;

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
	public EClass getCamera() {
		return cameraEClass;
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
	public EAttribute getPolarSysRoverPlatformClient_LinearVelocity() {
		return (EAttribute)polarSysRoverPlatformClientEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarSysRoverPlatformClient_AngularVelocity() {
		return (EAttribute)polarSysRoverPlatformClientEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarSysRoverPlatformClient_FrontLeftWheelPosition() {
		return (EAttribute)polarSysRoverPlatformClientEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarSysRoverPlatformClient_FrontRightWheelPosition() {
		return (EAttribute)polarSysRoverPlatformClientEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarSysRoverPlatformClient_RearLeftWheelPosition() {
		return (EAttribute)polarSysRoverPlatformClientEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarSysRoverPlatformClient_RearRightWheelPosition() {
		return (EAttribute)polarSysRoverPlatformClientEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarSysRoverPlatformClient_FrontSonar() {
		return (EAttribute)polarSysRoverPlatformClientEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolarSysRoverPlatformClient_Position() {
		return (EReference)polarSysRoverPlatformClientEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolarSysRoverPlatformClient_FrontCamera() {
		return (EReference)polarSysRoverPlatformClientEClass.getEStructuralFeatures().get(11);
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

		cameraEClass = createEClass(CAMERA);

		polarSysRoverPlatformClientEClass = createEClass(POLAR_SYS_ROVER_PLATFORM_CLIENT);
		createEAttribute(polarSysRoverPlatformClientEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT__INITIALIZED);
		createEAttribute(polarSysRoverPlatformClientEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT__DISPOSED);
		createEAttribute(polarSysRoverPlatformClientEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT__POSITION_ERROR);
		createEAttribute(polarSysRoverPlatformClientEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT__LINEAR_VELOCITY);
		createEAttribute(polarSysRoverPlatformClientEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT__ANGULAR_VELOCITY);
		createEAttribute(polarSysRoverPlatformClientEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_LEFT_WHEEL_POSITION);
		createEAttribute(polarSysRoverPlatformClientEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_RIGHT_WHEEL_POSITION);
		createEAttribute(polarSysRoverPlatformClientEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT__REAR_LEFT_WHEEL_POSITION);
		createEAttribute(polarSysRoverPlatformClientEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT__REAR_RIGHT_WHEEL_POSITION);
		createEAttribute(polarSysRoverPlatformClientEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_SONAR);
		createEReference(polarSysRoverPlatformClientEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT__POSITION);
		createEReference(polarSysRoverPlatformClientEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_CAMERA);
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
		ApogyCommonEMFPackage theApogyCommonEMFPackage = (ApogyCommonEMFPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonEMFPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cameraEClass.getESuperTypes().add(theApogyAddonsSensorsImagingPackage.getAbstractCamera());
		polarSysRoverPlatformClientEClass.getESuperTypes().add(theApogyCommonEMFPackage.getDisposable());

		// Initialize classes, features, and operations; add parameters
		initEClass(positionEClass, Position.class, "Position", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPosition_X(), theEcorePackage.getEDouble(), "x", "0.0", 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosition_Y(), theEcorePackage.getEDouble(), "y", "0.0", 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosition_Theta(), theEcorePackage.getEDouble(), "theta", "0.0", 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cameraEClass, Camera.class, "Camera", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(polarSysRoverPlatformClientEClass, PolarSysRoverPlatformClient.class, "PolarSysRoverPlatformClient", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPolarSysRoverPlatformClient_Initialized(), theEcorePackage.getEBoolean(), "initialized", "false", 0, 1, PolarSysRoverPlatformClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolarSysRoverPlatformClient_Disposed(), theEcorePackage.getEBoolean(), "disposed", "false", 0, 1, PolarSysRoverPlatformClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolarSysRoverPlatformClient_PositionError(), theEcorePackage.getEDouble(), "positionError", "0.0", 0, 1, PolarSysRoverPlatformClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolarSysRoverPlatformClient_LinearVelocity(), theEcorePackage.getEDouble(), "linearVelocity", "0.0", 0, 1, PolarSysRoverPlatformClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolarSysRoverPlatformClient_AngularVelocity(), theEcorePackage.getEDouble(), "angularVelocity", "0.0", 0, 1, PolarSysRoverPlatformClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolarSysRoverPlatformClient_FrontLeftWheelPosition(), theEcorePackage.getEDouble(), "frontLeftWheelPosition", "0.0", 0, 1, PolarSysRoverPlatformClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolarSysRoverPlatformClient_FrontRightWheelPosition(), theEcorePackage.getEDouble(), "frontRightWheelPosition", "0.0", 0, 1, PolarSysRoverPlatformClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolarSysRoverPlatformClient_RearLeftWheelPosition(), theEcorePackage.getEDouble(), "rearLeftWheelPosition", "0.0", 0, 1, PolarSysRoverPlatformClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolarSysRoverPlatformClient_RearRightWheelPosition(), theEcorePackage.getEDouble(), "rearRightWheelPosition", "0.0", 0, 1, PolarSysRoverPlatformClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolarSysRoverPlatformClient_FrontSonar(), theEcorePackage.getEInt(), "frontSonar", "0", 0, 1, PolarSysRoverPlatformClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolarSysRoverPlatformClient_Position(), this.getPosition(), null, "position", null, 1, 1, PolarSysRoverPlatformClient.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolarSysRoverPlatformClient_FrontCamera(), this.getCamera(), null, "frontCamera", null, 0, 1, PolarSysRoverPlatformClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPolarSysRoverPlatformClient__Init(), theEcorePackage.getEBoolean(), "init", 0, 1, !IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getPolarSysRoverPlatformClient__ResetPosition__Position(), null, "resetPosition", 0, 1, !IS_UNIQUE, IS_ORDERED);
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
		  (getPolarSysRoverPlatformClient_LinearVelocity(), 
		   source, 
		   new String[] {
			 "documentation", "This is the mobile platform\'s current linear velocity\n(in metres per second)",
			 "children", "false",
			 "notify", "true",
			 "property", "Readonly",
			 "propertyCategory", "Velocities",
			 "apogy_units", "m/s"
		   });	
		addAnnotation
		  (getPolarSysRoverPlatformClient_AngularVelocity(), 
		   source, 
		   new String[] {
			 "documentation", "This is the mobile platform\'s current angular velocity\n(in radians per second).",
			 "children", "false",
			 "notify", "true",
			 "property", "Readonly",
			 "propertyCategory", "Velocities",
			 "apogy_units", "rad/s"
		   });	
		addAnnotation
		  (getPolarSysRoverPlatformClient_FrontLeftWheelPosition(), 
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
		  (getPolarSysRoverPlatformClient_FrontRightWheelPosition(), 
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
		  (getPolarSysRoverPlatformClient_RearLeftWheelPosition(), 
		   source, 
		   new String[] {
			 "documentation", "This is the current angular position (in radians) of\nthe mobile platform\'s rear left wheels.",
			 "children", "false",
			 "notify", "true",
			 "property", "Readonly",
			 "propertyCategory", "Position",
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getPolarSysRoverPlatformClient_RearRightWheelPosition(), 
		   source, 
		   new String[] {
			 "documentation", "This is the current angular position (in radians) of\nthe mobile platform\'s rear right wheels.",
			 "children", "false",
			 "notify", "true",
			 "property", "Readonly",
			 "propertyCategory", "Position",
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getPolarSysRoverPlatformClient_Position(), 
		   source, 
		   new String[] {
			 "documentation", "This is the mobile platform\'s current position",
			 "notify", "true",
			 "propertyCategory", "Position"
		   });
	}

} //PolarSysRoverClientPackageImpl
