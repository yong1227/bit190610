package com.bitcamp.web.serviceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bitcamp.web.domain.CustomerDTO;
import com.bitcamp.web.mapper.CustomerMapper;
import com.bitcamp.web.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * CustomerServlceImpl
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerMapper customerMapper;

    @Override
    public void addCustomer(CustomerDTO customer) {
        System.out.println("====serviceimp============");
        customerMapper.insertCustomer(customer);
    }

    @Override
    public List<CustomerDTO> findCustomers() {
        return customerMapper.selectCustomers();
    }

    @Override
    public List<CustomerDTO> findCustomersByOption(CustomerDTO customer) {
        return null;
    }

    @Override
    public CustomerDTO findCustomerByCustomerId(String customer) {
        return customerMapper.selectCustomerByCustomerId(customer);
    }

    @Override
    public int updateCustomer(CustomerDTO customer) {
       int result = customerMapper.updateCustomer(customer);
       if(result ==1){
           System.out.println("서비스 수신 성공");
       }else{
           System.out.println("서비스 수정실패");
       }
       return result;
    }

    @Override
    public void deleteCustomer(CustomerDTO customer) {
        customerMapper.deleteCustomer(customer);
    }

    @Override
    public int countAll() {
        return customerMapper.selectCount();
    }

    @Override
    public CustomerDTO login(CustomerDTO customer) {
        System.out.println("컨트롤러에서 넘어온 ID: " +customer.getCustomerId() );
        System.out.println("컨트롤러에서 넘어온 PASSWORD: " + customer.getPassword());

        //mapper에 값을 전달해줘야한다.
        return customerMapper.login(customer);
    }    
}