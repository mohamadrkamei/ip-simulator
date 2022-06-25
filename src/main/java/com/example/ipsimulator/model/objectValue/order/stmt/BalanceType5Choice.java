
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for BalanceType5Choice complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="BalanceType5Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Cd" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}BalanceType12Code"/>
 *         &lt;element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Max35Text"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceType5Choice", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "cd",
    "prtry"
})
public class BalanceType5Choice {

    @XmlElement(name = "Cd", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    @XmlSchemaType(name = "string")
    public BalanceType12Code cd;
    @XmlElement(name = "Prtry", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String prtry;

    /**
     * Gets the value of the cd property.
     *
     * @return
     *     possible object is
     *     {@link BalanceType12Code }
     *
     */
    public BalanceType12Code getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     *
     * @param value
     *     allowed object is
     *     {@link BalanceType12Code }
     *
     */
    public void setCd(BalanceType12Code value) {
        this.cd = value;
    }

    /**
     * Gets the value of the prtry property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPrtry(String value) {
        this.prtry = value;
    }

}
