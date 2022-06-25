
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateTimePeriodDetails complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DateTimePeriodDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FrDtTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}ISODateTime"/>
 *         &lt;element name="ToDtTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}ISODateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateTimePeriodDetails", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "frDtTm",
    "toDtTm"
})
public class DateTimePeriodDetails {

    @XmlElement(name = "FrDtTm", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    public String frDtTm;
    @XmlElement(name = "ToDtTm", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    public String toDtTm;

    /**
     * Gets the value of the frDtTm property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFrDtTm() {
        return frDtTm;
    }

    /**
     * Sets the value of the frDtTm property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFrDtTm(String value) {
        this.frDtTm = value;
    }

    /**
     * Gets the value of the toDtTm property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getToDtTm() {
        return toDtTm;
    }

    /**
     * Sets the value of the toDtTm property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setToDtTm(String value) {
        this.toDtTm = value;
    }

}
