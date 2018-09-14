package com.software.engineering.spring.tripexspenses.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.software.engineering.spring.tripexspenses.dao.BillDAO;
import com.software.engineering.spring.tripexspenses.domen.Bill;
import com.software.engineering.spring.tripexspenses.service.BillService;

@Service("billsService")
public class BillServiceImpl implements BillService {
	
	@Autowired
	private BillDAO billDAO;

	@Override
	public List<Bill> findAll() {
		return billDAO.findAll();
	}

	@Override
	public void delete(Long billId) {
		billDAO.delete(billId);
	}

	@Override
	public Bill save(Bill bill) {
		return billDAO.save(bill);
	}

	@Override
	public Bill findByID(Long billId) {
		return billDAO.findOne(billId);
	}

}
