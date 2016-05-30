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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.polarsys.rover.client.simulator.PolarSysRoverClientSimulatorPackage
 * @generated
 */
public interface PolarSysRoverClientSimulatorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PolarSysRoverClientSimulatorFactory eINSTANCE = org.eclipse.polarsys.rover.client.simulator.impl.PolarSysRoverClientSimulatorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Polar Sys Rover Client Simulator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Polar Sys Rover Client Simulator</em>'.
	 * @generated
	 */
	PolarSysRoverClientSimulator createPolarSysRoverClientSimulator();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PolarSysRoverClientSimulatorPackage getPolarSysRoverClientSimulatorPackage();

} //PolarSysRoverClientSimulatorFactory
