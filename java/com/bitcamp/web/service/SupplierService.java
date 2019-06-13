package com.bitcamp.web.service;

import java.util.List;

import com.bitcamp.web.domain.SupplierDTO;

import org.springframework.stereotype.Component;

/**
 * SupplierService
 */
@Component
public interface SupplierService {

    //create 추가
    public void addSupplier(SupplierDTO supplier);
    //read 종류 3가지
    public List<SupplierDTO> findSuppliers();
    public List<SupplierDTO> findSuppliersByWord(SupplierDTO supplier);
    public SupplierDTO findSupplierBySupplierId(SupplierDTO supplier);

    //update
    public void updateSupplier(SupplierDTO supplier);
    //delete
    public void deleteSupplier(SupplierDTO supplier);
}