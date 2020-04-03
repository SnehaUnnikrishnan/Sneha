package com.cognizant.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cognizant.project.entity.Login;
import com.cognizant.project.service.UserService;





@Controller
@RequestMapping("/user")
public class UserController 
{
	@Autowired
	UserService userService;
	
	@GetMapping("/login")
	public String login(Model model)
	{
		Login login=new Login();
		model.addAttribute("user", login);
		return "Login-form";
	}
	@PostMapping("/checkuser")
	public String validateUser(@ModelAttribute("user") Login login)
	{	
		boolean b=userService.validateUser(login.getUsername(),login.getPassword());
		if(!b)
			return "redirect:/user/login";
		return "redirect:/customer/list"; 
	}
	}
	
	

