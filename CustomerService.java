package com.cognizant.project.service;

import java.util.List;

import com.cognizant.project.entity.Customer;

public interface CustomerService {

	List<Customer> getAllCustomers();

	void saveCustomer(Customer theCustomer);

	Customer getCustomer(int theId);

	void deleteCustomer(int customerId);
	
	
	List<Customer> getCustomerbyNameOrId(String val);
	
}