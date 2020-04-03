package com.cognizant.project.service;

import com.cognizant.project.entity.Login;

public interface UserService 
{

	boolean validateUser(String username, String password);

	void saveUser(Login login);	
}
