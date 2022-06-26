package com.example.ipsimulator.model.objectValue;

import com.example.ipsimulator.model.entity.Transaction;
import com.example.ipsimulator.model.objectValue.order.stmt.*;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class IPDataStorage {

    private static final IPDataStorage ipDataStorage = new IPDataStorage();
    private Set<ReportEntry8> transaction008 = new HashSet<>();

    private IPDataStorage(){}

    public static IPDataStorage getInstance(){
        return ipDataStorage;
    }


    public void setTransaction008(String messageId , Set<Transaction> transactions ){
        transaction008.clear();

        transactions.stream().forEach(t ->{
            ReportEntry8 entry8 = new ObjectFactory().createReportEntry8();
            entry8.setAmt(new ActiveOrHistoricCurrencyAndAmount());
            entry8.getAmt().setCcy("IRR");
            entry8.getAmt().setValue(t.getAmount());

            entry8.setCdtDbtInd(CreditDebitCode.DBIT);

            entry8.setRvslInd(false);

            entry8.setSts(EntryStatus2Code.BOOK);

            entry8.setValDt(new DateAndDateTimeChoice());
            entry8.getValDt().setDt("date");

            entry8.setBkTxCd(new BankTransactionCodeStructure4());
            entry8.getBkTxCd().setPrtry(new ProprietaryBankTransactionCodeStructure1());
            entry8.getBkTxCd().getPrtry().setCd("pacs.008.001.01");

            entry8.setChrgs(new Charges4());
            entry8.getChrgs().getRcrd().get(0).setAmt(new ActiveOrHistoricCurrencyAndAmount());
            entry8.getChrgs().getRcrd().get(0).getAmt().setCcy("IRR");
            entry8.getChrgs().getRcrd().get(0).getAmt().setValue(BigDecimal.valueOf(2000));

            entry8.setNtryDtls(new EntryDetails7());



        });

    }
}
