package com.skht.service;

import com.skht.entity.Order;

import java.util.List;

public interface OrderService {

    Order saveOrder(Order o);

    List<Order> getAllOrders();
}
