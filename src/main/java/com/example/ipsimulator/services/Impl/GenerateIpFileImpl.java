package com.example.ipsimulator.services.Impl;

import com.example.ipsimulator.model.entity.IpOrderRequest;
import com.example.ipsimulator.model.entity.Transaction;
import com.example.ipsimulator.model.enumeration.MessageType;
import com.example.ipsimulator.model.objectValue.IPDataStorage;
import com.example.ipsimulator.services.GenerateIpFile;

import com.example.ipsimulator.utils.CalenderUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Service
public class GenerateIpFileImpl implements GenerateIpFile {

    @Autowired
    AppConfigurationServiceImpl appConfigurationService ;
    @Override
    public void putSTMT(IpOrderRequest ipOrderRequest) {

        Set<Transaction> list = new HashSet<>();
        String messageId = appConfigurationService.generateMessageId(MessageType.stmt,1);

        for (int i = 1; i<= ipOrderRequest.getCount() ; i ++){

            BigDecimal amount = BigDecimal.valueOf(10000);
            String creditIban= "";
            list.add(getStatmentTransaction(creditIban, amount));
        }
        String settlementDate = CalenderUtils.getPersianDateSeparated();
        String createDateTime = CalenderUtils.getPersianDateTimeStamp();

        IPDataStorage.getInstance().setTransaction008(messageId,list);


    }

    private Transaction getStatmentTransaction(String creditIban , BigDecimal amount ){
        Transaction transaction = new Transaction();
        transaction.setAmount(amount);
        transaction.setDebtorIBAN("IR750100004001058204005911");
        transaction.setCreditorIBAN(creditIban);
        return transaction;


    }
}
