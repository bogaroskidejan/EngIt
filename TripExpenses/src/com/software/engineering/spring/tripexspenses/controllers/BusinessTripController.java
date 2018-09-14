package com.software.engineering.spring.tripexspenses.controllers;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.software.engineering.spring.tripexspenses.domen.Businesstrip;
import com.software.engineering.spring.tripexspenses.domen.Employee;
import com.software.engineering.spring.tripexspenses.domen.Location;
import com.software.engineering.spring.tripexspenses.domen.Tripbill;
import com.software.engineering.spring.tripexspenses.service.BusinessTripService;
import com.software.engineering.spring.tripexspenses.service.EmployeesService;
import com.software.engineering.spring.tripexspenses.service.LocationService;
import com.software.engineering.spring.tripexspenses.service.TripBillService;

@Controller
public class BusinessTripController {
	
	@Autowired
	private BusinessTripService businessTripService;
	
	@Autowired
	private EmployeesService employeeService;
	
	@Autowired
	private LocationService locationService;
	
	@Autowired
	private TripBillService tripBillService;
	
	@RequestMapping("/businesstrips")
	public String showLocations(Model model) {
		List<Businesstrip> businessTrips =businessTripService.findAll();
		model.addAttribute("businesstrips",businessTrips);
		return "businesstrips";
	}
	
	@RequestMapping("/addbusinesstrip")
	public String createBusinesstrip(Model model) {
		List<Employee> employees = employeeService.findAll();
		model.addAttribute("employees", employees);
		
		List<Location> locations = locationService.findAll();
		model.addAttribute("locations", locations);
		
		return "addbusinesstrip";
	}

	@RequestMapping(value = "/docreatebusinesstrip", method = RequestMethod.POST)
	public String doCreateBusinesstrip (Model model,String fromdate, String todate, Long locid,Long employeeid, Businesstrip businessTrip,  BindingResult result)throws Exception {

		Employee employee=employeeService.findByID(employeeid);
		Location location=locationService.findByID(locid);
		businessTrip.setEmployee(employee);
		businessTrip.setLocation(location);

		BigDecimal allowance=location.getLocdailyallowance();
		Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(fromdate); 
		Date date2=new SimpleDateFormat("dd-MM-yyyy").parse(todate);  
		  
		  long between =   date2.getTime() - date1.getTime();
		  System.out.println(between);
		  businessTrip.setDayscount(TimeUnit.DAYS.convert(between, TimeUnit.MILLISECONDS));
		  long days=TimeUnit.DAYS.convert(between, TimeUnit.MILLISECONDS);
		  BigDecimal total=allowance.multiply(new BigDecimal(days));
		  businessTrip.setFromdate(date1);
		  businessTrip.setTodate(date2);
		  businessTrip.setTriptotallow(total);
		  System.out.println(businessTrip);
		
		businessTripService.save(businessTrip);
		
		Tripbill tripBill = new Tripbill();
		tripBill.setBusinesstrip(businessTrip);
		tripBillService.save(tripBill);
		
		System.out.println("Business trip added successfully");
		model.addAttribute("message", "Business trip added succesfully!!!");
		
		return "addbusinesstrip";
	}
	
	@RequestMapping("/deletebusinesstrip")
	public String deleteBusinessTrip(Model model, Long bustripid) {
		businessTripService.delete(bustripid);
		List<Businesstrip> businesstrips = businessTripService.findAll();
		model.addAttribute("businesstrips", businesstrips);
		return "businesstrips";
	}

}