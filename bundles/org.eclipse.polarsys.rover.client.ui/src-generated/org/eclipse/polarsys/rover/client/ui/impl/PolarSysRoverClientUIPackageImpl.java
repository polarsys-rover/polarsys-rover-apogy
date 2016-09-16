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
 * 	Olivier L. Larouche (Olivier.llarouche@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */
package org.eclipse.polarsys.rover.client.ui.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.polarsys.rover.client.PolarSysRoverClientPackage;

import org.eclipse.polarsys.rover.client.ui.PolarSysRoverClientUIFactory;
import org.eclipse.polarsys.rover.client.ui.PolarSysRoverClientUIPackage;
import org.eclipse.polarsys.rover.client.ui.PolarSysRoverPlatformClientUiFacade;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PolarSysRoverClientUIPackageImpl extends EPackageImpl implements PolarSysRoverClientUIPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polarSysRoverPlatformClientUiFacadeEClass = null;

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
	 * @see org.eclipse.polarsys.rover.client.ui.PolarSysRoverClientUIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PolarSysRoverClientUIPackageImpl() {
		super(eNS_URI, PolarSysRoverClientUIFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PolarSysRoverClientUIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PolarSysRoverClientUIPackage init() {
		if (isInited) return (PolarSysRoverClientUIPackage)EPackage.Registry.INSTANCE.getEPackage(PolarSysRoverClientUIPackage.eNS_URI);

		// Obtain or create and register package
		PolarSysRoverClientUIPackageImpl thePolarSysRoverClientUIPackage = (PolarSysRoverClientUIPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PolarSysRoverClientUIPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PolarSysRoverClientUIPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PolarSysRoverClientPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePolarSysRoverClientUIPackage.createPackageContents();

		// Initialize created meta-data
		thePolarSysRoverClientUIPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePolarSysRoverClientUIPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PolarSysRoverClientUIPackage.eNS_URI, thePolarSysRoverClientUIPackage);
		return thePolarSysRoverClientUIPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolarSysRoverPlatformClientUiFacade() {
		return polarSysRoverPlatformClientUiFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolarSysRoverPlatformClientUiFacade_ActivePolarSysRoverPlatformClient() {
		return (EReference)polarSysRoverPlatformClientUiFacadeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPolarSysRoverPlatformClientUiFacade__Start() {
		return polarSysRoverPlatformClientUiFacadeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPolarSysRoverPlatformClientUiFacade__Stop() {
		return polarSysRoverPlatformClientUiFacadeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolarSysRoverClientUIFactory getPolarSysRoverClientUIFactory() {
		return (PolarSysRoverClientUIFactory)getEFactoryInstance();
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
		polarSysRoverPlatformClientUiFacadeEClass = createEClass(POLAR_SYS_ROVER_PLATFORM_CLIENT_UI_FACADE);
		createEReference(polarSysRoverPlatformClientUiFacadeEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT_UI_FACADE__ACTIVE_POLAR_SYS_ROVER_PLATFORM_CLIENT);
		createEOperation(polarSysRoverPlatformClientUiFacadeEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT_UI_FACADE___START);
		createEOperation(polarSysRoverPlatformClientUiFacadeEClass, POLAR_SYS_ROVER_PLATFORM_CLIENT_UI_FACADE___STOP);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(polarSysRoverPlatformClientUiFacadeEClass, PolarSysRoverPlatformClientUiFacade.class, "PolarSysRoverPlatformClientUiFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPolarSysRoverPlatformClientUiFacade_ActivePolarSysRoverPlatformClient(), thePolarSysRoverClientPackage.getPolarSysRoverPlatformClient(), null, "activePolarSysRoverPlatformClient", null, 0, 1, PolarSysRoverPlatformClientUiFacade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPolarSysRoverPlatformClientUiFacade__Start(), null, "start", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getPolarSysRoverPlatformClientUiFacade__Stop(), null, "stop", 0, 1, !IS_UNIQUE, IS_ORDERED);

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
			 "documentation", "Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca),\n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Olivier L. Larouche (Olivier.llarouche@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation",
			 "prefix", "PolarSysRoverClientUI",
			 "copyrightText", "Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n    Pierre Allard (Pierre.Allard@canada.ca), \r\n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\r\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\r\n\tOlivier L. Larouche (Olivier.llarouche@canada.ca),\r\n    Canadian Space Agency (CSA) - Initial API and implementation",
			 "modelName", "PolarSysRoverClientUi",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "suppressGenModelAnnotations", "false",
			 "dynamicTemplates", "true",
			 "templateDirectory", "platform:/plugin/ca.gc.asc_csa.apogy.common.emf.templates",
			 "modelDirectory", "/org.eclipse.polarsys.rover.client.ui/src-generated",
			 "editDirectory", "/org.eclipse.polarsys.rover.client.ui.edit/src-generated",
			 "basePackage", "org.eclipse.polarsys.rover.client"
		   });
	}

} //PolarSysRoverClientUIPackageImpl
