package com.example.ipsimulator.services.Impl;

import com.example.ipsimulator.model.entity.IpOrderRequest;
import com.example.ipsimulator.services.GenerateIpFile;
import org.springframework.stereotype.Service;

@Service
public class GenerateIpFileImpl implements GenerateIpFile {

    @Override
    public void putIpOrder(IpOrderRequest ipOrderRequest) {

        System.out.print("ok");
    }
}
