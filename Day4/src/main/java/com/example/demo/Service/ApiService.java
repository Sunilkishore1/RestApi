package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Student;
import com.example.demo.Repositories.StudentRepo;

@Service
public class ApiService {
	@Autowired
	StudentRepo repository;
	
	public boolean addStudent(Student stud) {
		repository.save(stud);
		return true;
	}
	
	public Optional<Student> getSutdentById(int a){
		return repository.findById(a);
	}
	
	public List<Student> getStudent(){
		return repository.findAll();
	}
	
	public Student updateStudentById(Student stu){
		Student updatedData=repository.save(stu);
		return updatedData;
	}
	
	public boolean deleteStudentById(int id) {
		repository.deleteById(id);
		return true;
	}
	
	
}
