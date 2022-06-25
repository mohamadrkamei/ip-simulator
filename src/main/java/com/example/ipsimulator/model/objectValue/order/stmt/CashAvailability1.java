
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for CashAvailability1 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CashAvailability1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Dt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}CashAvailabilityDate1Choice"/>
 *         &lt;element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}ActiveOrHistoricCurrencyAndAmount"/>
 *         &lt;element name="CdtDbtInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}CreditDebitCode"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashAvailability1", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "dt",
    "amt",
    "cdtDbtInd"
})
public class CashAvailability1 {

    @XmlElement(name = "Dt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    public CashAvailabilityDate1Choice dt;
    @XmlElement(name = "Amt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    public ActiveOrHistoricCurrencyAndAmount amt;
    @XmlElement(name = "CdtDbtInd", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    @XmlSchemaType(name = "string")
    public CreditDebitCode cdtDbtInd;

    /**
     * Gets the value of the dt property.
     *
     * @return
     *     possible object is
     *     {@link CashAvailabilityDate1Choice }
     *
     */
    public CashAvailabilityDate1Choice getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     *
     * @param value
     *     allowed object is
     *     {@link CashAvailabilityDate1Choice }
     *
     */
    public void setDt(CashAvailabilityDate1Choice value) {
        this.dt = value;
    }

    /**
     * Gets the value of the amt property.
     *
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *
     */
    public ActiveOrHistoricCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     *
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *
     */
    public void setAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.amt = value;
    }

    /**
     * Gets the value of the cdtDbtInd property.
     *
     * @return
     *     possible object is
     *     {@link CreditDebitCode }
     *
     */
    public CreditDebitCode getCdtDbtInd() {
        return cdtDbtInd;
    }

    /**
     * Sets the value of the cdtDbtInd property.
     *
     * @param value
     *     allowed object is
     *     {@link CreditDebitCode }
     *
     */
    public void setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
    }

}
