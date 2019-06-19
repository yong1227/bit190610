package com.bitcamp.web.controller;

import com.bitcamp.web.domain.EmployeeDTO;
import com.bitcamp.web.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * EmployeeController
 */
@RequestMapping("/employees")
@RestController
public class EmployeeController {

    @Autowired EmployeeService employeeService;
    @Autowired EmployeeDTO employeeDTO;



}