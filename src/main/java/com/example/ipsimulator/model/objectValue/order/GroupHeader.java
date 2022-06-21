package com.example.ipsimulator.model.objectValue.order;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BkToCstmrStmt" , propOrder = {"MsgId" , "CreDtTm","MsgPgntn","AddtlInf"})
@Data
public class GroupHeader {
    @XmlElement(name = "MsgId", required = true)
    protected String msgId;
    @XmlElement(name = "CreDtTm" , required = true)
    protected String crDtTm;
    @XmlElement(name = "AddtlInf" , required = true)
    protected String addtlInf;
    @XmlElement(name = "MsgPgntn" , required = true )
    protected MsgPgntn msgPgntn;


}
