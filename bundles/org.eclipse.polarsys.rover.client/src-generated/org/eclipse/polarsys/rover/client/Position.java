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
package org.eclipse.polarsys.rover.client;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is used to represent a position of a particular object
 * in space.  In particular, this provides both a Cartesian coordinate
 * location as well as an angle corresponding to the object's pose.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.polarsys.rover.client.Position#getX <em>X</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.Position#getY <em>Y</em>}</li>
 *   <li>{@link org.eclipse.polarsys.rover.client.Position#getTheta <em>Theta</em>}</li>
 * </ul>
 *
 * @see org.eclipse.polarsys.rover.client.PolarSysRoverClientPackage#getPosition()
 * @model
 * @generated
 */
public interface Position extends EObject {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the position's X coordinate (given in metres)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(double)
	 * @see org.eclipse.polarsys.rover.client.PolarSysRoverClientPackage#getPosition_X()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' apogy_units='m'"
	 * @generated
	 */
	double getX();

	/**
	 * Sets the value of the '{@link org.eclipse.polarsys.rover.client.Position#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(double value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the position's Y coordinate (given in metres)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(double)
	 * @see org.eclipse.polarsys.rover.client.PolarSysRoverClientPackage#getPosition_Y()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' apogy_units='m'"
	 * @generated
	 */
	double getY();

	/**
	 * Sets the value of the '{@link org.eclipse.polarsys.rover.client.Position#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(double value);

	/**
	 * Returns the value of the '<em><b>Theta</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the pose angle (in radians) of an object, which
	 * specifies a rotation around the Z axis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Theta</em>' attribute.
	 * @see #setTheta(double)
	 * @see org.eclipse.polarsys.rover.client.PolarSysRoverClientPackage#getPosition_Theta()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' apogy_units='rad'"
	 * @generated
	 */
	double getTheta();

	/**
	 * Sets the value of the '{@link org.eclipse.polarsys.rover.client.Position#getTheta <em>Theta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Theta</em>' attribute.
	 * @see #getTheta()
	 * @generated
	 */
	void setTheta(double value);

} // Position
