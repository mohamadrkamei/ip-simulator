
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for DisplayCapabilities1 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DisplayCapabilities1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DispTp" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}UserInterface2Code"/>
 *         &lt;element name="NbOfLines" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Max3NumericText"/>
 *         &lt;element name="LineWidth" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}Max3NumericText"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisplayCapabilities1", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "dispTp",
    "nbOfLines",
    "lineWidth"
})
public class DisplayCapabilities1 {

    @XmlElement(name = "DispTp", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    @XmlSchemaType(name = "string")
    public UserInterface2Code dispTp;
    @XmlElement(name = "NbOfLines", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    public String nbOfLines;
    @XmlElement(name = "LineWidth", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    public String lineWidth;

    /**
     * Gets the value of the dispTp property.
     *
     * @return
     *     possible object is
     *     {@link UserInterface2Code }
     *
     */
    public UserInterface2Code getDispTp() {
        return dispTp;
    }

    /**
     * Sets the value of the dispTp property.
     *
     * @param value
     *     allowed object is
     *     {@link UserInterface2Code }
     *
     */
    public void setDispTp(UserInterface2Code value) {
        this.dispTp = value;
    }

    /**
     * Gets the value of the nbOfLines property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNbOfLines() {
        return nbOfLines;
    }

    /**
     * Sets the value of the nbOfLines property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNbOfLines(String value) {
        this.nbOfLines = value;
    }

    /**
     * Gets the value of the lineWidth property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLineWidth() {
        return lineWidth;
    }

    /**
     * Sets the value of the lineWidth property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLineWidth(String value) {
        this.lineWidth = value;
    }

}
