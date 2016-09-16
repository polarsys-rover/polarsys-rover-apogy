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
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.common.util.EList;
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
import org.eclipse.swt.events.SelectionListener;
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

import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.Context;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;

public class PolarSysRoverSessionComposite extends Composite
{
	private static final String CONNECTED_STR = "Connected";
	private static final String NOT_CONNECTED_STR = "Not Connected";
	
	private static final String NO_ACTIVE_SESSION_STR = "No Active Session";
	private static final String SESSION_ACTIVE_STR = "Session Active";
	
	private DataBindingContext m_bindingContext;
	private ApogyCoreInvocatorFacade ecoreInvocatorFacade = ApogyCoreInvocatorFacade.INSTANCE;
	private PolarSysRoverPlatformClient roverPlatformClient;
	private final FormToolkit formToolKit = new FormToolkit(Display.getDefault());
	private WritableValue roverPlatformClientBinder;
	private EList<Context> contextList;
	
	private Text txtStatusConnexion;
	private Combo comboContext;
	
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
		txtStatusConnexion.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				if(txtStatusConnexion.getText().equals(SESSION_ACTIVE_STR)){
					txtStatusConnexion.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
				}else{
					txtStatusConnexion.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
				}
				
			}
		});
		
		Button btnResetInstances = new Button(compositeSession, SWT.NONE);
		GridData gd_btnResetInstances = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
		gd_btnResetInstances.minimumHeight = 100;
		btnResetInstances.setLayoutData(gd_btnResetInstances);
		formToolKit.adapt(btnResetInstances, true, true);
		btnResetInstances.setText("Reset Instances");
		// Create the listener that calls the start() method when the button is selected
		btnResetInstances.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (roverPlatformClient != null) {
					// TODO start();
				}
			}
		});
		
				Button btnClearInstance = new Button(compositeSession, SWT.NONE);
				GridData gd_btnClearInstance = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
				gd_btnClearInstance.minimumHeight = 100;
				btnClearInstance.setLayoutData(gd_btnClearInstance);
				formToolKit.adapt(btnClearInstance, true, true);
				btnClearInstance.setText("Clear Instances");
				// Create the listener that calls the stop() method when the button is selected
				btnClearInstance.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						if (roverPlatformClient != null) {
							// TODO listener stop();
						}
					}
				});
		
		Label lblContext = new Label(compositeSession, SWT.NONE);
		lblContext.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		formToolKit.adapt(lblContext, true, true);
		lblContext.setText("Context");
		
		comboContext = new Combo(compositeSession, SWT.NONE);
		formToolKit.adapt(comboContext);
		formToolKit.paintBordersFor(comboContext);
		comboContext.setText("Context");
		comboContext.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				updateComboContext();
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
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
		
		
		/** Invocator Facade Active Session Observable. */
		//IObservableValue ecoreInvocatorFacadeActiveInvocatorSessionObserveValue = EMFObservables.observeValue( ecoreInvocatorFacade, EMFEcoreInvocaorPackage.Literals.EMF_ECORE_INVOCATOR_FACADE__ACTIVE_INVOCATOR_SESSION t);

		/** Status Binding. */
		/*FIXME IObservableValue observeTextStatusObserveWidget = WidgetProperties.text().observe( textStatus );
		FIXME m_bindingContext.bindValue( observeTextStatusObserveWidget, ecoreInvocatorFacadeActiveInvocatorSessionObserveValue, null, new UpdateValueStrategy().setConverter( new Converter( InvocatorSession.class, String.class )
		{
			@Override
			public Object convert( Object fromObject )
			{
				return fromObject == null ? "No Active Session" : "Session Ready";
			}
		} ) );
		*/
		
		IObservableValue observeTextStatusConnexionObserveWidget = WidgetProperties.text().observe(txtStatusConnexion);
		IObservableValue ecoreInvocatorFacadeActiveInvocatorSessionObserveValue = EMFObservables.observeValue(ecoreInvocatorFacade, ApogyCoreInvocatorPackage.Literals.APOGY_CORE_INVOCATOR_FACADE__ACTIVE_INVOCATOR_SESSION);
		m_bindingContext.bindValue( observeTextStatusConnexionObserveWidget, ecoreInvocatorFacadeActiveInvocatorSessionObserveValue, 
				null, 
				new UpdateValueStrategy().setConverter(new Converter(InvocatorSession.class, String.class)
				{
					@Override
					public Object convert(Object fromObject)
					{
						return fromObject == null ? NO_ACTIVE_SESSION_STR : SESSION_ACTIVE_STR;
					}
				}));
		
		
		IObservableValue observeComboContextObserveWidget = WidgetProperties.singleSelectionIndex().observe(comboContext);
		m_bindingContext.bindValue(observeComboContextObserveWidget, ecoreInvocatorFacadeActiveInvocatorSessionObserveValue, 
				null, 
				new UpdateValueStrategy().setConverter(new Converter(InvocatorSession.class, Integer.class)
				{
					@Override
					public Object convert(Object arg0)
					{
						EList<Context> contextList = ((InvocatorSession)arg0).getEnvironment().getContextsList().getContexts();
						updateComboContext();
						for(int i = 0; i < contextList.size(); i++){
							if (contextList.get(i).equals(((InvocatorSession)arg0).getEnvironment().getActiveContext()))
							{
								return i;
							}	
						}
						return -1;
					}
				}));
		
		
		return m_bindingContext;
	}
	
	
	/** FIXME: See if needed
	 * Establishes the connection with the PolarSysRoverPlatformClient.
	 */
	protected void start()
	{
		PolarSysRoverPlatformClientUiFacade.INSTANCE.start();
		setPolarSysRoverClient(PolarSysRoverPlatformClientUiFacade.INSTANCE.getActivePolarSysRoverPlatformClient());
	}

	/** FIXME: See if needed
	 * Stops the connection with the PolarSysRoverPlatformClient.
	 */
	protected void stop()
	{
		PolarSysRoverPlatformClientUiFacade.INSTANCE.stop();
		setPolarSysRoverClient(null);
	}
	
	private void updateComboContext(){
		comboContext.removeAll();
		if(!contextList.equals(null)){
			for (int i = 0; i < contextList.size(); i++) {
				comboContext.add(contextList.get(i).getName());
			}
		}
		
	}
}

