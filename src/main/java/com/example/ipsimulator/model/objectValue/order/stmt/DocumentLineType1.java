
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentLineType1 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DocumentLineType1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CdOrPrtry" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}DocumentLineType1Choice"/>
 *         &lt;element name="Issr" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Max35Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentLineType1", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "cdOrPrtry",
    "issr"
})
public class DocumentLineType1 {

    @XmlElement(name = "CdOrPrtry", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    public DocumentLineType1Choice cdOrPrtry;
    @XmlElement(name = "Issr", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String issr;

    /**
     * Gets the value of the cdOrPrtry property.
     *
     * @return
     *     possible object is
     *     {@link DocumentLineType1Choice }
     *
     */
    public DocumentLineType1Choice getCdOrPrtry() {
        return cdOrPrtry;
    }

    /**
     * Sets the value of the cdOrPrtry property.
     *
     * @param value
     *     allowed object is
     *     {@link DocumentLineType1Choice }
     *
     */
    public void setCdOrPrtry(DocumentLineType1Choice value) {
        this.cdOrPrtry = value;
    }

    /**
     * Gets the value of the issr property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIssr(String value) {
        this.issr = value;
    }

}
