package com.software.engineering.spring.tripexspenses.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.software.engineering.spring.tripexspenses.domen.Bill;

@Repository("billsDAO")
public interface BillDAO extends JpaRepository<Bill, Long>{

}
