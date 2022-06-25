
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for EntryDetails7 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="EntryDetails7">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Btch" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}BatchInformation2" minOccurs="0"/>
 *         &lt;element name="TxDtls" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}EntryTransaction8" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntryDetails7", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "btch",
    "txDtls"
})
public class EntryDetails7 {

    @XmlElement(name = "Btch", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public BatchInformation2 btch;
    @XmlElement(name = "TxDtls", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public List<EntryTransaction8> txDtls;

    /**
     * Gets the value of the btch property.
     *
     * @return
     *     possible object is
     *     {@link BatchInformation2 }
     *
     */
    public BatchInformation2 getBtch() {
        return btch;
    }

    /**
     * Sets the value of the btch property.
     *
     * @param value
     *     allowed object is
     *     {@link BatchInformation2 }
     *
     */
    public void setBtch(BatchInformation2 value) {
        this.btch = value;
    }

    /**
     * Gets the value of the txDtls property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txDtls property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxDtls().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntryTransaction8 }
     *
     *
     */
    public List<EntryTransaction8> getTxDtls() {
        if (txDtls == null) {
            txDtls = new ArrayList<EntryTransaction8>();
        }
        return this.txDtls;
    }

}
