package com.poying.springbootecommerce.service;


import com.poying.springbootecommerce.dto.CreateOrderRequest;
import com.poying.springbootecommerce.dto.OrderQueryParams;
import com.poying.springbootecommerce.model.Order;

import java.util.List;

public interface OrderService {
   Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

   Order getOrderById(Integer orderId);

   List<Order> getOrders(OrderQueryParams orderQueryParams);

   Integer countOrder(OrderQueryParams orderQueryParams);
}
