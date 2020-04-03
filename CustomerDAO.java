package com.cognizant.project.dao;

import java.util.List;

import com.cognizant.project.entity.Customer;

public interface CustomerDAO {
   public List<Customer> getAllCustomers();

public void saveCustomer(Customer theCustomer);

public Customer getCustomer(int theId);

public void deleteCustomer(int customerId);

List<Customer> getCustomerbyNameOrId(String val);
}
