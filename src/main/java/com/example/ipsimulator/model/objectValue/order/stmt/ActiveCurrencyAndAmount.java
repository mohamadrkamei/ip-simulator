
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;


/**
 * <p>Java class for ActiveCurrencyAndAmount complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ActiveCurrencyAndAmount">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:iso:std:iso:20022:tech:xsd:camt.053.001.06>ActiveCurrencyAndAmount_SimpleType">
 *       &lt;attribute name="Ccy" use="required" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}ActiveCurrencyCode" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActiveCurrencyAndAmount", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "value"
})
public class ActiveCurrencyAndAmount {

    @XmlValue
    public BigDecimal value;
    @XmlAttribute(name = "Ccy", required = true)
    public String ccy;

    /**
     * Gets the value of the value property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the ccy property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCcy(String value) {
        this.ccy = value;
    }

}
