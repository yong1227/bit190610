package com.bitcamp.web.service;

import java.util.List;

import com.bitcamp.web.domain.ShipperDTO;

import org.springframework.stereotype.Component;

/**
 * ShipperService
 */
@Component
public interface ShipperService {
    
     //create 추가
     public void addShipper(ShipperDTO Shipper);
     //read 종류 3가지
     public List<ShipperDTO> findShippers();
     public List<ShipperDTO> findShippersByWord(ShipperDTO Shipper);
     public ShipperDTO findShipperByShipperId(ShipperDTO Shipper);
 
     //update
     public void updateShipper(ShipperDTO Shipper);
     //delete
     public void deleteShipper(ShipperDTO Shipper);
    
}