
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashAvailabilityDate1Choice complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CashAvailabilityDate1Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="NbOfDays" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Max15PlusSignedNumericText"/>
 *         &lt;element name="ActlDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}ISODate"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashAvailabilityDate1Choice", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "nbOfDays",
    "actlDt"
})
public class CashAvailabilityDate1Choice {

    @XmlElement(name = "NbOfDays", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String nbOfDays;
    @XmlElement(name = "ActlDt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String actlDt;

    /**
     * Gets the value of the nbOfDays property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNbOfDays() {
        return nbOfDays;
    }

    /**
     * Sets the value of the nbOfDays property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNbOfDays(String value) {
        this.nbOfDays = value;
    }

    /**
     * Gets the value of the actlDt property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getActlDt() {
        return actlDt;
    }

    /**
     * Sets the value of the actlDt property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setActlDt(String value) {
        this.actlDt = value;
    }

}
