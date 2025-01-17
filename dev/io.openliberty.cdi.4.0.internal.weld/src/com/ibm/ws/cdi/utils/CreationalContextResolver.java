/*******************************************************************************
 * Copyright (c) 2017 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.ws.cdi.utils;

import org.jboss.weld.construction.api.WeldCreationalContext;
import org.jboss.weld.contexts.CreationalContextImpl;

import jakarta.enterprise.inject.spi.Bean;

/**
 *
 */
public class CreationalContextResolver {

    public static <T> WeldCreationalContext<T> resolve(WeldCreationalContext<T> cc, Bean<T> bean) {
        WeldCreationalContext<T> creationalContext = cc;
        if (creationalContext instanceof CreationalContextImpl<?>) {
            creationalContext = ((CreationalContextImpl<?>) creationalContext).getCreationalContext(bean);
        }
        return creationalContext;
    }

}
