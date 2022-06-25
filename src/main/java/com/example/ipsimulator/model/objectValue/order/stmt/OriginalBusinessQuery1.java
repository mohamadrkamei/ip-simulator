
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OriginalBusinessQuery1 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="OriginalBusinessQuery1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MsgId" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Max35Text"/>
 *         &lt;element name="MsgNmId" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Max35Text" minOccurs="0"/>
 *         &lt;element name="CreDtTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}ISODateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalBusinessQuery1", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "msgId",
    "msgNmId",
    "creDtTm"
})
public class OriginalBusinessQuery1 {

    @XmlElement(name = "MsgId", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    public String msgId;
    @XmlElement(name = "MsgNmId", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String msgNmId;
    @XmlElement(name = "CreDtTm", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String creDtTm;

    /**
     * Gets the value of the msgId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMsgId(String value) {
        this.msgId = value;
    }

    /**
     * Gets the value of the msgNmId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMsgNmId() {
        return msgNmId;
    }

    /**
     * Sets the value of the msgNmId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMsgNmId(String value) {
        this.msgNmId = value;
    }

    /**
     * Gets the value of the creDtTm property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCreDtTm() {
        return creDtTm;
    }

    /**
     * Sets the value of the creDtTm property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCreDtTm(String value) {
        this.creDtTm = value;
    }

}
