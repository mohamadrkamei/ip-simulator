
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for CurrencyAndAmountRange2 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CurrencyAndAmountRange2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}ImpliedCurrencyAmountRangeChoice"/>
 *         &lt;element name="CdtDbtInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}CreditDebitCode" minOccurs="0"/>
 *         &lt;element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}ActiveOrHistoricCurrencyCode"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyAndAmountRange2", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "amt",
    "cdtDbtInd",
    "ccy"
})
public class CurrencyAndAmountRange2 {

    @XmlElement(name = "Amt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    public ImpliedCurrencyAmountRangeChoice amt;
    @XmlElement(name = "CdtDbtInd", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    @XmlSchemaType(name = "string")
    public CreditDebitCode cdtDbtInd;
    @XmlElement(name = "Ccy", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    public String ccy;

    /**
     * Gets the value of the amt property.
     *
     * @return
     *     possible object is
     *     {@link ImpliedCurrencyAmountRangeChoice }
     *
     */
    public ImpliedCurrencyAmountRangeChoice getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     *
     * @param value
     *     allowed object is
     *     {@link ImpliedCurrencyAmountRangeChoice }
     *
     */
    public void setAmt(ImpliedCurrencyAmountRangeChoice value) {
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
     * Gets the value of the ccy property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCcy(String value) {
        this.ccy = value;
    }

}
