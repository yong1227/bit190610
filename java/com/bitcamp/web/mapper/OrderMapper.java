package com.bitcamp.web.mapper;

import java.util.List;

import com.bitcamp.web.domain.OrderDTO;

import org.springframework.stereotype.Repository;

/**
 * OrerMapper
 */
@Repository
public interface OrderMapper {

    public void insertOrder(OrderDTO order);

    public List<OrderDTO> selectOrders();
    public List<OrderDTO> selectOrdersByWord(OrderDTO order);
    public OrderDTO selectOrderByOrderId(String order);

    public void updateOrder(OrderDTO order);

    public void deleteOrder(OrderDTO order);
}