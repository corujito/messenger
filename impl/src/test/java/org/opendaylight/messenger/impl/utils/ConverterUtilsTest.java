/*
 * Copyright © 2016 Kleber Infante and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.messenger.impl.utils;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.opendaylight.messenger.impl.model.Element;

public class ConverterUtilsTest {

    @Test
    public void testConvertToJson() throws Exception {
        List<Element> elements = new ArrayList<Element>();
        elements.add(createElement("Hydrogen"));
        elements.add(createElement("Hydrogen2"));

        String expectedJSON = "["
                + "{"
                  + "\"atomicNumber\":1,\"name\":\"Hydrogen\",\"symbol\":\"H\",\"atomicWeight\":1.00794,\"period\":1,"
                  + "\"group\":1,\"phase\":\"gas\",\"mostStableCrystal\":null,\"type\":\"Nonmetal\","
                  + "\"ionicRadius\":0.012,\"atomicRadius\":0.79,\"electronegativity\":2.2,"
                  + "\"firstIonizationPotential\":13.5984,\"density\":8.988E-5,\"meltingPoint\":14.175,"
                  + "\"boilingPoint\":20.28,\"isotopes\":3,\"discoverer\":\"Cavendish\",\"yearOfDiscovery\":1766,"
                  + "\"specificHeatCapacity\":14.304,\"electronConfiguration\":\"1s1\",\"row\":1,\"displayColumn\":1"
                  + "},"
                + "{"
                  + "\"atomicNumber\":1,\"name\":\"Hydrogen2\",\"symbol\":\"H\",\"atomicWeight\":1.00794,\"period\":1,"
                  + "\"group\":1,\"phase\":\"gas\",\"mostStableCrystal\":null,\"type\":\"Nonmetal\","
                  + "\"ionicRadius\":0.012,\"atomicRadius\":0.79,\"electronegativity\":2.2,"
                  + "\"firstIonizationPotential\":13.5984,\"density\":8.988E-5,\"meltingPoint\":14.175,"
                  + "\"boilingPoint\":20.28,\"isotopes\":3,\"discoverer\":\"Cavendish\",\"yearOfDiscovery\":1766,"
                  + "\"specificHeatCapacity\":14.304,\"electronConfiguration\":\"1s1\",\"row\":1,\"displayColumn\":1"
                  + "}"
                + "]";
        assertEquals(expectedJSON, ConverterUtils.convertToJson(elements));
    }

    @Test
    public void testConvertToJsonEmpty() throws Exception {
        List<Element> elements = new ArrayList<Element>();
        assertEquals("[]", ConverterUtils.convertToJson(elements));
    }

    @Test
    public void testConvertToXml() throws Exception {
        List<Element> elements = new ArrayList<Element>();
        elements.add(createElement("Hydrogen"));
        elements.add(createElement("Hydrogen2"));
        String expectedXML = "<?xml version=\"1.0\" ?>"
            + "<elements>"
              + "<element>"
                    + "<atomicNumber>1</atomicNumber>"
                    + "<name>Hydrogen</name>"
                    + "<symbol>H</symbol>"
                    + "<atomicWeight>1.00794</atomicWeight>"
                    + "<period>1</period>"
                    + "<group>1</group>"
                    + "<phase>gas</phase>"
                    + "<type>Nonmetal</type>"
                    + "<ionicRadius>0.012</ionicRadius>"
                    + "<atomicRadius>0.79</atomicRadius>"
                    + "<electronegativity>2.2</electronegativity>"
                    + "<firstIonizationPotential>13.5984</firstIonizationPotential>"
                    + "<density>8.988E-5</density>"
                    + "<meltingPoint>14.175</meltingPoint>"
                    + "<boilingPoint>20.28</boilingPoint>"
                    + "<isotopes>3</isotopes>"
                    + "<discoverer>Cavendish</discoverer>"
                    + "<yearOfDiscovery>1766</yearOfDiscovery>"
                    + "<specificHeatCapacity>14.304</specificHeatCapacity>"
                    + "<electronConfiguration>1s1</electronConfiguration>"
                    + "<row>1</row>"
                    + "<displayColumn>1</displayColumn>"
              + "</element>"
              + "<element>"
                    + "<atomicNumber>1</atomicNumber>"
                    + "<name>Hydrogen2</name>"
                    + "<symbol>H</symbol>"
                    + "<atomicWeight>1.00794</atomicWeight>"
                    + "<period>1</period>"
                    + "<group>1</group>"
                    + "<phase>gas</phase>"
                    + "<type>Nonmetal</type>"
                    + "<ionicRadius>0.012</ionicRadius>"
                    + "<atomicRadius>0.79</atomicRadius>"
                    + "<electronegativity>2.2</electronegativity>"
                    + "<firstIonizationPotential>13.5984</firstIonizationPotential>"
                    + "<density>8.988E-5</density>"
                    + "<meltingPoint>14.175</meltingPoint>"
                    + "<boilingPoint>20.28</boilingPoint>"
                    + "<isotopes>3</isotopes>"
                    + "<discoverer>Cavendish</discoverer>"
                    + "<yearOfDiscovery>1766</yearOfDiscovery>"
                    + "<specificHeatCapacity>14.304</specificHeatCapacity>"
                    + "<electronConfiguration>1s1</electronConfiguration>"
                    + "<row>1</row>"
                    + "<displayColumn>1</displayColumn>"
              + "</element>"
            + "</elements>";
        assertEquals(expectedXML, ConverterUtils.convertToXml(elements));
    }

    @Test
    public void testConvertToXmlEmpty() throws Exception {
        List<Element> elements = new ArrayList<Element>();
        assertEquals("<?xml version=\"1.0\" ?><elements></elements>", ConverterUtils.convertToXml(elements));
    }

    private Element createElement(String name) {
        Element element = new Element();
        element.setAtomicNumber(1);
        element.setName(name);
        element.setSymbol("H");
        element.setAtomicWeight(1.00794);
        element.setPeriod(1);
        element.setGroup(1);
        element.setPhase("gas");
        element.setMostStableCrystal(null);
        element.setType("Nonmetal");
        element.setIonicRadius(0.012);
        element.setAtomicRadius(0.79);
        element.setElectronegativity(2.2);
        element.setFirstIonizationPotential(13.5984);
        element.setDensity(0.00008988);
        element.setMeltingPoint(14.175);
        element.setBoilingPoint(20.28);
        element.setIsotopes(3);
        element.setDiscoverer("Cavendish");
        element.setYearOfDiscovery(1766);
        element.setSpecificHeatCapacity(14.304);
        element.setElectronConfiguration("1s1");
        element.setRow(1);
        element.setDisplayColumn(1);
        return element;
    }

}
