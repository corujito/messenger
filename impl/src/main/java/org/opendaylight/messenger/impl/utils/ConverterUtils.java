/*
 * Copyright © 2016 Kleber Infante and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.messenger.impl.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import java.util.List;
import org.opendaylight.messenger.impl.model.Element;

public class ConverterUtils {

    private static ObjectMapper jsonMapper = new ObjectMapper();
    private static XStream xstream = new XStream(new StaxDriver());

    public static String convertToJson(Object object) throws Exception {
        if (object == null) {
            return "[]";
        }
        return jsonMapper.writeValueAsString(object);
    }

    public static String convertToXml(Object object) throws Exception {
        xstream.alias("element", Element.class);
        xstream.alias("elements", List.class);
        return xstream.toXML(object);
    }
}
