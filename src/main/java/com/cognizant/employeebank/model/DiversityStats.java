package com.cognizant.employeebank.model;

import org.springframework.stereotype.Component;

@Component
public class DiversityStats {

	private String gender;
	private int count;
	
	public DiversityStats() {
		super();
	}

	public DiversityStats(String gender, int count) {
		super();
		this.gender = gender;
		this.count = count;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
}
