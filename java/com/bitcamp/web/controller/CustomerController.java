package com.bitcamp.web.controller;

import com.bitcamp.web.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * CustomerController
 */
@RestController
public class CustomerController {

    @Autowired CustomerService customerService;

    @RequestMapping("/count")
    public String count(){
        System.out.println("CustomerController count() 경로로 들어온다");
        int count = customerService.countAll();
        System.out.println("고객의 총인원 : " + count);
        return count+"";
    }
}