package com.vivek.spring.entity.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vivek.spring.entity.Employee;
import com.vivek.spring.entity.identity.EmployeeIdentifier;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, EmployeeIdentifier> {
	
	List<Employee> findAll();
	
	Employee findByEmployeeIdentifier(EmployeeIdentifier identifier);
	
}
