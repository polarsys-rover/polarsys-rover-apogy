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
 *   <li>{@link org.eclipse.polarsys.rover.client.simulator.PolarSysRoverPlatformClientSimulator#getDegreeSYM <em>Degree SYM</em>}</li>
 * </ul>
 *
 * @see org.eclipse.polarsys.rover.client.simulator.PolarSysRoverClientSimulatorPackage#getPolarSysRoverPlatformClientSimulator()
 * @model annotation="http://www.eclipse.org/emf/2002/GenModel dynamic='false'"
 * @generated
 */
public interface PolarSysRoverPlatformClientSimulator extends PolarSysRoverPlatformClient {

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
} // PolarSysRoverClientSimulator
