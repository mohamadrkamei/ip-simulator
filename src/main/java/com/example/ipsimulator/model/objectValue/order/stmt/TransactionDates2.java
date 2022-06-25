
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for TransactionDates2 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TransactionDates2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccptncDtTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}ISODateTime" minOccurs="0"/>
 *         &lt;element name="TradActvtyCtrctlSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}ISODate" minOccurs="0"/>
 *         &lt;element name="TradDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}ISODate" minOccurs="0"/>
 *         &lt;element name="IntrBkSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}ISODate" minOccurs="0"/>
 *         &lt;element name="StartDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}ISODate" minOccurs="0"/>
 *         &lt;element name="EndDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}ISODate" minOccurs="0"/>
 *         &lt;element name="TxDtTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}ISODateTime" minOccurs="0"/>
 *         &lt;element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}ProprietaryDate2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionDates2", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "accptncDtTm",
    "tradActvtyCtrctlSttlmDt",
    "tradDt",
    "intrBkSttlmDt",
    "startDt",
    "endDt",
    "txDtTm",
    "prtry"
})
public class TransactionDates2 {

    @XmlElement(name = "AccptncDtTm", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String accptncDtTm;
    @XmlElement(name = "TradActvtyCtrctlSttlmDt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String tradActvtyCtrctlSttlmDt;
    @XmlElement(name = "TradDt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String tradDt;
    @XmlElement(name = "IntrBkSttlmDt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String intrBkSttlmDt;
    @XmlElement(name = "StartDt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String startDt;
    @XmlElement(name = "EndDt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String endDt;
    @XmlElement(name = "TxDtTm", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String txDtTm;
    @XmlElement(name = "Prtry", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public List<ProprietaryDate2> prtry;

    /**
     * Gets the value of the accptncDtTm property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAccptncDtTm() {
        return accptncDtTm;
    }

    /**
     * Sets the value of the accptncDtTm property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAccptncDtTm(String value) {
        this.accptncDtTm = value;
    }

    /**
     * Gets the value of the tradActvtyCtrctlSttlmDt property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTradActvtyCtrctlSttlmDt() {
        return tradActvtyCtrctlSttlmDt;
    }

    /**
     * Sets the value of the tradActvtyCtrctlSttlmDt property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTradActvtyCtrctlSttlmDt(String value) {
        this.tradActvtyCtrctlSttlmDt = value;
    }

    /**
     * Gets the value of the tradDt property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTradDt(String value) {
        this.tradDt = value;
    }

    /**
     * Gets the value of the intrBkSttlmDt property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIntrBkSttlmDt() {
        return intrBkSttlmDt;
    }

    /**
     * Sets the value of the intrBkSttlmDt property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIntrBkSttlmDt(String value) {
        this.intrBkSttlmDt = value;
    }

    /**
     * Gets the value of the startDt property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStartDt(String value) {
        this.startDt = value;
    }

    /**
     * Gets the value of the endDt property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEndDt() {
        return endDt;
    }

    /**
     * Sets the value of the endDt property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEndDt(String value) {
        this.endDt = value;
    }

    /**
     * Gets the value of the txDtTm property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTxDtTm() {
        return txDtTm;
    }

    /**
     * Sets the value of the txDtTm property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTxDtTm(String value) {
        this.txDtTm = value;
    }

    /**
     * Gets the value of the prtry property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prtry property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrtry().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProprietaryDate2 }
     *
     *
     */
    public List<ProprietaryDate2> getPrtry() {
        if (prtry == null) {
            prtry = new ArrayList<ProprietaryDate2>();
        }
        return this.prtry;
    }

}
