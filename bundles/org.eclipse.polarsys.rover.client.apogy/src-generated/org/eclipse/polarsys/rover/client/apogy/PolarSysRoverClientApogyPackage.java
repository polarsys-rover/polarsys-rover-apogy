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
package org.eclipse.polarsys.rover.client.apogy;

import ca.gc.asc_csa.apogy.core.ApogyCorePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
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
 * <!-- end-model-doc -->
 * @see org.eclipse.polarsys.rover.client.apogy.PolarSysRoverClientApogyFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='PolarSysRoverClientApogy' copyrightText='Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation' modelName='PolarSysRoverClientApogy' childCreationExtenders='true' extensibleProviderFactory='true' suppressGenModelAnnotations='false' dynamicTemplates='true' templateDirectory='platform:/plugin/ca.gc.asc_csa.apogy.common.emf.templates' modelDirectory='/org.eclipse.polarsys.rover.client.apogy/src-generated' editDirectory='/org.eclipse.polarsys.rover.client.apogy.edit/src-generated' basePackage='org.eclipse.polarsys.rover.client'"
 * @generated
 */
public interface PolarSysRoverClientApogyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "apogy";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.eclipse.polarsys.rover.client.apogy";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "apogy";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PolarSysRoverClientApogyPackage eINSTANCE = org.eclipse.polarsys.rover.client.apogy.impl.PolarSysRoverClientApogyPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.polarsys.rover.client.apogy.impl.PolarSysRoverPlatformApogySystemApiAdapterImpl <em>Polar Sys Rover Platform Apogy System Api Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.polarsys.rover.client.apogy.impl.PolarSysRoverPlatformApogySystemApiAdapterImpl
	 * @see org.eclipse.polarsys.rover.client.apogy.impl.PolarSysRoverClientApogyPackageImpl#getPolarSysRoverPlatformApogySystemApiAdapter()
	 * @generated
	 */
	int POLAR_SYS_ROVER_PLATFORM_APOGY_SYSTEM_API_ADAPTER = 0;

	/**
	 * The feature id for the '<em><b>Pose Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_APOGY_SYSTEM_API_ADAPTER__POSE_TRANSFORM = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__POSE_TRANSFORM;

	/**
	 * The feature id for the '<em><b>Pose Corrector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_APOGY_SYSTEM_API_ADAPTER__POSE_CORRECTOR = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__POSE_CORRECTOR;

	/**
	 * The feature id for the '<em><b>Apogy System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_APOGY_SYSTEM_API_ADAPTER__APOGY_SYSTEM = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__APOGY_SYSTEM;

	/**
	 * The number of structural features of the '<em>Polar Sys Rover Platform Apogy System Api Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_APOGY_SYSTEM_API_ADAPTER_FEATURE_COUNT = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER_FEATURE_COUNT + -3;

	/**
	 * The operation id for the '<em>Create Result Matrix</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_APOGY_SYSTEM_API_ADAPTER___CREATE_RESULT_MATRIX__OBJECT = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER___CREATE_RESULT_MATRIX__OBJECT;

	/**
	 * The number of operations of the '<em>Polar Sys Rover Platform Apogy System Api Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_APOGY_SYSTEM_API_ADAPTER_OPERATION_COUNT = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER_OPERATION_COUNT + -8;

	/**
	 * The meta object id for the '{@link org.eclipse.polarsys.rover.client.apogy.impl.PolarSysRoverPlatformDataImpl <em>Polar Sys Rover Platform Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.polarsys.rover.client.apogy.impl.PolarSysRoverPlatformDataImpl
	 * @see org.eclipse.polarsys.rover.client.apogy.impl.PolarSysRoverClientApogyPackageImpl#getPolarSysRoverPlatformData()
	 * @generated
	 */
	int POLAR_SYS_ROVER_PLATFORM_DATA = 1;

	/**
	 * The feature id for the '<em><b>Initial Pose Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_DATA__INITIAL_POSE_TRANSFORM = ApogyCorePackage.APOGY_INITIALIZATION_DATA__INITIAL_POSE_TRANSFORM;

	/**
	 * The number of structural features of the '<em>Polar Sys Rover Platform Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_DATA_FEATURE_COUNT = ApogyCorePackage.APOGY_INITIALIZATION_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Polar Sys Rover Platform Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_SYS_ROVER_PLATFORM_DATA_OPERATION_COUNT = ApogyCorePackage.APOGY_INITIALIZATION_DATA_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.polarsys.rover.client.apogy.PolarSysRoverPlatformApogySystemApiAdapter <em>Polar Sys Rover Platform Apogy System Api Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polar Sys Rover Platform Apogy System Api Adapter</em>'.
	 * @see org.eclipse.polarsys.rover.client.apogy.PolarSysRoverPlatformApogySystemApiAdapter
	 * @generated
	 */
	EClass getPolarSysRoverPlatformApogySystemApiAdapter();

	/**
	 * Returns the meta object for class '{@link org.eclipse.polarsys.rover.client.apogy.PolarSysRoverPlatformData <em>Polar Sys Rover Platform Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polar Sys Rover Platform Data</em>'.
	 * @see org.eclipse.polarsys.rover.client.apogy.PolarSysRoverPlatformData
	 * @generated
	 */
	EClass getPolarSysRoverPlatformData();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PolarSysRoverClientApogyFactory getPolarSysRoverClientApogyFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.polarsys.rover.client.apogy.impl.PolarSysRoverPlatformApogySystemApiAdapterImpl <em>Polar Sys Rover Platform Apogy System Api Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.polarsys.rover.client.apogy.impl.PolarSysRoverPlatformApogySystemApiAdapterImpl
		 * @see org.eclipse.polarsys.rover.client.apogy.impl.PolarSysRoverClientApogyPackageImpl#getPolarSysRoverPlatformApogySystemApiAdapter()
		 * @generated
		 */
		EClass POLAR_SYS_ROVER_PLATFORM_APOGY_SYSTEM_API_ADAPTER = eINSTANCE.getPolarSysRoverPlatformApogySystemApiAdapter();

		/**
		 * The meta object literal for the '{@link org.eclipse.polarsys.rover.client.apogy.impl.PolarSysRoverPlatformDataImpl <em>Polar Sys Rover Platform Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.polarsys.rover.client.apogy.impl.PolarSysRoverPlatformDataImpl
		 * @see org.eclipse.polarsys.rover.client.apogy.impl.PolarSysRoverClientApogyPackageImpl#getPolarSysRoverPlatformData()
		 * @generated
		 */
		EClass POLAR_SYS_ROVER_PLATFORM_DATA = eINSTANCE.getPolarSysRoverPlatformData();

	}

} //PolarSysRoverClientApogyPackage
