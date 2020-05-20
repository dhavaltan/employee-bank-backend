package com.cognizant.employeebank.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.employeebank.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{ 
}
