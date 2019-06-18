package com.bitcamp.web.controller;

import com.bitcamp.web.domain.CustomerDTO;
import com.bitcamp.web.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * CustomerController
 */
@RestController
public class CustomerController {

    @Autowired 
    CustomerService customerService;
    @Autowired
    CustomerDTO customerDTO;

    @RequestMapping("/count")
    public String count(){
        System.out.println("CustomerController count() 경로로 들어온다");
        int count = customerService.countAll();
        System.out.println("고객의 총인원 : " + count);
        return count+"";
    }


    @GetMapping("/customers/{customerId}")
    public CustomerDTO login(@PathVariable("customerId")String id,
                                        @RequestAttribute CustomerDTO param) {
        System.out.println("컨트롤러 넘어온 pw : "+param.getPassword());
        customerDTO.setCustomerId(id);
        customerDTO.setPassword(param.getPassword());
        return customerService.login(customerDTO);
    }




    // @RequestMapping("/login/{customerId}/{password}")    
    // public  CustomerDTO login(@PathVariable("customerId")String id,
    //                             @PathVariable("password")String pass){
    //     System.out.println("AJAX로 넘어온 ID : "+id);
    //     System.out.println("AJAX로 넘어온 ID : "+id);

    //     //null일 수가 없다.
    //     customerDTO.setCustomerId(id);
    //     customerDTO.setPassword(pass);

        // return (!customerService
        //             .login(customerDTO)
        //             .getCustomerName()
        //             .equals("")
        //                 ?"SUCCESS" : "FAIL");
        
        // return (customerService.login(customerDTO)!=null) ? "SUCCESS" : "FAIL";
        // return customerService.login(customerDTO);

        // 서비스까지 값을 보내야 한다. 
        // Component있는 클래스에 있는 것까지 보내야 값이 안 없어진다.
        // 바로 mapper까지 보내면 캡슐화의 의미가 없다.
        // 그래서 서비스까지 보내기 위해 service 클래스를 호출한다.
        // 인스턴스만 살아남아서 값을 전달할 수 있다.
        // 값을 받아줘야 한다. 변수로 하나 받아준다.

        // CustomerDTO t = customerService.login(customer);
        // System.out.println("DB에서 넘어온 이름 : " + t.getCustomerName());

        //DB에 값이 있건 없건 null이 아니라 DTO에는 값이 있다. 그 중에 아이디와 패스워드 값이 있는 거다. 위에 set을 해줘서.
        //그래서 로그인(DB안에 데이터를 확인하는 거니까)하려면 다른 데이터를 DTO에 꺼내서 null인 지 확인해야 한다.
        //name(이름)이 null이 아니면 로그인 성공, null이면 로그인 실패
        //name(getCustomerName)를 변수에 담는다

        // String name = t.getCustomerName();
        //결과값 담을 문자열

        // String loginResult = " ";

        //있으면
        // if(name.equals(" ")){
        //     //문자열을 변수에 담는다.
        //     loginResult= "SUCCESS";
        //     System.out.println(loginResult);
        // //없으면
        // }else{
        //     loginResult = "FAIL";
        //     System.out.println(loginResult);
        // }
        // return loginResult;
        // return (!name.equals(" ")) ?  "SUCCESS" : "FAIL";
    // }
}