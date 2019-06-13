package com.bitcamp.web.service;

import java.util.List;

import com.bitcamp.web.domain.OrderDTO;

import org.springframework.stereotype.Component;

/**
 * OrderService
 */
@Component
public interface OrderService {

    public void addOrder(OrderDTO order);

    public List<OrderDTO> findOrders();
    public List<OrderDTO> findOrdersByWord(OrderDTO order);
    public OrderDTO findOrderByOrderId(OrderDTO order);

    public void updateOrder(OrderDTO order);

    public void deleteOrder(OrderDTO order);
    
}