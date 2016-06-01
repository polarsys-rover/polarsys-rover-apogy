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
package org.eclipse.polarsys.rover.client.apogy.impl;

import ca.gc.asc_csa.apogy.core.ApogyCorePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.polarsys.rover.client.apogy.PolarSysRoverPlatformApogySystemApiAdapter;
import org.eclipse.polarsys.rover.client.apogy.PolarSysRoverClientApogyFactory;
import org.eclipse.polarsys.rover.client.apogy.PolarSysRoverClientApogyPackage;
import org.eclipse.polarsys.rover.client.apogy.PolarSysRoverPlatformData;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PolarSysRoverClientApogyPackageImpl extends EPackageImpl implements PolarSysRoverClientApogyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polarSysRoverPlatformApogySystemApiAdapterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polarSysRoverPlatformDataEClass = null;

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
	 * @see org.eclipse.polarsys.rover.client.apogy.PolarSysRoverClientApogyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PolarSysRoverClientApogyPackageImpl() {
		super(eNS_URI, PolarSysRoverClientApogyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PolarSysRoverClientApogyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PolarSysRoverClientApogyPackage init() {
		if (isInited) return (PolarSysRoverClientApogyPackage)EPackage.Registry.INSTANCE.getEPackage(PolarSysRoverClientApogyPackage.eNS_URI);

		// Obtain or create and register package
		PolarSysRoverClientApogyPackageImpl thePolarSysRoverClientApogyPackage = (PolarSysRoverClientApogyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PolarSysRoverClientApogyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PolarSysRoverClientApogyPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyCorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePolarSysRoverClientApogyPackage.createPackageContents();

		// Initialize created meta-data
		thePolarSysRoverClientApogyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePolarSysRoverClientApogyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PolarSysRoverClientApogyPackage.eNS_URI, thePolarSysRoverClientApogyPackage);
		return thePolarSysRoverClientApogyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolarSysRoverPlatformApogySystemApiAdapter() {
		return polarSysRoverPlatformApogySystemApiAdapterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolarSysRoverPlatformData() {
		return polarSysRoverPlatformDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolarSysRoverClientApogyFactory getPolarSysRoverClientApogyFactory() {
		return (PolarSysRoverClientApogyFactory)getEFactoryInstance();
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
		polarSysRoverPlatformApogySystemApiAdapterEClass = createEClass(POLAR_SYS_ROVER_PLATFORM_APOGY_SYSTEM_API_ADAPTER);

		polarSysRoverPlatformDataEClass = createEClass(POLAR_SYS_ROVER_PLATFORM_DATA);
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
		ApogyCorePackage theApogyCorePackage = (ApogyCorePackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		polarSysRoverPlatformApogySystemApiAdapterEClass.getESuperTypes().add(theApogyCorePackage.getApogySystemApiAdapter());
		polarSysRoverPlatformDataEClass.getESuperTypes().add(theApogyCorePackage.getApogyInitializationData());

		// Initialize classes, features, and operations; add parameters
		initEClass(polarSysRoverPlatformApogySystemApiAdapterEClass, PolarSysRoverPlatformApogySystemApiAdapter.class, "PolarSysRoverPlatformApogySystemApiAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(polarSysRoverPlatformDataEClass, PolarSysRoverPlatformData.class, "PolarSysRoverPlatformData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
			 "prefix", "PolarSysRoverClientApogy",
			 "copyrightText", "Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation",
			 "modelName", "PolarSysRoverClientApogy",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "suppressGenModelAnnotations", "false",
			 "dynamicTemplates", "true",
			 "templateDirectory", "platform:/plugin/ca.gc.asc_csa.apogy.common.emf.templates",
			 "modelDirectory", "/org.eclipse.polarsys.rover.client.apogy/src-generated",
			 "editDirectory", "/org.eclipse.polarsys.rover.client.apogy.edit/src-generated",
			 "basePackage", "org.eclipse.polarsys.rover.client"
		   });	
		addAnnotation
		  (polarSysRoverPlatformApogySystemApiAdapterEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class is the specialized Apogy API adapter, used for connecting\nthe existing PolarSys Rover Client example, located at\n{@link org.eclipse.polarsys.rover.client.PolarSysRover},\nto Apogy; one can override the well-known callback functions to make\nApogy perform a variety of useful functions, including initialization,\ndisposal and other features."
		   });	
		addAnnotation
		  (polarSysRoverPlatformDataEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class specifies the initialization data that Apogy\nshould be interested in when (re)initializing the Mobile\nplatform with the API Adapter."
		   });
	}

} //PolarSysRoverClientApogyPackageImpl
