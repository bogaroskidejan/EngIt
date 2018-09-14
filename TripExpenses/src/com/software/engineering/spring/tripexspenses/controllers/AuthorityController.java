package com.software.engineering.spring.tripexspenses.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.software.engineering.spring.tripexspenses.domen.Authority;
import com.software.engineering.spring.tripexspenses.domen.User;
import com.software.engineering.spring.tripexspenses.service.AuthorityService;
import com.software.engineering.spring.tripexspenses.service.UserService;

@Controller
public class AuthorityController {
	@Autowired
	UserService userService;
	@Autowired
	AuthorityService authorityService;

	@RequestMapping("/authorities")
	public String showAuthorities(Model model) {
		List<Authority> authorities=authorityService.findAll();
		model.addAttribute("authorities",authorities);
		return "authorities";
	}
	


}
