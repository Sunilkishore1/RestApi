package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Student;
import com.example.demo.Service.ApiService;

@RestController
public class ApiController {
	@Autowired
	ApiService service;
	
	@PostMapping("/student")
	public boolean create(@RequestBody Student student) {
		return service.addStudent(student);
	}
	
	@GetMapping("/student/{id}")
	public Optional<Student> readById(@PathVariable int id){
		return service.getSutdentById(id);
	}
	
	@GetMapping("/student")
	public List<Student> read(){
		return service.getStudent();
	}
	
	@PutMapping("/student/{id}")
	public Student update(@RequestBody Student stud){
		return service.updateStudentById(stud);
	}
	
	@DeleteMapping("/student")
	public boolean delete(@RequestParam int id) {
		return service.deleteStudentById(id);
	}
	
}
