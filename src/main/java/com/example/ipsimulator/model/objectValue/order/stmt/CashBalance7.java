
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for CashBalance7 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CashBalance7">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}BalanceType12"/>
 *         &lt;element name="CdtLine" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}CreditLine2" minOccurs="0"/>
 *         &lt;element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}ActiveOrHistoricCurrencyAndAmount"/>
 *         &lt;element name="CdtDbtInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}CreditDebitCode"/>
 *         &lt;element name="Dt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}DateAndDateTimeChoice"/>
 *         &lt;element name="Avlbty" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}CashAvailability1" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashBalance7", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "tp",
    "cdtLine",
    "amt",
    "cdtDbtInd",
    "dt",
    "avlbty"
})
public class CashBalance7 {

    @XmlElement(name = "Tp", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    public BalanceType12 tp;
    @XmlElement(name = "CdtLine", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public CreditLine2 cdtLine;
    @XmlElement(name = "Amt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    public ActiveOrHistoricCurrencyAndAmount amt;
    @XmlElement(name = "CdtDbtInd", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    @XmlSchemaType(name = "string")
    public CreditDebitCode cdtDbtInd;
    @XmlElement(name = "Dt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    public DateAndDateTimeChoice dt;
    @XmlElement(name = "Avlbty", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public List<CashAvailability1> avlbty;

    /**
     * Gets the value of the tp property.
     *
     * @return
     *     possible object is
     *     {@link BalanceType12 }
     *
     */
    public BalanceType12 getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     *
     * @param value
     *     allowed object is
     *     {@link BalanceType12 }
     *
     */
    public void setTp(BalanceType12 value) {
        this.tp = value;
    }

    /**
     * Gets the value of the cdtLine property.
     *
     * @return
     *     possible object is
     *     {@link CreditLine2 }
     *
     */
    public CreditLine2 getCdtLine() {
        return cdtLine;
    }

    /**
     * Sets the value of the cdtLine property.
     *
     * @param value
     *     allowed object is
     *     {@link CreditLine2 }
     *
     */
    public void setCdtLine(CreditLine2 value) {
        this.cdtLine = value;
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

    /**
     * Gets the value of the dt property.
     *
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *
     */
    public DateAndDateTimeChoice getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     *
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *
     */
    public void setDt(DateAndDateTimeChoice value) {
        this.dt = value;
    }

    /**
     * Gets the value of the avlbty property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the avlbty property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvlbty().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashAvailability1 }
     *
     *
     */
    public List<CashAvailability1> getAvlbty() {
        if (avlbty == null) {
            avlbty = new ArrayList<CashAvailability1>();
        }
        return this.avlbty;
    }

}
