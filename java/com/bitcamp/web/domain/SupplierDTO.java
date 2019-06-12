package com.bitcamp.web.domain;

import lombok.Data;

/**
 * Supplier
 */
@Data
public class SupplierDTO {

    private String supplierId ,
                    supplierName,
                    contactName,
                    address ,
                    city,
                    postalCode, 
                    country ,
                    phone ;
}