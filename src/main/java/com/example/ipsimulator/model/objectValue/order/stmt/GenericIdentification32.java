
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for GenericIdentification32 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GenericIdentification32">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Max35Text"/>
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}PartyType3Code" minOccurs="0"/>
 *         &lt;element name="Issr" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}PartyType4Code" minOccurs="0"/>
 *         &lt;element name="ShrtNm" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Max35Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericIdentification32", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "id",
    "tp",
    "issr",
    "shrtNm"
})
public class GenericIdentification32 {

    @XmlElement(name = "Id", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    public String id;
    @XmlElement(name = "Tp", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    @XmlSchemaType(name = "string")
    public PartyType3Code tp;
    @XmlElement(name = "Issr", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    @XmlSchemaType(name = "string")
    public PartyType4Code issr;
    @XmlElement(name = "ShrtNm", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String shrtNm;

    /**
     * Gets the value of the id property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the tp property.
     *
     * @return
     *     possible object is
     *     {@link PartyType3Code }
     *
     */
    public PartyType3Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     *
     * @param value
     *     allowed object is
     *     {@link PartyType3Code }
     *
     */
    public void setTp(PartyType3Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the issr property.
     *
     * @return
     *     possible object is
     *     {@link PartyType4Code }
     *
     */
    public PartyType4Code getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     *
     * @param value
     *     allowed object is
     *     {@link PartyType4Code }
     *
     */
    public void setIssr(PartyType4Code value) {
        this.issr = value;
    }

    /**
     * Gets the value of the shrtNm property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getShrtNm() {
        return shrtNm;
    }

    /**
     * Sets the value of the shrtNm property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setShrtNm(String value) {
        this.shrtNm = value;
    }

}
