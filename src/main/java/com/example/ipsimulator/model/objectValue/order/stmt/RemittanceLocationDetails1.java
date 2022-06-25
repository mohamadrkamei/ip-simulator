
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for RemittanceLocationDetails1 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="RemittanceLocationDetails1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Mtd" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}RemittanceLocationMethod2Code"/>
 *         &lt;element name="ElctrncAdr" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Max2048Text" minOccurs="0"/>
 *         &lt;element name="PstlAdr" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}NameAndAddress10" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemittanceLocationDetails1", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "mtd",
    "elctrncAdr",
    "pstlAdr"
})
public class RemittanceLocationDetails1 {

    @XmlElement(name = "Mtd", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    @XmlSchemaType(name = "string")
    public RemittanceLocationMethod2Code mtd;
    @XmlElement(name = "ElctrncAdr", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String elctrncAdr;
    @XmlElement(name = "PstlAdr", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public NameAndAddress10 pstlAdr;

    /**
     * Gets the value of the mtd property.
     *
     * @return
     *     possible object is
     *     {@link RemittanceLocationMethod2Code }
     *
     */
    public RemittanceLocationMethod2Code getMtd() {
        return mtd;
    }

    /**
     * Sets the value of the mtd property.
     *
     * @param value
     *     allowed object is
     *     {@link RemittanceLocationMethod2Code }
     *
     */
    public void setMtd(RemittanceLocationMethod2Code value) {
        this.mtd = value;
    }

    /**
     * Gets the value of the elctrncAdr property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getElctrncAdr() {
        return elctrncAdr;
    }

    /**
     * Sets the value of the elctrncAdr property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setElctrncAdr(String value) {
        this.elctrncAdr = value;
    }

    /**
     * Gets the value of the pstlAdr property.
     *
     * @return
     *     possible object is
     *     {@link NameAndAddress10 }
     *
     */
    public NameAndAddress10 getPstlAdr() {
        return pstlAdr;
    }

    /**
     * Sets the value of the pstlAdr property.
     *
     * @param value
     *     allowed object is
     *     {@link NameAndAddress10 }
     *
     */
    public void setPstlAdr(NameAndAddress10 value) {
        this.pstlAdr = value;
    }

}
