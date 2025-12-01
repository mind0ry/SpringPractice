package com.sist.vo;

import lombok.Data;

/*
 * NO           NOT NULL NUMBER         
CNO          NOT NULL NUMBER         
IMAGE        NOT NULL VARCHAR2(500)  
ENGNAME      NOT NULL VARCHAR2(200)  
KORNAME      NOT NULL VARCHAR2(200)  
DESCRIPTION           VARCHAR2(1000) 
KCAL                  NUMBER         
SODIUM                NUMBER         
CARBOHYDRATE          NUMBER         
SUGAR                 NUMBER         
PROTEIN               NUMBER         
CAFFEINE              NUMBER         
FAT                   NUMBER  
 */
@Data
public class CafeVO {
	private int no, kcal;
	private String image,engname,korname,description;
}
