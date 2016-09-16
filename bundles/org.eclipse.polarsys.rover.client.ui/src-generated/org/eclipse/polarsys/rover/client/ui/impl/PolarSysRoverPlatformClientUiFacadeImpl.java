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

import java.lang.reflect.InvocationTargetException;


import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient;
import org.eclipse.polarsys.rover.client.ui.PolarSysRoverClientUIPackage;
import org.eclipse.polarsys.rover.client.ui.PolarSysRoverPlatformClientUiFacade;

import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.Environment;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Polar Sys Rover Platform Client Ui Facade</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.polarsys.rover.client.ui.impl.PolarSysRoverPlatformClientUiFacadeImpl#getActivePolarSysRoverPlatformClient <em>Active Polar Sys Rover Platform Client</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PolarSysRoverPlatformClientUiFacadeImpl extends MinimalEObjectImpl.Container implements PolarSysRoverPlatformClientUiFacade {
	
	private static PolarSysRoverPlatformClientUiFacade instance;

	public static PolarSysRoverPlatformClientUiFacade getFacade() {
		if (instance == null) {
			instance = new PolarSysRoverPlatformClientUiFacadeImpl();
		}
		return instance;
	}
	
	/**
	 * The cached value of the '{@link #getActivePolarSysRoverPlatformClient() <em>Active Polar Sys Rover Platform Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePolarSysRoverPlatformClient()
	 * @generated
	 * @ordered
	 */
	protected PolarSysRoverPlatformClient activePolarSysRoverPlatformClient;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolarSysRoverPlatformClientUiFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolarSysRoverClientUIPackage.Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT_UI_FACADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolarSysRoverPlatformClient getActivePolarSysRoverPlatformClient() {
		if (activePolarSysRoverPlatformClient != null && activePolarSysRoverPlatformClient.eIsProxy()) {
			InternalEObject oldActivePolarSysRoverPlatformClient = (InternalEObject)activePolarSysRoverPlatformClient;
			activePolarSysRoverPlatformClient = (PolarSysRoverPlatformClient)eResolveProxy(oldActivePolarSysRoverPlatformClient);
			if (activePolarSysRoverPlatformClient != oldActivePolarSysRoverPlatformClient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PolarSysRoverClientUIPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_UI_FACADE__ACTIVE_POLAR_SYS_ROVER_PLATFORM_CLIENT, oldActivePolarSysRoverPlatformClient, activePolarSysRoverPlatformClient));
			}
		}
		return activePolarSysRoverPlatformClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolarSysRoverPlatformClient basicGetActivePolarSysRoverPlatformClient() {
		return activePolarSysRoverPlatformClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivePolarSysRoverPlatformClient(PolarSysRoverPlatformClient newActivePolarSysRoverPlatformClient) {
		PolarSysRoverPlatformClient oldActivePolarSysRoverPlatformClient = activePolarSysRoverPlatformClient;
		activePolarSysRoverPlatformClient = newActivePolarSysRoverPlatformClient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolarSysRoverClientUIPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_UI_FACADE__ACTIVE_POLAR_SYS_ROVER_PLATFORM_CLIENT, oldActivePolarSysRoverPlatformClient, activePolarSysRoverPlatformClient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void start() {
		InvocatorSession session = ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession();
		if (session != null){
			Environment environment = ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession().getEnvironment();
			ApogyCoreInvocatorFacade.INSTANCE.initVariableInstances(environment);
			
			PolarSysRoverPlatformClient polarSysRoverPlatformClient = (PolarSysRoverPlatformClient) ApogyCoreInvocatorFacade.INSTANCE.getInstance(environment.getVariablesList().getVariables().get(0));
			// FIXME: init() ??			
			polarSysRoverPlatformClient.init();			
			setActivePolarSysRoverPlatformClient(polarSysRoverPlatformClient);
			System.out.println("PolarSysSessionUiFacadeImpl.start(): " + polarSysRoverPlatformClient.hashCode());
		}else{
			String message = "Error while starting the platform"; // FIXME: init()
			Logger.INSTANCE.log("org.eclipse.polarsys.rover.client.ui", this, message, EventSeverity.ERROR);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void stop() {
		InvocatorSession session = ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession();
		if (session != null){
			Environment environment = ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession().getEnvironment();
			
			PolarSysRoverPlatformClient polarSysRoverPlatformClient = (PolarSysRoverPlatformClient) ApogyCoreInvocatorFacade.INSTANCE.getInstance(environment.getVariablesList().getVariables().get(0));
			if (polarSysRoverPlatformClient != null){
			// FIXME: dispose()??
				polarSysRoverPlatformClient.dispose();					
			}
		
			setActivePolarSysRoverPlatformClient(null);
		}else{
			String message = "Error while stopping the platform"; // FIXME: dispose()
			Logger.INSTANCE.log("org.eclipse.polarsys.rover.client.ui", this, message, EventSeverity.ERROR);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PolarSysRoverClientUIPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_UI_FACADE__ACTIVE_POLAR_SYS_ROVER_PLATFORM_CLIENT:
				if (resolve) return getActivePolarSysRoverPlatformClient();
				return basicGetActivePolarSysRoverPlatformClient();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PolarSysRoverClientUIPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_UI_FACADE__ACTIVE_POLAR_SYS_ROVER_PLATFORM_CLIENT:
				setActivePolarSysRoverPlatformClient((PolarSysRoverPlatformClient)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PolarSysRoverClientUIPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_UI_FACADE__ACTIVE_POLAR_SYS_ROVER_PLATFORM_CLIENT:
				setActivePolarSysRoverPlatformClient((PolarSysRoverPlatformClient)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PolarSysRoverClientUIPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_UI_FACADE__ACTIVE_POLAR_SYS_ROVER_PLATFORM_CLIENT:
				return activePolarSysRoverPlatformClient != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PolarSysRoverClientUIPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_UI_FACADE___START:
				start();
				return null;
			case PolarSysRoverClientUIPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT_UI_FACADE___STOP:
				stop();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //PolarSysRoverPlatformClientUiFacadeImpl
