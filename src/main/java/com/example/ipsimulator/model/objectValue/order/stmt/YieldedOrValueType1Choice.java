
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for YieldedOrValueType1Choice complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="YieldedOrValueType1Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Yldd" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}YesNoIndicator"/>
 *         &lt;element name="ValTp" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}PriceValueType1Code"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "YieldedOrValueType1Choice", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "yldd",
    "valTp"
})
public class YieldedOrValueType1Choice {

    @XmlElement(name = "Yldd", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public Boolean yldd;
    @XmlElement(name = "ValTp", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    @XmlSchemaType(name = "string")
    public PriceValueType1Code valTp;

    /**
     * Gets the value of the yldd property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isYldd() {
        return yldd;
    }

    /**
     * Sets the value of the yldd property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setYldd(Boolean value) {
        this.yldd = value;
    }

    /**
     * Gets the value of the valTp property.
     *
     * @return
     *     possible object is
     *     {@link PriceValueType1Code }
     *
     */
    public PriceValueType1Code getValTp() {
        return valTp;
    }

    /**
     * Sets the value of the valTp property.
     *
     * @param value
     *     allowed object is
     *     {@link PriceValueType1Code }
     *
     */
    public void setValTp(PriceValueType1Code value) {
        this.valTp = value;
    }

}
