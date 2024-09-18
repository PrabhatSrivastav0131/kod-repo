package com.example.employee.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.employee.entities.Employee;
import com.example.employee.repositories.EmpRepostory;
@Service
public class EmpServiceImplementation implements EmpService 
{
	EmpRepostory emprepo;
	public EmpServiceImplementation(EmpRepostory emprepo) {
		super();
		this.emprepo=emprepo;
	}
	@Override
	public String addEmp(Employee e) {
		emprepo.save(e);
		return "Employee Object is created and saved";
	}

	@Override
	public Employee getEmpInfo(String empId) {
		Employee e=emprepo.findById(empId).get();
		return e;
	}

	@Override
	public List<Employee> getInfo() {
		List<Employee> empList=emprepo.findAll();
		return empList;
	}

	@Override
	public String updateEmp(Employee e) {
		emprepo.save(e);
		return "Employee Object is updated";
	}

	@Override
	public String deleteEmp(String empId) {
		emprepo.deleteById(empId);
		return "Employee object is deleted";
	}

}
