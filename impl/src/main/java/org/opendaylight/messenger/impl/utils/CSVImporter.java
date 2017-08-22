/*
 * Copyright © 2016 Kleber Infante and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.messenger.impl.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.opendaylight.messenger.impl.model.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CSVImporter {

    private static final Logger LOG = LoggerFactory.getLogger(CSVImporter.class);

    public static List<Element> parseCsvFile(String filename) throws Exception {
        BufferedReader reader = null;
        List<Element> elements = new ArrayList<Element>();
        try {
            reader = new BufferedReader(new FileReader(filename));
            reader.readLine(); // removing header

            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                try {
                    Element element = createElement(fields);
                    elements.add(element);
                    LOG.info("Parsed element: ", element);
                } catch (Exception e) {
                    LOG.warn("CSV format error for line: " + line);
                }
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
        return elements;
    }

    private static Element createElement(String[] fields) {
        Element element = new Element();
        if (!fields[0].equals("")) {
            element.setAtomicNumber(Integer.valueOf(fields[0]));
        }
        if (!fields[1].equals("")) {
            element.setName((String) fields[1].trim());
        }
        if (!fields[2].equals("")) {
            element.setSymbol((String) fields[2].trim());
        }
        if (!fields[3].equals("")) {
            element.setAtomicWeight(Double.valueOf(fields[3]));
        }
        if (!fields[4].equals("")) {
            element.setPeriod(Integer.valueOf(fields[4]));
        }
        if (!fields[5].equals("")) {
            element.setGroup(Integer.valueOf(fields[5]));
        }
        if (!fields[6].equals("")) {
            element.setPhase((String) fields[6].trim());
        }
        if (!fields[7].equals("")) {
            element.setMostStableCrystal((String) fields[7].trim());
        }
        if (!fields[8].equals("")) {
            element.setType((String) fields[8].trim());
        }
        if (!fields[9].equals("")) {
            element.setIonicRadius(Double.valueOf(fields[9]));
        }
        if (!fields[10].equals("")) {
            element.setAtomicRadius(Double.valueOf(fields[10]));
        }
        if (!fields[11].equals("")) {
            element.setElectronegativity(Double.valueOf(fields[11]));
        }
        if (!fields[12].equals("")) {
            element.setFirstIonizationPotential(Double.valueOf(fields[12]));
        }
        if (!fields[13].equals("")) {
            element.setDensity(Double.valueOf(fields[13]));
        }
        if (!fields[14].equals("")) {
            element.setMeltingPoint(Double.valueOf(fields[14]));
        }
        if (!fields[15].equals("")) {
            element.setBoilingPoint(Double.valueOf(fields[15]));
        }
        if (!fields[16].equals("")) {
            element.setIsotopes(Integer.valueOf(fields[16]));
        }
        if (!fields[17].equals("")) {
            element.setDiscoverer((String) fields[17].trim());
        }
        if (!fields[18].equals("")) {
            element.setYearOfDiscovery(Integer.valueOf(fields[18]));
        }
        if (!fields[19].equals("")) {
            element.setSpecificHeatCapacity(Double.valueOf(fields[19]));
        }
        if (!fields[20].equals("")) {
            element.setElectronConfiguration((String) fields[20].trim());
        }
        if (!fields[21].equals("")) {
            element.setRow(Integer.valueOf(fields[21]));
        }
        if (!fields[22].equals("")) {
            element.setDisplayColumn(Integer.valueOf(fields[22]));
        }
        return element;
    }
}
