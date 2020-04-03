package com.cognizant.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.project.dao.CustomerDAO;
import com.cognizant.project.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
	CustomerDAO customerDao;
	
	@Override
	@Transactional
	public List<Customer> getAllCustomers() {
		return customerDao.getAllCustomers();
	}

	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {
		customerDao.saveCustomer(theCustomer);
		
	}

	@Override
	@Transactional
	public Customer getCustomer(int theId) {
return customerDao.getCustomer(theId);		
	}

	@Override
	@Transactional
	public void deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		
		customerDao.deleteCustomer(customerId);

	}

	@Override
	@Transactional
	public List<Customer> getCustomerbyNameOrId(String val) {
		return customerDao.getCustomerbyNameOrId(val);
	}

}