
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GroupHeader58 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GroupHeader58">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MsgId" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Max35Text"/>
 *         &lt;element name="CreDtTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}ISODateTime"/>
 *         &lt;element name="MsgRcpt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}PartyIdentification43" minOccurs="0"/>
 *         &lt;element name="MsgPgntn" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Pagination" minOccurs="0"/>
 *         &lt;element name="OrgnlBizQry" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}OriginalBusinessQuery1" minOccurs="0"/>
 *         &lt;element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Max500Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupHeader58", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "msgId",
    "creDtTm",
    "msgRcpt",
    "msgPgntn",
    "orgnlBizQry",
    "addtlInf"
})
public class GroupHeader58 {

    @XmlElement(name = "MsgId", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    public String msgId;
    @XmlElement(name = "CreDtTm", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    public String creDtTm;
    @XmlElement(name = "MsgRcpt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public PartyIdentification43 msgRcpt;
    @XmlElement(name = "MsgPgntn", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public Pagination msgPgntn;
    @XmlElement(name = "OrgnlBizQry", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public OriginalBusinessQuery1 orgnlBizQry;
    @XmlElement(name = "AddtlInf", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String addtlInf;

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

    /**
     * Gets the value of the msgRcpt property.
     *
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *
     */
    public PartyIdentification43 getMsgRcpt() {
        return msgRcpt;
    }

    /**
     * Sets the value of the msgRcpt property.
     *
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *
     */
    public void setMsgRcpt(PartyIdentification43 value) {
        this.msgRcpt = value;
    }

    /**
     * Gets the value of the msgPgntn property.
     *
     * @return
     *     possible object is
     *     {@link Pagination }
     *
     */
    public Pagination getMsgPgntn() {
        return msgPgntn;
    }

    /**
     * Sets the value of the msgPgntn property.
     *
     * @param value
     *     allowed object is
     *     {@link Pagination }
     *
     */
    public void setMsgPgntn(Pagination value) {
        this.msgPgntn = value;
    }

    /**
     * Gets the value of the orgnlBizQry property.
     *
     * @return
     *     possible object is
     *     {@link OriginalBusinessQuery1 }
     *
     */
    public OriginalBusinessQuery1 getOrgnlBizQry() {
        return orgnlBizQry;
    }

    /**
     * Sets the value of the orgnlBizQry property.
     *
     * @param value
     *     allowed object is
     *     {@link OriginalBusinessQuery1 }
     *
     */
    public void setOrgnlBizQry(OriginalBusinessQuery1 value) {
        this.orgnlBizQry = value;
    }

    /**
     * Gets the value of the addtlInf property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAddtlInf(String value) {
        this.addtlInf = value;
    }

}
