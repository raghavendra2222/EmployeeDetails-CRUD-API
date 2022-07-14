package com.employee.rest.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.rest.model.Details;

public interface DetailsRepo extends JpaRepository<Details, Long> {
	public List<Details> findByEfname(String name);
	//public List<Details> findAllByOrderByDsc();
}
