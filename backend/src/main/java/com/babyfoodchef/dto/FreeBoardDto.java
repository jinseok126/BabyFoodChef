package com.babyfoodchef.dto;

import lombok.Data;


@Data
public class FreeBoardDto {
    private int no;
    private String writer;
    private String title;
    private String contents;
    private String dateCreated;
    private int viewCount;
}
