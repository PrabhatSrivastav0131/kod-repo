package com.example.employee.controller;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.entities.Employee;
import com.example.employee.services.EmpService;

@RestController
@RequestMapping("emp")
public class EmployeeController {
	EmpService empServ;
	
	public EmployeeController( EmpService empServ) {
		super();
		this.empServ=empServ;
	}
	@PostMapping
	public String addEmp(@RequestBody Employee e) {
		String msg=empServ.addEmp(e);
		return msg;
	}
	
	@GetMapping(value="{empId}")
	public Employee getEmpInfo(@PathVariable String empId) {
		Employee e=empServ.getEmpInfo(empId);
		return e;
		
	}
	@GetMapping
	public List<Employee> getInfo() {
		List<Employee> empListObjects =empServ.getInfo();
		return empListObjects;
	}
	@PutMapping
	public String updateEmp(@RequestBody Employee e) {
		String msg=empServ.updateEmp(e);
		return msg;
	}

	@DeleteMapping(value="{empId}")
	public String deleteEmp(@PathVariable String empId) {
		String msg=empServ.deleteEmp(empId);
		return msg;
	}

	

}
