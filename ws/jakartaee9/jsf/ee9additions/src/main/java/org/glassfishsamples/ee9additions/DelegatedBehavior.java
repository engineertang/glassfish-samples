/*
 * Copyright (c) 2019, 2020 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package org.glassfishsamples.ee9additions;

import jakarta.faces.component.behavior.ClientBehaviorBase;
import jakarta.faces.component.behavior.ClientBehaviorContext;
import jakarta.faces.component.behavior.FacesBehavior;
import jakarta.faces.context.ExternalContext;
import jakarta.inject.Inject;

@FacesBehavior(value = "injectedBehavior", managed = true)
public class DelegatedBehavior extends ClientBehaviorBase {
    
    @Inject
    private ExternalContext externalContext;
    
    public DelegatedBehavior() {
    }
    
    @Override
    public String getScript(ClientBehaviorContext behaviorContext) {
        return "<!-- " + externalContext.toString() + " -->";
    }
}
