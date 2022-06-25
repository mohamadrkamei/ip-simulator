
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for TotalTransactions5 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TotalTransactions5">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TtlNtries" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}NumberAndSumOfTransactions4" minOccurs="0"/>
 *         &lt;element name="TtlCdtNtries" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}NumberAndSumOfTransactions1" minOccurs="0"/>
 *         &lt;element name="TtlDbtNtries" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}NumberAndSumOfTransactions1" minOccurs="0"/>
 *         &lt;element name="TtlNtriesPerBkTxCd" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}TotalsPerBankTransactionCode4" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalTransactions5", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "ttlNtries",
    "ttlCdtNtries",
    "ttlDbtNtries",
    "ttlNtriesPerBkTxCd"
})
public class TotalTransactions5 {

    @XmlElement(name = "TtlNtries", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public NumberAndSumOfTransactions4 ttlNtries;
    @XmlElement(name = "TtlCdtNtries", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public NumberAndSumOfTransactions1 ttlCdtNtries;
    @XmlElement(name = "TtlDbtNtries", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public NumberAndSumOfTransactions1 ttlDbtNtries;
    @XmlElement(name = "TtlNtriesPerBkTxCd", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public List<TotalsPerBankTransactionCode4> ttlNtriesPerBkTxCd;

    /**
     * Gets the value of the ttlNtries property.
     *
     * @return
     *     possible object is
     *     {@link NumberAndSumOfTransactions4 }
     *
     */
    public NumberAndSumOfTransactions4 getTtlNtries() {
        return ttlNtries;
    }

    /**
     * Sets the value of the ttlNtries property.
     *
     * @param value
     *     allowed object is
     *     {@link NumberAndSumOfTransactions4 }
     *
     */
    public void setTtlNtries(NumberAndSumOfTransactions4 value) {
        this.ttlNtries = value;
    }

    /**
     * Gets the value of the ttlCdtNtries property.
     *
     * @return
     *     possible object is
     *     {@link NumberAndSumOfTransactions1 }
     *
     */
    public NumberAndSumOfTransactions1 getTtlCdtNtries() {
        return ttlCdtNtries;
    }

    /**
     * Sets the value of the ttlCdtNtries property.
     *
     * @param value
     *     allowed object is
     *     {@link NumberAndSumOfTransactions1 }
     *
     */
    public void setTtlCdtNtries(NumberAndSumOfTransactions1 value) {
        this.ttlCdtNtries = value;
    }

    /**
     * Gets the value of the ttlDbtNtries property.
     *
     * @return
     *     possible object is
     *     {@link NumberAndSumOfTransactions1 }
     *
     */
    public NumberAndSumOfTransactions1 getTtlDbtNtries() {
        return ttlDbtNtries;
    }

    /**
     * Sets the value of the ttlDbtNtries property.
     *
     * @param value
     *     allowed object is
     *     {@link NumberAndSumOfTransactions1 }
     *
     */
    public void setTtlDbtNtries(NumberAndSumOfTransactions1 value) {
        this.ttlDbtNtries = value;
    }

    /**
     * Gets the value of the ttlNtriesPerBkTxCd property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ttlNtriesPerBkTxCd property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTtlNtriesPerBkTxCd().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TotalsPerBankTransactionCode4 }
     *
     *
     */
    public List<TotalsPerBankTransactionCode4> getTtlNtriesPerBkTxCd() {
        if (ttlNtriesPerBkTxCd == null) {
            ttlNtriesPerBkTxCd = new ArrayList<TotalsPerBankTransactionCode4>();
        }
        return this.ttlNtriesPerBkTxCd;
    }

}
