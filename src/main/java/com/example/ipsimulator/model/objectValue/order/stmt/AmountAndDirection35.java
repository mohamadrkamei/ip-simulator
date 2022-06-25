
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;


/**
 * <p>Java class for AmountAndDirection35 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AmountAndDirection35">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}NonNegativeDecimalNumber"/>
 *         &lt;element name="CdtDbtInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}CreditDebitCode"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountAndDirection35", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "amt",
    "cdtDbtInd"
})
public class AmountAndDirection35 {

    @XmlElement(name = "Amt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    public BigDecimal amt;
    @XmlElement(name = "CdtDbtInd", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    @XmlSchemaType(name = "string")
    public CreditDebitCode cdtDbtInd;

    /**
     * Gets the value of the amt property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setAmt(BigDecimal value) {
        this.amt = value;
    }

    /**
     * Gets the value of the cdtDbtInd property.
     *
     * @return
     *     possible object is
     *     {@link CreditDebitCode }
     *
     */
    public CreditDebitCode getCdtDbtInd() {
        return cdtDbtInd;
    }

    /**
     * Sets the value of the cdtDbtInd property.
     *
     * @param value
     *     allowed object is
     *     {@link CreditDebitCode }
     *
     */
    public void setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
    }

}
