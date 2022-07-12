package com.poying.springbootecommerce.service;


import com.poying.springbootecommerce.dto.CreateOrderRequest;
import com.poying.springbootecommerce.model.Order;

public interface OrderService {
   Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

   Order getOrderById(Integer orderId);
}
