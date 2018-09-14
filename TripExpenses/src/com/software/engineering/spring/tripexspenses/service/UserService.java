package com.software.engineering.spring.tripexspenses.service;

import java.util.List;


import com.software.engineering.spring.tripexspenses.domen.User;

public interface UserService {
	public List<User> findAll();
	public void delete(Long userid);
	public User save(User user);
	public User findByID(Long userid) ;
	public User findByUsername(String username);
}
