package com.software.engineering.spring.tripexspenses.service;

import java.util.List;

import com.software.engineering.spring.tripexspenses.domen.Tripbill;


public interface TripBillService {
	
	public List<Tripbill> findAll();
	public void delete(Long tripbillid);
	public Tripbill save(Tripbill tripbill);
	public Tripbill findByID(Long tripbillid);

}