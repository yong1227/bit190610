package com.bitcamp.web.mapper;

import java.util.List;

import com.bitcamp.web.domain.SupplierDTO;

import org.springframework.stereotype.Repository;

/**
 * SupplierMapper
 */
@Repository
public interface SupplierMapper {

     //create 추가
    public void insertSupplier(SupplierDTO supplier);
    //read 종류 3가지
    public List<SupplierDTO> selectSuppliers();
    public List<SupplierDTO> selectSuppliersByWord(SupplierDTO supplier);
    public SupplierDTO selectSupplierBySupplierId(String supplier);

    //update
    public void updateSupplier(SupplierDTO supplier);
    //delete
    public void deleteSupplier(SupplierDTO supplier);
}