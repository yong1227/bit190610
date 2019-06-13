package com.bitcamp.web.mapper;

import java.util.List;

import com.bitcamp.web.domain.ShipperDTO;

import org.springframework.stereotype.Repository;

/**
 * ShipperMapper
 */
@Repository
public interface ShipperMapper {

    //create 추가
    public void insertShipper(ShipperDTO Shipper);
    //read 종류 3가지
    public List<ShipperDTO> selectShippers();
    public List<ShipperDTO> selectShippersByWord(ShipperDTO Shipper);
    public ShipperDTO selectShipperByShipperId(String Shipper);

    //update
    public void updateShipper(ShipperDTO Shipper);
    //delete
    public void deleteShipper(ShipperDTO Shipper);
}