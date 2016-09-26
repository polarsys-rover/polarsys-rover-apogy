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
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
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
	
	private final FormToolkit formToolKit = new FormToolkit(Display.getDefault());
	private WritableValue roverPlatformClientBinder;
	private WritableValue cameraBinder; // FIXIME
	
	
	public int speedLevel = SPEED_LEVEL_MAX;
	
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
	private Composite compositeDirection;
	private Composite compositeStatus;
	private Text txtStatus;
	private Label lblSpeed;
	private Composite composite;
	private Composite compositeSpeed;
	private Text txtSonar;
	private Scale scaleSpeed;
	private Label labelOn1;
	private Label labelOn2;
	private Section sctnCamera;
	private Composite compositeCamera;
	private Button btnStartStreaming;
	private Button btnStopStreaming;
	private Button btnTakeSnapshot;
	private Section sctnControls;
	private Composite composite_1;
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
		setLayout(new GridLayout(3, false));
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);

		sctnControls = formToolKit.createSection(this, Section.TITLE_BAR);
		sctnControls.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 2));
		formToolKit.paintBordersFor(sctnControls);
		sctnControls.setText("Controls");
		sctnControls.setExpanded(true);

		composite_1 = new Composite(sctnControls, SWT.NONE);
		formToolKit.adapt(composite_1);
		formToolKit.paintBordersFor(composite_1);
		sctnControls.setClient(composite_1);
		composite_1.setLayout(new GridLayout(1, false));

		composite = new Composite(composite_1, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		formToolKit.adapt(composite);
		formToolKit.paintBordersFor(composite);
		composite.setLayout(new GridLayout(3, false));

		compositeStatus = formToolKit.createComposite(composite, SWT.BORDER);
		GridData gd_compositeStatus = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
		gd_compositeStatus.widthHint = 200;
		compositeStatus.setLayoutData(gd_compositeStatus);
		formToolKit.paintBordersFor(compositeStatus);
		GridLayout gl_compositeStatus = new GridLayout(2, false);
		compositeStatus.setLayout(gl_compositeStatus);
		new Label(compositeStatus, SWT.NONE);
		new Label(compositeStatus, SWT.NONE);

		Button btnStart = formToolKit.createButton(compositeStatus, "Start", SWT.NONE);
		GridData gd_btnStart = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
		gd_btnStart.widthHint = 50;
		btnStart.setLayoutData(gd_btnStart);
		btnStart.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e)  {
				if (!((PolarSysRoverPlatformClient) roverPlatformClientBinder.getValue()).equals(null)) {
					CustomJob initJob = new CustomJob("initJob"){						
						PolarSysRoverPlatformClient roverPlatformClient = getPolarSysRoverPlatformClient();
						@Override
						protected void execute() {
							roverPlatformClient.init();											
						}
					};
					initJob.schedule();
				}
			}
		});

		Button btnStop = formToolKit.createButton(compositeStatus, "Stop", SWT.NONE);
		GridData gd_btnStop = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
		gd_btnStop.widthHint = 50;
		btnStop.setLayoutData(gd_btnStop);
		btnStop.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (!((PolarSysRoverPlatformClient) roverPlatformClientBinder.getValue()).equals(null)) {
					CustomJob disposeJob = new CustomJob("disposeJob") {
						PolarSysRoverPlatformClient roverPlatformClient = getPolarSysRoverPlatformClient();

						@Override
						protected void execute() {
							roverPlatformClient.dispose();
						}
					};
					disposeJob.schedule();
				}
			}
		});

		txtStatus = formToolKit.createText(compositeStatus, "New Text", SWT.CENTER);
		txtStatus.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		txtStatus.setText("Status");
		GridData gd_txtStatus = new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1);
		gd_txtStatus.widthHint = 100;
		txtStatus.setLayoutData(gd_txtStatus);
		
		compositeDirection = new Composite(composite, SWT.BORDER);
		GridData gd_compositeDirection = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
		gd_compositeDirection.widthHint = 250;
		compositeDirection.setLayoutData(gd_compositeDirection);
		formToolKit.adapt(compositeDirection);
		formToolKit.paintBordersFor(compositeDirection);
		GridLayout gl_compositeDirection = new GridLayout(3, false);
		gl_compositeDirection.marginWidth = 10;
		compositeDirection.setLayout(gl_compositeDirection);
		new Label(compositeDirection, SWT.NONE);

		Button btnFront = new Button(compositeDirection, SWT.NONE);
		GridData gd_btnFront = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_btnFront.widthHint = 45;
		btnFront.setLayoutData(gd_btnFront);
		formToolKit.adapt(btnFront, true, true);
		btnFront.setText("Front");
				
		btnFront.addMouseListener(new MouseListener() {

			@Override
			public void mouseUp(MouseEvent e) {
				if (getPolarSysRoverPlatformClient() != null)
					if (!((PolarSysRoverPlatformClient) roverPlatformClientBinder.getValue()).equals(null)) {
						StopJob stopJob = new StopJob();
						stopJob.schedule();
					}
			}

			@Override
			public void mouseDown(MouseEvent e) {
				if (!((PolarSysRoverPlatformClient) roverPlatformClientBinder.getValue()).equals(null)) {
					CustomJob frontJob = new CustomJob("frontJob") {
						PolarSysRoverPlatformClient roverPlatformClient = getPolarSysRoverPlatformClient();

						@Override
						protected void execute() {
							roverPlatformClient.cmdPowerLevel(
									roverPlatformClient.getMaxCtrPowerLevel() * speedLevel / SPEED_LEVEL_MAX,
									roverPlatformClient.getMaxCtrPowerLevel() * speedLevel / SPEED_LEVEL_MAX);
						}
					};
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
		gd_btnLeft.widthHint = 45;
		btnLeft.setLayoutData(gd_btnLeft);
		formToolKit.adapt(btnLeft, true, true);
		btnLeft.setText("Left");
		btnLeft.addMouseListener(new MouseListener() {

			@Override
			public void mouseUp(MouseEvent e) {
				if (!((PolarSysRoverPlatformClient) roverPlatformClientBinder.getValue()).equals(null)) {
					StopJob stopJob = new StopJob();
					stopJob.schedule();
				}
			}

			@Override
			public void mouseDown(MouseEvent e) {
				if (!((PolarSysRoverPlatformClient) roverPlatformClientBinder.getValue()).equals(null)) {
					CustomJob leftJob = new CustomJob("leftJob") {
						PolarSysRoverPlatformClient roverPlatformClient = getPolarSysRoverPlatformClient();
						@Override
						protected void execute() {
							roverPlatformClient.cmdPowerLevel(-roverPlatformClient.getMaxCtrPowerLevel() * speedLevel / SPEED_LEVEL_MAX, 
									roverPlatformClient.getMaxCtrPowerLevel() * speedLevel / SPEED_LEVEL_MAX);
						}
					};
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
		gd_btnRight.widthHint = 45;
		btnRight.setLayoutData(gd_btnRight);
		formToolKit.adapt(btnRight, true, true);
		btnRight.setText("Right");
		btnRight.addMouseListener(new MouseListener() {

			@Override
			public void mouseUp(MouseEvent e) {
				if (!((PolarSysRoverPlatformClient) roverPlatformClientBinder.getValue()).equals(null)) {
					Job stopJob = new StopJob();

					stopJob.schedule();
				}
			}

			@Override
			public void mouseDown(MouseEvent e) {
				if (!((PolarSysRoverPlatformClient) roverPlatformClientBinder.getValue()).equals(null)) {
					CustomJob rightJob = new CustomJob("rightJob") {
						PolarSysRoverPlatformClient roverPlatformClient = getPolarSysRoverPlatformClient();
						@Override
						protected void execute() {
							roverPlatformClient.cmdPowerLevel(roverPlatformClient.getMaxCtrPowerLevel() * speedLevel / SPEED_LEVEL_MAX, 
									-roverPlatformClient.getMaxCtrPowerLevel() * speedLevel / SPEED_LEVEL_MAX);
						}
					};
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
		gd_btnBack.widthHint = 45;
		btnBack.setLayoutData(gd_btnBack);
		formToolKit.adapt(btnBack, true, true);
		btnBack.setText("Back");
		btnBack.addMouseListener(new MouseListener() {

			@Override
			public void mouseUp(MouseEvent e) {
				if (!((PolarSysRoverPlatformClient) roverPlatformClientBinder.getValue()).equals(null)) {
					Job stopJob = new StopJob();

					stopJob.schedule();
				}
			}

			@Override
			public void mouseDown(MouseEvent e) {
				if (!((PolarSysRoverPlatformClient) roverPlatformClientBinder.getValue()).equals(null)) {
					CustomJob backJob = new CustomJob("backJob") {
						PolarSysRoverPlatformClient roverPlatformClient = getPolarSysRoverPlatformClient();
						@Override
						protected void execute() {
							roverPlatformClient.cmdPowerLevel(-roverPlatformClient.getMaxCtrPowerLevel() * speedLevel / SPEED_LEVEL_MAX, 
									-roverPlatformClient.getMaxCtrPowerLevel() * speedLevel / SPEED_LEVEL_MAX);
						}
					};
					backJob.schedule();
				}
			}

			@Override
			public void mouseDoubleClick(MouseEvent e) {
			}
		});
		new Label(compositeDirection, SWT.NONE);

		compositeSpeed = new Composite(composite, SWT.NONE);
		GridData gd_compositeSpeed = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
		gd_compositeSpeed.minimumWidth = 50;
		compositeSpeed.setLayoutData(gd_compositeSpeed);
		formToolKit.adapt(compositeSpeed);
		formToolKit.paintBordersFor(compositeSpeed);
		compositeSpeed.setLayout(new GridLayout(1, false));

		lblSpeed = new Label(compositeSpeed, SWT.CENTER);
		GridData gd_lblSpeed = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
		gd_lblSpeed.minimumWidth = 30;
		lblSpeed.setLayoutData(gd_lblSpeed);
		lblSpeed.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		formToolKit.adapt(lblSpeed, true, true);
		lblSpeed.setText("Speed");

		scaleSpeed = new Scale(compositeSpeed, SWT.VERTICAL);
		scaleSpeed.setMaximum(SPEED_LEVEL_MAX);
		scaleSpeed.setMinimum(0);
		GridData gd_scaleSpeed = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
		gd_scaleSpeed.minimumWidth = 30;
		gd_scaleSpeed.heightHint = 80;
		scaleSpeed.setLayoutData(gd_scaleSpeed);
		formToolKit.adapt(scaleSpeed, true, true);
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
		lblX.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));

		txtX = formToolKit.createText(compositePosition, "New Text", SWT.CENTER);
		txtX.setEditable(false);
		GridData gd_txtX = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
		gd_txtX.widthHint = 40;
		txtX.setLayoutData(gd_txtX);
		txtX.setText(" 0.000 m");

		lblY = formToolKit.createLabel(compositePosition, "Y:", SWT.RIGHT);
		lblY.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));

		txtY = formToolKit.createText(compositePosition, "New Text", SWT.CENTER);
		txtY.setEditable(false);
		txtY.setText(" 0.000 m");
		GridData gd_txtY = new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1);
		gd_txtY.widthHint = 40;
		txtY.setLayoutData(gd_txtY);

		lblTheta = formToolKit.createLabel(compositePosition, "Theta:", SWT.RIGHT);
		lblTheta.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));

		txtTheta = formToolKit.createText(compositePosition, "New Text", SWT.CENTER);
		txtTheta.setEditable(false);
		txtTheta.setText(" 0.000" + DEGREE_SYM);
		GridData gd_txtTheta = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
		gd_txtTheta.widthHint = 40;
		txtTheta.setLayoutData(gd_txtTheta);
		new Label(compositePosition, SWT.NONE);
		new Label(compositePosition, SWT.NONE);

		sctnCamera = formToolKit.createSection(this, Section.TITLE_BAR);
		GridData gd_sctnCamera = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
		gd_sctnCamera.minimumWidth = 110;
		sctnCamera.setLayoutData(gd_sctnCamera);
		formToolKit.paintBordersFor(sctnCamera);
		sctnCamera.setText("Camera");

		compositeCamera = new Composite(sctnCamera, SWT.NONE);
		formToolKit.adapt(compositeCamera);
		formToolKit.paintBordersFor(compositeCamera);
		sctnCamera.setClient(compositeCamera);
		compositeCamera.setLayout(new GridLayout(1, false));

		btnTakeSnapshot = new Button(compositeCamera, SWT.NONE);
		GridData gd_btnTakeSnapshot = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
		gd_btnTakeSnapshot.widthHint = 100;
		btnTakeSnapshot.setLayoutData(gd_btnTakeSnapshot);
		formToolKit.adapt(btnTakeSnapshot, true, true);
		btnTakeSnapshot.setText("Take Snapshot");
		btnTakeSnapshot.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (!((PolarSysRoverPlatformClient) roverPlatformClientBinder.getValue()).equals(null)) {
					CustomJob takeSnapshotJob = new CustomJob("takeSnapshotJob") {
						PolarSysRoverPlatformClient roverPlatformClient = getPolarSysRoverPlatformClient();

						@Override
						protected void execute() {
							roverPlatformClient.getFrontCamera().takeSnapshot();
						}
					};
					takeSnapshotJob.schedule();

				}
			}
		});

		btnStartStreaming = new Button(compositeCamera, SWT.NONE);
		btnStartStreaming.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		btnStartStreaming.setEnabled(true);
		formToolKit.adapt(btnStartStreaming, true, true);
		btnStartStreaming.setText("Start Streaming");
		btnStartStreaming.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (!((PolarSysRoverPlatformClient) roverPlatformClientBinder.getValue()).equals(null)) {
					CustomJob startStreamingJob = new CustomJob("startStreamingJob") {
						PolarSysRoverPlatformClient roverPlatformClient = getPolarSysRoverPlatformClient();

						@Override
						protected void execute() {
							roverPlatformClient.getFrontCamera().commandStreaming(true);
						}
					};
					startStreamingJob.schedule();
				}
			}
		});

		btnStopStreaming = new Button(compositeCamera, SWT.NONE);
		btnStopStreaming.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		formToolKit.adapt(btnStopStreaming, true, true);
		btnStopStreaming.setText("Stop Streaming");
		btnStopStreaming.setEnabled(false);
		btnStopStreaming.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (!((PolarSysRoverPlatformClient) roverPlatformClientBinder.getValue()).equals(null)) {
					CustomJob stopStreamingJob = new CustomJob("stopStreamingJob") {
						PolarSysRoverPlatformClient roverPlatformClient = getPolarSysRoverPlatformClient();

						@Override
						protected void execute() {
							roverPlatformClient.getFrontCamera().commandStreaming(false);
						}
					};
					stopStreamingJob.schedule();
				}
			}
		});
		sctnPowerLevels = formToolKit.createSection(this, Section.TITLE_BAR);
		GridData gd_sctnPowerLevels = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
		gd_sctnPowerLevels.minimumWidth = 160;
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
		gd_txtPowerLeft.widthHint = 40;
		txtPowerLeft.setLayoutData(gd_txtPowerLeft);

		labelOn1 = new Label(compositePowerLevels, SWT.CENTER);
		labelOn1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		formToolKit.adapt(labelOn1, true, true);
		labelOn1.setText("/");

		lblPowerMaxLeft = new Label(compositePowerLevels, SWT.NONE);
		GridData gd_lblPowerMaxLeft = new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1);
		gd_lblPowerMaxLeft.widthHint = 40;
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
		gd_txtPowerRight.widthHint = 40;
		txtPowerRight.setLayoutData(gd_txtPowerRight);

		labelOn2 = new Label(compositePowerLevels, SWT.CENTER);
		labelOn2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		formToolKit.adapt(labelOn2, true, true);
		labelOn2.setText("/");

		lblPowerMaxRight = new Label(compositePowerLevels, SWT.NONE);
		GridData gd_lblPowerMaxRight = new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1);
		gd_lblPowerMaxRight.widthHint = 40;
		lblPowerMaxRight.setLayoutData(gd_lblPowerMaxRight);
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
		if (!roverPlatformClient.equals(getPolarSysRoverPlatformClient())
				|| (getPolarSysRoverPlatformClient() == (null) && roverPlatformClient != null)) {
			this.roverPlatformClientBinder.setValue(roverPlatformClient);
			this.cameraBinder.setValue(roverPlatformClient.getFrontCamera()); // FIXME 
		}
	}	
	
	/**
	 * Returns the actual {@link PolarSysRoverPlatformClient} controlled by this composite.
	 * 
	 * @return Reference to the PolarSysRoverPlatformClient
	 */
	public PolarSysRoverPlatformClient getPolarSysRoverPlatformClient()
	{
		if(roverPlatformClientBinder != null){	
			return ((PolarSysRoverPlatformClient) roverPlatformClientBinder.getValue());
		}else{
			return null;
		}
		
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
		cameraBinder = new WritableValue(); 

		/** Data binding for the position */
		IObservableValue observeTxtXObserveWidget = WidgetProperties.text().observe(txtX);
		IObservableValue observeTxtYObserveWidget = WidgetProperties.text().observe(txtY);
		IObservableValue observeTxtThetaObserveWidget = WidgetProperties.text().observe(txtTheta);
		IObservableValue PositionRoverPlatformClientgetPositionObserveValue = EMFProperties.value(Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT__POSITION).observeDetail(roverPlatformClientBinder);
		m_bindingContext.bindValue(observeTxtXObserveWidget, PositionRoverPlatformClientgetPositionObserveValue, null,
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE)
						.setConverter(new Converter(Position.class, String.class) {
							@Override
							public Object convert(Object arg0) {
								if (arg0 != null) {
									return String.format(" %1$.3f m", ((Position) arg0).getX());
								} else {
									return " 0.000 m";
								}

							}
						}));
		m_bindingContext.bindValue(observeTxtYObserveWidget, PositionRoverPlatformClientgetPositionObserveValue, null,
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE)
						.setConverter(new Converter(Position.class, String.class) {
							@Override
							public Object convert(Object arg0) {
								if (arg0 != null) {
									return String.format(" %1$.3f m", ((Position) arg0).getY());
								} else {
									return " 0.000 m";
								}
							}
						}));
		m_bindingContext.bindValue(observeTxtThetaObserveWidget, PositionRoverPlatformClientgetPositionObserveValue,
				null, new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE)
						.setConverter(new Converter(Position.class, String.class) {
							@Override
							public Object convert(Object arg0) {
								if (arg0 != null) {
									if (((Position) arg0).getTheta() >= 0) {
										return String.format(" %1$.3f " + DEGREE_SYM,
												(Math.toDegrees(((Position) arg0).getTheta())) % 360);
									} else {
										return String.format(" %1$.3f " + DEGREE_SYM,
												360 + (Math.toDegrees(((Position) arg0).getTheta())) % 360);
									}
								}else{
									return " 0.000" + DEGREE_SYM;
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
						if(arg0 != null){
							return Integer.toString((Integer)arg0);
						}else{
							return "0";
						}
						
					}
				}));
		
		/** Data binding to know the status of the platform client*/
		IObservableValue observeTextTxtStatusObserveWidget = WidgetProperties.text().observe(txtStatus);
		IObservableValue observeBackgroundTxtStatusObserveWidget = WidgetProperties.background().observe(txtStatus);
		IObservableValue observeForegroundTxtStatusObserveWidget = WidgetProperties.foreground().observe(txtStatus);
		IObservableValue xRoverPlatformClientInitializedObserveValue = EMFProperties.value(Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT__INITIALIZED).observeDetail(roverPlatformClientBinder);

		// Binding to know if the platform is initialized
		m_bindingContext.bindValue(observeTextTxtStatusObserveWidget, xRoverPlatformClientInitializedObserveValue, 
				null,
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE).setConverter(new Converter(Boolean.class, String.class) 
				{
					@Override
					public Object convert(Object arg0) {
						if(((Boolean)arg0).booleanValue() == true){
							cameraBinder.setValue(((PolarSysRoverPlatformClient)roverPlatformClientBinder.getValue()).getFrontCamera());
						}// FIXME 
						return ((Boolean)arg0).booleanValue() ?  READY_STR : NOT_READY_STR;
					}
				}));
		m_bindingContext.bindValue(observeBackgroundTxtStatusObserveWidget, xRoverPlatformClientInitializedObserveValue,
				null,
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE).setConverter(new Converter(Boolean.class, Color.class) {
					
					@Override
					public Object convert(Object fromObject) {
						return ((Boolean)fromObject).booleanValue() ? SWTResourceManager.getColor(SWT.COLOR_GREEN) : SWTResourceManager.getColor(SWT.COLOR_RED);
					}
				}));
		
		
		// Binding to know if the platform is disposed
		IObservableValue observeThisEnabledObserveWidget = WidgetProperties.enabled().observe(this);
		IObservableValue xRoverPlatformClientDisposedLevelObserveValue = EMFProperties
				.value(Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT__DISPOSED).observeDetail(roverPlatformClientBinder);
		m_bindingContext.bindValue(observeThisEnabledObserveWidget, xRoverPlatformClientDisposedLevelObserveValue, null,
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE)
						.setConverter(new Converter(Boolean.class, Boolean.class) {
							@Override
							public Object convert(Object arg0) {
								return !(((Boolean) arg0).booleanValue());
							}
						}));
		m_bindingContext.bindValue(observeTextTxtStatusObserveWidget, xRoverPlatformClientDisposedLevelObserveValue, 
				null,
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE).setConverter(new Converter(Boolean.class, String.class) 
				{
					@Override
					public Object convert(Object arg0) {
						return ((Boolean)arg0).booleanValue() ?  DISPOSED_STR : txtStatus.getText();
					}
				}));
		m_bindingContext.bindValue(observeBackgroundTxtStatusObserveWidget, xRoverPlatformClientDisposedLevelObserveValue,
				null,
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE).setConverter(new Converter(Boolean.class, Color.class) {
					
					@Override
					public Object convert(Object fromObject) {
						return ((Boolean)fromObject).booleanValue() ? SWTResourceManager.getColor(SWT.COLOR_DARK_RED) : txtStatus.getBackground();
					}
				}));
		m_bindingContext.bindValue(observeForegroundTxtStatusObserveWidget, xRoverPlatformClientDisposedLevelObserveValue,
				null,
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE).setConverter(new Converter(Boolean.class, Color.class) {
					
					@Override
					public Object convert(Object fromObject) {
						return ((Boolean)fromObject).booleanValue() ? SWTResourceManager.getColor(SWT.COLOR_WHITE) : txtStatus.getForeground();
					}
				}));

		
		/** Data binding for the streaming*/
		IObservableValue observeEnabledStartStreamingObserveWidget = WidgetProperties.enabled().observe(btnStartStreaming);
		IObservableValue observeEnabledStopStreamingObserveWidget = WidgetProperties.enabled().observe(btnStopStreaming);
		IObservableValue xRoverCameraStreamingEnabledObserveValue = EMFProperties.value(Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_CAMERA).observeDetail(roverPlatformClientBinder);
		m_bindingContext.bindValue(observeEnabledStartStreamingObserveWidget, xRoverCameraStreamingEnabledObserveValue, 
				null,
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE).setConverter(new Converter(PolarSysCamera.class, Boolean.class) 
				{
					@Override
					public Object convert(Object fromObject) {
						if(fromObject != null){
							System.out.println(
									"PolarSysRoverClientComposite.initDataBindings_().new Converter() {...}.convert()" + fromObject);
							return ((PolarSysCamera) fromObject).isStreamingEnabled() ?  false : true;
						}else{
							System.out.println(
									"PolarSysRoverClientComposite.initDataBindings_().new Converter() {...}.convert() null");
							return true;
						}
					}
				}));
		m_bindingContext.bindValue(observeEnabledStopStreamingObserveWidget, xRoverCameraStreamingEnabledObserveValue, 
				null,
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE).setConverter(new Converter(Boolean.class, Boolean.class) 
				{
					@Override
					public Object convert(Object fromObject) {
						if(fromObject != null){
							System.out.println(
									"PolarSysRoverClientComposite.initDataBindings_().new Converter() {...}.convert()" + fromObject);
							
							return ((PolarSysCamera) fromObject).isStreamingEnabled();
						}else{
							System.out.println(
									"PolarSysRoverClientComposite.initDataBindings_().new Converter() {...}.convert() null");
				
							return false;
						}
					}
				}));
		
		/** Data binding for the status of the camera*/
		IObservableValue observeEnabledTakeSnapshotObserveWidget = WidgetProperties.enabled().observe(btnTakeSnapshot);
		IObservableValue RoverCameraInitializedObserveValue = EMFProperties.value(Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_CAMERA).observeDetail(roverPlatformClientBinder);
		m_bindingContext.bindValue(observeEnabledTakeSnapshotObserveWidget, RoverCameraInitializedObserveValue, 
				null, 
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE).setConverter(new Converter(PolarSysCamera.class, Boolean.class) {
			
			@Override
			public Object convert(Object fromObject) {
				if(fromObject != null){
					System.out.println(
							"PolarSysRoverClientComposite.initDataBindings_().new Converter() {...}.convert()" + fromObject);
					
					return ((PolarSysCamera) fromObject).isInitialized();
				}else{
					System.out.println(
							"PolarSysRoverClientComposite.initDataBindings_().new Converter() {...}.convert() null");
		
					return false;
				}
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
					if(arg0 != null){
						return String.format(" %1$.3f", ((Double)arg0));
					}else{
						return " 0.000";
					}
					
				}				
			});
		}
	}

	/**
	 * This class is used to create the jobs for the controls of the rover
	 *
	 */
	protected abstract class CustomJob extends Job{

		public CustomJob(String name) {
			super(name);
			setSystem(true);
		}

		@Override
		protected IStatus run(IProgressMonitor monitor) {
			try
			{
				execute();
			}
			catch (Exception ex)
			{
				ex.printStackTrace();
			}				
			return Status.OK_STATUS;
		}

		// Only this method is left to implement
		abstract protected void execute();			
	}
	
	
	/**
	 * This class is used to create the job that stops the rover when it's moving
	 *
	 */
	public class StopJob extends CustomJob{

		PolarSysRoverPlatformClient roverPlatformClient = getPolarSysRoverPlatformClient();
		public StopJob() {
			super("StopJob");
		}

		@Override
		protected void execute() {
			roverPlatformClient.cmdPowerLevel(0, 0);
		}
		
	}
}

