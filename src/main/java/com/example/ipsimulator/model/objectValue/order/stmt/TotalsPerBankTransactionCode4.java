
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for TotalsPerBankTransactionCode4 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TotalsPerBankTransactionCode4">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NbOfNtries" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Max15NumericText" minOccurs="0"/>
 *         &lt;element name="Sum" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}DecimalNumber" minOccurs="0"/>
 *         &lt;element name="TtlNetNtry" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}AmountAndDirection35" minOccurs="0"/>
 *         &lt;element name="FcstInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}TrueFalseIndicator" minOccurs="0"/>
 *         &lt;element name="BkTxCd" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}BankTransactionCodeStructure4"/>
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
@XmlType(name = "TotalsPerBankTransactionCode4", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "nbOfNtries",
    "sum",
    "ttlNetNtry",
    "fcstInd",
    "bkTxCd",
    "avlbty"
})
public class TotalsPerBankTransactionCode4 {

    @XmlElement(name = "NbOfNtries", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String nbOfNtries;
    @XmlElement(name = "Sum", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public BigDecimal sum;
    @XmlElement(name = "TtlNetNtry", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public AmountAndDirection35 ttlNetNtry;
    @XmlElement(name = "FcstInd", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public Boolean fcstInd;
    @XmlElement(name = "BkTxCd", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    public BankTransactionCodeStructure4 bkTxCd;
    @XmlElement(name = "Avlbty", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public List<CashAvailability1> avlbty;

    /**
     * Gets the value of the nbOfNtries property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNbOfNtries() {
        return nbOfNtries;
    }

    /**
     * Sets the value of the nbOfNtries property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNbOfNtries(String value) {
        this.nbOfNtries = value;
    }

    /**
     * Gets the value of the sum property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getSum() {
        return sum;
    }

    /**
     * Sets the value of the sum property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setSum(BigDecimal value) {
        this.sum = value;
    }

    /**
     * Gets the value of the ttlNetNtry property.
     *
     * @return
     *     possible object is
     *     {@link AmountAndDirection35 }
     *
     */
    public AmountAndDirection35 getTtlNetNtry() {
        return ttlNetNtry;
    }

    /**
     * Sets the value of the ttlNetNtry property.
     *
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection35 }
     *
     */
    public void setTtlNetNtry(AmountAndDirection35 value) {
        this.ttlNetNtry = value;
    }

    /**
     * Gets the value of the fcstInd property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isFcstInd() {
        return fcstInd;
    }

    /**
     * Sets the value of the fcstInd property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setFcstInd(Boolean value) {
        this.fcstInd = value;
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
