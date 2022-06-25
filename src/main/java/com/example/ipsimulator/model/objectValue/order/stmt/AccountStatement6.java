
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for AccountStatement6 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AccountStatement6">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Max35Text"/>
 *         &lt;element name="StmtPgntn" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Pagination" minOccurs="0"/>
 *         &lt;element name="ElctrncSeqNb" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Number" minOccurs="0"/>
 *         &lt;element name="LglSeqNb" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Number" minOccurs="0"/>
 *         &lt;element name="CreDtTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}ISODateTime"/>
 *         &lt;element name="FrToDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}DateTimePeriodDetails" minOccurs="0"/>
 *         &lt;element name="CpyDplctInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}CopyDuplicate1Code" minOccurs="0"/>
 *         &lt;element name="RptgSrc" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}ReportingSource1Choice" minOccurs="0"/>
 *         &lt;element name="Acct" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}CashAccount25"/>
 *         &lt;element name="RltdAcct" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}CashAccount24" minOccurs="0"/>
 *         &lt;element name="Intrst" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}AccountInterest3" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Bal" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}CashBalance7" maxOccurs="unbounded"/>
 *         &lt;element name="TxsSummry" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}TotalTransactions5" minOccurs="0"/>
 *         &lt;element name="Ntry" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}ReportEntry8" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AddtlStmtInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Max500Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountStatement6", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "id",
    "stmtPgntn",
    "elctrncSeqNb",
    "lglSeqNb",
    "creDtTm",
    "frToDt",
    "cpyDplctInd",
    "rptgSrc",
    "acct",
    "rltdAcct",
    "intrst",
    "bal",
    "txsSummry",
    "ntry",
    "addtlStmtInf"
})
public class AccountStatement6 {

