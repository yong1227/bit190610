package com.bitcamp.web.serviceImpl;

import java.util.List;

import com.bitcamp.web.domain.EmployeeDTO;
import com.bitcamp.web.service.EmployeeService;

import org.springframework.stereotype.Service;

/**
 * EmplyeeServiceImpl
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public void addEmployee(EmployeeDTO employee) {

    }

    @Override
    public List<EmployeeDTO> findEmploies() {
        return null;
    }

    @Override
    public List<EmployeeDTO> findEmploiesByWord(EmployeeDTO employee) {
        return null;
    }

    @Override
    public EmployeeDTO findEmployeeByEmployeeId(EmployeeDTO employee) {
        return null;
    }

    @Override
    public void updateEmployee(EmployeeDTO employee) {

    }

    @Override
    public void deleteEmployee(EmployeeDTO employee) {

    }

    
}