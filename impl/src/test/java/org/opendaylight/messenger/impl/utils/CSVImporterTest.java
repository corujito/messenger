/*
 * Copyright © 2016 Kleber Infante and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.messenger.impl.utils;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.opendaylight.messenger.impl.model.Element;

public class CSVImporterTest {

    private String path = "src/test/resources/periodic_table_of_elements.csv";

    @Test
    public void testImportElementsFromCsv() throws Exception {
        List<Element> elements = CSVImporter.parseCsvFile(path);
        assertEquals("Hydrogen", elements.get(0).getName());
        assertEquals("Ununoctium", elements.get(elements.size() - 1).getName());
    }

}
