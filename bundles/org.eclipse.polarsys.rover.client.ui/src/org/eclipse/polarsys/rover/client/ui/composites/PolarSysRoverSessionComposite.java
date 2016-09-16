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
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient;
import org.eclipse.polarsys.rover.client.ui.PolarSysRoverPlatformClientUiFacade;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Combo;

public class PolarSysRoverSessionComposite extends Composite
{
	private static final String CONNECTED_STR = "Connected";
	private static final String NOT_CONNECTED_STR = "Not Connected";
	
	private static final String NO_ACTIVE_SESSION_STR = "No Active Session";
	private static final String READY_STR = "Ready";
	
	private DataBindingContext m_bindingContext;
	//private EMFEcoreInvocatorFacade ecoreInvocatorFacade = EMFEcoreInvocatorFacade.INSTANCE;
	private PolarSysRoverPlatformClient roverPlatformClient;
	private final FormToolkit formToolKit = new FormToolkit(Display.getDefault());
	private WritableValue roverPlatformClientBinder;
	private Text txtStatusConnexion;
		
	
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
		sctnSessionStatus.setText("Connexion Status");
		
		Composite compositeSession = new Composite(sctnSessionStatus, SWT.BORDER);
		sctnSessionStatus.setClient(compositeSession);
		formToolKit.adapt(compositeSession);
		formToolKit.paintBordersFor(compositeSession);
		compositeSession.setLayout(new GridLayout(2, false));
		
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

		txtStatusConnexion = new Text(compositeSession, SWT.BORDER | SWT.CENTER);
		txtStatusConnexion.setText("Status");
		txtStatusConnexion.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		formToolKit.adapt(txtStatusConnexion, true, true);
		
		Composite composite = new Composite(compositeSession, SWT.NONE);
		composite.setLayout(new GridLayout(2, false));
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 2, 1));
		formToolKit.adapt(composite);
		formToolKit.paintBordersFor(composite);
		
		Label lblContext = new Label(composite, SWT.CENTER);
		formToolKit.adapt(lblContext, true, true);
		lblContext.setText("Context");
		
		Combo comboContext = new Combo(composite, SWT.NONE);
		comboContext.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		formToolKit.adapt(comboContext);
		formToolKit.paintBordersFor(comboContext);
		


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
		IObservableValue observeTextStatusConnexionObserveWidget = WidgetProperties.text().observe(txtStatusConnexion);
		
		/** Invocator Facade Active Session Observable. */
		//IObservableValue ecoreInvocatorFacadeActiveInvocatorSessionObserveValue = EMFObservables.observeValue( ecoreInvocatorFacade, EMFEcoreInvocatorPackage.Literals.EMF_ECORE_INVOCATOR_FACADE__ACTIVE_INVOCATOR_SESSION );

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
}

