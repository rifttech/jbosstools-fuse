/*******************************************************************************
 * Copyright (c) 2018 Red Hat, Inc. 
 * Distributed under license by Red Hat, Inc. All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation
 ******************************************************************************/
package org.jboss.tools.fuse.reddeer.wizard;

import org.eclipse.reddeer.eclipse.selectionwizard.NewMenuWizard;

/**
 * Represents "New Fuse Ignite Extension Project" wizard
 * 
 * @author tsedmik
 */
public class NewFuseIgniteExtensionProjectWizard extends NewMenuWizard {

	private static final String SHELL_NAME = "New Fuse Ignite Extension Project";
	private static final String WIZARD_CATEGORY = "Red Hat Fuse";
	private static final String WIZARD_NAME = "Fuse Ignite Extension Project";
	
	public NewFuseIgniteExtensionProjectWizard() {
		super(SHELL_NAME, WIZARD_CATEGORY, WIZARD_NAME);
	}

	
}
