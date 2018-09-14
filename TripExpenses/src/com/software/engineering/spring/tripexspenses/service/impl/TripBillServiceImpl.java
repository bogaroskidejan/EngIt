package com.software.engineering.spring.tripexspenses.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.software.engineering.spring.tripexspenses.dao.TripBillDAO;
import com.software.engineering.spring.tripexspenses.domen.Tripbill;
import com.software.engineering.spring.tripexspenses.service.TripBillService;

@Service("tripBillsService")
public class TripBillServiceImpl implements TripBillService{
	
	@Autowired
	private TripBillDAO tripBillDAO;

	@Override
	public List<Tripbill> findAll() {
		return tripBillDAO.findAll();
	}

	@Override
	public void delete(Long tripBillId) {
		tripBillDAO.delete(tripBillId);
	}

	@Override
	public Tripbill save(Tripbill tripBill) {
		return tripBillDAO.save(tripBill);
	}

	@Override
	public Tripbill findByID(Long tripBillId) {
		return tripBillDAO.findOne(tripBillId);
	}

}
