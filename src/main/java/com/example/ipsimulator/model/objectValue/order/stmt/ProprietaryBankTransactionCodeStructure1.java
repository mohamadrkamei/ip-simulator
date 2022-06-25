
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProprietaryBankTransactionCodeStructure1 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ProprietaryBankTransactionCodeStructure1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cd" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Max35Text"/>
 *         &lt;element name="Issr" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Max35Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProprietaryBankTransactionCodeStructure1", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "cd",
    "issr"
})
public class ProprietaryBankTransactionCodeStructure1 {

    @XmlElement(name = "Cd", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    public String cd;
    @XmlElement(name = "Issr", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String issr;

    /**
     * Gets the value of the cd property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCd(String value) {
        this.cd = value;
    }

    /**
     * Gets the value of the issr property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIssr(String value) {
        this.issr = value;
    }

}
