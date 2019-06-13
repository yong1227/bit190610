package com.bitcamp.web.mapper;

import java.util.List;

import com.bitcamp.web.domain.EmployeeDTO;

import org.springframework.stereotype.Repository;

/**
 * EmplyeeMapper
 */
@Repository
public interface EmployeeMapper {
    
    public void insertEmployee(EmployeeDTO employee);
    
    public List<EmployeeDTO> selectEmploies();
    public List<EmployeeDTO> selectEmploiesByWord(EmployeeDTO employee);
    public EmployeeDTO selectEmployeeByEmployeeId(String employee);

    public void updateEmployee(EmployeeDTO employee);

    public void deleteEmployee(EmployeeDTO employee);
}