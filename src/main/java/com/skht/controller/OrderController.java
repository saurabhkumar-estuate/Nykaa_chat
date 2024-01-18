package com.skht.controller;

import com.skht.entity.Order;
import com.skht.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    private OrderService service;

    public OrderController(OrderService service){
        this.service=service;
    }

    @PostMapping("/save")
    public Order saveOrder(@RequestBody Order o){
        return service.saveOrder(o);
    }

    @GetMapping("/getorder")
    public List<Order> getAllOrders(){
        return service.getAllOrders();
    }
}
