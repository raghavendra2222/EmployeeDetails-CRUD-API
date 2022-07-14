package com.employee.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.employee.rest.model.Details;
import com.employee.rest.repo.DetailsRepo;

@org.springframework.stereotype.Service
public class DetailsService {
	@Autowired
	DetailsRepo detailsRepo;
	public Details insertDetails(Details details) {
		return detailsRepo.save(details);
	}
	public List<Details> insertDetails(List<Details> details){
		return (List<Details>) detailsRepo.saveAll(details);
	}
	public List<Details> getDetails(){
		return (List<Details>) detailsRepo.findAll();
	}
	public List<Details> getDetailsByEfname(String efname){
		return (List<Details>) detailsRepo.findByEfname(efname);
	}
	public Optional<Details> getDetailsByEid(Long id){
		return (Optional<Details>) detailsRepo.findById(id);
	}
	public void deleteDetails(Long id) {
		detailsRepo.deleteById(id);
	}
	public Details update(Details details) {
		return detailsRepo.save(details);
	}
	
	
}
