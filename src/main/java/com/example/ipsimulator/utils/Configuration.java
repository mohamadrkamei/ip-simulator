package com.example.ipsimulator.utils;


import com.example.ipsimulator.model.enumeration.MessageType;


public class Configuration {

    public static final String EMPTY = "EMPTY";

    private Configuration() {
    }


    public static String getContext(MessageType messageType) {
        switch (messageType) {
            case stmt:
                return "com.example.ipsimulator.model.objectValue.order.stmt";
            default:
                throw new IllegalStateException("not handled");
        }

    }
}
