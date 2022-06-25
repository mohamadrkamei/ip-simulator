
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


/**
 * <p>Java class for FinancialInstrumentQuantityChoice complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="FinancialInstrumentQuantityChoice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Unit" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}DecimalNumber"/>
 *         &lt;element name="FaceAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}ImpliedCurrencyAndAmount"/>
 *         &lt;element name="AmtsdVal" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}ImpliedCurrencyAndAmount"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentQuantityChoice", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "unit",
    "faceAmt",
    "amtsdVal"
})
public class FinancialInstrumentQuantityChoice {

    @XmlElement(name = "Unit", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public BigDecimal unit;
    @XmlElement(name = "FaceAmt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public BigDecimal faceAmt;
    @XmlElement(name = "AmtsdVal", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public BigDecimal amtsdVal;

    /**
     * Gets the value of the unit property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setUnit(BigDecimal value) {
        this.unit = value;
    }

    /**
     * Gets the value of the faceAmt property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getFaceAmt() {
        return faceAmt;
    }

    /**
     * Sets the value of the faceAmt property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setFaceAmt(BigDecimal value) {
        this.faceAmt = value;
    }

    /**
     * Gets the value of the amtsdVal property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getAmtsdVal() {
        return amtsdVal;
    }

    /**
     * Sets the value of the amtsdVal property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setAmtsdVal(BigDecimal value) {
        this.amtsdVal = value;
    }

}
