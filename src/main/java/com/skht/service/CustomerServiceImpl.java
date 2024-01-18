package com.skht.service;

import com.skht.entity.CustomerDetails;
import com.skht.entity.Items;
import com.skht.entity.Order;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CustomerServiceImpl implements CustomerService{
    Map<Integer, CustomerDetails> map = new HashMap<>();
    @Override
    public CustomerDetails addCustomerDetails(CustomerDetails customerDetails) {
        Random r = new Random();
        int num = r.nextInt(100);
        map.put(num,customerDetails);
        for(Map.Entry<Integer, CustomerDetails> m : map.entrySet()){
           return m.getValue();
        }
        return null;
    }

    @Override
    public List<CustomerDetails> getAllCustomerDetails() {
        List<CustomerDetails> list = new ArrayList<>();
        for(Map.Entry<Integer, CustomerDetails> m : map.entrySet()){
            list.add(m.getValue());
        }
        return list;
    }

    @Override
    public Items getItems(String itemSku) {
        List<CustomerDetails> list = new ArrayList<>();
        for(Map.Entry<Integer, CustomerDetails> m : map.entrySet()){
            list.add(m.getValue());
        }
        CustomerDetails customerDetails = list.get(0);
        List<Items> items = customerDetails.getItems();
        for(Items item : items){
            String value = item.getItemSku();
            if(value.equals(itemSku)){
                return item;
            }
        }
        return null;
    }
}
