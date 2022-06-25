
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for AccountInterest3 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AccountInterest3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}InterestType1Choice" minOccurs="0"/>
 *         &lt;element name="Rate" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Rate3" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FrToDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}DateTimePeriodDetails" minOccurs="0"/>
 *         &lt;element name="Rsn" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Max35Text" minOccurs="0"/>
 *         &lt;element name="Tax" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}TaxCharges2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountInterest3", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "tp",
    "rate",
    "frToDt",
    "rsn",
    "tax"
})
public class AccountInterest3 {

    @XmlElement(name = "Tp", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public InterestType1Choice tp;
    @XmlElement(name = "Rate", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public List<Rate3> rate;
    @XmlElement(name = "FrToDt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public DateTimePeriodDetails frToDt;
    @XmlElement(name = "Rsn", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String rsn;
    @XmlElement(name = "Tax", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public TaxCharges2 tax;

    /**
     * Gets the value of the tp property.
     *
     * @return
     *     possible object is
     *     {@link InterestType1Choice }
     *
     */
    public InterestType1Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     *
     * @param value
     *     allowed object is
     *     {@link InterestType1Choice }
     *
     */
    public void setTp(InterestType1Choice value) {
        this.tp = value;
    }

    /**
     * Gets the value of the rate property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rate property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRate().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rate3 }
     *
     *
     */
    public List<Rate3> getRate() {
        if (rate == null) {
            rate = new ArrayList<Rate3>();
        }
        return this.rate;
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
     * Gets the value of the rsn property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRsn(String value) {
        this.rsn = value;
    }

    /**
     * Gets the value of the tax property.
     *
     * @return
     *     possible object is
     *     {@link TaxCharges2 }
     *
     */
    public TaxCharges2 getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     *
     * @param value
     *     allowed object is
     *     {@link TaxCharges2 }
     *
     */
    public void setTax(TaxCharges2 value) {
        this.tax = value;
    }

}
