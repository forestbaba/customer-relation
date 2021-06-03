package com.forestsoftware.dao;

import com.forestsoftware.entity.Customer;

import java.util.List;

public interface CustomerDAO {

    public List<Customer> getCustomers();

   public void saveCustomer(Customer customer);
}
