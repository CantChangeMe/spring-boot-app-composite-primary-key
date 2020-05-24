package com.vivek.spring.entity.identity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class EmployeeIdentifier implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String companyId;
	private String employeeId;
	
	
	public EmployeeIdentifier() {
		
	}
	
	public EmployeeIdentifier(String companyId, String employeeId) {
		super();
		this.companyId = companyId;
		this.employeeId = employeeId;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	
	

}
