package com.babyfoodchef.dto;

import lombok.Data;

@Data
public class Test<T> {
    private String message;
    private boolean check  = true;
    private T response;


    public void setResponse(T list) {
        this.response = list;
    }
}