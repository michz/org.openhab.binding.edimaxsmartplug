/**
 * Copyright (c) 2010-2019 Contributors to the openHAB project
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.edimaxsmartplug.handler;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.smarthome.core.thing.Thing;

/**
 * The {@link Edimax1101Handler} is responsible for handling commands for the
 * Edimax 1101, which are sent to one of the channels. It is equal to to base
 * EdimaxHandler.
 *
 * @author Falk Harnisch - Initial contribution
 */
@NonNullByDefault
public class Edimax1101Handler extends EdimaxSmartPlugHandler {

    /**
     * Constructor the only calls the super constructor.
     *
     * @param thing The thing
     */
    public Edimax1101Handler(Thing thing) {
        super(thing);
    }
}
