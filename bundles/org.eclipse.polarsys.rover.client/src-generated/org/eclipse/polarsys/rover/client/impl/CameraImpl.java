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

import ca.gc.asc_csa.apogy.addons.sensors.imaging.impl.AbstractCameraImpl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.polarsys.rover.client.Camera;
import org.eclipse.polarsys.rover.client.PolarSysRoverClientPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camera</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CameraImpl extends AbstractCameraImpl implements Camera {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CameraImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolarSysRoverClientPackage.Literals.CAMERA;
	}

} //CameraImpl