    @XmlElement(name = "Id", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    public String id;
    @XmlElement(name = "StmtPgntn", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public Pagination stmtPgntn;
    @XmlElement(name = "ElctrncSeqNb", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public BigDecimal elctrncSeqNb;
    @XmlElement(name = "LglSeqNb", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public BigDecimal lglSeqNb;
    @XmlElement(name = "CreDtTm", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    public String creDtTm;
    @XmlElement(name = "FrToDt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public DateTimePeriodDetails frToDt;
    @XmlElement(name = "CpyDplctInd", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    @XmlSchemaType(name = "string")
    public CopyDuplicate1Code cpyDplctInd;
    @XmlElement(name = "RptgSrc", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public ReportingSource1Choice rptgSrc;
    @XmlElement(name = "Acct", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    public CashAccount25 acct;
    @XmlElement(name = "RltdAcct", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public CashAccount24 rltdAcct;
    @XmlElement(name = "Intrst", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public List<AccountInterest3> intrst;
    @XmlElement(name = "Bal", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    public List<CashBalance7> bal;
    @XmlElement(name = "TxsSummry", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public TotalTransactions5 txsSummry;
    @XmlElement(name = "Ntry", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public List<ReportEntry8> ntry;
    @XmlElement(name = "AddtlStmtInf", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String addtlStmtInf;

    /**
     * Gets the value of the id property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the stmtPgntn property.
     *
     * @return
     *     possible object is
     *     {@link Pagination }
     *
     */
    public Pagination getStmtPgntn() {
        return stmtPgntn;
    }

    /**
     * Sets the value of the stmtPgntn property.
     *
     * @param value
     *     allowed object is
     *     {@link Pagination }
     *
     */
    public void setStmtPgntn(Pagination value) {
        this.stmtPgntn = value;
    }

    /**
     * Gets the value of the elctrncSeqNb property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getElctrncSeqNb() {
        return elctrncSeqNb;
    }

    /**
     * Sets the value of the elctrncSeqNb property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setElctrncSeqNb(BigDecimal value) {
        this.elctrncSeqNb = value;
    }

    /**
     * Gets the value of the lglSeqNb property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getLglSeqNb() {
        return lglSeqNb;
    }

    /**
     * Sets the value of the lglSeqNb property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setLglSeqNb(BigDecimal value) {
        this.lglSeqNb = value;
    }

    /**
     * Gets the value of the creDtTm property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCreDtTm() {
        return creDtTm;
    }

    /**
     * Sets the value of the creDtTm property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCreDtTm(String value) {
        this.creDtTm = value;
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
     * Gets the value of the cpyDplctInd property.
     *
     * @return
     *     possible object is
     *     {@link CopyDuplicate1Code }
     *
     */
    public CopyDuplicate1Code getCpyDplctInd() {
        return cpyDplctInd;
    }

    /**
     * Sets the value of the cpyDplctInd property.
     *
     * @param value
     *     allowed object is
     *     {@link CopyDuplicate1Code }
     *
     */
    public void setCpyDplctInd(CopyDuplicate1Code value) {
        this.cpyDplctInd = value;
    }

    /**
     * Gets the value of the rptgSrc property.
     *
     * @return
     *     possible object is
     *     {@link ReportingSource1Choice }
     *
     */
    public ReportingSource1Choice getRptgSrc() {
        return rptgSrc;
    }

    /**
     * Sets the value of the rptgSrc property.
     *
     * @param value
     *     allowed object is
     *     {@link ReportingSource1Choice }
     *
     */
    public void setRptgSrc(ReportingSource1Choice value) {
        this.rptgSrc = value;
    }

    /**
     * Gets the value of the acct property.
     *
     * @return
     *     possible object is
     *     {@link CashAccount25 }
     *
     */
    public CashAccount25 getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     *
     * @param value
     *     allowed object is
     *     {@link CashAccount25 }
     *
     */
    public void setAcct(CashAccount25 value) {
        this.acct = value;
    }

    /**
     * Gets the value of the rltdAcct property.
     *
     * @return
     *     possible object is
     *     {@link CashAccount24 }
     *
     */
    public CashAccount24 getRltdAcct() {
        return rltdAcct;
    }

    /**
     * Sets the value of the rltdAcct property.
     *
     * @param value
     *     allowed object is
     *     {@link CashAccount24 }
     *
     */
    public void setRltdAcct(CashAccount24 value) {
        this.rltdAcct = value;
    }

    /**
     * Gets the value of the intrst property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intrst property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntrst().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountInterest3 }
     *
     *
     */
    public List<AccountInterest3> getIntrst() {
        if (intrst == null) {
            intrst = new ArrayList<AccountInterest3>();
        }
        return this.intrst;
    }

    /**
     * Gets the value of the bal property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bal property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBal().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashBalance7 }
     *
     *
     */
    public List<CashBalance7> getBal() {
        if (bal == null) {
            bal = new ArrayList<CashBalance7>();
        }
        return this.bal;
    }

    /**
     * Gets the value of the txsSummry property.
     *
     * @return
     *     possible object is
     *     {@link TotalTransactions5 }
     *
     */
    public TotalTransactions5 getTxsSummry() {
        return txsSummry;
    }

    /**
     * Sets the value of the txsSummry property.
     *
     * @param value
     *     allowed object is
     *     {@link TotalTransactions5 }
     *
     */
    public void setTxsSummry(TotalTransactions5 value) {
        this.txsSummry = value;
    }

    /**
     * Gets the value of the ntry property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ntry property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtry().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportEntry8 }
     *
     *
     */
    public List<ReportEntry8> getNtry() {
        if (ntry == null) {
            ntry = new ArrayList<ReportEntry8>();
        }
        return this.ntry;
    }

    /**
     * Gets the value of the addtlStmtInf property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAddtlStmtInf() {
        return addtlStmtInf;
    }

    /**
     * Sets the value of the addtlStmtInf property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAddtlStmtInf(String value) {
        this.addtlStmtInf = value;
    }

}
