
package com.example.ipsimulator.model.objectValue.order.stmt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for BankToCustomerStatementV06 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="BankToCustomerStatementV06">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GrpHdr" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}GroupHeader58"/>
 *         &lt;element name="Stmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}AccountStatement6" maxOccurs="unbounded"/>
 *         &lt;element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.06}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankToCustomerStatementV06", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", propOrder = {
    "grpHdr",
    "stmt",
    "splmtryData"
})
public class BankToCustomerStatementV06 {

    @XmlElement(name = "GrpHdr", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    public GroupHeader58 grpHdr;
    @XmlElement(name = "Stmt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06", required = true)
    public List<AccountStatement6> stmt;
    @XmlElement(name = "SplmtryData", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.06")
    public List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the grpHdr property.
     *
     * @return
     *     possible object is
     *     {@link GroupHeader58 }
     *
     */
    public GroupHeader58 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     *
     * @param value
     *     allowed object is
     *     {@link GroupHeader58 }
     *
     */
    public void setGrpHdr(GroupHeader58 value) {
        this.grpHdr = value;
    }

    /**
     * Gets the value of the stmt property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stmt property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStmt().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountStatement6 }
     *
     *
     */
    public List<AccountStatement6> getStmt() {
        if (stmt == null) {
            stmt = new ArrayList<AccountStatement6>();
        }
        return this.stmt;
    }

    /**
     * Gets the value of the splmtryData property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     *
     *
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
    }

}
