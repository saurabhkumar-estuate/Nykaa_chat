package com.skht.service;

import com.skht.entity.CustomerDetails;
import com.skht.entity.Items;

import java.util.List;

public interface CustomerService {

    CustomerDetails addCustomerDetails(CustomerDetails customerDetails);

    List<CustomerDetails> getAllCustomerDetails();

    Items getItems(String itemSku);
}
