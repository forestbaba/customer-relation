package com.forestsoftware.service;

import com.forestsoftware.entity.Customer;

import java.util.List;

public interface CustomerService {

    public List<Customer>getCustomers();

    public void saveCustomer(Customer customer);
}
