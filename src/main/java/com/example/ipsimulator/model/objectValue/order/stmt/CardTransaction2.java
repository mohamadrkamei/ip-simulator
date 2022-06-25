
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardTransaction2 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CardTransaction2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Card" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}PaymentCard4" minOccurs="0"/>
 *         &lt;element name="POI" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}PointOfInteraction1" minOccurs="0"/>
 *         &lt;element name="Tx" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}CardTransaction2Choice" minOccurs="0"/>
 *         &lt;element name="PrePdAcct" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}CashAccount24" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardTransaction2", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "card",
    "poi",
    "tx",
    "prePdAcct"
})
public class CardTransaction2 {

    @XmlElement(name = "Card", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public PaymentCard4 card;
    @XmlElement(name = "POI", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public PointOfInteraction1 poi;
    @XmlElement(name = "Tx", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public CardTransaction2Choice tx;
    @XmlElement(name = "PrePdAcct", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public CashAccount24 prePdAcct;

    /**
     * Gets the value of the card property.
     *
     * @return
     *     possible object is
     *     {@link PaymentCard4 }
     *
     */
    public PaymentCard4 getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     *
     * @param value
     *     allowed object is
     *     {@link PaymentCard4 }
     *
     */
    public void setCard(PaymentCard4 value) {
        this.card = value;
    }

    /**
     * Gets the value of the poi property.
     *
     * @return
     *     possible object is
     *     {@link PointOfInteraction1 }
     *
     */
    public PointOfInteraction1 getPOI() {
        return poi;
    }

    /**
     * Sets the value of the poi property.
     *
     * @param value
     *     allowed object is
     *     {@link PointOfInteraction1 }
     *
     */
    public void setPOI(PointOfInteraction1 value) {
        this.poi = value;
    }

    /**
     * Gets the value of the tx property.
     *
     * @return
     *     possible object is
     *     {@link CardTransaction2Choice }
     *
     */
    public CardTransaction2Choice getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     *
     * @param value
     *     allowed object is
     *     {@link CardTransaction2Choice }
     *
     */
    public void setTx(CardTransaction2Choice value) {
        this.tx = value;
    }

    /**
     * Gets the value of the prePdAcct property.
     *
     * @return
     *     possible object is
     *     {@link CashAccount24 }
     *
     */
    public CashAccount24 getPrePdAcct() {
        return prePdAcct;
    }

    /**
     * Sets the value of the prePdAcct property.
     *
     * @param value
     *     allowed object is
     *     {@link CashAccount24 }
     *
     */
    public void setPrePdAcct(CashAccount24 value) {
        this.prePdAcct = value;
    }

}
