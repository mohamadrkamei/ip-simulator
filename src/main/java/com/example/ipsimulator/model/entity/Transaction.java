package com.example.ipsimulator.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class Transaction {


    private BigDecimal amount;
    private BigDecimal feeAmount;

    private String creditorIBAN;
    private String creditorName;


    private String debtorIBAN;
    private String debtorName;

    private String debtorNationalCode;


    private String debtorShahabCode;
    private String xrequestid;


    private String debtorPostalCode;
    private String description;


    private String messageType;
    private String branchCode;

    private String paymentGatewayCode;
    private String creditorBankBicCode;
    private String originalTransactionID;
    private String returnReasonCode;
    private String instructionID;

}
