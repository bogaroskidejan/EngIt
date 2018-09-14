package com.software.engineering.spring.tripexspenses.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.software.engineering.spring.tripexspenses.domen.Tripbill;



@Repository("tripBillsDAO")
public interface TripBillDAO extends JpaRepository<Tripbill, Long>{

}