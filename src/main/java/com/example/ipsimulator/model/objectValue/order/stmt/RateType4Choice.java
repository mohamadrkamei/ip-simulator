
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


/**
 * <p>Java class for RateType4Choice complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="RateType4Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Pctg" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}PercentageRate"/>
 *         &lt;element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Max35Text"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateType4Choice", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "pctg",
    "othr"
})
public class RateType4Choice {

    @XmlElement(name = "Pctg", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public BigDecimal pctg;
    @XmlElement(name = "Othr", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String othr;

    /**
     * Gets the value of the pctg property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getPctg() {
        return pctg;
    }

    /**
     * Sets the value of the pctg property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setPctg(BigDecimal value) {
        this.pctg = value;
    }

    /**
     * Gets the value of the othr property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOthr(String value) {
        this.othr = value;
    }

}
