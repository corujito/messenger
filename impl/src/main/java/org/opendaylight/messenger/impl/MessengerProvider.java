/*
 * Copyright © 2016 Kleber Infante and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.messenger.impl;

import java.util.List;

import org.opendaylight.controller.md.sal.binding.api.DataBroker;
import org.opendaylight.messenger.impl.model.Element;
import org.opendaylight.messenger.impl.utils.CSVImporter;
import org.opendaylight.messenger.impl.utils.ConverterUtils;
import org.opendaylight.messenger.impl.utils.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessengerProvider {

    private static final Logger LOG = LoggerFactory.getLogger(MessengerProvider.class);

    private final DataBroker dataBroker;

    public MessengerProvider(final DataBroker dataBroker) {
        this.dataBroker = dataBroker;
    }

    /**
     * Method called when the blueprint container is created.
     */
    public void init() {
        LOG.info("MessengerProvider Session Initiated");
        execute();
    }

    /**
     * Method called when the blueprint container is destroyed.
     */
    public void close() {
        LOG.info("MessengerProvider Closed");
    }

    private void execute() {
        try {
            List<Element> elements = CSVImporter.parseCsvFile("src/main/resources/periodic_table_of_elements.csv");
            exportToJsonFile(elements);
            exportToXmlFile(elements);
        } catch (Exception e) {
            LOG.error("Could not parse csv and convert to json/xml", e);
        }
    }

    private void exportToJsonFile(List<Element> elements) throws Exception {
        String json = ConverterUtils.convertToJson(elements);
        FileUtils.saveFile("src/main/resources/periodic_table_elements.json", json);
    }

    private void exportToXmlFile(List<Element> elements) throws Exception {
        String xml = ConverterUtils.convertToXml(elements);
        FileUtils.saveFile("src/main/resources/periodic_table_elements.xml", xml);
    }
}
