package com.poying.springbootecommerce.service;


import com.poying.springbootecommerce.dto.CreateOrderRequest;

public interface OrderService {
   Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
