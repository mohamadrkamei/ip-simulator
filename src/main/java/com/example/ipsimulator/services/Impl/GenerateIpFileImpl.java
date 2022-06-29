package com.example.ipsimulator.services.Impl;

import com.example.ipsimulator.model.entity.IpOrderRequest;
import com.example.ipsimulator.model.entity.Transaction;
import com.example.ipsimulator.model.enumeration.MessageType;
import com.example.ipsimulator.model.objectValue.IPDataStorage;
import com.example.ipsimulator.model.objectValue.order.stmt.*;
import com.example.ipsimulator.services.GenerateIpFile;

import com.example.ipsimulator.utils.CalenderUtils;
import com.example.ipsimulator.utils.JaxbUtil;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@Log4j2
public class GenerateIpFileImpl implements GenerateIpFile {

    @Autowired
    AppConfigurationServiceImpl appConfigurationService ;
    @Override
    public void putSTMT(IpOrderRequest ipOrderRequest) throws Exception {


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

        fillStmt(messageId,settlementDate,createDateTime);



        String xml = JaxbUtil.objectToXml(IPDataStorage.getInstance().getStmt());

        xml = xml.replace("ns2:", "");
        Path path = Paths.get("D:\\stmt.xml");
        File file = new File("D:\\stmt.xml");
        byte[] arr = xml.getBytes();
        Files.write(path,arr);

//        FileWriter myWriter = new FileWriter("D:\\stmt.xml");
//        myWriter.write("xml");


        log.info("trying to send mock ict file to ftp");
    }

    public void fillStmt (String messageId, String creDtTm, String intrBkSttlmDt){
        int count = 0 ;
        BigDecimal totalAmount = new BigDecimal(0);
        List<ReportEntry8> trxList = new ArrayList<>();

        for(ReportEntry8 ReportEntry8 : IPDataStorage.getInstance().getTransaction008())
        {

            count++;
            totalAmount = totalAmount.add(ReportEntry8.getAmt().getValue());
            trxList.add(ReportEntry8);
        }
        if (count>0 ){

            Document document = new Document();
            document.setBkToCstmrStmt(new BankToCustomerStatementV06());
            document.getBkToCstmrStmt().setGrpHdr(new GroupHeader58());
            document.getBkToCstmrStmt().getGrpHdr().setMsgId(">IPS-SABC-14010322T1345-03-1.stmt");
            document.getBkToCstmrStmt().getGrpHdr().setCreDtTm("1401-03-22T13:46:01");
            document.getBkToCstmrStmt().getGrpHdr().setMsgPgntn(new Pagination());
            document.getBkToCstmrStmt().getGrpHdr().getMsgPgntn().setPgNb("1");
            document.getBkToCstmrStmt().getGrpHdr().getMsgPgntn().setLastPgInd(true);
            document.getBkToCstmrStmt().getGrpHdr().setAddtlInf("1401-03-22T10:45:00.1401-03-22T13:45:00.03");
            document.getBkToCstmrStmt().setStmt(new AccountStatement6());
            document.getBkToCstmrStmt().getStmt().getNtry().addAll(trxList);
            IPDataStorage.getInstance().setStmt(document);

        }
    }


    private Transaction getStatmentTransaction(String creditIban , BigDecimal amount ){
        Transaction transaction = new Transaction();
        transaction.setAmount(amount);
        transaction.setDebtorIBAN("IR750100004001058204005911");
        transaction.setCreditorIBAN(creditIban);



        transaction.setDebtorName(RandomStringUtils.randomAlphabetic(6));
        transaction.setDebtorNationalCode(RandomStringUtils.randomNumeric(3));

        transaction.setDescription(RandomStringUtils.randomAlphabetic(3));

        transaction.setEntToEndID(RandomStringUtils.randomNumeric(18));

        return transaction;


    }
}
