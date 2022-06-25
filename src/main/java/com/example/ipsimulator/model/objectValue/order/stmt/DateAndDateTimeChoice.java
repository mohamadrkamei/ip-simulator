
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateAndDateTimeChoice complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DateAndDateTimeChoice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Dt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}ISODate"/>
 *         &lt;element name="DtTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}ISODateTime"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateAndDateTimeChoice", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "dt",
    "dtTm"
})
public class DateAndDateTimeChoice {

    @XmlElement(name = "Dt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String dt;
    @XmlElement(name = "DtTm", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String dtTm;

    /**
     * Gets the value of the dt property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDt(String value) {
        this.dt = value;
    }

    /**
     * Gets the value of the dtTm property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDtTm() {
        return dtTm;
    }

    /**
     * Sets the value of the dtTm property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDtTm(String value) {
        this.dtTm = value;
    }

}
