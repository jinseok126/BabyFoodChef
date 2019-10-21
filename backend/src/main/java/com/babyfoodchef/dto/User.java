package com.babyfoodchef.dto;

import lombok.Data;

@Data
public class User {
    private String name;
    private String phoneNumber;

    public User(String a, String b){
        this.name = a;
        this.phoneNumber = b;
    }
}