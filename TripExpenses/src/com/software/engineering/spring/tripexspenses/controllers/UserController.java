package com.software.engineering.spring.tripexspenses.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.software.engineering.spring.tripexspenses.domen.Employee;
import com.software.engineering.spring.tripexspenses.domen.User;
import com.software.engineering.spring.tripexspenses.service.AuthorityService;
import com.software.engineering.spring.tripexspenses.service.EmployeesService;
import com.software.engineering.spring.tripexspenses.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private EmployeesService employeeService;
	@Autowired
	private AuthorityService authoritiesService;
	
	@RequestMapping("/users")
	public String showUsers(Model model) {
		List<User> users=userService.findAll();
		model.addAttribute("users",users);
		return "users";
	}
	@RequestMapping("/adduser")
	public String createLocation(Model model) {
		List<Employee> employees = employeeService.findAll();
		model.addAttribute("employees", employees);
		
		return "adduser";
	}

	@RequestMapping(value = "/docreateuser", method = RequestMethod.POST)
	public String doCreateUser(Model model,  User user, Long employeeid, BindingResult result) {
		Employee employee=employeeService.findByID(employeeid);
		user.setEmployee(employee);
		userService.save(user);
		authoritiesService.addAuthorities(user);
		System.out.println(user);
		System.out.println("user added successfully");
		model.addAttribute("message","User added succesfully!!!");
		
		
		return "adduser";

	}
}
