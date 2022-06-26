package com.example.ipsimulator.model.enumeration;

public enum  MessageType {

    stmt("stmt");

    private final String title;

    MessageType(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

}
