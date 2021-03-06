
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentLineIdentification1 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DocumentLineIdentification1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}DocumentLineType1" minOccurs="0"/>
 *         &lt;element name="Nb" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Max35Text" minOccurs="0"/>
 *         &lt;element name="RltdDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}ISODate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentLineIdentification1", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "tp",
    "nb",
    "rltdDt"
})
public class DocumentLineIdentification1 {

    @XmlElement(name = "Tp", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public DocumentLineType1 tp;
    @XmlElement(name = "Nb", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String nb;
    @XmlElement(name = "RltdDt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String rltdDt;

    /**
     * Gets the value of the tp property.
     *
     * @return
     *     possible object is
     *     {@link DocumentLineType1 }
     *
     */
    public DocumentLineType1 getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     *
     * @param value
     *     allowed object is
     *     {@link DocumentLineType1 }
     *
     */
    public void setTp(DocumentLineType1 value) {
        this.tp = value;
    }

    /**
     * Gets the value of the nb property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNb() {
        return nb;
    }

    /**
     * Sets the value of the nb property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNb(String value) {
        this.nb = value;
    }

    /**
     * Gets the value of the rltdDt property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRltdDt() {
        return rltdDt;
    }

    /**
     * Sets the value of the rltdDt property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRltdDt(String value) {
        this.rltdDt = value;
    }

}
