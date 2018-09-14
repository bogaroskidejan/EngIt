package com.software.engineering.spring.tripexspenses.controllers;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.software.engineering.spring.tripexspenses.domen.Tripbill;
import com.software.engineering.spring.tripexspenses.service.TripBillService;


@Controller
public class TripBillController {

	@Autowired
	private TripBillService tripBillService; 
	
	@RequestMapping("/tripbills")
	public String showLocations(Model model) {
		List<Tripbill> tripBills = tripBillService.findAll();
		model.addAttribute("tripbills", tripBills);
		return "tripbills";
	}
	
	@RequestMapping("/addTripbill")
	public String createBill(Model model) {
		return "addtripbill";
	}

	@RequestMapping(value = "/docreatetripbill", method = RequestMethod.POST)
	public String doCreateTripbill(Model model,  Tripbill tripBill,  BindingResult result) {
		tripBillService.save(tripBill);
		System.out.println(tripBill);
		System.out.println("Trip Bill added successfully");
		model.addAttribute("message", "Tripbill added succesfully!!!");
		
		return "addtripbill";
	}
	
	@RequestMapping(value = "/deletetripbill")
	public String delete(Model model, Long tripbillid) {
		tripBillService.delete(tripbillid);
		List<Tripbill> tripbills = tripBillService.findAll();
		model.addAttribute("tripbills", tripbills);
		return "tripbills";
	}

	@RequestMapping(value = "/updatedetripbill")
	public String update(Model model, Long tripbillId) {
		Tripbill tripBill = tripBillService.findByID(tripbillId);
		List<Tripbill> tripBills = new ArrayList<>();
		tripBills.add(tripBill);
		model.addAttribute("tripbills", tripBills);
		return "updatetripbill";
	}

	@RequestMapping(value = "/doupdatetripbill")
	public String doUpdate(Model model,@Valid Tripbill tripBill, BindingResult result) {
		tripBillService.save(tripBill);
		List<Tripbill> tripBills = tripBillService.findAll();
		model.addAttribute("tripbills", tripBills);
		model.addAttribute("message","Tripbill updated succesfully!!!");
		return "tripbills";
	}
	
}
