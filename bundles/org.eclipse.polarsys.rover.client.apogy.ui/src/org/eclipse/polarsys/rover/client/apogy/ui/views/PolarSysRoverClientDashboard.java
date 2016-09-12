package org.eclipse.polarsys.rover.client.apogy.ui.views;

import java.util.List;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient;
import org.eclipse.polarsys.rover.client.ui.composites.PolarSysRoverClientComposite;
import org.eclipse.swt.SWT;

// FIXME Put Header with copyrights.

import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.common.converters.ui.ApogyCommonConvertersUIFacade;
import ca.gc.asc_csa.apogy.common.ui.views.AbstractView;

public class PolarSysRoverClientDashboard extends AbstractView
{
	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "org.eclipse.polarsys.rover.client.apogy.ui.views.PolarSysRoverClientDashboard";
		
	/**
	 * This is the composite which has all of the content
	 * for the view.
	 */
	private PolarSysRoverClientComposite polarSysRoverClientComposite;
	
	
	@Override
	public void updatePartName(){
	}
	
	@Override
	public void createPartControl(Composite parent)
	{
		// Call the superclass's version of the method
		super.createPartControl(parent);
		
		// Create the control composite and attach it to
		// the scrolled composite
		this.polarSysRoverClientComposite = new PolarSysRoverClientComposite(parent, SWT.NONE);		
	}
	
	@Override
	public void updateSelection(ISelection selection)
	{
		// Attempt to get a robotic arm reference
		List<Object> clients = ApogyCommonConvertersUIFacade.INSTANCE.convert(selection, PolarSysRoverPlatformClient.class);
		
		if (!clients.isEmpty())
		{
			polarSysRoverClientComposite.setPolarSysRoverClient((PolarSysRoverPlatformClient) clients.get(0));
		}
	}
}