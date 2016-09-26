package org.eclipse.polarsys.rover.client.apogy.ui.views;
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


import org.eclipse.jface.viewers.ISelection;
import org.eclipse.polarsys.rover.client.ui.composites.ApogySessionComposite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.common.ui.views.AbstractView;

public class PolarSysRoverSessionDashboard extends AbstractView
{
	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "org.eclipse.polarsys.rover.client.apogy.ui.views.PolarSysRoverClientDashboard";

	@Override
	public void updatePartName(){
	}
	

	@Override
	public void createPartControl(Composite parent)
	{
		// Call the superclass's version of the method
		super.createPartControl(parent);
		
		// Create the control composite
		new ApogySessionComposite(parent, SWT.NONE);		
	}

	@Override
	public void updateSelection(ISelection arg0) {
	}			
}