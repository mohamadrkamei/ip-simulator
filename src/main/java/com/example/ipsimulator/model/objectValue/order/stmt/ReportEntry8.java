
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ReportEntry8 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ReportEntry8">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NtryRef" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Max35Text" minOccurs="0"/>
 *         &lt;element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}ActiveOrHistoricCurrencyAndAmount"/>
 *         &lt;element name="CdtDbtInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}CreditDebitCode"/>
 *         &lt;element name="RvslInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}TrueFalseIndicator" minOccurs="0"/>
 *         &lt;element name="Sts" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}EntryStatus2Code"/>
 *         &lt;element name="BookgDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}DateAndDateTimeChoice" minOccurs="0"/>
 *         &lt;element name="ValDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}DateAndDateTimeChoice" minOccurs="0"/>
 *         &lt;element name="AcctSvcrRef" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Max35Text" minOccurs="0"/>
 *         &lt;element name="Avlbty" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}CashAvailability1" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BkTxCd" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}BankTransactionCodeStructure4"/>
 *         &lt;element name="ComssnWvrInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}YesNoIndicator" minOccurs="0"/>
 *         &lt;element name="AddtlInfInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}MessageIdentification2" minOccurs="0"/>
 *         &lt;element name="AmtDtls" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}AmountAndCurrencyExchange3" minOccurs="0"/>
 *         &lt;element name="Chrgs" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Charges4" minOccurs="0"/>
 *         &lt;element name="TechInptChanl" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}TechnicalInputChannel1Choice" minOccurs="0"/>
 *         &lt;element name="Intrst" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}TransactionInterest3" minOccurs="0"/>
 *         &lt;element name="CardTx" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}CardEntry2" minOccurs="0"/>
 *         &lt;element name="NtryDtls" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}EntryDetails7" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AddtlNtryInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Max500Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportEntry8", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "ntryRef",
    "amt",
    "cdtDbtInd",
    "rvslInd",
    "sts",
    "bookgDt",
    "valDt",
    "acctSvcrRef",
    "avlbty",
    "bkTxCd",
    "comssnWvrInd",
    "addtlInfInd",
    "amtDtls",
    "chrgs",
    "techInptChanl",
    "intrst",
    "cardTx",
    "ntryDtls",
    "addtlNtryInf"
})
public class ReportEntry8 {

