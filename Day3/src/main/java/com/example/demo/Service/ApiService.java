package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Employee;
import com.example.demo.Repositories.EmployeeRepo;

@Service
public class ApiService {
	@Autowired
	EmployeeRepo repository;
	
	public boolean addEmployee(Employee employee) {
		repository.save(employee);
		return true;
	}
	
	public Optional<Employee> getEmployeeById(int id){
		return repository.findById(id);
	}
	
	public List<Employee> getEmployee(){
		return repository.findAll();
	}
}
