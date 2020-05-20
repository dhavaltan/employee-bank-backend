package com.cognizant.employeebank.model;

import org.springframework.stereotype.Component;

@Component
public class ProjectStats {

	private String projectName;
	private int employeeCount;
	
	public ProjectStats() {
		super();
	}

	public ProjectStats(String projectName, int employeeCount) {
		super();
		this.projectName = projectName;
		this.employeeCount = employeeCount;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public int getEmployeeCount() {
		return employeeCount;
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}
	
}
