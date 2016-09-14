package org.eclipse.polarsys.rover.client.apogy.ui;
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

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator
{
	/**
	 * This is a single activator instance which is shared
	 * by all parts of the OSGi framework.
	 */
	private static Activator plugin;
	
	/**
	 * This is the context in which the plugin (i.e. bundle)
	 * operates and contains useful information.
	 */
	private static BundleContext context;
	
	/**
	 * This is the constructor for the Activator class; concretely,
	 * an instance of this type is created for the lifetime of the
	 * loaded plugin.
	 */
	public Activator()
	{
		plugin = this;
	}
	
	/**
	 * This is used to get the shared Activator instance 
	 * @return The shared instance
	 */
	public static Activator getDefault()
	{
		return plugin;
	}
	
	/**
	 * Get the context associated with this plugin (i.e. bundle)
	 * @return This plugin's context
	 */
	public static BundleContext getContext()
	{
		return context;
	}
	
	/**
	 * This hook method is called whenever the plugin is started
	 * @param context The plugin's operating context 
	 * @throws Exception Any exception encountered while starting the plugin
	 */
	@Override
	public void start(BundleContext context) throws Exception 
	{ 
		Activator.context = context;
	}

	/**
	 * This hook method is called whenever the plugin is stopped
	 * @param context The plugin's operating context
	 * @throws Exception Any exception encountered while stopping the plugin
	 */
	@Override
	public void stop(BundleContext context) throws Exception 
	{		
		Activator.context = null;
	}
}