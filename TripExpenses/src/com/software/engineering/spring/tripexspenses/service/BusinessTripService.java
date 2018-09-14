package com.software.engineering.spring.tripexspenses.service;

import java.util.List;

import com.software.engineering.spring.tripexspenses.domen.Businesstrip;

public interface BusinessTripService {

	public List<Businesstrip> findAll();
	public void delete(Long bussinessTripId);
	public Businesstrip save(Businesstrip businessTrip);
	public Businesstrip findByID(Long bussinessTripId);
	
}