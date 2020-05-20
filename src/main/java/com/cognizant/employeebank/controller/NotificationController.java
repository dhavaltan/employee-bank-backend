package com.cognizant.employeebank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.employeebank.model.Notification;
import com.cognizant.employeebank.service.NotificationService;

@RestController
@RequestMapping(value="/notifications")
public class NotificationController {

	@Autowired
	NotificationService notificationService;

	@GetMapping()
	public ResponseEntity<List<Notification>> findRecentNotification() {
		return new ResponseEntity<>(notificationService.findRecentNotification(), HttpStatus.OK);
	}
}
