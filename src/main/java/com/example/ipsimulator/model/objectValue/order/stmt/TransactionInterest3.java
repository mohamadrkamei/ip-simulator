
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for TransactionInterest3 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TransactionInterest3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TtlIntrstAndTaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         &lt;element name="Rcrd" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}InterestRecord1" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionInterest3", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "ttlIntrstAndTaxAmt",
    "rcrd"
})
public class TransactionInterest3 {

    @XmlElement(name = "TtlIntrstAndTaxAmt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public ActiveOrHistoricCurrencyAndAmount ttlIntrstAndTaxAmt;
    @XmlElement(name = "Rcrd", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public List<InterestRecord1> rcrd;

    /**
     * Gets the value of the ttlIntrstAndTaxAmt property.
     *
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *
     */
    public ActiveOrHistoricCurrencyAndAmount getTtlIntrstAndTaxAmt() {
        return ttlIntrstAndTaxAmt;
    }

    /**
     * Sets the value of the ttlIntrstAndTaxAmt property.
     *
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *
     */
    public void setTtlIntrstAndTaxAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlIntrstAndTaxAmt = value;
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
     * {@link InterestRecord1 }
     *
     *
     */
    public List<InterestRecord1> getRcrd() {
        if (rcrd == null) {
            rcrd = new ArrayList<InterestRecord1>();
        }
        return this.rcrd;
    }

}
