package com.skht.controller;

import com.skht.entity.CustomerDetails;
import com.skht.entity.Items;
import com.skht.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    private CustomerService service;
    public CustomerController(CustomerService service){
        this.service=service;
    }

    @PostMapping("/addcustomer")
    public CustomerDetails addCustomer(@RequestBody CustomerDetails customerDetails){
        return service.addCustomerDetails(customerDetails);
    }

    @GetMapping("/getcustomers")
    public List<CustomerDetails> getAllCustomers(){
        return service.getAllCustomerDetails();
    }

    @GetMapping("/getitems/{itemSku}")
    public Items getItems(@PathVariable String itemSku){
        return service.getItems(itemSku);
    }
}
