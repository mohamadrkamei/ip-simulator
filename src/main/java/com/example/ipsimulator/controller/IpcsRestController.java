package com.example.ipsimulator.controller;

import com.example.ipsimulator.model.entity.IpOrderRequest;
import com.example.ipsimulator.services.GenerateIpFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ipcs")
public class IpcsRestController {

    @Autowired
    GenerateIpFile generateIpFile;

    @PutMapping(value = "/order")
    public void putIpOrder(@RequestBody IpOrderRequest ipOrderRequest) {

        generateIpFile.putIpOrder(ipOrderRequest);

    }

}
