
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionQuantities2Choice complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TransactionQuantities2Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Qty" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}FinancialInstrumentQuantityChoice"/>
 *         &lt;element name="OrgnlAndCurFaceAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}OriginalAndCurrentQuantities1"/>
 *         &lt;element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}ProprietaryQuantity1"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionQuantities2Choice", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "qty",
    "orgnlAndCurFaceAmt",
    "prtry"
})
public class TransactionQuantities2Choice {

    @XmlElement(name = "Qty", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public FinancialInstrumentQuantityChoice qty;
    @XmlElement(name = "OrgnlAndCurFaceAmt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public OriginalAndCurrentQuantities1 orgnlAndCurFaceAmt;
    @XmlElement(name = "Prtry", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public ProprietaryQuantity1 prtry;

    /**
     * Gets the value of the qty property.
     *
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantityChoice }
     *
     */
    public FinancialInstrumentQuantityChoice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     *
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantityChoice }
     *
     */
    public void setQty(FinancialInstrumentQuantityChoice value) {
        this.qty = value;
    }

    /**
     * Gets the value of the orgnlAndCurFaceAmt property.
     *
     * @return
     *     possible object is
     *     {@link OriginalAndCurrentQuantities1 }
     *
     */
    public OriginalAndCurrentQuantities1 getOrgnlAndCurFaceAmt() {
        return orgnlAndCurFaceAmt;
    }

    /**
     * Sets the value of the orgnlAndCurFaceAmt property.
     *
     * @param value
     *     allowed object is
     *     {@link OriginalAndCurrentQuantities1 }
     *
     */
    public void setOrgnlAndCurFaceAmt(OriginalAndCurrentQuantities1 value) {
        this.orgnlAndCurFaceAmt = value;
    }

    /**
     * Gets the value of the prtry property.
     *
     * @return
     *     possible object is
     *     {@link ProprietaryQuantity1 }
     *
     */
    public ProprietaryQuantity1 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     *
     * @param value
     *     allowed object is
     *     {@link ProprietaryQuantity1 }
     *
     */
    public void setPrtry(ProprietaryQuantity1 value) {
        this.prtry = value;
    }

}
