
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionIdentifier1 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TransactionIdentifier1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TxDtTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}ISODateTime"/>
 *         &lt;element name="TxRef" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Max35Text"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionIdentifier1", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "txDtTm",
    "txRef"
})
public class TransactionIdentifier1 {

    @XmlElement(name = "TxDtTm", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    public String txDtTm;
    @XmlElement(name = "TxRef", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    public String txRef;

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
     * Gets the value of the txRef property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTxRef() {
        return txRef;
    }

    /**
     * Sets the value of the txRef property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTxRef(String value) {
        this.txRef = value;
    }

}
