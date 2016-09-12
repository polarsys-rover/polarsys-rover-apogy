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
package org.eclipse.polarsys.rover.client.simulator.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.polarsys.rover.client.PolarSysRoverClientPackage;
import org.eclipse.polarsys.rover.client.simulator.PolarSysRoverPlatformClientSimulator;
import org.eclipse.polarsys.rover.client.simulator.PolarSysRoverClientSimulatorFactory;
import org.eclipse.polarsys.rover.client.simulator.PolarSysRoverClientSimulatorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PolarSysRoverClientSimulatorPackageImpl extends EPackageImpl implements PolarSysRoverClientSimulatorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polarSysRoverPlatformClientSimulatorEClass = null;
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
	 * @see org.eclipse.polarsys.rover.client.simulator.PolarSysRoverClientSimulatorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PolarSysRoverClientSimulatorPackageImpl() {
		super(eNS_URI, PolarSysRoverClientSimulatorFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PolarSysRoverClientSimulatorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PolarSysRoverClientSimulatorPackage init() {
		if (isInited) return (PolarSysRoverClientSimulatorPackage)EPackage.Registry.INSTANCE.getEPackage(PolarSysRoverClientSimulatorPackage.eNS_URI);

		// Obtain or create and register package
		PolarSysRoverClientSimulatorPackageImpl thePolarSysRoverClientSimulatorPackage = (PolarSysRoverClientSimulatorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PolarSysRoverClientSimulatorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PolarSysRoverClientSimulatorPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PolarSysRoverClientPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePolarSysRoverClientSimulatorPackage.createPackageContents();

		// Initialize created meta-data
		thePolarSysRoverClientSimulatorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePolarSysRoverClientSimulatorPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PolarSysRoverClientSimulatorPackage.eNS_URI, thePolarSysRoverClientSimulatorPackage);
		return thePolarSysRoverClientSimulatorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolarSysRoverPlatformClientSimulator() {
		return polarSysRoverPlatformClientSimulatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarSysRoverPlatformClientSimulator_WheelRadius() {
		return (EAttribute)polarSysRoverPlatformClientSimulatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarSysRoverPlatformClientSimulator_DegreeSYM() {
		return (EAttribute)polarSysRoverPlatformClientSimulatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarSysRoverPlatformClientSimulator_WheelTrack() {
		return (EAttribute)polarSysRoverPlatformClientSimulatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarSysRoverPlatformClientSimulator_MoveWaitPeriod() {
		return (EAttribute)polarSysRoverPlatformClientSimulatorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarSysRoverPlatformClientSimulator_MoveToMinLinSpeed() {
		return (EAttribute)polarSysRoverPlatformClientSimulatorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarSysRoverPlatformClientSimulator_ErrorPerMeter() {
		return (EAttribute)polarSysRoverPlatformClientSimulatorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarSysRoverPlatformClientSimulator_MaxPowerLevel() {
		return (EAttribute)polarSysRoverPlatformClientSimulatorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarSysRoverPlatformClientSimulator_MinPowerLevel() {
		return (EAttribute)polarSysRoverPlatformClientSimulatorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarSysRoverPlatformClientSimulator_MaxCtrPowerLevel() {
		return (EAttribute)polarSysRoverPlatformClientSimulatorEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarSysRoverPlatformClientSimulator_MinCtrPowerLevel() {
		return (EAttribute)polarSysRoverPlatformClientSimulatorEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarSysRoverPlatformClientSimulator_MaxAngVelocity() {
		return (EAttribute)polarSysRoverPlatformClientSimulatorEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarSysRoverPlatformClientSimulator_MinAngVelocity() {
		return (EAttribute)polarSysRoverPlatformClientSimulatorEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarSysRoverPlatformClientSimulator_MaxLinVelocity() {
		return (EAttribute)polarSysRoverPlatformClientSimulatorEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarSysRoverPlatformClientSimulator_MinLinVelocity() {
		return (EAttribute)polarSysRoverPlatformClientSimulatorEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarSysRoverPlatformClientSimulator_DistanceBetweenWheels() {
		return (EAttribute)polarSysRoverPlatformClientSimulatorEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolarSysRoverClientSimulatorFactory getPolarSysRoverClientSimulatorFactory() {
		return (PolarSysRoverClientSimulatorFactory)getEFactoryInstance();
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
		polarSysRoverPlatformClientSimulatorEClass = createEClass(POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR);
		createEAttribute(polarSysRoverPlatformClientSimulatorEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__WHEEL_RADIUS);
		createEAttribute(polarSysRoverPlatformClientSimulatorEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__DEGREE_SYM);
		createEAttribute(polarSysRoverPlatformClientSimulatorEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__WHEEL_TRACK);
		createEAttribute(polarSysRoverPlatformClientSimulatorEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__MOVE_WAIT_PERIOD);
		createEAttribute(polarSysRoverPlatformClientSimulatorEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__MOVE_TO_MIN_LIN_SPEED);
		createEAttribute(polarSysRoverPlatformClientSimulatorEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__ERROR_PER_METER);
		createEAttribute(polarSysRoverPlatformClientSimulatorEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__MAX_POWER_LEVEL);
		createEAttribute(polarSysRoverPlatformClientSimulatorEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__MIN_POWER_LEVEL);
		createEAttribute(polarSysRoverPlatformClientSimulatorEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__MAX_CTR_POWER_LEVEL);
		createEAttribute(polarSysRoverPlatformClientSimulatorEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__MIN_CTR_POWER_LEVEL);
		createEAttribute(polarSysRoverPlatformClientSimulatorEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__MAX_ANG_VELOCITY);
		createEAttribute(polarSysRoverPlatformClientSimulatorEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__MIN_ANG_VELOCITY);
		createEAttribute(polarSysRoverPlatformClientSimulatorEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__MAX_LIN_VELOCITY);
		createEAttribute(polarSysRoverPlatformClientSimulatorEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__MIN_LIN_VELOCITY);
		createEAttribute(polarSysRoverPlatformClientSimulatorEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT_SIMULATOR__DISTANCE_BETWEEN_WHEELS);
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
		PolarSysRoverClientPackage thePolarSysRoverClientPackage = (PolarSysRoverClientPackage)EPackage.Registry.INSTANCE.getEPackage(PolarSysRoverClientPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		polarSysRoverPlatformClientSimulatorEClass.getESuperTypes().add(thePolarSysRoverClientPackage.getPolarSysRoverPlatformClient());

		// Initialize classes, features, and operations; add parameters
		initEClass(polarSysRoverPlatformClientSimulatorEClass, PolarSysRoverPlatformClientSimulator.class, "PolarSysRoverPlatformClientSimulator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPolarSysRoverPlatformClientSimulator_WheelRadius(), theEcorePackage.getEDouble(), "wheelRadius", "0.25", 0, 1, PolarSysRoverPlatformClientSimulator.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolarSysRoverPlatformClientSimulator_DegreeSYM(), theEcorePackage.getEString(), "degreeSYM", "\u00b0", 0, 1, PolarSysRoverPlatformClientSimulator.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolarSysRoverPlatformClientSimulator_WheelTrack(), theEcorePackage.getEDouble(), "wheelTrack", "0.64", 0, 1, PolarSysRoverPlatformClientSimulator.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolarSysRoverPlatformClientSimulator_MoveWaitPeriod(), theEcorePackage.getEInt(), "moveWaitPeriod", "30", 0, 1, PolarSysRoverPlatformClientSimulator.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolarSysRoverPlatformClientSimulator_MoveToMinLinSpeed(), theEcorePackage.getEDouble(), "moveToMinLinSpeed", "1.5", 0, 1, PolarSysRoverPlatformClientSimulator.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolarSysRoverPlatformClientSimulator_ErrorPerMeter(), theEcorePackage.getEDouble(), "ErrorPerMeter", "0.05", 0, 1, PolarSysRoverPlatformClientSimulator.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolarSysRoverPlatformClientSimulator_MaxPowerLevel(), theEcorePackage.getEDouble(), "maxPowerLevel", "1", 0, 1, PolarSysRoverPlatformClientSimulator.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolarSysRoverPlatformClientSimulator_MinPowerLevel(), theEcorePackage.getEDouble(), "minPowerLevel", "-1", 0, 1, PolarSysRoverPlatformClientSimulator.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolarSysRoverPlatformClientSimulator_MaxCtrPowerLevel(), theEcorePackage.getEDouble(), "maxCtrPowerLevel", "100", 0, 1, PolarSysRoverPlatformClientSimulator.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolarSysRoverPlatformClientSimulator_MinCtrPowerLevel(), theEcorePackage.getEDouble(), "minCtrPowerLevel", "-100", 0, 1, PolarSysRoverPlatformClientSimulator.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolarSysRoverPlatformClientSimulator_MaxAngVelocity(), theEcorePackage.getEDouble(), "maxAngVelocity", "2", 0, 1, PolarSysRoverPlatformClientSimulator.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolarSysRoverPlatformClientSimulator_MinAngVelocity(), theEcorePackage.getEDouble(), "minAngVelocity", "-2", 0, 1, PolarSysRoverPlatformClientSimulator.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolarSysRoverPlatformClientSimulator_MaxLinVelocity(), theEcorePackage.getEDouble(), "maxLinVelocity", "2", 0, 1, PolarSysRoverPlatformClientSimulator.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolarSysRoverPlatformClientSimulator_MinLinVelocity(), theEcorePackage.getEDouble(), "minLinVelocity", "-2", 0, 1, PolarSysRoverPlatformClientSimulator.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolarSysRoverPlatformClientSimulator_DistanceBetweenWheels(), theEcorePackage.getEDouble(), "distanceBetweenWheels", "2", 0, 1, PolarSysRoverPlatformClientSimulator.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
			 "prefix", "PolarSysRoverClientSimulator",
			 "copyrightText", "Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation",
			 "modelName", "PolarSysRoverClient",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "suppressGenModelAnnotations", "false",
			 "dynamicTemplates", "true",
			 "templateDirectory", "platform:/plugin/ca.gc.asc_csa.apogy.common.emf.templates",
			 "modelDirectory", "/org.eclipse.polarsys.rover.client.simulator/src-generated",
			 "editDirectory", "/org.eclipse.polarsys.rover.client.simulator.edit/src-generated",
			 "basePackage", "org.eclipse.polarsys.rover.client"
		   });	
		addAnnotation
		  (polarSysRoverPlatformClientSimulatorEClass, 
		   source, 
		   new String[] {
			 "dynamic", "false"
		   });	
		addAnnotation
		  (getPolarSysRoverPlatformClientSimulator_WheelRadius(), 
		   source, 
		   new String[] {
			 "documentation", "This is the radius (in m) of the mobile platform\'s wheels."
		   });	
		addAnnotation
		  (getPolarSysRoverPlatformClientSimulator_DegreeSYM(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThis is the degree symbol, as expressed in unicode"
		   });	
		addAnnotation
		  (getPolarSysRoverPlatformClientSimulator_WheelTrack(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThis is the length (in m) of the mobile platform\'s track"
		   });	
		addAnnotation
		  (getPolarSysRoverPlatformClientSimulator_MoveWaitPeriod(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThis is the time (in milliseconds) between subsequent movement steps of\nthe mobile platform."
		   });	
		addAnnotation
		  (getPolarSysRoverPlatformClientSimulator_MoveToMinLinSpeed(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThis is the minimum linear velocity (in metres / second) that a moveTo()\noperates at."
		   });	
		addAnnotation
		  (getPolarSysRoverPlatformClientSimulator_ErrorPerMeter(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThis is the amount of error is taking place per metre of distance\ntraveled by the mobile platform."
		   });
	}

} //PolarSysRoverClientSimulatorPackageImpl
