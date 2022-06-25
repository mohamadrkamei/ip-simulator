
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardTransaction2Choice complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CardTransaction2Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Aggtd" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}CardAggregated1"/>
 *         &lt;element name="Indv" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}CardIndividualTransaction2"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardTransaction2Choice", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "aggtd",
    "indv"
})
public class CardTransaction2Choice {

    @XmlElement(name = "Aggtd", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public CardAggregated1 aggtd;
    @XmlElement(name = "Indv", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public CardIndividualTransaction2 indv;

    /**
     * Gets the value of the aggtd property.
     *
     * @return
     *     possible object is
     *     {@link CardAggregated1 }
     *
     */
    public CardAggregated1 getAggtd() {
        return aggtd;
    }

    /**
     * Sets the value of the aggtd property.
     *
     * @param value
     *     allowed object is
     *     {@link CardAggregated1 }
     *
     */
    public void setAggtd(CardAggregated1 value) {
        this.aggtd = value;
    }

    /**
     * Gets the value of the indv property.
     *
     * @return
     *     possible object is
     *     {@link CardIndividualTransaction2 }
     *
     */
    public CardIndividualTransaction2 getIndv() {
        return indv;
    }

    /**
     * Sets the value of the indv property.
     *
     * @param value
     *     allowed object is
     *     {@link CardIndividualTransaction2 }
     *
     */
    public void setIndv(CardIndividualTransaction2 value) {
        this.indv = value;
    }

}
