package com.example.employee.services;

import java.util.List;

import com.example.employee.entities.Employee;

public interface EmpService {
	String addEmp(Employee e);
	Employee getEmpInfo(String empId);
	List<Employee>getInfo();
	String updateEmp(Employee e);
	String deleteEmp(String empId);
	
}
