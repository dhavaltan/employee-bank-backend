package com.cognizant.employeebank.service;

import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.employeebank.dao.EmployeeRepository;
import com.cognizant.employeebank.dao.NotificationRepository;
import com.cognizant.employeebank.model.Employee;
import com.cognizant.employeebank.model.Notification;
import com.cognizant.employeebank.util.DateUtil;

@Service
public class NotificationService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	NotificationRepository notificationRepository;
	
	@PostConstruct
	public void sendNotification() {
		List<Employee> employeeList = employeeRepository.findAll();
		
		for(final Employee emp : employeeList) {
			if(DateUtil.isBirthday(emp.getDateOfBirth(),new Date())) {
				notificationRepository.saveNotification("Today is "+emp.getName() + "'s Birthday");
			}
		}
	}

	public List<Notification> findRecentNotification() {
		return notificationRepository.findRecentNotification();
	}
 
}
