package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Citizen;
import com.example.repo.CitizenRepo;

@RestController
public class CitizenController {
	@Autowired
	private CitizenRepo cr;
	
	@GetMapping("/welcome/{ssn}")
	public String findSsn(@PathVariable String ssn) {
		Citizen ssnum = cr.findBySsn(ssn);
		String statename = ssnum.getStatename();
		//String fname = ssnum.getFname();
		//String namedetals=fname+"belongs to "+statename+"state";
		return statename;
	}
	
	@PostMapping("/Save")
	public String GiveDatils(@RequestBody Citizen cit) {
		Citizen save = cr.save(cit);
		String msg="data save sucessfully";
		
		return msg;
	}

}
