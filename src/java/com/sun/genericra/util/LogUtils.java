/*
 * Copyright (c) 2004, 2017 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package com.sun.genericra.util;

import java.util.logging.*;


/**
 * Utility to obtain  the logger.
 *
 * @author Binod P.G
 */
public class LogUtils {
    public static Logger getLogger() {
        return Logger.getLogger(Constants.LOGGER_NAME);
    }
}
