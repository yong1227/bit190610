package com.bitcamp.web.service;

import java.util.List;

import com.bitcamp.web.domain.EmployeeDTO;

import org.springframework.stereotype.Component;

/**
 * EmplyeeService
 */
@Component
public interface EmployeeService {

    public void addEmployee(EmployeeDTO employee);
    
    public List<EmployeeDTO> findEmploies();
    public List<EmployeeDTO> findEmploiesByWord(EmployeeDTO employee);
    public EmployeeDTO findEmployeeByEmployeeId(EmployeeDTO employee);

    public void updateEmployee(EmployeeDTO employee);

    public void deleteEmployee(EmployeeDTO employee);

}