package com.example.ipsimulator.utils;


import com.example.ipsimulator.model.enumeration.MessageType;

import com.example.ipsimulator.model.objectValue.order.stmt.Document;
import com.sun.xml.bind.marshaller.NamespacePrefixMapper;
import lombok.extern.log4j.Log4j2;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import java.io.*;

@Log4j2
public class JaxbUtil {

    private JaxbUtil() {
    }



    public static  String objectToXml(Document document) throws Exception {

        StringWriter sw = new StringWriter();
        try {
            JAXBContext jc = JAXBContext.newInstance(Document.class);
            Marshaller marshaller = jc.createMarshaller();
            marshaller.marshal(document, sw);
            return sw.toString();

        } catch (JAXBException e) {
            log.error(e.getMessage(), e);
            throw new Exception(String.format("write xml error, messageType=%s"), e);
        }
    }

}
