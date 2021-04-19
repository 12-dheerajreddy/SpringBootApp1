package com.example.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Citizen;

public interface CitizenRepo extends JpaRepository<Citizen, Serializable>{

	public Citizen findBySsn(String ssn);
	
}
