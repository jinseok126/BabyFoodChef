package com.babyfoodchef.dto;

import lombok.Data;

@Data
public class MemberDto {
    private int no;
    private String id;
    private String password;
    private String nickName;
    private String email;

}