
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatePeriodDetails complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DatePeriodDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FrDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}ISODate"/>
 *         &lt;element name="ToDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}ISODate"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatePeriodDetails", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "frDt",
    "toDt"
})
public class DatePeriodDetails {

    @XmlElement(name = "FrDt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    public String frDt;
    @XmlElement(name = "ToDt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    public String toDt;

    /**
     * Gets the value of the frDt property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFrDt() {
        return frDt;
    }

    /**
     * Sets the value of the frDt property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFrDt(String value) {
        this.frDt = value;
    }

    /**
     * Gets the value of the toDt property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getToDt() {
        return toDt;
    }

    /**
     * Sets the value of the toDt property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setToDt(String value) {
        this.toDt = value;
    }

}
