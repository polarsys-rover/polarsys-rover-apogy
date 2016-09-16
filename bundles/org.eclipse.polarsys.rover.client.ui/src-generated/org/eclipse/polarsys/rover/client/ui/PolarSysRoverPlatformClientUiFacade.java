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
package org.eclipse.polarsys.rover.client.ui;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient;
import org.eclipse.polarsys.rover.client.ui.impl.PolarSysRoverPlatformClientUiFacadeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polar Sys Rover Platform Client Ui Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.polarsys.rover.client.ui.PolarSysRoverPlatformClientUiFacade#getActivePolarSysRoverPlatformClient <em>Active Polar Sys Rover Platform Client</em>}</li>
 * </ul>
 *
 * @see org.eclipse.polarsys.rover.client.ui.PolarSysRoverClientUIPackage#getPolarSysRoverPlatformClientUiFacade()
 * @model
 * @generated
 */
public interface PolarSysRoverPlatformClientUiFacade extends EObject {
	
	public PolarSysRoverPlatformClientUiFacade INSTANCE = PolarSysRoverPlatformClientUiFacadeImpl.getFacade(); 
	/**
	 * Returns the value of the '<em><b>Active Polar Sys Rover Platform Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active Polar Sys Rover Platform Client</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Polar Sys Rover Platform Client</em>' reference.
	 * @see #setActivePolarSysRoverPlatformClient(PolarSysRoverPlatformClient)
	 * @see org.eclipse.polarsys.rover.client.ui.PolarSysRoverClientUIPackage#getPolarSysRoverPlatformClientUiFacade_ActivePolarSysRoverPlatformClient()
	 * @model
	 * @generated
	 */
	PolarSysRoverPlatformClient getActivePolarSysRoverPlatformClient();

	/**
	 * Sets the value of the '{@link org.eclipse.polarsys.rover.client.ui.PolarSysRoverPlatformClientUiFacade#getActivePolarSysRoverPlatformClient <em>Active Polar Sys Rover Platform Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Polar Sys Rover Platform Client</em>' reference.
	 * @see #getActivePolarSysRoverPlatformClient()
	 * @generated
	 */
	void setActivePolarSysRoverPlatformClient(PolarSysRoverPlatformClient value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void start();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void stop();

} // PolarSysRoverPlatformClientUiFacade
