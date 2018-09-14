package com.software.engineering.spring.tripexspenses.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.software.engineering.spring.tripexspenses.dao.UserDAO;
import com.software.engineering.spring.tripexspenses.domen.User;
import com.software.engineering.spring.tripexspenses.service.UserService;

@Service("usersService")
public class UserServiceImpl implements UserService{
	@Autowired
	UserDAO userDAO;

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userDAO.findAll();
	}

	@Override
	public void delete(Long userid) {
		userDAO.delete(userid);
		
	}

	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		return userDAO.save(user);
	}

	@Override
	public User findByID(Long userid) {
		// TODO Auto-generated method stub
		return userDAO.findOne(userid);
	}

	@Override
	public User findByUsername(String username) {
		// TODO Auto-generated method stub
		return userDAO.findByUsername(username);
	}
	
	

}
