package com.software.engineering.spring.tripexspenses.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.software.engineering.spring.tripexspenses.domen.User;
import com.software.engineering.spring.tripexspenses.dao.AuthorityDAO;
import com.software.engineering.spring.tripexspenses.domen.Authority;
import com.software.engineering.spring.tripexspenses.service.AuthorityService;

@Service("authorityService")
public class AuthorityServiceImpl implements AuthorityService{
	@Autowired
	AuthorityDAO authorityDAO;
	
	public static final String userRole="user";
	@Override
	
	public List<Authority> findAll() {
		// TODO Auto-generated method stub
		return authorityDAO.findAll();
	}

	@Override
	public void delete(Long authorityid) {
		authorityDAO.delete(authorityid);
		
	}

	@Override
	public void addAuthorities(User user) {
		Authority authority=new Authority();
		
		// TODO Auto-generated method stub
		authority.setUsername(user.getUsername());
		authority.setAuthority(userRole);
		authorityDAO.save(authority);
		
	}

	@Override
	public Authority findByID(Long authorityid) {
		// TODO Auto-generated method stub
		return authorityDAO.findOne(authorityid);
	}

}
