/*
 * Copyright © 2016 Kleber Infante and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.messenger.impl.utils;

import java.io.FileWriter;
import java.io.PrintWriter;

public class FileUtils {

    public static void saveFile(String filename, String text) throws Exception {
        PrintWriter outputStream = null;
        try {
            outputStream = new PrintWriter(new FileWriter(filename));
            outputStream.print(text);
        } finally {
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
