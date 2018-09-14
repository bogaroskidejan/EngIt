package com.software.engineering.spring.tripexspenses.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.software.engineering.spring.tripexspenses.dao.BusinessTripDAO;
import com.software.engineering.spring.tripexspenses.domen.Businesstrip;
import com.software.engineering.spring.tripexspenses.service.BusinessTripService;

@Service("businessTripService")
public class BusinessTripServiceImpl implements BusinessTripService {
	
	@Autowired
	private BusinessTripDAO businessTripDAO;

	@Override
	public List<Businesstrip> findAll() {
		return businessTripDAO.findAll();
	}

	@Override
	public void delete(Long bussinessTripId) {
		businessTripDAO.delete(bussinessTripId);
	}

	@Override
	public Businesstrip save(Businesstrip businessTrip) {
		return businessTripDAO.save(businessTrip);
	}

	@Override
	public Businesstrip findByID(Long bussinessTripId) {
		return businessTripDAO.findOne(bussinessTripId);
	}

}