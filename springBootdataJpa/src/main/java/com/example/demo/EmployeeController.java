package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeDoa employeeDoa;
	
	@PostMapping("/employees")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee emp) {
		Employee employee = employeeDoa.save(emp);
		return new ResponseEntity<Employee>(employee,HttpStatus.OK);
	}
}
