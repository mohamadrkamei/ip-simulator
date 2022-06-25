
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


/**
 * <p>Java class for AmountRangeBoundary1 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AmountRangeBoundary1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BdryAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}ImpliedCurrencyAndAmount"/>
 *         &lt;element name="Incl" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}YesNoIndicator"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountRangeBoundary1", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "bdryAmt",
    "incl"
})
public class AmountRangeBoundary1 {

    @XmlElement(name = "BdryAmt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    public BigDecimal bdryAmt;
    @XmlElement(name = "Incl", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public boolean incl;

    /**
     * Gets the value of the bdryAmt property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getBdryAmt() {
        return bdryAmt;
    }

    /**
     * Sets the value of the bdryAmt property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setBdryAmt(BigDecimal value) {
        this.bdryAmt = value;
    }

    /**
     * Gets the value of the incl property.
     *
     */
    public boolean isIncl() {
        return incl;
    }

    /**
     * Sets the value of the incl property.
     *
     */
    public void setIncl(boolean value) {
        this.incl = value;
    }

}
