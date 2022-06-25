
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CSCManagement1Code.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CSCManagement1Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PRST"/>
 *     &lt;enumeration value="BYPS"/>
 *     &lt;enumeration value="UNRD"/>
 *     &lt;enumeration value="NCSC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "CSCManagement1Code", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
@XmlEnum
public enum CSCManagement1Code {

    PRST,
    BYPS,
    UNRD,
    NCSC;

    public String value() {
        return name();
    }

    public static CSCManagement1Code fromValue(String v) {
        return valueOf(v);
    }

}
