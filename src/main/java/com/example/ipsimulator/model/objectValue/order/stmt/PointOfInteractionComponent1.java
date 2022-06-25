
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for PointOfInteractionComponent1 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PointOfInteractionComponent1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="POICmpntTp" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}POIComponentType1Code"/>
 *         &lt;element name="ManfctrId" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Max35Text" minOccurs="0"/>
 *         &lt;element name="Mdl" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Max35Text" minOccurs="0"/>
 *         &lt;element name="VrsnNb" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Max16Text" minOccurs="0"/>
 *         &lt;element name="SrlNb" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Max35Text" minOccurs="0"/>
 *         &lt;element name="ApprvlNb" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Max70Text" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfInteractionComponent1", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "poiCmpntTp",
    "manfctrId",
    "mdl",
    "vrsnNb",
    "srlNb",
    "apprvlNb"
})
public class PointOfInteractionComponent1 {

    @XmlElement(name = "POICmpntTp", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    @XmlSchemaType(name = "string")
    public POIComponentType1Code poiCmpntTp;
    @XmlElement(name = "ManfctrId", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String manfctrId;
    @XmlElement(name = "Mdl", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String mdl;
    @XmlElement(name = "VrsnNb", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String vrsnNb;
    @XmlElement(name = "SrlNb", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String srlNb;
    @XmlElement(name = "ApprvlNb", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public List<String> apprvlNb;

    /**
     * Gets the value of the poiCmpntTp property.
     *
     * @return
     *     possible object is
     *     {@link POIComponentType1Code }
     *
     */
    public POIComponentType1Code getPOICmpntTp() {
        return poiCmpntTp;
    }

    /**
     * Sets the value of the poiCmpntTp property.
     *
     * @param value
     *     allowed object is
     *     {@link POIComponentType1Code }
     *
     */
    public void setPOICmpntTp(POIComponentType1Code value) {
        this.poiCmpntTp = value;
    }

    /**
     * Gets the value of the manfctrId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getManfctrId() {
        return manfctrId;
    }

    /**
     * Sets the value of the manfctrId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setManfctrId(String value) {
        this.manfctrId = value;
    }

    /**
     * Gets the value of the mdl property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMdl() {
        return mdl;
    }

    /**
     * Sets the value of the mdl property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMdl(String value) {
        this.mdl = value;
    }

    /**
     * Gets the value of the vrsnNb property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVrsnNb() {
        return vrsnNb;
    }

    /**
     * Sets the value of the vrsnNb property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVrsnNb(String value) {
        this.vrsnNb = value;
    }

    /**
     * Gets the value of the srlNb property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSrlNb() {
        return srlNb;
    }

    /**
     * Sets the value of the srlNb property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSrlNb(String value) {
        this.srlNb = value;
    }

    /**
     * Gets the value of the apprvlNb property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apprvlNb property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApprvlNb().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getApprvlNb() {
        if (apprvlNb == null) {
            apprvlNb = new ArrayList<String>();
        }
        return this.apprvlNb;
    }

}
