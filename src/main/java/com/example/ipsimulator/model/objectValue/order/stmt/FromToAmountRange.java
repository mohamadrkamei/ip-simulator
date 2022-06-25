
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FromToAmountRange complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="FromToAmountRange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FrAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}AmountRangeBoundary1"/>
 *         &lt;element name="ToAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}AmountRangeBoundary1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FromToAmountRange", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "frAmt",
    "toAmt"
})
public class FromToAmountRange {

    @XmlElement(name = "FrAmt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    public AmountRangeBoundary1 frAmt;
    @XmlElement(name = "ToAmt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    public AmountRangeBoundary1 toAmt;

    /**
     * Gets the value of the frAmt property.
     *
     * @return
     *     possible object is
     *     {@link AmountRangeBoundary1 }
     *
     */
    public AmountRangeBoundary1 getFrAmt() {
        return frAmt;
    }

    /**
     * Sets the value of the frAmt property.
     *
     * @param value
     *     allowed object is
     *     {@link AmountRangeBoundary1 }
     *
     */
    public void setFrAmt(AmountRangeBoundary1 value) {
        this.frAmt = value;
    }

    /**
     * Gets the value of the toAmt property.
     *
     * @return
     *     possible object is
     *     {@link AmountRangeBoundary1 }
     *
     */
    public AmountRangeBoundary1 getToAmt() {
        return toAmt;
    }

    /**
     * Sets the value of the toAmt property.
     *
     * @param value
     *     allowed object is
     *     {@link AmountRangeBoundary1 }
     *
     */
    public void setToAmt(AmountRangeBoundary1 value) {
        this.toAmt = value;
    }

}
