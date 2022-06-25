
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for CardIndividualTransaction2 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CardIndividualTransaction2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ICCRltdData" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Max1025Text" minOccurs="0"/>
 *         &lt;element name="PmtCntxt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}PaymentContext3" minOccurs="0"/>
 *         &lt;element name="AddtlSvc" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}CardPaymentServiceType2Code" minOccurs="0"/>
 *         &lt;element name="TxCtgy" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}ExternalCardTransactionCategory1Code" minOccurs="0"/>
 *         &lt;element name="SaleRcncltnId" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Max35Text" minOccurs="0"/>
 *         &lt;element name="SaleRefNb" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Max35Text" minOccurs="0"/>
 *         &lt;element name="RePresntmntRsn" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}ExternalRePresentmentReason1Code" minOccurs="0"/>
 *         &lt;element name="SeqNb" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Max35Text" minOccurs="0"/>
 *         &lt;element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}TransactionIdentifier1" minOccurs="0"/>
 *         &lt;element name="Pdct" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Product2" minOccurs="0"/>
 *         &lt;element name="VldtnDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}ISODate" minOccurs="0"/>
 *         &lt;element name="VldtnSeqNb" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Max35Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardIndividualTransaction2", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "iccRltdData",
    "pmtCntxt",
    "addtlSvc",
    "txCtgy",
    "saleRcncltnId",
    "saleRefNb",
    "rePresntmntRsn",
    "seqNb",
    "txId",
    "pdct",
    "vldtnDt",
    "vldtnSeqNb"
})
public class CardIndividualTransaction2 {

    @XmlElement(name = "ICCRltdData", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String iccRltdData;
    @XmlElement(name = "PmtCntxt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public PaymentContext3 pmtCntxt;
    @XmlElement(name = "AddtlSvc", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    @XmlSchemaType(name = "string")
    public CardPaymentServiceType2Code addtlSvc;
    @XmlElement(name = "TxCtgy", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String txCtgy;
    @XmlElement(name = "SaleRcncltnId", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String saleRcncltnId;
    @XmlElement(name = "SaleRefNb", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String saleRefNb;
    @XmlElement(name = "RePresntmntRsn", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String rePresntmntRsn;
    @XmlElement(name = "SeqNb", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String seqNb;
    @XmlElement(name = "TxId", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public TransactionIdentifier1 txId;
    @XmlElement(name = "Pdct", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public Product2 pdct;
    @XmlElement(name = "VldtnDt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String vldtnDt;
    @XmlElement(name = "VldtnSeqNb", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String vldtnSeqNb;

    /**
     * Gets the value of the iccRltdData property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getICCRltdData() {
        return iccRltdData;
    }

    /**
     * Sets the value of the iccRltdData property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setICCRltdData(String value) {
        this.iccRltdData = value;
    }

    /**
     * Gets the value of the pmtCntxt property.
     *
     * @return
     *     possible object is
     *     {@link PaymentContext3 }
     *
     */
    public PaymentContext3 getPmtCntxt() {
        return pmtCntxt;
    }

    /**
     * Sets the value of the pmtCntxt property.
     *
     * @param value
     *     allowed object is
     *     {@link PaymentContext3 }
     *
     */
    public void setPmtCntxt(PaymentContext3 value) {
        this.pmtCntxt = value;
    }

    /**
     * Gets the value of the addtlSvc property.
     *
     * @return
     *     possible object is
     *     {@link CardPaymentServiceType2Code }
     *
     */
    public CardPaymentServiceType2Code getAddtlSvc() {
        return addtlSvc;
    }

    /**
     * Sets the value of the addtlSvc property.
     *
     * @param value
     *     allowed object is
     *     {@link CardPaymentServiceType2Code }
     *
     */
    public void setAddtlSvc(CardPaymentServiceType2Code value) {
        this.addtlSvc = value;
    }

    /**
     * Gets the value of the txCtgy property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTxCtgy() {
        return txCtgy;
    }

    /**
     * Sets the value of the txCtgy property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTxCtgy(String value) {
        this.txCtgy = value;
    }

    /**
     * Gets the value of the saleRcncltnId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSaleRcncltnId() {
        return saleRcncltnId;
    }

    /**
     * Sets the value of the saleRcncltnId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSaleRcncltnId(String value) {
        this.saleRcncltnId = value;
    }

    /**
     * Gets the value of the saleRefNb property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSaleRefNb() {
        return saleRefNb;
    }

    /**
     * Sets the value of the saleRefNb property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSaleRefNb(String value) {
        this.saleRefNb = value;
    }

    /**
     * Gets the value of the rePresntmntRsn property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRePresntmntRsn() {
        return rePresntmntRsn;
    }

    /**
     * Sets the value of the rePresntmntRsn property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRePresntmntRsn(String value) {
        this.rePresntmntRsn = value;
    }

    /**
     * Gets the value of the seqNb property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSeqNb() {
        return seqNb;
    }

    /**
     * Sets the value of the seqNb property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSeqNb(String value) {
        this.seqNb = value;
    }

    /**
     * Gets the value of the txId property.
     *
     * @return
     *     possible object is
     *     {@link TransactionIdentifier1 }
     *
     */
    public TransactionIdentifier1 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     *
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifier1 }
     *
     */
    public void setTxId(TransactionIdentifier1 value) {
        this.txId = value;
    }

    /**
     * Gets the value of the pdct property.
     *
     * @return
     *     possible object is
     *     {@link Product2 }
     *
     */
    public Product2 getPdct() {
        return pdct;
    }

    /**
     * Sets the value of the pdct property.
     *
     * @param value
     *     allowed object is
     *     {@link Product2 }
     *
     */
    public void setPdct(Product2 value) {
        this.pdct = value;
    }

    /**
     * Gets the value of the vldtnDt property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVldtnDt() {
        return vldtnDt;
    }

    /**
     * Sets the value of the vldtnDt property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVldtnDt(String value) {
        this.vldtnDt = value;
    }

    /**
     * Gets the value of the vldtnSeqNb property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVldtnSeqNb() {
        return vldtnSeqNb;
    }

    /**
     * Sets the value of the vldtnSeqNb property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVldtnSeqNb(String value) {
        this.vldtnSeqNb = value;
    }

}
