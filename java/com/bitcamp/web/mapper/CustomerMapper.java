package com.bitcamp.web.mapper;

import java.util.List;

import com.bitcamp.web.domain.CustomerDTO;

import org.springframework.stereotype.Repository;

/**
 * CustomerMapper
 */
@Repository
public interface CustomerMapper {

    public void insertCustomer(CustomerDTO customer);
    public List<CustomerDTO> selectCustomers();
    public List<CustomerDTO> selectCustomersByWord(CustomerDTO customer);
    public CustomerDTO selectCustomerByCustomerId(String customer);

    public void updateCustomer(CustomerDTO customer);

    public void deleteCustomer(CustomerDTO customer);

}