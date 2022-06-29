
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for Document complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Document">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BkToCstmrStmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}BankToCustomerStatementV06"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "bkToCstmrStmt"
})

@XmlRootElement(name = "Document")
public class Document {

    @XmlElement(name = "BkToCstmrStmt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    public BankToCustomerStatementV06 bkToCstmrStmt;

    /**
     * Gets the value of the bkToCstmrStmt property.
     *
     * @return
     *     possible object is
     *     {@link BankToCustomerStatementV06 }
     *
     */
    public BankToCustomerStatementV06 getBkToCstmrStmt() {
        return bkToCstmrStmt;
    }

    /**
     * Sets the value of the bkToCstmrStmt property.
     *
     * @param value
     *     allowed object is
     *     {@link BankToCustomerStatementV06 }
     *
     */
    public void setBkToCstmrStmt(BankToCustomerStatementV06 value) {
        this.bkToCstmrStmt = value;
    }

}
