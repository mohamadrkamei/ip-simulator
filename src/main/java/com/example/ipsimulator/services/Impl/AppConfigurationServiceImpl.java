package com.example.ipsimulator.services.Impl;

import com.example.ipsimulator.model.enumeration.MessageType;
import com.example.ipsimulator.utils.CalenderUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppConfigurationServiceImpl {

    public  String generateMessageId(MessageType messageType, Integer cycleNo){

        return "IPS-SABC-"+ CalenderUtils.getPersianDateStamp()+"T1345-0" + cycleNo + "-1." + messageType.name();


    }

}
