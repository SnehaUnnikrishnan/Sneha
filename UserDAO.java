package com.cognizant.project.dao;

import com.cognizant.project.entity.Login;

public interface UserDAO {


	boolean validateUser(String uname, String pass);

	void saveUser(Login login);

}
