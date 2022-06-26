package com.example.ipsimulator;

import com.example.ipsimulator.model.entity.IpOrderRequest;
import com.example.ipsimulator.model.objectValue.order.stmt.BankToCustomerStatementV06;
import com.example.ipsimulator.model.objectValue.order.stmt.Document;
import com.example.ipsimulator.services.GenerateIpFile;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class IpSimulatorApplicationTests {


    @Autowired
    GenerateIpFile generateIpFile ;

    @Test
    void contextLoads() {
    }

    @Test
    public void serializeIpTransactionToXml() throws JsonProcessingException, FileNotFoundException {

    }

    @Test
    public void putStatment(){
        IpOrderRequest ipOrderRequest = new IpOrderRequest();
        ipOrderRequest.setCount(2);
        ipOrderRequest.setCycleNo(1);
        generateIpFile.putSTMT(ipOrderRequest);

    }

}
