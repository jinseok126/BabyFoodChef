package com.babyfoodchef.dto;

import lombok.Data;

import java.util.Date;

@Data
public class FreeBoardDto {
    private int no;
    private String writer;
    private String title;
    private String contents;
    private Date dateCreated;
}
