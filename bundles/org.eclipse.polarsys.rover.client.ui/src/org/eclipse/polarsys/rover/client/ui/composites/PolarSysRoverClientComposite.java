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
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.polarsys.rover.client.PolarSysCamera;
import org.eclipse.polarsys.rover.client.PolarSysRoverClientPackage.Literals;
import org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient;
import org.eclipse.polarsys.rover.client.Position;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Scale;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.wb.swt.SWTResourceManager;

public class PolarSysRoverClientComposite extends Composite
{
	private DataBindingContext m_bindingContext;
	private static final String DEGREE_SYM = "\u00b0";
	private static final String READY_STR = "Ready";
	private static final String NOT_READY_STR = "Not ready";
	private static final String DISPOSED_STR = "Disposed";
	private static final int SPEED_LEVEL_MAX = 100;
	
	private PolarSysRoverPlatformClient roverPlatformClient;
	private final FormToolkit formToolKit = new FormToolkit(Display.getDefault());
	private WritableValue roverPlatformClientBinder;
	
	private int speedLevel = SPEED_LEVEL_MAX;
	
	private Section sctnPosition;
	private Section sctnPowerLevels;
	private Composite compositePosition;
	private Composite compositePowerLevels;
	private Section sctnSonar;
	private Composite compositeSonar;
	private Label lblLeftText;
	private Label lblRightText;
	private Label lblSonarLevelText;
	private Label lblPowerMaxLeft;
	private Label lblPowerMaxRight;
	private Label lblX;
	private Label lblY;
	private Label lblTheta;
	private Text txtX;
	private Text txtY;
	private Text txtTheta;
	private Text txtPowerLeft;
	private Text txtPowerRight;
	private Section sctnControls;
	private Composite compositeDirection;
	private Composite compositeControls;
	private Composite compositeStatus;
	private Text txtStatus;
	private Label lblSpeed;
	private Composite composite;
	private Composite compositeSpeed;
	private Text txtSonar;
	private Scale scaleSpeed;
	private Label label;
	private Label label_1;
	private Section sctnCamera;
	private Composite compositeCamera;
	private Button btnStartStreaming;
	private Button btnStopStreaming;
	private Button btnTakeSnapshot;
	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public PolarSysRoverClientComposite(Composite parent, int style)
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
		setLayout(new GridLayout(5, false));
		
		sctnControls = formToolKit.createSection(this, Section.TITLE_BAR);
		GridData gd_sctnControls = new GridData(SWT.FILL, SWT.FILL, true, false, 3, 2);
		gd_sctnControls.widthHint = 148;
		sctnControls.setLayoutData(gd_sctnControls);
		formToolKit.paintBordersFor(sctnControls);
		sctnControls.setText("Controls");

		compositeControls = formToolKit.createComposite(sctnControls, SWT.NONE);
		formToolKit.paintBordersFor(compositeControls);
		sctnControls.setClient(compositeControls);
		compositeControls.setLayout(new GridLayout(1, false));

		composite = new Composite(compositeControls, SWT.NONE);
		formToolKit.adapt(composite);
		formToolKit.paintBordersFor(composite);
		composite.setLayout(new GridLayout(3, false));

		compositeStatus = formToolKit.createComposite(composite, SWT.BORDER);
		compositeStatus.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		formToolKit.paintBordersFor(compositeStatus);
		GridLayout gl_compositeStatus = new GridLayout(2, false);
		compositeStatus.setLayout(gl_compositeStatus);
		new Label(compositeStatus, SWT.NONE);
		new Label(compositeStatus, SWT.NONE);

