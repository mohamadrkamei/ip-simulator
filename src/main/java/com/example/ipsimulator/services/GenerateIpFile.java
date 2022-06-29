package com.example.ipsimulator.services;

import com.example.ipsimulator.model.entity.IpOrderRequest;

public interface GenerateIpFile {

    void putSTMT(IpOrderRequest ipOrderRequest) throws Exception;
}
