
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for PaymentContext3 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PaymentContext3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CardPres" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}TrueFalseIndicator" minOccurs="0"/>
 *         &lt;element name="CrdhldrPres" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}TrueFalseIndicator" minOccurs="0"/>
 *         &lt;element name="OnLineCntxt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}TrueFalseIndicator" minOccurs="0"/>
 *         &lt;element name="AttndncCntxt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}AttendanceContext1Code" minOccurs="0"/>
 *         &lt;element name="TxEnvt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}TransactionEnvironment1Code" minOccurs="0"/>
 *         &lt;element name="TxChanl" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}TransactionChannel1Code" minOccurs="0"/>
 *         &lt;element name="AttndntMsgCpbl" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}TrueFalseIndicator" minOccurs="0"/>
 *         &lt;element name="AttndntLang" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}ISO2ALanguageCode" minOccurs="0"/>
 *         &lt;element name="CardDataNtryMd" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}CardDataReading1Code"/>
 *         &lt;element name="FllbckInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}TrueFalseIndicator" minOccurs="0"/>
 *         &lt;element name="AuthntcnMtd" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}CardholderAuthentication2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentContext3", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "cardPres",
    "crdhldrPres",
    "onLineCntxt",
    "attndncCntxt",
    "txEnvt",
    "txChanl",
    "attndntMsgCpbl",
    "attndntLang",
    "cardDataNtryMd",
    "fllbckInd",
    "authntcnMtd"
})
public class PaymentContext3 {

    @XmlElement(name = "CardPres", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public Boolean cardPres;
    @XmlElement(name = "CrdhldrPres", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public Boolean crdhldrPres;
    @XmlElement(name = "OnLineCntxt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public Boolean onLineCntxt;
    @XmlElement(name = "AttndncCntxt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    @XmlSchemaType(name = "string")
    public AttendanceContext1Code attndncCntxt;
    @XmlElement(name = "TxEnvt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    @XmlSchemaType(name = "string")
    public TransactionEnvironment1Code txEnvt;
    @XmlElement(name = "TxChanl", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    @XmlSchemaType(name = "string")
    public TransactionChannel1Code txChanl;
    @XmlElement(name = "AttndntMsgCpbl", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public Boolean attndntMsgCpbl;
    @XmlElement(name = "AttndntLang", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String attndntLang;
    @XmlElement(name = "CardDataNtryMd", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    @XmlSchemaType(name = "string")
    public CardDataReading1Code cardDataNtryMd;
    @XmlElement(name = "FllbckInd", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public Boolean fllbckInd;
    @XmlElement(name = "AuthntcnMtd", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public CardholderAuthentication2 authntcnMtd;

    /**
     * Gets the value of the cardPres property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isCardPres() {
        return cardPres;
    }

    /**
     * Sets the value of the cardPres property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setCardPres(Boolean value) {
        this.cardPres = value;
    }

    /**
     * Gets the value of the crdhldrPres property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isCrdhldrPres() {
        return crdhldrPres;
    }

    /**
     * Sets the value of the crdhldrPres property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setCrdhldrPres(Boolean value) {
        this.crdhldrPres = value;
    }

    /**
     * Gets the value of the onLineCntxt property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isOnLineCntxt() {
        return onLineCntxt;
    }

    /**
     * Sets the value of the onLineCntxt property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setOnLineCntxt(Boolean value) {
        this.onLineCntxt = value;
    }

    /**
     * Gets the value of the attndncCntxt property.
     *
     * @return
     *     possible object is
     *     {@link AttendanceContext1Code }
     *
     */
    public AttendanceContext1Code getAttndncCntxt() {
        return attndncCntxt;
    }

    /**
     * Sets the value of the attndncCntxt property.
     *
     * @param value
     *     allowed object is
     *     {@link AttendanceContext1Code }
     *
     */
    public void setAttndncCntxt(AttendanceContext1Code value) {
        this.attndncCntxt = value;
    }

    /**
     * Gets the value of the txEnvt property.
     *
     * @return
     *     possible object is
     *     {@link TransactionEnvironment1Code }
     *
     */
    public TransactionEnvironment1Code getTxEnvt() {
        return txEnvt;
    }

    /**
     * Sets the value of the txEnvt property.
     *
     * @param value
     *     allowed object is
     *     {@link TransactionEnvironment1Code }
     *
     */
    public void setTxEnvt(TransactionEnvironment1Code value) {
        this.txEnvt = value;
    }

    /**
     * Gets the value of the txChanl property.
     *
     * @return
     *     possible object is
     *     {@link TransactionChannel1Code }
     *
     */
    public TransactionChannel1Code getTxChanl() {
        return txChanl;
    }

    /**
     * Sets the value of the txChanl property.
     *
     * @param value
     *     allowed object is
     *     {@link TransactionChannel1Code }
     *
     */
    public void setTxChanl(TransactionChannel1Code value) {
        this.txChanl = value;
    }

    /**
     * Gets the value of the attndntMsgCpbl property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isAttndntMsgCpbl() {
        return attndntMsgCpbl;
    }

    /**
     * Sets the value of the attndntMsgCpbl property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setAttndntMsgCpbl(Boolean value) {
        this.attndntMsgCpbl = value;
    }

    /**
     * Gets the value of the attndntLang property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAttndntLang() {
        return attndntLang;
    }

    /**
     * Sets the value of the attndntLang property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAttndntLang(String value) {
        this.attndntLang = value;
    }

    /**
     * Gets the value of the cardDataNtryMd property.
     *
     * @return
     *     possible object is
     *     {@link CardDataReading1Code }
     *
     */
    public CardDataReading1Code getCardDataNtryMd() {
        return cardDataNtryMd;
    }

    /**
     * Sets the value of the cardDataNtryMd property.
     *
     * @param value
     *     allowed object is
     *     {@link CardDataReading1Code }
     *
     */
    public void setCardDataNtryMd(CardDataReading1Code value) {
        this.cardDataNtryMd = value;
    }

    /**
     * Gets the value of the fllbckInd property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isFllbckInd() {
        return fllbckInd;
    }

    /**
     * Sets the value of the fllbckInd property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setFllbckInd(Boolean value) {
        this.fllbckInd = value;
    }

    /**
     * Gets the value of the authntcnMtd property.
     *
     * @return
     *     possible object is
     *     {@link CardholderAuthentication2 }
     *
     */
    public CardholderAuthentication2 getAuthntcnMtd() {
        return authntcnMtd;
    }

    /**
     * Sets the value of the authntcnMtd property.
     *
     * @param value
     *     allowed object is
     *     {@link CardholderAuthentication2 }
     *
     */
    public void setAuthntcnMtd(CardholderAuthentication2 value) {
        this.authntcnMtd = value;
    }

}
