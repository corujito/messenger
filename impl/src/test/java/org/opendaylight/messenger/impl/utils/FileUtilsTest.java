/*
 * Copyright © 2016 Kleber Infante and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.messenger.impl.utils;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FileUtilsTest {

    private String path = "src/test/resources/testSaveFile.txt";

    @Before
    public void before() throws IOException {
        // Files.createDirectory(Paths.get(path));
        if (Files.exists(Paths.get(path))) {
            Files.delete(Paths.get(path));
        }
    }

    @After
    public void after() throws IOException {
        if (Files.exists(Paths.get(path))) {
            Files.delete(Paths.get(path));
        }
    }

    @Test
    public void saveFile() throws Exception {
        String originalText = "text from FileUtilsTest.testSaveFile()";
        FileUtils.saveFile(path, originalText);
        String fileText = readFile(path);
        assertEquals(originalText, fileText);
    }

    private String readFile(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }
}
