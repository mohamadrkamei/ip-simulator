
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for DocumentLineInformation1 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DocumentLineInformation1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}DocumentLineIdentification1" maxOccurs="unbounded"/>
 *         &lt;element name="Desc" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Max2048Text" minOccurs="0"/>
 *         &lt;element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}RemittanceAmount3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentLineInformation1", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "id",
    "desc",
    "amt"
})
public class DocumentLineInformation1 {

    @XmlElement(name = "Id", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    public List<DocumentLineIdentification1> id;
    @XmlElement(name = "Desc", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public String desc;
    @XmlElement(name = "Amt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public RemittanceAmount3 amt;

    /**
     * Gets the value of the id property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getId().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentLineIdentification1 }
     *
     *
     */
    public List<DocumentLineIdentification1> getId() {
        if (id == null) {
            id = new ArrayList<DocumentLineIdentification1>();
        }
        return this.id;
    }

    /**
     * Gets the value of the desc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the amt property.
     *
     * @return
     *     possible object is
     *     {@link RemittanceAmount3 }
     *
     */
    public RemittanceAmount3 getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     *
     * @param value
     *     allowed object is
     *     {@link RemittanceAmount3 }
     *
     */
    public void setAmt(RemittanceAmount3 value) {
        this.amt = value;
    }

}
