
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BankTransactionCodeStructure4 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="BankTransactionCodeStructure4">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Domn" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}BankTransactionCodeStructure5" minOccurs="0"/>
 *         &lt;element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}ProprietaryBankTransactionCodeStructure1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankTransactionCodeStructure4", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "domn",
    "prtry"
})
public class BankTransactionCodeStructure4 {

    @XmlElement(name = "Domn", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public BankTransactionCodeStructure5 domn;
    @XmlElement(name = "Prtry", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public ProprietaryBankTransactionCodeStructure1 prtry;

    /**
     * Gets the value of the domn property.
     *
     * @return
     *     possible object is
     *     {@link BankTransactionCodeStructure5 }
     *
     */
    public BankTransactionCodeStructure5 getDomn() {
        return domn;
    }

    /**
     * Sets the value of the domn property.
     *
     * @param value
     *     allowed object is
     *     {@link BankTransactionCodeStructure5 }
     *
     */
    public void setDomn(BankTransactionCodeStructure5 value) {
        this.domn = value;
    }

    /**
     * Gets the value of the prtry property.
     *
     * @return
     *     possible object is
     *     {@link ProprietaryBankTransactionCodeStructure1 }
     *
     */
    public ProprietaryBankTransactionCodeStructure1 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     *
     * @param value
     *     allowed object is
     *     {@link ProprietaryBankTransactionCodeStructure1 }
     *
     */
    public void setPrtry(ProprietaryBankTransactionCodeStructure1 value) {
        this.prtry = value;
    }

}
