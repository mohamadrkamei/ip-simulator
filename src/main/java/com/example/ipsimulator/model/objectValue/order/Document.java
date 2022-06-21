package com.example.ipsimulator.model.objectValue.order;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document" , propOrder={"bkToCstmrStmt"})
@Data
@AllArgsConstructor
public class Document {

    @XmlElement(name = "BkToCstmrStmt" , required = true)
    protected BkToCstmrStmt bkToCstmrStmt;

    public BkToCstmrStmt getBkToCstmrStmt() {
        return this.bkToCstmrStmt;
    }

    public void setBkToCstmrStmt(final BkToCstmrStmt value){

        this.bkToCstmrStmt = value;
    }
}
