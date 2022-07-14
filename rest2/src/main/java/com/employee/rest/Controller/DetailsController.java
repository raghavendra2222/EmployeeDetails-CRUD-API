package com.employee.rest.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.*;

import com.employee.rest.model.Details;
import com.employee.rest.service.DetailsService;

@RestController
public class DetailsController {
	@Autowired
	DetailsService detailsService;
	@PostMapping("/DetailsSave")
	public String insertDetails(@RequestBody Details details) {
		detailsService.insertDetails(details);
		return "Record is saved Successfully";
	}
	@PostMapping("/multipleDetailsSave")
	public String insertDetails(@RequestBody List<Details> details) {
		detailsService.insertDetails(details);
		return "saved Successfully";
	}
	@GetMapping("/getAllDetails")
	public List<Details> getDetails(){
		return (List<Details>) detailsService.getDetails();
	}
	@GetMapping("/getByEfname/{Efname}")
	public List<Details> getDetailsByEfname(@PathVariable("Efname") String fname){
		return (List<Details>) detailsService.getDetailsByEfname(fname);
	}
	@GetMapping("/getByEid/{Eid}")
	public Optional<Details> getDetailsByEid(@PathVariable("Eid") Long id){
		return detailsService.getDetailsByEid(id);
	}
	@DeleteMapping("/deletedetails/{id}")
	public String deleteDetails(@PathVariable("id") Long id) {
		detailsService.deleteDetails(id);
		return "Successfully Deleted";
	}
	@PutMapping("/updation")
	public Details update(@RequestBody Details details) {
		return detailsService.update(details);
	}
	
}
