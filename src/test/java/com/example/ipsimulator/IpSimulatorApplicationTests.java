package com.example.ipsimulator;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class IpSimulatorApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void serializeIpTransactionToXml() throws JsonProcessingException, FileNotFoundException {


        XmlMapper xmlMapper = new XmlMapper();
        BkToCstmrStmt bkToCstmrStmt = new BkToCstmrStmt();
        String xml = xmlMapper.writeValueAsString(new  Document(bkToCstmrStmt));
        File file =  new File ("D:\\ipstm.xml");
        PrintWriter pw = new PrintWriter(file);

        pw.write(xml);

        pw.flush();
        pw.close();
        assertNotNull(file);
    }

}
