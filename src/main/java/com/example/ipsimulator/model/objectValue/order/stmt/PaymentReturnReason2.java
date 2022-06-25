
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for PaymentReturnReason2 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PaymentReturnReason2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrgnlBkTxCd" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}BankTransactionCodeStructure4" minOccurs="0"/>
 *         &lt;element name="Orgtr" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}PartyIdentification43" minOccurs="0"/>
 *         &lt;element name="Rsn" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}ReturnReason5Choice" minOccurs="0"/>
 *         &lt;element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Max105Text" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentReturnReason2", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "orgnlBkTxCd",
    "orgtr",
    "rsn",
    "addtlInf"
})
public class PaymentReturnReason2 {

    @XmlElement(name = "OrgnlBkTxCd", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public BankTransactionCodeStructure4 orgnlBkTxCd;
    @XmlElement(name = "Orgtr", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public PartyIdentification43 orgtr;
    @XmlElement(name = "Rsn", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public ReturnReason5Choice rsn;
    @XmlElement(name = "AddtlInf", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public List<String> addtlInf;

    /**
     * Gets the value of the orgnlBkTxCd property.
     *
     * @return
     *     possible object is
     *     {@link BankTransactionCodeStructure4 }
     *
     */
    public BankTransactionCodeStructure4 getOrgnlBkTxCd() {
        return orgnlBkTxCd;
    }

    /**
     * Sets the value of the orgnlBkTxCd property.
     *
     * @param value
     *     allowed object is
     *     {@link BankTransactionCodeStructure4 }
     *
     */
    public void setOrgnlBkTxCd(BankTransactionCodeStructure4 value) {
        this.orgnlBkTxCd = value;
    }

    /**
     * Gets the value of the orgtr property.
     *
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *
     */
    public PartyIdentification43 getOrgtr() {
        return orgtr;
    }

    /**
     * Sets the value of the orgtr property.
     *
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *
     */
    public void setOrgtr(PartyIdentification43 value) {
        this.orgtr = value;
    }

    /**
     * Gets the value of the rsn property.
     *
     * @return
     *     possible object is
     *     {@link ReturnReason5Choice }
     *
     */
    public ReturnReason5Choice getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     *
     * @param value
     *     allowed object is
     *     {@link ReturnReason5Choice }
     *
     */
    public void setRsn(ReturnReason5Choice value) {
        this.rsn = value;
    }

    /**
     * Gets the value of the addtlInf property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlInf property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<String>();
        }
        return this.addtlInf;
    }

}
