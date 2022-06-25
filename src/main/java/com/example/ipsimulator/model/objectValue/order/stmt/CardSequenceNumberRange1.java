
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardSequenceNumberRange1 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CardSequenceNumberRange1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FrstTx" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Max35Text" minOccurs="0"/>
 *         &lt;element name="LastTx" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Max35Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardSequenceNumberRange1", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "frstTx",
    "lastTx"
})
public class CardSequenceNumberRange1 {

    @XmlElement(name = "FrstTx", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String frstTx;
    @XmlElement(name = "LastTx", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String lastTx;

    /**
     * Gets the value of the frstTx property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFrstTx() {
        return frstTx;
    }

    /**
     * Sets the value of the frstTx property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFrstTx(String value) {
        this.frstTx = value;
    }

    /**
     * Gets the value of the lastTx property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLastTx() {
        return lastTx;
    }

    /**
     * Sets the value of the lastTx property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLastTx(String value) {
        this.lastTx = value;
    }

}
