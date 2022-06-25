
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for PointOfInteraction1 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PointOfInteraction1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}GenericIdentification32"/>
 *         &lt;element name="SysNm" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Max70Text" minOccurs="0"/>
 *         &lt;element name="GrpId" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Max35Text" minOccurs="0"/>
 *         &lt;element name="Cpblties" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}PointOfInteractionCapabilities1" minOccurs="0"/>
 *         &lt;element name="Cmpnt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}PointOfInteractionComponent1" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfInteraction1", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "id",
    "sysNm",
    "grpId",
    "cpblties",
    "cmpnt"
})
public class PointOfInteraction1 {

    @XmlElement(name = "Id", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    public GenericIdentification32 id;
    @XmlElement(name = "SysNm", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String sysNm;
    @XmlElement(name = "GrpId", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String grpId;
    @XmlElement(name = "Cpblties", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public PointOfInteractionCapabilities1 cpblties;
    @XmlElement(name = "Cmpnt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public List<PointOfInteractionComponent1> cmpnt;

    /**
     * Gets the value of the id property.
     *
     * @return
     *     possible object is
     *     {@link GenericIdentification32 }
     *
     */
    public GenericIdentification32 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link GenericIdentification32 }
     *
     */
    public void setId(GenericIdentification32 value) {
        this.id = value;
    }

    /**
     * Gets the value of the sysNm property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSysNm() {
        return sysNm;
    }

    /**
     * Sets the value of the sysNm property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSysNm(String value) {
        this.sysNm = value;
    }

    /**
     * Gets the value of the grpId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGrpId() {
        return grpId;
    }

    /**
     * Sets the value of the grpId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGrpId(String value) {
        this.grpId = value;
    }

    /**
     * Gets the value of the cpblties property.
     *
     * @return
     *     possible object is
     *     {@link PointOfInteractionCapabilities1 }
     *
     */
    public PointOfInteractionCapabilities1 getCpblties() {
        return cpblties;
    }

    /**
     * Sets the value of the cpblties property.
     *
     * @param value
     *     allowed object is
     *     {@link PointOfInteractionCapabilities1 }
     *
     */
    public void setCpblties(PointOfInteractionCapabilities1 value) {
        this.cpblties = value;
    }

    /**
     * Gets the value of the cmpnt property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cmpnt property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCmpnt().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointOfInteractionComponent1 }
     *
     *
     */
    public List<PointOfInteractionComponent1> getCmpnt() {
        if (cmpnt == null) {
            cmpnt = new ArrayList<PointOfInteractionComponent1>();
        }
        return this.cmpnt;
    }

}
