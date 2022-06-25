
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;


/**
 * <p>Java class for ActiveOrHistoricCurrencyAnd13DecimalAmount complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ActiveOrHistoricCurrencyAnd13DecimalAmount">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:iso:std:iso:20022:tech:xsd:camt.053.001.06>ActiveOrHistoricCurrencyAnd13DecimalAmount_SimpleType">
 *       &lt;attribute name="Ccy" use="required" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}ActiveOrHistoricCurrencyCode" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActiveOrHistoricCurrencyAnd13DecimalAmount", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "value"
})
public class ActiveOrHistoricCurrencyAnd13DecimalAmount {

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
