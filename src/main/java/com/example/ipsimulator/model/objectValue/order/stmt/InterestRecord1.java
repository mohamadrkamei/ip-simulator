
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for InterestRecord1 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="InterestRecord1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}ActiveOrHistoricCurrencyAndAmount"/>
 *         &lt;element name="CdtDbtInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}CreditDebitCode"/>
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}InterestType1Choice" minOccurs="0"/>
 *         &lt;element name="Rate" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Rate3" minOccurs="0"/>
 *         &lt;element name="FrToDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}DateTimePeriodDetails" minOccurs="0"/>
 *         &lt;element name="Rsn" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Max35Text" minOccurs="0"/>
 *         &lt;element name="Tax" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}TaxCharges2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestRecord1", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "amt",
    "cdtDbtInd",
    "tp",
    "rate",
    "frToDt",
    "rsn",
    "tax"
})
public class InterestRecord1 {

    @XmlElement(name = "Amt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    public ActiveOrHistoricCurrencyAndAmount amt;
    @XmlElement(name = "CdtDbtInd", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    @XmlSchemaType(name = "string")
    public CreditDebitCode cdtDbtInd;
    @XmlElement(name = "Tp", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public InterestType1Choice tp;
    @XmlElement(name = "Rate", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public Rate3 rate;
    @XmlElement(name = "FrToDt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public DateTimePeriodDetails frToDt;
    @XmlElement(name = "Rsn", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String rsn;
    @XmlElement(name = "Tax", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public TaxCharges2 tax;

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

    /**
     * Gets the value of the tp property.
     *
     * @return
     *     possible object is
     *     {@link InterestType1Choice }
     *
     */
    public InterestType1Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     *
     * @param value
     *     allowed object is
     *     {@link InterestType1Choice }
     *
     */
    public void setTp(InterestType1Choice value) {
        this.tp = value;
    }

    /**
     * Gets the value of the rate property.
     *
     * @return
     *     possible object is
     *     {@link Rate3 }
     *
     */
    public Rate3 getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     *
     * @param value
     *     allowed object is
     *     {@link Rate3 }
     *
     */
    public void setRate(Rate3 value) {
        this.rate = value;
    }

    /**
     * Gets the value of the frToDt property.
     *
     * @return
     *     possible object is
     *     {@link DateTimePeriodDetails }
     *
     */
    public DateTimePeriodDetails getFrToDt() {
        return frToDt;
    }

    /**
     * Sets the value of the frToDt property.
     *
     * @param value
     *     allowed object is
     *     {@link DateTimePeriodDetails }
     *
     */
    public void setFrToDt(DateTimePeriodDetails value) {
        this.frToDt = value;
    }

    /**
     * Gets the value of the rsn property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRsn(String value) {
        this.rsn = value;
    }

    /**
     * Gets the value of the tax property.
     *
     * @return
     *     possible object is
     *     {@link TaxCharges2 }
     *
     */
    public TaxCharges2 getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     *
     * @param value
     *     allowed object is
     *     {@link TaxCharges2 }
     *
     */
    public void setTax(TaxCharges2 value) {
        this.tax = value;
    }

}