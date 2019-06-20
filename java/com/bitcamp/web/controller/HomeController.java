package com.bitcamp.web.controller;

import com.bitcamp.web.common.util.Printer;
import com.bitcamp.web.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * HomeController
 */

@Controller //빈으로 등록
public class HomeController {

    @Autowired
    CustomerService customerService;
    @Autowired Printer p;

    //맵핑 - 연결
    @RequestMapping("/")
    public String index() {
        // System.out.println("루트 URL 경로로 들어옴");
        // int count = customerService.countAll();
        // System.out.println("고객의 총 인원 : " + count);

        p.accept("람다 이후 루트 URL 경로로 들어옴");
        int count = customerService.countAll();
        p.accept("람다가 고객의 총인원 :" +count);
        
        return "index";
    }
}