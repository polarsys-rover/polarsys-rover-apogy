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
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;

import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;

import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;


public class PolarSysRoverSessionComposite extends Composite
{
	private DataBindingContext m_bindingContext;
	private ApogyCoreInvocatorFacade ecoreInvocatorFacade = ApogyCoreInvocatorFacade.INSTANCE;
	private PolarSysRoverPlatformClient roverPlatformClient;
	private final FormToolkit formToolKit = new FormToolkit(Display.getDefault());
	private WritableValue roverPlatformClientBinder;
	
	private Label lblStatus;
		
	
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
		sctnSessionStatus.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		formToolKit.paintBordersFor(sctnSessionStatus);
		sctnSessionStatus.setText("Session Status");
		
		Composite composite = new Composite(sctnSessionStatus, SWT.NONE);
		formToolKit.adapt(composite);
		formToolKit.paintBordersFor(composite);
		sctnSessionStatus.setClient(composite);
		composite.setLayout(new GridLayout(2, false));
		
		Button btnResetInstances = new Button(composite, SWT.NONE);
		btnResetInstances.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		formToolKit.adapt(btnResetInstances, true, true);
		btnResetInstances.setText("Reset Instances");
		
		Button btnNewButton = new Button(composite, SWT.NONE);
		btnNewButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		formToolKit.adapt(btnNewButton, true, true);
		btnNewButton.setText("Clear Instances");
		
		lblStatus = new Label(composite, SWT.BORDER | SWT.CENTER);
		lblStatus.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));
		formToolKit.adapt(lblStatus, true, true);
		lblStatus.setText("Status");

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
		IObservableValue ecoreInvocatorFacadeActiveInvocatorSessionObserveValue = EMFObservables.observeValue(ecoreInvocatorFacade, ApogyCoreInvocatorPackage.Literals.APOGY_CORE_INVOCATOR_FACADE__ACTIVE_INVOCATOR_SESSION);

		/** Status Binding. */
		IObservableValue observeTextStatusObserveWidget = WidgetProperties.text().observe(lblStatus);
		m_bindingContext.bindValue( observeTextStatusObserveWidget, ecoreInvocatorFacadeActiveInvocatorSessionObserveValue, 
				null,
				new UpdateValueStrategy().setConverter( new Converter( InvocatorSession.class, String.class )
				{
					@Override
					public Object convert( Object fromObject )
					{
						return fromObject == null ? "No Active Session" : "Session Ready";
					}
		}));
		
		
		
		return m_bindingContext;
	}
}

