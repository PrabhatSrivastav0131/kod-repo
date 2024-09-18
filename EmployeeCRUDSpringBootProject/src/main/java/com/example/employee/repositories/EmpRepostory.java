package com.example.employee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employee.entities.Employee;

public interface EmpRepostory extends JpaRepository<Employee,String> 
{
	

}
