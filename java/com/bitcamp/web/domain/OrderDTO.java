package com.bitcamp.web.domain;

import lombok.Data;

/**
 * Order
 */
@Data
public class OrderDTO {

    private String orderId,
                    customerId,
                    employeeId, 
                    orderDate,
                    shipperId ;
   
}