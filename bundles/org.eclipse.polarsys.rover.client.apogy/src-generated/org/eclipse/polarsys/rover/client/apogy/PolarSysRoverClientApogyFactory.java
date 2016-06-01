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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.polarsys.rover.client.apogy.PolarSysRoverClientApogyPackage
 * @generated
 */
public interface PolarSysRoverClientApogyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PolarSysRoverClientApogyFactory eINSTANCE = org.eclipse.polarsys.rover.client.apogy.impl.PolarSysRoverClientApogyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Polar Sys Rover Platform Apogy System Api Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Polar Sys Rover Platform Apogy System Api Adapter</em>'.
	 * @generated
	 */
	PolarSysRoverPlatformApogySystemApiAdapter createPolarSysRoverPlatformApogySystemApiAdapter();

	/**
	 * Returns a new object of class '<em>Polar Sys Rover Platform Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Polar Sys Rover Platform Data</em>'.
	 * @generated
	 */
	PolarSysRoverPlatformData createPolarSysRoverPlatformData();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PolarSysRoverClientApogyPackage getPolarSysRoverClientApogyPackage();

} //PolarSysRoverClientApogyFactory
