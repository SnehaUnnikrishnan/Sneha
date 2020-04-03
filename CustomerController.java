package com.cognizant.project.controllers;

import java.util.List;

import javax.persistence.QueryHint;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cognizant.project.entity.Customer;
import com.cognizant.project.service.CustomerService;


@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	 
	@RequestMapping("/list")
	public String listCustomers(Model theModel) {
		List<Customer> customers =customerService.getAllCustomers();
		theModel.addAttribute("customers", customers);
		System.out.println(customers);//my cross checking im printing here
		return "customer-list";
	}
	@RequestMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel)
	{
		Customer customer=new Customer();
		theModel.addAttribute("customer",customer);
		return "customer-form";
		
	}
	@RequestMapping("/saveCustomer")
	public String saveCustomer(@Valid @ModelAttribute("customer") Customer theCustomer,BindingResult bind) {
		if(bind.hasErrors())
		{
			System.out.println();
			return "customer-form";
		}
		else {
		customerService.saveCustomer(theCustomer);
		return "redirect:/customer/list";}
	}
	
	@RequestMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId") int theId, Model theModel) {
		//get customer from service
		Customer theCustomer=customerService.getCustomer(theId);
		
		
		//set model att to prepopulate
		theModel.addAttribute("customer", theCustomer);
		
		
		return "customer-form";
		
	}
	
	@RequestMapping("/delete")
	public String deleteCustomer(@RequestParam("id") int customerId) {
		customerService.deleteCustomer(customerId);

		return "redirect:/customer/list";
	}
	
	
	@GetMapping("/searchCustomer")
	public String searchCustomer(@RequestParam("val") String val,Model custModel) {
		List<Customer> searchList= customerService.getCustomerbyNameOrId(val);
		custModel.addAttribute("customers",searchList);
		
		
		return "customer-list";
		
	}
	
	
	
	
	
	
	
	
	

	

	
}
