package com.vivek.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vivek.spring.entity.Employee;
import com.vivek.spring.entity.identity.EmployeeIdentifier;
import com.vivek.spring.entity.repository.EmployeeRepository;

@SpringBootApplication
public class SpringBootCompositePrimaryKeyApplication implements CommandLineRunner {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootCompositePrimaryKeyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		employeeRepository.deleteAllInBatch();
		Employee employee = new Employee(new EmployeeIdentifier("C-1000", "E-1000"), "Vivek", "Kumar");
		Employee employee2 = new Employee(new EmployeeIdentifier("C-1001", "E-1001"), "Vive", "Kum");
		
		employeeRepository.save(employee);
		employeeRepository.save(employee2);
		System.out.println(employeeRepository.findAll());
		System.out.println("Vivek-??"+employeeRepository.findById(new EmployeeIdentifier("C-1001", "E-1001")));
		
		
	}

}
