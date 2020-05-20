package com.cognizant.employeebank.model;

import org.springframework.stereotype.Component;

@Component
public class DesignationStats {
private String designation;
private int count;

public DesignationStats() {
	super();
}

public DesignationStats(String designation, int count) {
	super();
	this.designation = designation;
	this.count = count;
}

public String getDesignation() {
	return designation;
}

public void setDesignation(String designation) {
	this.designation = designation;
}

public int getCount() {
	return count;
}

public void setCount(int count) {
	this.count = count;
}

}
