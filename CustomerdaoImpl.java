package com.cognizant.project.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.project.entity.Customer;

@Repository
public class CustomerdaoImpl implements CustomerDAO {
	@Autowired
	private SessionFactory factory;

	@Override
	@Transactional
	public List<Customer> getAllCustomers() {
		Session session=factory.getCurrentSession();
		// this is not SQL but HQL
		Query<Customer> query=
				session.createQuery("from Customer",Customer.class);
		 List<Customer> listOfCustomers=query.getResultList();
		  System.out.println("***");
		  listOfCustomers.forEach(c ->System.out.println(c));
		  System.out.println("***");
			return listOfCustomers;
		 
		
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
Session session=factory.getCurrentSession();
//session.save(theCustomer);
session.saveOrUpdate(theCustomer);	
}

	@Override
	public Customer getCustomer(int theId) {
		Session session=factory.getCurrentSession();
		
		Customer customer=session.get(Customer.class, theId);
		return customer;
	}

	@Override
	public void deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		Session session = factory.getCurrentSession();
		Customer customer=session.get(Customer.class, customerId);
		session.delete(customer);
	}
	
	
	
	@Override
	@Transactional
	public List<Customer> getCustomerbyNameOrId(String val){
		Session session=factory.getCurrentSession();
		Query<Customer> query=session.createQuery("from Customer where firstName like '"+val+"%' or lastName like  '"+val+"%' or concat(firstName,lastName) like '"+val+"%' or id ='"+val+"%' order by id"); 
		
		List<Customer> custList=query.getResultList();
		return custList;
		
	}
	
	
	
	
	
	
	
	
	
	
}