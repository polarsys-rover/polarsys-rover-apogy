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

import java.util.Timer;
import java.util.TimerTask;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient;
import org.eclipse.polarsys.rover.client.ui.PolarSysRoverPlatformClientUiFacade;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.core.databinding.Binding;

import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.Context;
import ca.gc.asc_csa.apogy.core.invocator.ContextsList;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;

public class PolarSysRoverSessionComposite extends Composite
{
	
	private static final String NO_ACTIVE_SESSION_STR = "No Active Session";
	private static final String SESSION_ACTIVE_STR = "Session Active";
	
	private DataBindingContext m_bindingContext;
	private DataBindingContext m_bindingContextSession;
	private ApogyCoreInvocatorFacade ecoreInvocatorFacade = ApogyCoreInvocatorFacade.INSTANCE;
	private PolarSysRoverPlatformClient roverPlatformClient;
	private final FormToolkit formToolKit = new FormToolkit(Display.getDefault());
	private WritableValue roverPlatformClientBinder;
	private ContextsList contextsList;
	
	private Text txtStatusConnexion;
	private Combo comboContext;
	private Button btnResetInstances;
	private Button btnClearInstance;
	
	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public PolarSysRoverSessionComposite(Composite parent, int style)
	{		
		super(parent, style);

		this.addDisposeListener(new DisposeListener()

		{
			@Override
			public void widgetDisposed(DisposeEvent e)
			{
				m_bindingContext.dispose();
				m_bindingContextSession.dispose();
			}

		});
		setLayout(new GridLayout(1, false));
		
		Section sctnSessionStatus = formToolKit.createSection(this, Section.TITLE_BAR);
		GridData gd_sctnSessionStatus = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
		gd_sctnSessionStatus.minimumWidth = 220;
		sctnSessionStatus.setLayoutData(gd_sctnSessionStatus);
		formToolKit.paintBordersFor(sctnSessionStatus);
		sctnSessionStatus.setText("Session Status");
		
		Composite compositeSession = new Composite(sctnSessionStatus, SWT.BORDER);
		sctnSessionStatus.setClient(compositeSession);
		formToolKit.adapt(compositeSession);
		formToolKit.paintBordersFor(compositeSession);
		compositeSession.setLayout(new GridLayout(2, false));
		
		txtStatusConnexion = new Text(compositeSession, SWT.BORDER | SWT.CENTER);
		txtStatusConnexion.setText("Session Status");
		txtStatusConnexion.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		formToolKit.adapt(txtStatusConnexion, true, true);
		txtStatusConnexion.setEditable(false);


		btnResetInstances = new Button(compositeSession, SWT.NONE);
		GridData gd_btnResetInstances = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
		gd_btnResetInstances.minimumHeight = 100;
		btnResetInstances.setLayoutData(gd_btnResetInstances);
		formToolKit.adapt(btnResetInstances, true, true);
		btnResetInstances.setText("Reset Instances");
		// Create the listener that initiates the variables of the environment when the button is selected
		// This is to reset the instances
		btnResetInstances.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (ecoreInvocatorFacade != null) {
					if(!ecoreInvocatorFacade.getActiveInvocatorSession().getEnvironment().getVariablesList().equals(null)){
						ecoreInvocatorFacade.disposeVariableInstances(
								ecoreInvocatorFacade.getActiveInvocatorSession().getEnvironment());
					}
					ecoreInvocatorFacade
							.initVariableInstances(ecoreInvocatorFacade.getActiveInvocatorSession().getEnvironment());
				}
			}
		});

		btnClearInstance = new Button(compositeSession, SWT.NONE);
		GridData gd_btnClearInstance = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
		gd_btnClearInstance.minimumHeight = 100;
		btnClearInstance.setLayoutData(gd_btnClearInstance);
		formToolKit.adapt(btnClearInstance, true, true);
		btnClearInstance.setText("Clear Instances");
		// Create the listener that disposes the variables of the environment when the button is selected
		// This is to clear the instances
		btnClearInstance.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (ecoreInvocatorFacade != null) {
					ecoreInvocatorFacade.disposeVariableInstances(
							ecoreInvocatorFacade.getActiveInvocatorSession().getEnvironment());
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
		// Create a listener that changes the active context to the selected context
		comboContext.addSelectionListener(new SelectionAdapter() {			
			@Override
			public void widgetSelected(SelectionEvent e) {
				ecoreInvocatorFacade.getActiveInvocatorSession().getEnvironment().setActiveContext(contextsList.getContexts().get(comboContext.getSelectionIndex()));
			}
		});
				
		// Create the listener that changes the color of the label according to the text
		// This listener also disables the session controls when there is no active session
		txtStatusConnexion.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				if (txtStatusConnexion.getText().equals(SESSION_ACTIVE_STR)) {
					txtStatusConnexion.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
					btnResetInstances.setEnabled(true);
					btnClearInstance.setEnabled(true);
					comboContext.setEnabled(true);
				} else {
					txtStatusConnexion.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
					btnResetInstances.setEnabled(false);
					btnClearInstance.setEnabled(false);
					comboContext.setEnabled(false);
				}

			}
		});

		m_bindingContext = initDataBindings_();
	}


	/**
	 * Sets the {@link PolarSysRoverPlatformClient} to be controlled by this composite.
	 * 
	 * @param PolarSysRoverPlatformClient
	 *            Reference to the {@link PolarSysRoverPlatformClient}.
	 */
	public void setPolarSysRoverClient(PolarSysRoverPlatformClient roverPlatformClient)
	{				
		if (roverPlatformClient != this.roverPlatformClient)
		{
			this.roverPlatformClient = roverPlatformClient;
			// Set the binder for databinding
			this.roverPlatformClientBinder.setValue(roverPlatformClient);						
		}
	}	
	
	/**
	 * Returns the actual {@link PolarSysRoverPlatformClient} controlled by this composite.
	 * 
	 * @return Reference to the PolarSysRoverPlatformClient
	 */
	public PolarSysRoverPlatformClient getPolarSysRoverPlatformClient()
	{
		return roverPlatformClient;
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
	protected DataBindingContext initDataBindings_() {
		
		m_bindingContext = new DataBindingContext();
		
		roverPlatformClientBinder = new WritableValue();
		
		/** Data binding to rebind the values if the active session is changed */
		IObservableValue observeTextStatusConnexionObserveWidget = WidgetProperties.text().observe(txtStatusConnexion);
		IObservableValue ecoreInvocatorFacadeActiveInvocatorSessionObserveValue = EMFObservables.observeValue(ecoreInvocatorFacade, ApogyCoreInvocatorPackage.Literals.APOGY_CORE_INVOCATOR_FACADE__ACTIVE_INVOCATOR_SESSION);
		m_bindingContext.bindValue( observeTextStatusConnexionObserveWidget, ecoreInvocatorFacadeActiveInvocatorSessionObserveValue, 
				null, 
				new UpdateValueStrategy().setConverter(new Converter(InvocatorSession.class, String.class)
				{
					@Override
					public Object convert(Object fromObject)
					{
						initDataBindingsSession(roverPlatformClientBinder);
						return "";
					}
				}));

		
		return m_bindingContext;
	}
	
	/**
	 *
	 * Creates and returns the data bindings associated with the active session.
	 * 
	 * @param roverPlatformClientBinder
	 */
	private void initDataBindingsSession(WritableValue roverPlatformClientBinder){
		
		m_bindingContextSession = new DataBindingContext();
		
		/** Data binding to know if there is an active session */
		IObservableValue observeTextStatusConnexionObserveWidget = WidgetProperties.text().observe(txtStatusConnexion);
		IObservableValue ecoreInvocatorFacadeActiveInvocatorSessionObserveValue = EMFObservables.observeValue(ecoreInvocatorFacade, ApogyCoreInvocatorPackage.Literals.APOGY_CORE_INVOCATOR_FACADE__ACTIVE_INVOCATOR_SESSION);
		m_bindingContextSession.bindValue( observeTextStatusConnexionObserveWidget, ecoreInvocatorFacadeActiveInvocatorSessionObserveValue, 
				null, 
				new UpdateValueStrategy().setConverter(new Converter(InvocatorSession.class, String.class)
				{
					@Override
					public Object convert(Object fromObject)
					{
						return fromObject == null ? NO_ACTIVE_SESSION_STR : SESSION_ACTIVE_STR;
					}
				}));

		
		// FIXME: SELON LA LISTE
		/*IObservableList observeComboContextListObserveWidget1 = WidgetProperties.items().observe(comboContext);
		IObservableList ecoreInvocatorFacadeEnvironmentContextsListObserveValue2 = EMFObservables.observeList(ecoreInvocatorFacade.getActiveInvocatorSession().getEnvironment(), ApogyCoreInvocatorPackage.Literals.ENVIRONMENT__CONTEXTS_LIST);
		m_bindingContext.bindList(observeComboContextListObserveWidget1, ecoreInvocatorFacadeEnvironmentContextsListObserveValue2,
				null,
				new UpdateListStrategy().setConverter(new Converter(ContextList.class, String.class) 
				{
					@Override
					public Object convert(Object arg0) {
						@SuppressWarnings("unused")
						Context test1 = (Context)arg0;
						@SuppressWarnings("unused")
						ContextList test2 = (ContextList)arg0;
						@SuppressWarnings({ "unused", "unchecked" })
						EList<Context> test3 = (EList<Context>)arg0;
						@SuppressWarnings("unused")
						Environment test4 = (Environment)arg0;
						
						@SuppressWarnings("unchecked")
						EList<Context> test = ((EList<Context>)arg0);
						
						System.out.print("bllbalblabl");
						String[] contextNames = new String[test.size()];
						for (int i = 0; i < contextNames.length; i++){
							contextNames[i] = test.get(i).getName();
						}
						
						/*contextsList = ((ContextsList)arg0);
						String[] contextNames = new String[contextsList.getContexts().size()];
						for (int i = 0; i < contextNames.length; i++){
							contextNames[i] = ((ContextsList)arg0).getContexts().get(i).getName();
						}*//*
						return contextNames;
					}
				}));*/
		
		
		/** Data binding to get the name of the contexts or the combo box */
		// FIXME: SELON LA VALUE AVEC HACK
		IObservableValue observeComboContextListObserveWidget = WidgetProperties.enabled().observe(comboContext);
		IObservableValue ecoreInvocatorFacadeEnvironmentContextsListObserveValue = EMFObservables.observeValue(ecoreInvocatorFacade.getActiveInvocatorSession().getEnvironment(), ApogyCoreInvocatorPackage.Literals.ENVIRONMENT__CONTEXTS_LIST);
		m_bindingContextSession.bindValue(observeComboContextListObserveWidget, ecoreInvocatorFacadeEnvironmentContextsListObserveValue, 
				null,
				new UpdateValueStrategy().setConverter(new Converter(ContextsList.class, boolean.class)
				{
					public Object convert(Object arg0)
					{
						contextsList = ((ContextsList)arg0);
						String[] contextNames = new String[contextsList.getContexts().size()];
						for (int i = 0; i < contextNames.length; i++){
							contextNames[i] = ((ContextsList)arg0).getContexts().get(i).getName();
						}
						comboContext.setItems(contextNames);
						return true;
					}
				}));
		
		// FIXME: SELON LA VALUE SANS HACK
		/*IObservableList observeComboContextListObserveWidget = WidgetProperties.items().observe(comboContext);
		IObservableList ecoreInvocatorFacadeEnvironmentContextsListObserveValue = EMFObservables.observeList(ecoreInvocatorFacade.getActiveInvocatorSession().getEnvironment(), ApogyCoreInvocatorPackage.Literals.ENVIRONMENT__CONTEXTS_LIST);
		m_bindingContext.bindList(observeComboContextListObserveWidget, ecoreInvocatorFacadeEnvironmentContextsListObserveValue, 
				null,
				new UpdateListStrategy().setConverter(new Converter(ContextList.class, String.class)
				{
					public Object convert(Object arg0)
					{
						contextsList = ((ContextsList)arg0);
						
						String[] contextNames = new String[contextsList.getContexts().size()];
						for (int i = 0; i < contextNames.length; i++){
							contextNames[i] = contextsList.getContexts().get(i).getName();
						}
						return contextNames;
						
						
						//contextsList = ((ContextsList)arg0);
						//String[] contextNames = new String[contextsList.getContexts().size()];
						//for (int i = 0; i < contextNames.length; i++){
						//	contextNames[i] = ((ContextsList)arg0).getContexts().get(i).getName();
						//}
						//comboContext.setItems(contextNames);
						//return true;
					}
				}));*/
		
		/** Data binding to set the text value of the combo box to the active context*/
		IObservableValue observeComboContextObserveWidget = WidgetProperties.singleSelectionIndex().observe(comboContext);
		IObservableValue ecoreInvocatorFacadeEnvironmentActiveContextObserveValue = EMFObservables.observeValue(ecoreInvocatorFacade.getActiveInvocatorSession().getEnvironment(), ApogyCoreInvocatorPackage.Literals.ENVIRONMENT__ACTIVE_CONTEXT);
		m_bindingContextSession.bindValue(observeComboContextObserveWidget, ecoreInvocatorFacadeEnvironmentActiveContextObserveValue, 
				null,
				new UpdateValueStrategy().setConverter(new Converter(Context.class, Integer.class)
				{
					@Override
					public Object convert(Object arg0)
					{
						for(int i = 0; i < comboContext.getItemCount(); i++){
							if(((Context)arg0).getName().equals(comboContext.getItem(i))){
								return i;
							}
						}
						return -1;
					}
				}));
		
		System.out.print("");
	}

}

