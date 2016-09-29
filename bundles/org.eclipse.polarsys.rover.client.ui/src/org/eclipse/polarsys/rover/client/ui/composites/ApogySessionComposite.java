package org.eclipse.polarsys.rover.client.ui.composites;
/**
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
 *     Olivier L. Larouche (Olivier.llarouche@canada.ca,
 *     Canadian Space Agency (CSA) - Initial API and implementation
 **/

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateListStrategy;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.wb.swt.SWTResourceManager;

import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.Context;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;

public class ApogySessionComposite extends Composite {

	private static final String NO_ACTIVE_SESSION_STR = "No Active Session";
	private static final String SESSION_ACTIVE_STR = "Session Active";
	/* FIXME: ISSUE156: Strings for variable instance status indicator
	private static final String INITIALIZED_STR = "Variables initialized";
	private static final String DISPOSED_STR = "Variables disposed";
	private static final String NULL_STR = "-";*/

	private DataBindingContext m_bindingContext;
	private WritableValue invocatorFacadeBinder;
	private final FormToolkit formToolKit = new FormToolkit(Display.getDefault());
	
	private Text txtStatusConnexion;
	private Combo comboContext;
	private Button btnResetInstances;
	private Button btnClearInstance;
	private Group grpInstance;
	private Text txtInstanceStatus;

