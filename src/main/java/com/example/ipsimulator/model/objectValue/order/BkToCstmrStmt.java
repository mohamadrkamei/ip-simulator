package com.example.ipsimulator.model.objectValue.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BkToCstmrStmt" , propOrder = {"GrpHdr" , "Stmt" })
public class BkToCstmrStmt {

    @XmlElement(name = "GrpHdr" , required = true)
    protected GroupHeader grpHdr ;

    @XmlElement(name = "Stmt" , required = true)
    protected Stmt stmt;
}
