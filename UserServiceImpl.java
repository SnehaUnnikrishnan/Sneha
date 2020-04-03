package com.cognizant.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.project.dao.UserDAO;
import com.cognizant.project.entity.Login;




@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAO userDao;
	
	@Override
	@Transactional
	public boolean validateUser(String username, String password) {
		return userDao.validateUser(username,password);
	}

	@Override
	@Transactional
	public void saveUser(Login login) {
		userDao.saveUser(login);
	}

}
