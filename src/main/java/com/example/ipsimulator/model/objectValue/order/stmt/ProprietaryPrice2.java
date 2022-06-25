
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProprietaryPrice2 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ProprietaryPrice2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Max35Text"/>
 *         &lt;element name="Pric" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}ActiveOrHistoricCurrencyAndAmount"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProprietaryPrice2", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "tp",
    "pric"
})
public class ProprietaryPrice2 {

    @XmlElement(name = "Tp", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    public String tp;
    @XmlElement(name = "Pric", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    public ActiveOrHistoricCurrencyAndAmount pric;

    /**
     * Gets the value of the tp property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTp(String value) {
        this.tp = value;
    }

    /**
     * Gets the value of the pric property.
     *
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *
     */
    public ActiveOrHistoricCurrencyAndAmount getPric() {
        return pric;
    }

    /**
     * Sets the value of the pric property.
     *
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *
     */
    public void setPric(ActiveOrHistoricCurrencyAndAmount value) {
        this.pric = value;
    }

}
