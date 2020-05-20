package com.cognizant.employeebank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.employeebank.model.DesignationStats;
import com.cognizant.employeebank.model.DiversityStats;
import com.cognizant.employeebank.model.ProjectStats;
import com.cognizant.employeebank.service.StatsService;

@RestController
public class StatsController {
	
	@Autowired
	StatsService statsService;
	
	@GetMapping(value="/projectStats")
	public ResponseEntity<List<ProjectStats>> getProjectStats() {
		return new ResponseEntity<>(statsService.getProjectStats(), HttpStatus.OK);
	}

	@GetMapping(value="/diversityStats")
	public ResponseEntity<List<DiversityStats>> getDiversityStats() {
		return new ResponseEntity<>(statsService.getDiversityStats(), HttpStatus.OK);
	}
	
	@GetMapping(value="designationStats")
	public ResponseEntity<List<DesignationStats>> getDesignationStats() {
		return new ResponseEntity<>(statsService.getDesignationStats(), HttpStatus.OK);
	}
}
