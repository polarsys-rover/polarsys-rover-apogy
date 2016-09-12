package org.eclipse.polarsys.rover.client.ui.composites;
/*
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
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.polarsys.rover.client.PolarSysRoverClientPackage.Literals;
import org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient;
import org.eclipse.polarsys.rover.client.Position;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.core.databinding.beans.PojoProperties;
import org.eclipse.swt.layout.GridData;

public class PolarSysRoverClientComposite extends Composite
{
	private DataBindingContext m_bindingContext;
	private static final String DEGREE_SYM = "\u00b0";

	private PolarSysRoverPlatformClient roverPlatformClient;
	private Label lblPosition;
	private Label lblLeft;
	private Label lblRight;
	private Label lblSonarLevel;
	private WritableValue roverPlatformClientBinder;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public PolarSysRoverClientComposite(Composite parent, int style)
	{		
		super(parent, style);
		System.out.println("PolarSysRoverClientComposite.PolarSysRoverClientComposite()");
		setLayout(new GridLayout(2, false));
		
		this.addDisposeListener(new DisposeListener()

		{
			@Override
			public void widgetDisposed(DisposeEvent e)

			{
				m_bindingContext.dispose();
			}
		});
		

		
		Group groupPosition = new Group(this, SWT.BORDER);
		GridData gd_groupPosition = new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 2);
		gd_groupPosition.heightHint = 135;
		groupPosition.setLayoutData(gd_groupPosition);
		groupPosition.setLayout(new GridLayout(1, false));
		
		Label lblPositions = new Label(groupPosition, SWT.NONE);
		lblPositions.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
		lblPositions.setText("Positions");
		
		lblPosition = new Label(groupPosition, SWT.NONE);
		GridData gd_lblPosition = new GridData(SWT.LEFT, SWT.CENTER, false, true, 1, 1);
		gd_lblPosition.heightHint = 63;
		lblPosition.setLayoutData(gd_lblPosition);
		lblPosition.setText("Position");
		
		
		Group groupVelocity = new Group(this, SWT.BORDER);
		groupVelocity.setLayout(new GridLayout(1, false));
		GridData gd_groupVelocity = new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1);
		gd_groupVelocity.widthHint = 98;
		groupVelocity.setLayoutData(gd_groupVelocity);

		Label lblPowerLevels = new Label(groupVelocity, SWT.NONE);
		lblPowerLevels.setAlignment(SWT.CENTER);
		lblPowerLevels.setText("Power levels");

		lblLeft = new Label(groupVelocity, SWT.NONE);
		lblLeft.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		lblLeft.setText("Left");

		lblRight = new Label(groupVelocity, SWT.NONE);
		lblRight.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		lblRight.setText("Right");
		
				Group group = new Group(this, SWT.BORDER);
				GridData gd_group = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
				gd_group.widthHint = 103;
				group.setLayoutData(gd_group);
				
						Label lblSonar = new Label(group, SWT.NONE);
						lblSonar.setBounds(10, 12, 55, 15);
						lblSonar.setText("Sonar");
						
								lblSonarLevel = new Label(group, SWT.NONE);
								lblSonarLevel.setBounds(10, 33, 55, 15);
								lblSonarLevel.setText("SonarLevel");
		m_bindingContext = initDataBindings_();
	}
		
	public void setPolarSysRoverClient(PolarSysRoverPlatformClient roverPlatformClient)
	{		
		
		System.out.println("PolarSysRoverClientComposite.setPolarSysRoverClient()");
		
		if (roverPlatformClient != this.roverPlatformClient)
		{
			this.roverPlatformClient = roverPlatformClient;
			this.roverPlatformClientBinder.setValue(roverPlatformClient);						
		}
	}	
	
	@Override
	public void dispose() {
		m_bindingContext.dispose();
		super.dispose();		
	}
	
	protected DataBindingContext initDataBindings_() {
		m_bindingContext = new DataBindingContext();
		roverPlatformClientBinder = new WritableValue();
		//
		IObservableValue observeTextLblPositionvalueObserveWidget = WidgetProperties.text().observe(lblPosition);
		IObservableValue PositionRoverPlatformClientgetPositionObserveValue = EMFProperties.value(Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT__POSITION).observeDetail(roverPlatformClientBinder);
		m_bindingContext.bindValue(observeTextLblPositionvalueObserveWidget, PositionRoverPlatformClientgetPositionObserveValue, 
				null,
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE).setConverter(new Converter(Position.class, String.class) 
				{
					@Override
					public Object convert(Object arg0) {
						return String.format("X: %1$.3f "
											+ "\nY: %2$.3f "
											+ "\nTheta:\n %3.3f", 
												((Position) arg0).getX(),
												((Position)arg0).getTheta(),
												((Position)arg0).getY());
					}
				}));
		
		IObservableValue observeTextLblLeftObserveWidget = WidgetProperties.text().observe(lblLeft);
		IObservableValue xRoverPlatformClientgetLeftPowerObserveValue = EMFProperties.value(Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT__LEFT_POWER_LEVEL).observeDetail(roverPlatformClientBinder);
		m_bindingContext.bindValue(observeTextLblLeftObserveWidget, xRoverPlatformClientgetLeftPowerObserveValue, 
				null,
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE).setConverter(new Converter(Double.class, String.class) 
				{
					@Override
					public Object convert(Object arg0) {
						return String.format("Left: %1$.3f", ((Double)arg0));
					}
				}));
		
		IObservableValue observeTextLblRightObserveWidget = WidgetProperties.text().observe(lblRight);
		IObservableValue xRoverPlatformClientgetRightPowerObserveValue = EMFProperties.value(Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT__RIGHT_POWER_LEVEL).observeDetail(roverPlatformClientBinder);
		m_bindingContext.bindValue(observeTextLblRightObserveWidget, xRoverPlatformClientgetRightPowerObserveValue, 
				null,
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE).setConverter(new Converter(Double.class, String.class) 
				{
					@Override
					public Object convert(Object arg0) {
						return String.format("Right: %1$.3f", ((Double)arg0));
					}
				}));
		
		IObservableValue observeTextLblSonarLevelObserveWidget = WidgetProperties.text().observe(lblSonarLevel);
		IObservableValue xRoverPlatformClientgetSonarLevelObserveValue = EMFProperties.value(Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_SONAR).observeDetail(roverPlatformClientBinder);
		m_bindingContext.bindValue(observeTextLblSonarLevelObserveWidget, xRoverPlatformClientgetSonarLevelObserveValue, 
				null,
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE).setConverter(new Converter(Double.class, String.class) 
				{
					@Override
					public Object convert(Object arg0) {
						return String.format("Right: %1$.3f", ((Double)arg0));
					}
				}));
		
		// //
//		IObservableValue observeTextLblYvalueObserveWidget =  WidgetProperties.text().observe(lblYvalue);
//		IObservableValue yRoverPlatformClientgetPositionObserveValue = EMFProperties.value(Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT__POSITION).observeDetail(roverPlatformClientBinder);
//		m_bindingContext.bindValue(observeTextLblYvalueObserveWidget, yRoverPlatformClientgetPositionObserveValue, 
//				null,
//				new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE).setConverter(new Converter(Position.class, String.class)
//		{
//			@Override
//			public Object convert(Object arg0)
//			{
//				return ((Position)arg0).getY();
//			}
//		})
//	);
//		//
//		IObservableValue observeTextLblThetavalueObserveWidget =  WidgetProperties.text().observe(lblThetavalue);
//		IObservableValue thetaRoverPlatformClientgetPositionObserveValue = EMFProperties.value(Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT__POSITION).observeDetail(roverPlatformClientBinder);
//		m_bindingContext.bindValue(observeTextLblThetavalueObserveWidget, thetaRoverPlatformClientgetPositionObserveValue, 
//				null, 
//				new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE).setConverter(new Converter(Position.class, String.class)
//		{
//			@Override
//			public Object convert(Object arg0)
//			{
//				return ((Position)arg0).getTheta();
//			}
//		})
//	);
		//
		return m_bindingContext;
	}
}