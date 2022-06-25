
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


/**
 * <p>Java class for CurrencyExchange5 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CurrencyExchange5">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SrcCcy" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}ActiveOrHistoricCurrencyCode"/>
 *         &lt;element name="TrgtCcy" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *         &lt;element name="UnitCcy" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *         &lt;element name="XchgRate" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}BaseOneRate"/>
 *         &lt;element name="CtrctId" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Max35Text" minOccurs="0"/>
 *         &lt;element name="QtnDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}ISODateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyExchange5", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "srcCcy",
    "trgtCcy",
    "unitCcy",
    "xchgRate",
    "ctrctId",
    "qtnDt"
})
public class CurrencyExchange5 {

    @XmlElement(name = "SrcCcy", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    public String srcCcy;
    @XmlElement(name = "TrgtCcy", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String trgtCcy;
    @XmlElement(name = "UnitCcy", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String unitCcy;
    @XmlElement(name = "XchgRate", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    public BigDecimal xchgRate;
    @XmlElement(name = "CtrctId", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String ctrctId;
    @XmlElement(name = "QtnDt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String qtnDt;

    /**
     * Gets the value of the srcCcy property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSrcCcy() {
        return srcCcy;
    }

    /**
     * Sets the value of the srcCcy property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSrcCcy(String value) {
        this.srcCcy = value;
    }

    /**
     * Gets the value of the trgtCcy property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTrgtCcy() {
        return trgtCcy;
    }

    /**
     * Sets the value of the trgtCcy property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTrgtCcy(String value) {
        this.trgtCcy = value;
    }

    /**
     * Gets the value of the unitCcy property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUnitCcy() {
        return unitCcy;
    }

    /**
     * Sets the value of the unitCcy property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUnitCcy(String value) {
        this.unitCcy = value;
    }

    /**
     * Gets the value of the xchgRate property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getXchgRate() {
        return xchgRate;
    }

    /**
     * Sets the value of the xchgRate property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setXchgRate(BigDecimal value) {
        this.xchgRate = value;
    }

    /**
     * Gets the value of the ctrctId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCtrctId() {
        return ctrctId;
    }

    /**
     * Sets the value of the ctrctId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCtrctId(String value) {
        this.ctrctId = value;
    }

    /**
     * Gets the value of the qtnDt property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getQtnDt() {
        return qtnDt;
    }

    /**
     * Sets the value of the qtnDt property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setQtnDt(String value) {
        this.qtnDt = value;
    }

}
