package com.bitcamp.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * HomeController
 */

 
@Controller //빈으로 등록
public class HomeController {

    //맵핑 - 연결
    @RequestMapping("/")
    public String index() {
        System.out.println("루트 URL 경로로 들어옴");
        return "index";
    }
}