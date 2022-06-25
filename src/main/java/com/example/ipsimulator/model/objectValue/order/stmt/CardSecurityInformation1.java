
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for CardSecurityInformation1 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CardSecurityInformation1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CSCMgmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}CSCManagement1Code"/>
 *         &lt;element name="CSCVal" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Min3Max4NumericText" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardSecurityInformation1", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "cscMgmt",
    "cscVal"
})
public class CardSecurityInformation1 {

    @XmlElement(name = "CSCMgmt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    @XmlSchemaType(name = "string")
    public CSCManagement1Code cscMgmt;
    @XmlElement(name = "CSCVal", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String cscVal;

    /**
     * Gets the value of the cscMgmt property.
     *
     * @return
     *     possible object is
     *     {@link CSCManagement1Code }
     *
     */
    public CSCManagement1Code getCSCMgmt() {
        return cscMgmt;
    }

    /**
     * Sets the value of the cscMgmt property.
     *
     * @param value
     *     allowed object is
     *     {@link CSCManagement1Code }
     *
     */
    public void setCSCMgmt(CSCManagement1Code value) {
        this.cscMgmt = value;
    }

    /**
     * Gets the value of the cscVal property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCSCVal() {
        return cscVal;
    }

    /**
     * Sets the value of the cscVal property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCSCVal(String value) {
        this.cscVal = value;
    }

}