	/**
	 * Create the composite.
	 * 
	 * @param parent
	 * @param style
	 */
	public ApogySessionComposite(Composite parent, int style) {
		super(parent, style);

		this.addDisposeListener(new DisposeListener()

		{
			@Override
			public void widgetDisposed(DisposeEvent e) {
				m_bindingContext.dispose();
			}

		});
		setLayout(new GridLayout(1, false));

		Section sctnSessionStatus = formToolKit.createSection(this, Section.TITLE_BAR);
		GridData gd_sctnSessionStatus = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
		gd_sctnSessionStatus.minimumWidth = 220;
		sctnSessionStatus.setLayoutData(gd_sctnSessionStatus);
		formToolKit.paintBordersFor(sctnSessionStatus);
		sctnSessionStatus.setText("Status");

		Composite compositeSession = new Composite(sctnSessionStatus, SWT.BORDER);
		sctnSessionStatus.setClient(compositeSession);
		formToolKit.adapt(compositeSession);
		formToolKit.paintBordersFor(compositeSession);
		compositeSession.setLayout(new GridLayout(2, false));

		txtStatusConnexion = new Text(compositeSession, SWT.BORDER | SWT.CENTER);
		txtStatusConnexion.setText(NO_ACTIVE_SESSION_STR);
		txtStatusConnexion.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		txtStatusConnexion.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		formToolKit.adapt(txtStatusConnexion, true, true);
		txtStatusConnexion.setEditable(false);

		grpInstance = new Group(compositeSession, SWT.NONE);
		grpInstance.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));
		grpInstance.setLayout(new GridLayout(3, false));
		grpInstance.setText("Instance");
		formToolKit.adapt(grpInstance);
		formToolKit.paintBordersFor(grpInstance);

		txtInstanceStatus = formToolKit.createText(grpInstance, "New Text", SWT.CENTER);
		txtInstanceStatus.setText("Status");
		txtInstanceStatus.setEditable(false);
		txtInstanceStatus.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 3, 1));
		// Create the listener that modify the background color
		// when the status is changed
		txtInstanceStatus.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				// FIXME: ISSUE156: Add color change
				/*if(txtInstanceStatus.getText().equals(INITIALIZED_STR)){
					txtInstanceStatus.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
				}else{
					txtInstanceStatus.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
				}*/
			}
		});

		btnResetInstances = new Button(grpInstance, SWT.NONE);
		btnResetInstances.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		formToolKit.adapt(btnResetInstances, true, true);
		btnResetInstances.setText("Reset Instances");

		btnClearInstance = new Button(grpInstance, SWT.NONE);
		btnClearInstance.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));
		formToolKit.adapt(btnClearInstance, true, true);
		btnClearInstance.setText("Clear Instances");
		// Create the listener that disposes the variables of the environment
		// when the button is selected. This is to clear the instances
		btnClearInstance.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {				
				if (ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession() != null) {
					if (!ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession().getEnvironment().getVariablesList().getVariables().isEmpty()){
						ApogyCoreInvocatorFacade.INSTANCE.disposeVariableInstances(ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession().getEnvironment());
					}
				}
			}
		});
		
		// Create the listener that initiates the variables of the environment
		// when the button is selected. This is to reset the instances.
		btnResetInstances.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession() != null) {
					if (!ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession().getEnvironment().getVariablesList().getVariables().isEmpty()){
						ApogyCoreInvocatorFacade.INSTANCE.disposeVariableInstances(ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession().getEnvironment());
					}
					ApogyCoreInvocatorFacade.INSTANCE.initVariableInstances(ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession().getEnvironment());
				}
			}
		});

		Label lblContext = new Label(compositeSession, SWT.NONE);
		lblContext.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		formToolKit.adapt(lblContext, true, true);
		lblContext.setText("Context");

		comboContext = new Combo(compositeSession, SWT.NONE);
		comboContext.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		formToolKit.adapt(comboContext);
		formToolKit.paintBordersFor(comboContext);
		comboContext.setText("Context");

		m_bindingContext = customInitDataBindings();
	}
	
	/**
	 * Disposes the actual composite.
	 */
	@Override
	public void dispose() {
		m_bindingContext.dispose();
		super.dispose();
	}

	/**
	 * Creates and returns the data bindings associated with the active session.
	 * 
	 * @return Reference to the bindings.
	 */
	protected DataBindingContext customInitDataBindings() {

		m_bindingContext = new DataBindingContext();

		invocatorFacadeBinder = new WritableValue();
		// Get the Invocator facade for the binder
		invocatorFacadeBinder.setValue(ApogyCoreInvocatorFacade.INSTANCE);		
		

		/** Data binding to know if there is an active session */
		IObservableValue observeTextStatusConnexionObserveWidget = WidgetProperties.text().observe(txtStatusConnexion);
		IObservableValue obeserveBackGroundColorStatusConnexionObserveWidget = WidgetProperties.background().observe(txtStatusConnexion);	
		IObservableValue invocatorFacadeActiveInvocatorSessionObserveValue = EMFProperties
				.value(ApogyCoreInvocatorPackage.Literals.APOGY_CORE_INVOCATOR_FACADE__ACTIVE_INVOCATOR_SESSION)
				.observeDetail(invocatorFacadeBinder);
		
		m_bindingContext.bindValue(observeTextStatusConnexionObserveWidget,
				invocatorFacadeActiveInvocatorSessionObserveValue, null,
				new UpdateValueStrategy().setConverter(new Converter(InvocatorSession.class, String.class) {
					@Override
					public Object convert(Object fromObject) {
						return fromObject == null ? NO_ACTIVE_SESSION_STR : SESSION_ACTIVE_STR;

					}
				}));

		m_bindingContext.bindValue(obeserveBackGroundColorStatusConnexionObserveWidget,
				invocatorFacadeActiveInvocatorSessionObserveValue, null,
				new UpdateValueStrategy().setConverter(new Converter(InvocatorSession.class, Color.class) {

					@Override
					public Object convert(Object fromObject) {
						return fromObject == null ? SWTResourceManager.getColor(SWT.COLOR_RED) : SWTResourceManager.getColor(SWT.COLOR_GREEN);
					}
				}));
		
		/** Data binding for the different elements of the UI to be enabled/disabled if there is an active session or not */
		IObservableValue observeEnabledResetInstancesObserveWidget = WidgetProperties.enabled().observe(btnResetInstances);
		m_bindingContext.bindValue(observeEnabledResetInstancesObserveWidget, invocatorFacadeActiveInvocatorSessionObserveValue, null, new InvocatorInstanceToBooleanUpdateValueStrategy());
		IObservableValue observeEnabledClearInstancesObserveWidget = WidgetProperties.enabled().observe(btnClearInstance);
		m_bindingContext.bindValue(observeEnabledClearInstancesObserveWidget, invocatorFacadeActiveInvocatorSessionObserveValue, null, new InvocatorInstanceToBooleanUpdateValueStrategy());
		IObservableValue observeEnabledComboContextObserveWidget = WidgetProperties.enabled().observe(comboContext);
		m_bindingContext.bindValue(observeEnabledComboContextObserveWidget, invocatorFacadeActiveInvocatorSessionObserveValue, null, new InvocatorInstanceToBooleanUpdateValueStrategy());
		IObservableValue observeEnabledTxtInstanceStatusObserveWidget = WidgetProperties.enabled().observe(txtInstanceStatus);
		m_bindingContext.bindValue(observeEnabledTxtInstanceStatusObserveWidget, invocatorFacadeActiveInvocatorSessionObserveValue, null, new InvocatorInstanceToBooleanUpdateValueStrategy());
		
		
		/** Data binding to get the name of the contexts or the combo box */
		IObservableList observeComboContextItemsObserveWidget = WidgetProperties.items().observe(comboContext);
		IObservableList invocatorFacadeEnvironmentContextsListContextsObserveValue = EMFProperties
				.list(FeaturePath.fromList(
						(EStructuralFeature) ApogyCoreInvocatorPackage.Literals.APOGY_CORE_INVOCATOR_FACADE__ACTIVE_INVOCATOR_SESSION,
						(EStructuralFeature) ApogyCoreInvocatorPackage.Literals.INVOCATOR_SESSION__ENVIRONMENT,
						(EStructuralFeature) ApogyCoreInvocatorPackage.Literals.ENVIRONMENT__CONTEXTS_LIST,
						(EStructuralFeature) ApogyCoreInvocatorPackage.Literals.CONTEXTS_LIST__CONTEXTS))
				.observeDetail(invocatorFacadeBinder);
		m_bindingContext.bindList(observeComboContextItemsObserveWidget,
				invocatorFacadeEnvironmentContextsListContextsObserveValue, null,
				new UpdateListStrategy().setConverter(new Converter(Context.class, String.class) {
					@Override
					public Object convert(Object arg0) {
						return ((Context) arg0).getName() == null ? "null" : ((Context) arg0).getName();
					}
				}));

		/**
		 * Data binding to set the text value of the combo box to the active
		 * context
		 */
		IObservableValue observeComboContextSingleSelectionIndexObserveWidget = WidgetProperties.singleSelectionIndex()
				.observe(comboContext);
		IObservableValue invocatorFacadeEnvironmentActiveContextObserveValue = EMFProperties
				.value(FeaturePath.fromList(
						(EStructuralFeature) ApogyCoreInvocatorPackage.Literals.APOGY_CORE_INVOCATOR_FACADE__ACTIVE_INVOCATOR_SESSION,
						(EStructuralFeature) ApogyCoreInvocatorPackage.Literals.INVOCATOR_SESSION__ENVIRONMENT,
						(EStructuralFeature) ApogyCoreInvocatorPackage.Literals.ENVIRONMENT__ACTIVE_CONTEXT))
				.observeDetail(invocatorFacadeBinder);
		
		m_bindingContext.bindValue(observeComboContextSingleSelectionIndexObserveWidget,
				invocatorFacadeEnvironmentActiveContextObserveValue, new UpdateValueStrategy().setConverter(new Converter(Integer.class, Context.class){

					@Override
					public Object convert(Object fromObject) {
						if (!ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession().getEnvironment()
								.getContextsList().getContexts().get((Integer) fromObject).equals(null)) {

							return ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession().getEnvironment()
									.getContextsList().getContexts().get((Integer) fromObject);
						} else {
							return null;
						}
					}
					
				}),
				new UpdateValueStrategy().setConverter(new Converter(Context.class, Integer.class) {
					@Override
					public Object convert(Object arg0) {
						for (int i = 0; i < comboContext.getItemCount(); i++) {
							if (((Context) arg0).getName().equals(comboContext.getItem(i))) {
								return i;
							}
						}
						return -1;
					}
				}));
		
		/*FIXME: ISSUE156: Databinding for the variable instances status	
		IObservableValue observeTextInstanceStatusObserveWidget = WidgetProperties.text().observe(txtInstanceStatus);
		IObservableValue invocatorFacadeActiveContextCreationDateValue = EMFProperties
				.value(FeaturePath.fromList(
						(EStructuralFeature) ApogyCoreInvocatorPackage.Literals.APOGY_CORE_INVOCATOR_FACADE__ACTIVE_INVOCATOR_SESSION,
						(EStructuralFeature) ApogyCoreInvocatorPackage.Literals.INVOCATOR_SESSION__ENVIRONMENT,
						(EStructuralFeature) ApogyCoreInvocatorPackage.Literals.ENVIRONMENT__ACTIVE_CONTEXT,
						(EStructuralFeature) ApogyCoreInvocatorPackage.Literals. FIXME:  ISSUE156: Variable status indicator EReference
				.observeDetail(invocatorFacadeBinder);
		m_bindingContext.bindValue(observeTextInstanceStatusObserveWidget,
				invocatorFacadeActiveContextCreationDateValue, null,
				new UpdateValueStrategy().setConverter(new Converter(TODO ISSUE156 .class, TODO  ISSUE156 .class) {
					@Override
					public Object convert(Object fromObject) {
						FIXME: ISSUE156: converter
					}
				}));*/
		
		return m_bindingContext;
	}
	
	/**
	 * This class is used to convert a InvocatorSession to a boolean if there is an InvocatorSession instance active
	 */
	private class InvocatorInstanceToBooleanUpdateValueStrategy extends UpdateValueStrategy {
		public InvocatorInstanceToBooleanUpdateValueStrategy() {
			setConverter(new Converter(InvocatorSession.class, Boolean.class) {
				@Override
				/**
				 * @return true if there is an Invocator Session, false otherwise       
				 */
				public Object convert(Object fromObject) {
					return fromObject != null;
				}
			});
		}
	}
}
