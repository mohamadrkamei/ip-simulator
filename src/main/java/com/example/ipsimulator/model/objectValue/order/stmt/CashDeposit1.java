
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashDeposit1 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CashDeposit1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NoteDnmtn" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}ActiveCurrencyAndAmount"/>
 *         &lt;element name="NbOfNotes" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Max15NumericText"/>
 *         &lt;element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}ActiveCurrencyAndAmount"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashDeposit1", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "noteDnmtn",
    "nbOfNotes",
    "amt"
})
public class CashDeposit1 {

    @XmlElement(name = "NoteDnmtn", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    public ActiveCurrencyAndAmount noteDnmtn;
    @XmlElement(name = "NbOfNotes", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    public String nbOfNotes;
    @XmlElement(name = "Amt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    public ActiveCurrencyAndAmount amt;

    /**
     * Gets the value of the noteDnmtn property.
     *
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *
     */
    public ActiveCurrencyAndAmount getNoteDnmtn() {
        return noteDnmtn;
    }

    /**
     * Sets the value of the noteDnmtn property.
     *
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *
     */
    public void setNoteDnmtn(ActiveCurrencyAndAmount value) {
        this.noteDnmtn = value;
    }

    /**
     * Gets the value of the nbOfNotes property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNbOfNotes() {
        return nbOfNotes;
    }

    /**
     * Sets the value of the nbOfNotes property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNbOfNotes(String value) {
        this.nbOfNotes = value;
    }

    /**
     * Gets the value of the amt property.
     *
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *
     */
    public ActiveCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     *
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *
     */
    public void setAmt(ActiveCurrencyAndAmount value) {
        this.amt = value;
    }

}
