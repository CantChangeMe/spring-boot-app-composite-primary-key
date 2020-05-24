package com.vivek.spring.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.vivek.spring.entity.identity.EmployeeIdentifier;

@Entity
@Table(name =  "employee") 
public class Employee {
	
	@EmbeddedId
	private EmployeeIdentifier employeeIdentifier;	
	
	private String firstName;
	private String lastName;
	
	public Employee() {
		
	}
	
	public Employee(EmployeeIdentifier employeeIdentifier, String firstName, String lastName) {
		super();
		this.employeeIdentifier = employeeIdentifier;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public EmployeeIdentifier getEmployeeIdentifier() {
		return employeeIdentifier;
	}
	public void setEmployeeIdentifier(EmployeeIdentifier employeeIdentifier) {
		this.employeeIdentifier = employeeIdentifier;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee [employeeIdentifier=" + employeeIdentifier + ", firstName=" + firstName + ", lastName="
				+ lastName + "]";
	}
	

}