    @XmlElement(name = "NtryRef", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String ntryRef;
    @XmlElement(name = "Amt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    public ActiveOrHistoricCurrencyAndAmount amt;
    @XmlElement(name = "CdtDbtInd", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    @XmlSchemaType(name = "string")
    public CreditDebitCode cdtDbtInd;
    @XmlElement(name = "RvslInd", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public Boolean rvslInd;
    @XmlElement(name = "Sts", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    @XmlSchemaType(name = "string")
    public EntryStatus2Code sts;
    @XmlElement(name = "BookgDt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public DateAndDateTimeChoice bookgDt;
    @XmlElement(name = "ValDt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public DateAndDateTimeChoice valDt;
    @XmlElement(name = "AcctSvcrRef", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String acctSvcrRef;
    @XmlElement(name = "Avlbty", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public List<CashAvailability1> avlbty;
    @XmlElement(name = "BkTxCd", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    public BankTransactionCodeStructure4 bkTxCd;
    @XmlElement(name = "ComssnWvrInd", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public Boolean comssnWvrInd;
    @XmlElement(name = "AddtlInfInd", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public MessageIdentification2 addtlInfInd;
    @XmlElement(name = "AmtDtls", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public AmountAndCurrencyExchange3 amtDtls;
    @XmlElement(name = "Chrgs", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public Charges4 chrgs;
    @XmlElement(name = "TechInptChanl", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public TechnicalInputChannel1Choice techInptChanl;
    @XmlElement(name = "Intrst", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public TransactionInterest3 intrst;
    @XmlElement(name = "CardTx", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public CardEntry2 cardTx;
    @XmlElement(name = "NtryDtls", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public EntryDetails7 ntryDtls;
    @XmlElement(name = "AddtlNtryInf", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String addtlNtryInf;




    public void setNtryDtls(EntryDetails7 ntryDtls){
        this.ntryDtls = ntryDtls;
    }


    /**
     * Gets the value of the ntryRef property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNtryRef() {
        return ntryRef;
    }

    /**
     * Sets the value of the ntryRef property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNtryRef(String value) {
        this.ntryRef = value;
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
     * Gets the value of the rvslInd property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isRvslInd() {
        return rvslInd;
    }

    /**
     * Sets the value of the rvslInd property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setRvslInd(Boolean value) {
        this.rvslInd = value;
    }

    /**
     * Gets the value of the sts property.
     *
     * @return
     *     possible object is
     *     {@link EntryStatus2Code }
     *
     */
    public EntryStatus2Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     *
     * @param value
     *     allowed object is
     *     {@link EntryStatus2Code }
     *
     */
    public void setSts(EntryStatus2Code value) {
        this.sts = value;
    }

    /**
     * Gets the value of the bookgDt property.
     *
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *
     */
    public DateAndDateTimeChoice getBookgDt() {
        return bookgDt;
    }

    /**
     * Sets the value of the bookgDt property.
     *
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *
     */
    public void setBookgDt(DateAndDateTimeChoice value) {
        this.bookgDt = value;
    }

    /**
     * Gets the value of the valDt property.
     *
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *
     */
    public DateAndDateTimeChoice getValDt() {
        return valDt;
    }

    /**
     * Sets the value of the valDt property.
     *
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *
     */
    public void setValDt(DateAndDateTimeChoice value) {
        this.valDt = value;
    }

    /**
     * Gets the value of the acctSvcrRef property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAcctSvcrRef() {
        return acctSvcrRef;
    }

    /**
     * Sets the value of the acctSvcrRef property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAcctSvcrRef(String value) {
        this.acctSvcrRef = value;
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

    /**
     * Gets the value of the bkTxCd property.
     *
     * @return
     *     possible object is
     *     {@link BankTransactionCodeStructure4 }
     *
     */
    public BankTransactionCodeStructure4 getBkTxCd() {
        return bkTxCd;
    }

    /**
     * Sets the value of the bkTxCd property.
     *
     * @param value
     *     allowed object is
     *     {@link BankTransactionCodeStructure4 }
     *
     */
    public void setBkTxCd(BankTransactionCodeStructure4 value) {
        this.bkTxCd = value;
    }

    /**
     * Gets the value of the comssnWvrInd property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isComssnWvrInd() {
        return comssnWvrInd;
    }

    /**
     * Sets the value of the comssnWvrInd property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setComssnWvrInd(Boolean value) {
        this.comssnWvrInd = value;
    }

    /**
     * Gets the value of the addtlInfInd property.
     *
     * @return
     *     possible object is
     *     {@link MessageIdentification2 }
     *
     */
    public MessageIdentification2 getAddtlInfInd() {
        return addtlInfInd;
    }

    /**
     * Sets the value of the addtlInfInd property.
     *
     * @param value
     *     allowed object is
     *     {@link MessageIdentification2 }
     *
     */
    public void setAddtlInfInd(MessageIdentification2 value) {
        this.addtlInfInd = value;
    }

    /**
     * Gets the value of the amtDtls property.
     *
     * @return
     *     possible object is
     *     {@link AmountAndCurrencyExchange3 }
     *
     */
    public AmountAndCurrencyExchange3 getAmtDtls() {
        return amtDtls;
    }

    /**
     * Sets the value of the amtDtls property.
     *
     * @param value
     *     allowed object is
     *     {@link AmountAndCurrencyExchange3 }
     *
     */
    public void setAmtDtls(AmountAndCurrencyExchange3 value) {
        this.amtDtls = value;
    }

    /**
     * Gets the value of the chrgs property.
     *
     * @return
     *     possible object is
     *     {@link Charges4 }
     *
     */
    public Charges4 getChrgs() {
        return chrgs;
    }

    /**
     * Sets the value of the chrgs property.
     *
     * @param value
     *     allowed object is
     *     {@link Charges4 }
     *
     */
    public void setChrgs(Charges4 value) {
        this.chrgs = value;
    }

    /**
     * Gets the value of the techInptChanl property.
     *
     * @return
     *     possible object is
     *     {@link TechnicalInputChannel1Choice }
     *
     */
    public TechnicalInputChannel1Choice getTechInptChanl() {
        return techInptChanl;
    }

    /**
     * Sets the value of the techInptChanl property.
     *
     * @param value
     *     allowed object is
     *     {@link TechnicalInputChannel1Choice }
     *
     */
    public void setTechInptChanl(TechnicalInputChannel1Choice value) {
        this.techInptChanl = value;
    }

    /**
     * Gets the value of the intrst property.
     *
     * @return
     *     possible object is
     *     {@link TransactionInterest3 }
     *
     */
    public TransactionInterest3 getIntrst() {
        return intrst;
    }

    /**
     * Sets the value of the intrst property.
     *
     * @param value
     *     allowed object is
     *     {@link TransactionInterest3 }
     *
     */
    public void setIntrst(TransactionInterest3 value) {
        this.intrst = value;
    }

    /**
     * Gets the value of the cardTx property.
     *
     * @return
     *     possible object is
     *     {@link CardEntry2 }
     *
     */
    public CardEntry2 getCardTx() {
        return cardTx;
    }

    /**
     * Sets the value of the cardTx property.
     *
     * @param value
     *     allowed object is
     *     {@link CardEntry2 }
     *
     */
    public void setCardTx(CardEntry2 value) {
        this.cardTx = value;
    }

    /**
     * Gets the value of the ntryDtls property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ntryDtls property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtryDtls().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntryDetails7 }
     *
     *
     */
    public EntryDetails7 getNtryDtls() {

        return this.ntryDtls;
    }

    /**
     * Gets the value of the addtlNtryInf property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAddtlNtryInf() {
        return addtlNtryInf;
    }

    /**
     * Sets the value of the addtlNtryInf property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAddtlNtryInf(String value) {
        this.addtlNtryInf = value;
    }

}
