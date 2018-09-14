package com.software.engineering.spring.tripexspenses.service;


import java.util.List;

import com.software.engineering.spring.tripexspenses.domen.Bill;

public interface BillService {
	
	public List<Bill> findAll();
	public void delete(Long billId);
	public Bill save(Bill bill);
	public Bill findByID(Long billId);

}
