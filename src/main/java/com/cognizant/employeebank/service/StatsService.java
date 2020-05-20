package com.cognizant.employeebank.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.employeebank.dao.EmployeeRepository;
import com.cognizant.employeebank.model.DesignationStats;
import com.cognizant.employeebank.model.DiversityStats;
import com.cognizant.employeebank.model.Employee;
import com.cognizant.employeebank.model.ProjectStats;

@Service
public class StatsService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<ProjectStats> getProjectStats() {
		List<Employee> employeeDetails = employeeRepository.findAll();
		List<ProjectStats> projectStats = new ArrayList<>();
		Set<String> projectNames = new HashSet<String>();
		for(final Employee emp : employeeDetails) {
			projectNames.add(emp.getProjectName());
		}
		for(String str : projectNames)
		{
			int count = 0;
			for(final Employee emp : employeeDetails)
			{
				if(emp.getProjectName().equals(str)) {
					count++;
				}
			}
			projectStats.add(new ProjectStats(str,count));
		}
		return projectStats;
	}

	public List<DiversityStats> getDiversityStats() {
		List<Employee> employeeDetails = employeeRepository.findAll();
		List<String> gender = new ArrayList<>(Arrays.asList("Male","Female" ));
		List<DiversityStats> diversityStats = new ArrayList<>();
		
		
		for(String str : gender)
		{
			int count = 0;
			for(final Employee emp : employeeDetails)
			{
				if(emp.getGender().equals(str)) {
					count++;
				}
			}
			diversityStats.add(new DiversityStats(str,count));
		}
		return diversityStats;
	}

	public List<DesignationStats> getDesignationStats() {
		List<Employee> employeeDetails = employeeRepository.findAll();
		List<DesignationStats> designationStats = new ArrayList<>();
		Set<String> designationNames = new HashSet<String>();
		for(final Employee emp : employeeDetails) {
			designationNames.add(emp.getDesignation());
		}
		for(String str : designationNames)
		{
			int count = 0;
			for(final Employee emp : employeeDetails)
			{
				if(emp.getDesignation().equals(str)) {
					count++;
				}
			}
			designationStats.add(new DesignationStats(str,count));
		}
		return designationStats;
	}

}
