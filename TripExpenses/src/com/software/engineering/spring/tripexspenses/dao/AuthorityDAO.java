package com.software.engineering.spring.tripexspenses.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.software.engineering.spring.tripexspenses.domen.Authority;


@Repository("authoritiesDAO")
public interface AuthorityDAO extends JpaRepository<Authority, Long>{
	
}
