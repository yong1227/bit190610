package com.bitcamp.web.mapper;

import java.util.HashMap;
import java.util.List;

import com.bitcamp.web.common.util.PageProxy;
import com.bitcamp.web.domain.CustomerDTO;

import org.springframework.stereotype.Repository;

/**
 * CustomerMapper
 */
@Repository
public interface CustomerMapper {

    public void insertCustomer(CustomerDTO customer);
    public List<CustomerDTO> selectCustomers();
    public List<CustomerDTO> selectCustomers(PageProxy pxy);

    public List<CustomerDTO> selectCustomersByWord(CustomerDTO customer);
    public CustomerDTO selectCustomerByCustomerId(String customer);

    public int updateCustomer(CustomerDTO customer);

    public void deleteCustomer(CustomerDTO customer);

    public int selectCount();
    
    //메소드값이 mapper.xml의 id값과 동일한 태그로 가서 값이 전달된다.
    public CustomerDTO login(CustomerDTO customer);

}