		Button btnStart = formToolKit.createButton(compositeStatus, "Start", SWT.NONE);
		GridData gd_btnStart = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
		gd_btnStart.widthHint = 120;
		btnStart.setLayoutData(gd_btnStart);
		/**
		 * Add a listener that initiates the platform client when the button is selected
		 */
		btnStart.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (roverPlatformClient != null) {
					Job initJob = new InitJob();

					initJob.schedule();
				}
			}
		});

		Button btnStop = formToolKit.createButton(compositeStatus, "Stop", SWT.NONE);
		GridData gd_btnStop = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
		gd_btnStop.widthHint = 120;
		btnStop.setLayoutData(gd_btnStop);
		/**
		 * Add a listener that disposes the platform client when the button is selected
		 */
		btnStop.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (roverPlatformClient != null) {
					Job disposeJob = new DisposeJob();

					disposeJob.schedule();
				}
			}
		});

		txtStatus = formToolKit.createText(compositeStatus, "New Text", SWT.CENTER);
		txtStatus.setText("Status");
		GridData gd_txtStatus = new GridData(SWT.FILL, SWT.FILL, false, false, 2, 1);
		gd_txtStatus.widthHint = 150;
		txtStatus.setLayoutData(gd_txtStatus);
		/**
		 * Add a listener that changes the background color of the label when the label's text is modified
		 */
		txtStatus.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				if (txtStatus.getText().equals(READY_STR)) {
					txtStatus.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
				} else {
					txtStatus.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
				}
			}
		});

		compositeDirection = new Composite(composite, SWT.BORDER);
		compositeDirection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		formToolKit.adapt(compositeDirection);
		formToolKit.paintBordersFor(compositeDirection);
		GridLayout gl_compositeDirection = new GridLayout(3, false);
		gl_compositeDirection.marginWidth = 10;
		compositeDirection.setLayout(gl_compositeDirection);
		new Label(compositeDirection, SWT.NONE);

		Button btnFront = new Button(compositeDirection, SWT.NONE);
		GridData gd_btnFront = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_btnFront.widthHint = 75;
		btnFront.setLayoutData(gd_btnFront);
		formToolKit.adapt(btnFront, true, true);
		btnFront.setText("Front");
		/**
		 * Add a listener that makes the platform 
		 * go forward if the mouse is pressed down on the button
		 * or
		 * stop completely when the mouse is released
		 */
		btnFront.addMouseListener(new MouseListener() {

			@Override
			public void mouseUp(MouseEvent e) {
				if (roverPlatformClient != null) {
					Job stopJob = new StopJob();

					stopJob.schedule();
				}
			}

			@Override
			public void mouseDown(MouseEvent e) {
				if (roverPlatformClient != null) {
					Job frontJob = new FrontJob();

					frontJob.schedule();
				}
			}

			@Override
			public void mouseDoubleClick(MouseEvent e) {
			}
		});
		new Label(compositeDirection, SWT.NONE);

		Button btnLeft = new Button(compositeDirection, SWT.NONE);
		GridData gd_btnLeft = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_btnLeft.widthHint = 75;
		btnLeft.setLayoutData(gd_btnLeft);
		formToolKit.adapt(btnLeft, true, true);
		btnLeft.setText("Left");
		/**
		 * Add a listener that makes the platform 
		 * go left if the mouse is pressed down on the button
		 * or
		 * stop completely when the mouse is released
		 */
		btnLeft.addMouseListener(new MouseListener() {

			@Override
			public void mouseUp(MouseEvent e) {
				if (roverPlatformClient != null) {
					Job stopJob = new StopJob();

					stopJob.schedule();
				}
			}

			@Override
			public void mouseDown(MouseEvent e) {
				if (roverPlatformClient != null) {
					Job leftJob = new LeftJob();

					leftJob.schedule();
				}
			}

			@Override
			public void mouseDoubleClick(MouseEvent e) {
			}
		});
		new Label(compositeDirection, SWT.NONE);

		Button btnRight = new Button(compositeDirection, SWT.NONE);
		GridData gd_btnRight = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
		gd_btnRight.widthHint = 75;
		btnRight.setLayoutData(gd_btnRight);
		formToolKit.adapt(btnRight, true, true);
		btnRight.setText("Right");
		/**
		 * Add a listener that makes the platform 
		 * go right if the mouse is pressed down on the button
		 * or
		 * stop completely when the mouse is released
		 */
		btnRight.addMouseListener(new MouseListener() {

			@Override
			public void mouseUp(MouseEvent e) {
				if (roverPlatformClient != null) {
					Job stopJob = new StopJob();

					stopJob.schedule();
				}
			}

			@Override
			public void mouseDown(MouseEvent e) {
				if (roverPlatformClient != null) {
					Job rightJob = new RightJob();

					rightJob.schedule();
				}
			}

			@Override
			public void mouseDoubleClick(MouseEvent e) {		
			}
		});
		new Label(compositeDirection, SWT.NONE);

		Button btnBack = new Button(compositeDirection, SWT.NONE);
		GridData gd_btnBack = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_btnBack.widthHint = 75;
		btnBack.setLayoutData(gd_btnBack);
		formToolKit.adapt(btnBack, true, true);
		btnBack.setText("Back");
		/**
		 * Add a listener that makes the platform 
		 * go backward if the mouse is pressed down on the button
		 * or
		 * stop completely when the mouse is released
		 */
		btnBack.addMouseListener(new MouseListener() {

			@Override
			public void mouseUp(MouseEvent e) {
				if (roverPlatformClient != null) {
					Job stopJob = new StopJob();

					stopJob.schedule();
				}
			}

			@Override
			public void mouseDown(MouseEvent e) {
				if (roverPlatformClient != null) {
					Job backJob = new BackJob();

					backJob.schedule();
				}
			}

			@Override
			public void mouseDoubleClick(MouseEvent e) {
			}
		});
		new Label(compositeDirection, SWT.NONE);

		compositeSpeed = new Composite(composite, SWT.NONE);
		formToolKit.adapt(compositeSpeed);
		formToolKit.paintBordersFor(compositeSpeed);
		compositeSpeed.setLayout(new GridLayout(1, false));

		lblSpeed = new Label(compositeSpeed, SWT.CENTER);
		lblSpeed.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		lblSpeed.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		formToolKit.adapt(lblSpeed, true, true);
		lblSpeed.setText("Speed");
		
		scaleSpeed = new Scale(compositeSpeed, SWT.VERTICAL);
		scaleSpeed.setMaximum(SPEED_LEVEL_MAX);
		scaleSpeed.setMinimum(0);
		GridData gd_scaleSpeed = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
		gd_scaleSpeed.heightHint = 80;
		scaleSpeed.setLayoutData(gd_scaleSpeed);
		formToolKit.adapt(scaleSpeed, true, true);
		/**
		 * Add a listener that sets the speed according to the value selected on the scale
		 */
		scaleSpeed.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				speedLevel = SPEED_LEVEL_MAX - scaleSpeed.getSelection();
			}
		});

		sctnPosition = formToolKit.createSection(this, Section.TITLE_BAR);
		GridData gd_sctnPosition = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
		gd_sctnPosition.heightHint = 109;
		gd_sctnPosition.widthHint = 146;
		sctnPosition.setLayoutData(gd_sctnPosition);
		formToolKit.paintBordersFor(sctnPosition);
		sctnPosition.setText("Position");

		compositePosition = new Composite(sctnPosition, SWT.NONE);
		formToolKit.adapt(compositePosition);
		formToolKit.paintBordersFor(compositePosition);
		sctnPosition.setClient(compositePosition);
		compositePosition.setLayout(new GridLayout(2, false));

		lblX = formToolKit.createLabel(compositePosition, "X:", SWT.RIGHT);
		lblX.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		txtX = formToolKit.createText(compositePosition, "New Text", SWT.CENTER);
		txtX.setEditable(false);
		GridData gd_txtX = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
		gd_txtX.widthHint = 66;
		txtX.setLayoutData(gd_txtX);
		txtX.setText(" 0.000 m");

		lblY = formToolKit.createLabel(compositePosition, "Y:", SWT.RIGHT);
		lblY.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		txtY = formToolKit.createText(compositePosition, "New Text", SWT.CENTER);
		txtY.setEditable(false);
		txtY.setText(" 0.000 m");
		GridData gd_txtY = new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1);
		gd_txtY.widthHint = 75;
		txtY.setLayoutData(gd_txtY);

		lblTheta = formToolKit.createLabel(compositePosition, "Theta:", SWT.RIGHT);
		lblTheta.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		txtTheta = formToolKit.createText(compositePosition, "New Text", SWT.CENTER);
		txtTheta.setEditable(false);
		txtTheta.setText(" 0.000" + DEGREE_SYM);
		GridData gd_txtTheta = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
		gd_txtTheta.widthHint = 66;
		txtTheta.setLayoutData(gd_txtTheta);
		new Label(compositePosition, SWT.NONE);
		new Label(compositePosition, SWT.NONE);

		sctnCamera = formToolKit.createSection(this, Section.TITLE_BAR);
		sctnCamera.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		formToolKit.paintBordersFor(sctnCamera);
		sctnCamera.setText("Camera");

		compositeCamera = new Composite(sctnCamera, SWT.NONE);
		formToolKit.adapt(compositeCamera);
		formToolKit.paintBordersFor(compositeCamera);
		sctnCamera.setClient(compositeCamera);
		compositeCamera.setLayout(new GridLayout(1, false));
		
		btnTakeSnapshot = new Button(compositeCamera, SWT.NONE);
		btnTakeSnapshot.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		formToolKit.adapt(btnTakeSnapshot, true, true);
		btnTakeSnapshot.setText("Take Snapshot");
		/**
		 * Add a listener that takes a snapshot when the button is selected
		 */
		btnTakeSnapshot.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(roverPlatformClient != null) {
					Job takeSnapshotJob = new TakeSnapshotJob();

					takeSnapshotJob.schedule();
				}
			}
		});

		btnStartStreaming = new Button(compositeCamera, SWT.NONE);
		btnStartStreaming.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		btnStartStreaming.setEnabled(true);
		formToolKit.adapt(btnStartStreaming, true, true);
		btnStartStreaming.setText("Start Streaming");
		/**
		 * Add a listener that starts streaming when the button is selected
		 */
		btnStartStreaming.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(roverPlatformClient != null) {
					Job startStreamingJob = new StartStreamingJob();

					startStreamingJob.schedule();
					// Disable the start button and enable the stop button
					btnStartStreaming.setEnabled(false);
					btnStopStreaming.setEnabled(true);
				}
			}
		});

		btnStopStreaming = new Button(compositeCamera, SWT.NONE);
		btnStopStreaming.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		formToolKit.adapt(btnStopStreaming, true, true);
		btnStopStreaming.setText("Stop Streaming");
		btnStopStreaming.setEnabled(false);
		/**
		 * Add a listener that stops streaming when the button is selected
		 */
		btnStopStreaming.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (roverPlatformClient != null) {
					Job stopStreamingJob = new StopStreamingJob();

					stopStreamingJob.schedule();
					
					// Disable the stop button and enable the start button
					btnStartStreaming.setEnabled(true);
					btnStopStreaming.setEnabled(false);
				}
			}
		});
		sctnPowerLevels = formToolKit.createSection(this, Section.TITLE_BAR);
		GridData gd_sctnPowerLevels = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
		gd_sctnPowerLevels.widthHint = 115;
		sctnPowerLevels.setLayoutData(gd_sctnPowerLevels);
		formToolKit.paintBordersFor(sctnPowerLevels);
		sctnPowerLevels.setText("Power levels");

		compositePowerLevels = new Composite(sctnPowerLevels, SWT.NONE);
		formToolKit.adapt(compositePowerLevels);
		formToolKit.paintBordersFor(compositePowerLevels);
		sctnPowerLevels.setClient(compositePowerLevels);
		GridLayout gl_compositePowerLevels = new GridLayout(4, false);
		compositePowerLevels.setLayout(gl_compositePowerLevels);

		lblLeftText = new Label(compositePowerLevels, SWT.RIGHT);
		lblLeftText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		lblLeftText.setText("Left");

		txtPowerLeft = formToolKit.createText(compositePowerLevels, "New Text", SWT.CENTER);
		txtPowerLeft.setEditable(false);
		txtPowerLeft.setText(" 0.000");
		GridData gd_txtPowerLeft = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
		gd_txtPowerLeft.widthHint = 51;
		txtPowerLeft.setLayoutData(gd_txtPowerLeft);

		label = new Label(compositePowerLevels, SWT.CENTER);
		label.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		formToolKit.adapt(label, true, true);
		label.setText("/");

		lblPowerMaxLeft = new Label(compositePowerLevels, SWT.NONE);
		GridData gd_lblPowerMaxLeft = new GridData(SWT.CENTER, SWT.CENTER, true, false, 1, 1);
		gd_lblPowerMaxLeft.widthHint = 45;
		lblPowerMaxLeft.setLayoutData(gd_lblPowerMaxLeft);
		formToolKit.adapt(lblPowerMaxLeft, true, true);
		lblPowerMaxLeft.setText(" 0.000");

		lblRightText = new Label(compositePowerLevels, SWT.HORIZONTAL | SWT.RIGHT);
		lblRightText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		lblRightText.setText("Right");

		txtPowerRight = formToolKit.createText(compositePowerLevels, "New Text", SWT.CENTER);
		txtPowerRight.setEditable(false);
		txtPowerRight.setText(" 0.000");
		GridData gd_txtPowerRight = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
		gd_txtPowerRight.widthHint = 44;
		txtPowerRight.setLayoutData(gd_txtPowerRight);

		label_1 = new Label(compositePowerLevels, SWT.CENTER);
		label_1.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		formToolKit.adapt(label_1, true, true);
		label_1.setText("/");

		lblPowerMaxRight = new Label(compositePowerLevels, SWT.NONE);
		lblPowerMaxRight.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		formToolKit.adapt(lblPowerMaxRight, true, true);
		lblPowerMaxRight.setText(" 0.000");

		sctnSonar = formToolKit.createSection(this, Section.TITLE_BAR);
		GridData gd_sctnSonar = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
		gd_sctnSonar.widthHint = 114;
		sctnSonar.setLayoutData(gd_sctnSonar);
		formToolKit.paintBordersFor(sctnSonar);
		sctnSonar.setText("Sonar");

		compositeSonar = new Composite(sctnSonar, SWT.NONE);
		formToolKit.adapt(compositeSonar);
		formToolKit.paintBordersFor(compositeSonar);
		sctnSonar.setClient(compositeSonar);
		compositeSonar.setLayout(new GridLayout(2, false));

		lblSonarLevelText = new Label(compositeSonar, SWT.NONE);
		lblSonarLevelText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		lblSonarLevelText.setText("Level");

		txtSonar = formToolKit.createText(compositeSonar, "New Text", SWT.CENTER);
		txtSonar.setText("000");
		txtSonar.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));

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
		
		/** Data binding for the position */
		IObservableValue observeTxtXObserveWidget = WidgetProperties.text().observe(txtX);
		IObservableValue observeTxtYObserveWidget = WidgetProperties.text().observe(txtY);
		IObservableValue observeTxtThetaObserveWidget = WidgetProperties.text().observe(txtTheta);
		IObservableValue PositionRoverPlatformClientgetPositionObserveValue = EMFProperties.value(Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT__POSITION).observeDetail(roverPlatformClientBinder);
		m_bindingContext.bindValue(observeTxtXObserveWidget, PositionRoverPlatformClientgetPositionObserveValue, 
				null,
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE).setConverter(new Converter(Position.class, String.class) 
				{
					@Override
					public Object convert(Object arg0) {
						return String.format(" %1$.3f m", ((Position)arg0).getX());
					}
				}));
		m_bindingContext.bindValue(observeTxtYObserveWidget, PositionRoverPlatformClientgetPositionObserveValue, 
				null,
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE).setConverter(new Converter(Position.class, String.class) 
				{
					@Override
					public Object convert(Object arg0) {
						return String.format(" %1$.3f m", ((Position)arg0).getY());
					}
				}));
		m_bindingContext.bindValue(observeTxtThetaObserveWidget, PositionRoverPlatformClientgetPositionObserveValue, 
				null,
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE).setConverter(new Converter(Position.class, String.class) 
				{
					@Override
					public Object convert(Object arg0) {
						if(((Position)arg0).getTheta() >= 0){
							return String.format(" %1$.3f " + DEGREE_SYM, (Math.toDegrees(((Position)arg0).getTheta()))%360);
						}else{
							return String.format(" %1$.3f " + DEGREE_SYM, 360 + (Math.toDegrees(((Position)arg0).getTheta()))%360);
						}
						
					}
				}));
		

		/** Data binding for the wheel powers */
		IObservableValue observeTxtPowerLeftObserveWidget = WidgetProperties.text().observe(txtPowerLeft);
		IObservableValue xRoverPlatformClientgetLeftPowerObserveValue = EMFProperties.value(Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT__LEFT_POWER_LEVEL).observeDetail(roverPlatformClientBinder);
		m_bindingContext.bindValue(observeTxtPowerLeftObserveWidget, xRoverPlatformClientgetLeftPowerObserveValue, null, new DoubleToStringUpdateValueStrategy());
		
		IObservableValue observeTxtPowerRightObserveWidget = WidgetProperties.text().observe(txtPowerRight);
		IObservableValue xRoverPlatformClientgetRightPowerObserveValue = EMFProperties.value(Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT__RIGHT_POWER_LEVEL).observeDetail(roverPlatformClientBinder);
		m_bindingContext.bindValue(observeTxtPowerRightObserveWidget, xRoverPlatformClientgetRightPowerObserveValue, null, new DoubleToStringUpdateValueStrategy());
		
		IObservableValue observeTextLblPowerMaxLeftObserveWidget = WidgetProperties.text().observe(lblPowerMaxLeft);
		IObservableValue observeTextLblPowerMaxRightObserveWidget = WidgetProperties.text().observe(lblPowerMaxRight);		
		IObservableValue xRoverPlatformClientgetPowerMaxObserveValue = EMFProperties.value(Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT__MAX_POWER_LEVEL).observeDetail(roverPlatformClientBinder);
		m_bindingContext.bindValue(observeTextLblPowerMaxLeftObserveWidget, xRoverPlatformClientgetPowerMaxObserveValue, null, new DoubleToStringUpdateValueStrategy());
		m_bindingContext.bindValue(observeTextLblPowerMaxRightObserveWidget, xRoverPlatformClientgetPowerMaxObserveValue, null, new DoubleToStringUpdateValueStrategy());

		/** Data binding for the sonar */
		IObservableValue observeTxtSonarObserveWidget = WidgetProperties.text().observe(txtSonar);
		IObservableValue xRoverPlatformClientgetSonarLevelObserveValue = EMFProperties.value(Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_SONAR).observeDetail(roverPlatformClientBinder);
		m_bindingContext.bindValue(observeTxtSonarObserveWidget, xRoverPlatformClientgetSonarLevelObserveValue, 
				null,
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE).setConverter(new Converter(Integer.class, String.class) 
				{
					@Override
					public Object convert(Object arg0) {
						return Integer.toString((Integer)arg0);
					}
				}));
		
		/** Data binding to know if the platform client is initialized*/
		IObservableValue observeTextTxtStatusObserveWidget = WidgetProperties.text().observe(txtStatus);
		IObservableValue xRoverPlatformClientInitializedLevelObserveValue = EMFProperties.value(Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT__INITIALIZED).observeDetail(roverPlatformClientBinder);
		m_bindingContext.bindValue(observeTextTxtStatusObserveWidget, xRoverPlatformClientInitializedLevelObserveValue, 
				null,
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE).setConverter(new Converter(Boolean.class, String.class) 
				{
					@Override
					public Object convert(Object arg0) {
						return ((Boolean)arg0).booleanValue() ?  READY_STR : NOT_READY_STR;
					}
				}));
		
		/** Data binding to know if the platform client is disposed*/
		IObservableValue xRoverPlatformClientDisposedLevelObserveValue = EMFProperties.value(Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT__DISPOSED).observeDetail(roverPlatformClientBinder);
		m_bindingContext.bindValue(observeTextTxtStatusObserveWidget, xRoverPlatformClientDisposedLevelObserveValue,
				null,
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE).setConverter(new Converter(Boolean.class, String.class)
				{
					@Override
					public Object convert(Object arg0) {
						return ((Boolean)arg0).booleanValue() ?  DISPOSED_STR : NOT_READY_STR;
				}
				}));
		
		/** Data binding for the streaming*/
		IObservableValue observeEnabledStartStreamingObserveWidget = WidgetProperties.enabled().observe(btnStartStreaming);
		IObservableValue observeEnabledStopStreamingObserveWidget = WidgetProperties.enabled().observe(btnStartStreaming);
		IObservableValue xRoverCameraStreamingEnabledObserveValue = EMFProperties.value(Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_CAMERA).observeDetail(roverPlatformClientBinder);
		m_bindingContext.bindValue(observeEnabledStartStreamingObserveWidget, xRoverCameraStreamingEnabledObserveValue, 
				null,
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE).setConverter(new Converter(PolarSysCamera.class, Boolean.class) 
				{
					@Override
					public Object convert(Object arg0) {
						return ((PolarSysCamera)arg0).isStreamingEnabled()?  false : true;
					}
				}));
		m_bindingContext.bindValue(observeEnabledStopStreamingObserveWidget, xRoverCameraStreamingEnabledObserveValue, 
				null,
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE).setConverter(new Converter(PolarSysCamera.class, Boolean.class) 
				{
					@Override
					public Object convert(Object arg0) {
						return ((PolarSysCamera)arg0).isStreamingEnabled()?  true : false;
					}
				}));
		
		return m_bindingContext;
	}
	
	/**
	 * This class is used to convert a double to a string 
	 */
	private class DoubleToStringUpdateValueStrategy extends UpdateValueStrategy
	{
		public DoubleToStringUpdateValueStrategy()
		{
			setConverter(new Converter(double.class, String.class)
			{
				@Override
				/**
				 * @return A string with the first three decimals of the orignal double
				 */
				public Object convert(Object arg0)
				{
					return String.format(" %1$.3f", ((Double)arg0));
				}				
			});
		}
	}

	/**
	 * This class is used to create a job to move the platform forward
	 */
	public class FrontJob extends Job
	{
		public FrontJob()
		{
			super("Plateform, move forward");
			
			setSystem(true);
		}

		@Override
		public IStatus run(IProgressMonitor arg0)
		{
			try
			{
				roverPlatformClient.cmdPowerLevel(roverPlatformClient.getMaxCtrPowerLevel() * speedLevel / SPEED_LEVEL_MAX, 
													roverPlatformClient.getMaxCtrPowerLevel() * speedLevel / SPEED_LEVEL_MAX);
			}
			catch (Exception ex)
			{
				ex.printStackTrace();
			}
				
			return Status.OK_STATUS;
		}					
	}
	
	/**
	 * This class is used to create a job to move the platform backward
	 */
	public class BackJob extends Job
	{
		public BackJob()
		{
			super("Plateform, move backward");
			
			setSystem(true);
		}

		@Override
		public IStatus run(IProgressMonitor arg0)
		{
			try
			{
				roverPlatformClient.cmdPowerLevel(-roverPlatformClient.getMaxCtrPowerLevel() * speedLevel / SPEED_LEVEL_MAX, 
													-roverPlatformClient.getMaxCtrPowerLevel() * speedLevel / SPEED_LEVEL_MAX);
			}
			catch (Exception ex)
			{
				ex.printStackTrace();
			}
				
			return Status.OK_STATUS;
		}					
	}
	
	/**
	 * This class is used to create a job to turn the platform left
	 */
	public class LeftJob extends Job
	{
		public LeftJob()
		{
			super("Plateform, turn left");
			
			setSystem(true);
		}

		@Override
		public IStatus run(IProgressMonitor arg0)
		{
			try
			{
				roverPlatformClient.cmdPowerLevel(-roverPlatformClient.getMaxCtrPowerLevel() * speedLevel / SPEED_LEVEL_MAX,
													roverPlatformClient.getMaxCtrPowerLevel() * speedLevel / SPEED_LEVEL_MAX);
			}
			catch (Exception ex)
			{
				ex.printStackTrace();
			}
				
			return Status.OK_STATUS;
		}					
	}
	
	/**
	 * This class is used to create a job to turn the platform right
	 */
	public class RightJob extends Job
	{
		public RightJob()
		{
			super("Plateform, turn right");
			
			setSystem(true);
		}

		@Override
		public IStatus run(IProgressMonitor arg0)
		{
			try
			{
				roverPlatformClient.cmdPowerLevel(roverPlatformClient.getMaxCtrPowerLevel() * speedLevel / SPEED_LEVEL_MAX, 
													-roverPlatformClient.getMaxCtrPowerLevel() * speedLevel / SPEED_LEVEL_MAX);
			}
			catch (Exception ex)
			{
				ex.printStackTrace();
			}
				
			return Status.OK_STATUS;
		}					
	}
	
	/**
	 * This class is used to create a job to stop the platform
	 */
	public class StopJob extends Job
	{
		public StopJob()
		{
			super("Plateform, stop");
			
			setSystem(true);
		}

		@Override
		public IStatus run(IProgressMonitor arg0)
		{
			try
			{
				roverPlatformClient.cmdPowerLevel(0, 0);
			}
			catch (Exception ex)
			{
				ex.printStackTrace();
			}
				
			return Status.OK_STATUS;
		}					
	}
	
	/**
	 * This class is used to create a job to initialize the platform
	 */
	public class InitJob extends Job
	{
		public InitJob()
		{
			super("Initialize platform");
			
			setSystem(true);
		}

		@Override
		public IStatus run(IProgressMonitor arg0)
		{
			try
			{
				roverPlatformClient.init();
			}
			catch (Exception ex)
			{
				ex.printStackTrace();
			}
				
			new Timer().scheduleAtFixedRate(new TimerTask(){
				@Override
				public void run() {
					if(roverPlatformClient != null){
						roverPlatformClient.setFrontSonar((int) (Math.random() * 100));
					}
				}	
			}, 500, 1000);
			return Status.OK_STATUS;
		}					
	}
	
	/**
	 * This class is used to create a job to dispose the platform
	 */
	public class DisposeJob extends Job
	{
		public DisposeJob()
		{
			super("Dispose platform");
			
			setSystem(true);
		}

		@Override
		public IStatus run(IProgressMonitor arg0)
		{
			try
			{
				roverPlatformClient.dispose();
			}
			catch (Exception ex)
			{
				ex.printStackTrace();
			}
				
			return Status.OK_STATUS;
		}					
	}
	
	/**
	 * This class is used to create a job to take a snapshot with the camera
	 */
	public class TakeSnapshotJob extends Job
	{
		public TakeSnapshotJob()
		{
			super("Take a snapshot");
			
			setSystem(true);
		}

		@Override
		public IStatus run(IProgressMonitor arg0)
		{
			try
			{
				roverPlatformClient.getFrontCamera().takeSnapshot();
			}
			catch (Exception ex)
			{
				ex.printStackTrace();
			}
				
			return Status.OK_STATUS;
		}					
	}
	
	/**
	 * This class is used to create a job to start streaming with the camera
	 */
	public class StartStreamingJob extends Job
	{
		public StartStreamingJob ()
		{
			super("Start streaming");
			
			setSystem(true);
		}

		@Override
		public IStatus run(IProgressMonitor arg0)
		{
			try
			{
				roverPlatformClient.getFrontCamera().commandStreaming(true);
			}
			catch (Exception ex)
			{
				ex.printStackTrace();
			}
				
			return Status.OK_STATUS;
		}					
	}
	
	/**
	 * This class is used to create a job to stop streaming with the camera
	 */
	public class StopStreamingJob extends Job
	{
		public StopStreamingJob ()
		{
			super("Stop streaming");
			
			setSystem(true);
		}

		@Override
		public IStatus run(IProgressMonitor arg0)
		{
			try
			{
				roverPlatformClient.getFrontCamera().commandStreaming(false);
			}
			catch (Exception ex)
			{
				ex.printStackTrace();
			}
				
			return Status.OK_STATUS;
		}					
	}
}

