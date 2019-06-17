package com.bitcamp.web.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * Supplier
 */
@Data
@Component
@Lazy
public class SupplierDTO {

    private String supplierId ,
                    supplierName,
                    contactName,
                    address ,
                    city,
                    postalCode, 
                    country ,
                    phone ;

    public void setCity(String city){
        this.city = city;
    }

    public String getCity(){
        return this.city;
    }
}