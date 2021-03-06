
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for TaxInformation4 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TaxInformation4">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cdtr" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}TaxParty1" minOccurs="0"/>
 *         &lt;element name="Dbtr" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}TaxParty2" minOccurs="0"/>
 *         &lt;element name="UltmtDbtr" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}TaxParty2" minOccurs="0"/>
 *         &lt;element name="AdmstnZone" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Max35Text" minOccurs="0"/>
 *         &lt;element name="RefNb" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Max140Text" minOccurs="0"/>
 *         &lt;element name="Mtd" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Max35Text" minOccurs="0"/>
 *         &lt;element name="TtlTaxblBaseAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         &lt;element name="TtlTaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         &lt;element name="Dt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}ISODate" minOccurs="0"/>
 *         &lt;element name="SeqNb" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Number" minOccurs="0"/>
 *         &lt;element name="Rcrd" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}TaxRecord1" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxInformation4", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "cdtr",
    "dbtr",
    "ultmtDbtr",
    "admstnZone",
    "refNb",
    "mtd",
    "ttlTaxblBaseAmt",
    "ttlTaxAmt",
    "dt",
    "seqNb",
    "rcrd"
})
public class TaxInformation4 {

    @XmlElement(name = "Cdtr", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public TaxParty1 cdtr;
    @XmlElement(name = "Dbtr", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public TaxParty2 dbtr;
    @XmlElement(name = "UltmtDbtr", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public TaxParty2 ultmtDbtr;
    @XmlElement(name = "AdmstnZone", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String admstnZone;
    @XmlElement(name = "RefNb", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String refNb;
    @XmlElement(name = "Mtd", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String mtd;
    @XmlElement(name = "TtlTaxblBaseAmt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public ActiveOrHistoricCurrencyAndAmount ttlTaxblBaseAmt;
    @XmlElement(name = "TtlTaxAmt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public ActiveOrHistoricCurrencyAndAmount ttlTaxAmt;
    @XmlElement(name = "Dt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String dt;
    @XmlElement(name = "SeqNb", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public BigDecimal seqNb;
    @XmlElement(name = "Rcrd", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public List<TaxRecord1> rcrd;

    /**
     * Gets the value of the cdtr property.
     *
     * @return
     *     possible object is
     *     {@link TaxParty1 }
     *
     */
    public TaxParty1 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     *
     * @param value
     *     allowed object is
     *     {@link TaxParty1 }
     *
     */
    public void setCdtr(TaxParty1 value) {
        this.cdtr = value;
    }

    /**
     * Gets the value of the dbtr property.
     *
     * @return
     *     possible object is
     *     {@link TaxParty2 }
     *
     */
    public TaxParty2 getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     *
     * @param value
     *     allowed object is
     *     {@link TaxParty2 }
     *
     */
    public void setDbtr(TaxParty2 value) {
        this.dbtr = value;
    }

    /**
     * Gets the value of the ultmtDbtr property.
     *
     * @return
     *     possible object is
     *     {@link TaxParty2 }
     *
     */
    public TaxParty2 getUltmtDbtr() {
        return ultmtDbtr;
    }

    /**
     * Sets the value of the ultmtDbtr property.
     *
     * @param value
     *     allowed object is
     *     {@link TaxParty2 }
     *
     */
    public void setUltmtDbtr(TaxParty2 value) {
        this.ultmtDbtr = value;
    }

    /**
     * Gets the value of the admstnZone property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAdmstnZone() {
        return admstnZone;
    }

    /**
     * Sets the value of the admstnZone property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAdmstnZone(String value) {
        this.admstnZone = value;
    }

    /**
     * Gets the value of the refNb property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRefNb() {
        return refNb;
    }

    /**
     * Sets the value of the refNb property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRefNb(String value) {
        this.refNb = value;
    }

    /**
     * Gets the value of the mtd property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMtd() {
        return mtd;
    }

    /**
     * Sets the value of the mtd property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMtd(String value) {
        this.mtd = value;
    }

    /**
     * Gets the value of the ttlTaxblBaseAmt property.
     *
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *
     */
    public ActiveOrHistoricCurrencyAndAmount getTtlTaxblBaseAmt() {
        return ttlTaxblBaseAmt;
    }

    /**
     * Sets the value of the ttlTaxblBaseAmt property.
     *
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *
     */
    public void setTtlTaxblBaseAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlTaxblBaseAmt = value;
    }

    /**
     * Gets the value of the ttlTaxAmt property.
     *
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *
     */
    public ActiveOrHistoricCurrencyAndAmount getTtlTaxAmt() {
        return ttlTaxAmt;
    }

    /**
     * Sets the value of the ttlTaxAmt property.
     *
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *
     */
    public void setTtlTaxAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlTaxAmt = value;
    }

    /**
     * Gets the value of the dt property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDt(String value) {
        this.dt = value;
    }

    /**
     * Gets the value of the seqNb property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getSeqNb() {
        return seqNb;
    }

    /**
     * Sets the value of the seqNb property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setSeqNb(BigDecimal value) {
        this.seqNb = value;
    }

    /**
     * Gets the value of the rcrd property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rcrd property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRcrd().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxRecord1 }
     *
     *
     */
    public List<TaxRecord1> getRcrd() {
        if (rcrd == null) {
            rcrd = new ArrayList<TaxRecord1>();
        }
        return this.rcrd;
    }

}
