package com.bitcamp.web.controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bitcamp.web.common.util.Printer;
import com.bitcamp.web.domain.CustomerDTO;
import com.bitcamp.web.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * CustomerController
 */
@RestController
@RequestMapping("/customers") 
public class CustomerController {

    @Autowired CustomerService customerService;
    @Autowired CustomerDTO customer;
    @Autowired Printer p;
    
    //전체목록 가져오기
    @GetMapping("")
    public List<CustomerDTO> list() {
        List<CustomerDTO> list = new ArrayList<>();
        // list = customerService.findCustomers();
        // for(CustomerDTO customer : list){
        //     System.out.println(customer.getCustomerId()+" : "
        //         +customer.getCustomerName()+" : "
        //         +customer.getPassword()+" : "
        //         +customer.getSsn()+" : "
        //         +customer.getPhone()+" : "
        //         +customer.getCity()+" : "
        //         +customer.getAddress()+" : "
        //         +customer.getPostalcode()
        //     );
        // }
        return list;
    }

    @GetMapping("/count")
    public String count(){
        System.out.println("CustomerController count() 경로로 들어온다");
        int count = customerService.countAll();
        System.out.println("고객의 총인원 : " + count);
        return count+"";
    }

    @GetMapping("/{customerId}/{password}")
    public CustomerDTO login(@PathVariable("customerId")String id,
                        @PathVariable("password")String pass){
        customer.setCustomerId(id);
        customer.setPassword(pass);
        return customerService.login(customer); 
    }

    @PostMapping("")
    public HashMap<String, Object> join(@RequestBody CustomerDTO param) {
        System.out.println("=======post mapping=========");
        System.out.println(param.getCustomerId());
        customerService.addCustomer(param);
        HashMap<String,Object> map = new HashMap<>();
        map.put("result", "SUCCESS" );
        return map;
    }

    @GetMapping("/{customerId}")
    public CustomerDTO selectOne(@PathVariable String customerId) {
        System.out.println("id 검색 진입");
        return customerService.findCustomerByCustomerId(customerId);
    }

    @PutMapping("/{customerId}")
    public CustomerDTO update(@RequestBody CustomerDTO customer) {
        System.out.println("수정 할 id " + customer.getCustomerId());
        int result = customerService.updateCustomer(customer);

        System.out.println("====>"+result);
        if(result ==1 ){
            customer = customerService.findCustomerByCustomerId(customer.getCustomerId());
        }else{
            System.out.println("컨트롤러 수정 실패");
        }
        return customer;
        
    }

    @DeleteMapping("/{customerId}")
    public HashMap delete(@PathVariable String customerId) {
        HashMap<String,Object> map = new HashMap<>();
        customer.setCustomerId(customerId);
        customerService.deleteCustomer(customer);
        map.put("result", "탈퇴 성공");
        return map;
    }
}