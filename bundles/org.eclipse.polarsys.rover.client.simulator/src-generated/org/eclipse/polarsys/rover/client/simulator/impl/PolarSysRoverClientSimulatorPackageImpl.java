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
		  (getPolarSysRoverPlatformClientSimulator_WheelRadius(), 
		   source, 
		   new String[] {
			 "documentation", "This is the radius (in m) of the mobile platform\'s wheels."
		   });
	}

} //PolarSysRoverClientSimulatorPackageImpl
