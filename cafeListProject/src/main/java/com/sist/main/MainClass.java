package com.sist.main;

import com.sist.service.CafeService;
import com.sist.vo.CafeVO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext app=new ClassPathXmlApplicationContext("application-*.xml");
        Scanner scan=new Scanner(System.in);
        System.out.print("검색할 카테고리 선택(1.한국이름, 2.영어이름):");
        String column="";
        int cate=scan.nextInt();
        String[] strColumn= {"","korname","engname"};
        System.out.print("검색어 입력:");
        String ss=scan.next();
        Map map=new HashMap();
        map.put("column", strColumn[cate]);
        map.put("ss", ss);

        CafeService cs=(CafeService)app.getBean("cafeServiceImpl");
        int count=cs.cafeListCount(map);
        List<CafeVO> list=cs.cafeListData(map);
        System.out.println("검색 결과:"+count+"건");
        for(CafeVO vo:list) {
            System.out.println(vo.getKorname()+" "
                    +vo.getEngname());
        }
    }
}
