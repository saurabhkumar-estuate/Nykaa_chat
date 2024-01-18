package com.skht.service;

import com.skht.entity.Order;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class OrderServiceImpl implements OrderService {

    Map<Integer, Order> map = new HashMap<>();
    @Override
    public Order saveOrder(Order o) {
        Random r = new Random();
        int num = r.nextInt(100);
        map.put(num,o);
        return o;
    }

    @Override
    public List<Order> getAllOrders() {
        List<Order> list = new ArrayList<>();
        for(Map.Entry<Integer, Order> m : map.entrySet()){
            list.add(m.getValue());
        }
        return list;
    }
}
