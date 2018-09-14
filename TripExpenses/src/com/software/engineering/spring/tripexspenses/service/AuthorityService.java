package com.software.engineering.spring.tripexspenses.service;

import java.util.List;

import com.software.engineering.spring.tripexspenses.domen.Authority;
import com.software.engineering.spring.tripexspenses.domen.User;



public interface AuthorityService {
	public List<Authority> findAll();
	public void delete(Long authorityid);
	public void addAuthorities(User user);
	public Authority findByID(Long authorityid) ;
}
