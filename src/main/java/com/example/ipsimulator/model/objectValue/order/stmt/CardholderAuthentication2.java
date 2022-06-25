
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for CardholderAuthentication2 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CardholderAuthentication2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AuthntcnMtd" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}AuthenticationMethod1Code"/>
 *         &lt;element name="AuthntcnNtty" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}AuthenticationEntity1Code"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardholderAuthentication2", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "authntcnMtd",
    "authntcnNtty"
})
public class CardholderAuthentication2 {

    @XmlElement(name = "AuthntcnMtd", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    @XmlSchemaType(name = "string")
    public AuthenticationMethod1Code authntcnMtd;
    @XmlElement(name = "AuthntcnNtty", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    @XmlSchemaType(name = "string")
    public AuthenticationEntity1Code authntcnNtty;

    /**
     * Gets the value of the authntcnMtd property.
     *
     * @return
     *     possible object is
     *     {@link AuthenticationMethod1Code }
     *
     */
    public AuthenticationMethod1Code getAuthntcnMtd() {
        return authntcnMtd;
    }

    /**
     * Sets the value of the authntcnMtd property.
     *
     * @param value
     *     allowed object is
     *     {@link AuthenticationMethod1Code }
     *
     */
    public void setAuthntcnMtd(AuthenticationMethod1Code value) {
        this.authntcnMtd = value;
    }

    /**
     * Gets the value of the authntcnNtty property.
     *
     * @return
     *     possible object is
     *     {@link AuthenticationEntity1Code }
     *
     */
    public AuthenticationEntity1Code getAuthntcnNtty() {
        return authntcnNtty;
    }

    /**
     * Sets the value of the authntcnNtty property.
     *
     * @param value
     *     allowed object is
     *     {@link AuthenticationEntity1Code }
     *
     */
    public void setAuthntcnNtty(AuthenticationEntity1Code value) {
        this.authntcnNtty = value;
    }

}
