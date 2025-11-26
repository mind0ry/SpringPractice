package com.sist.vo;

import lombok.Data;

import java.util.Date;

@Data
public class BoardVO {
    private int no, hit;
    private String title, name, content, dbday;
    private Date regdate;
}
