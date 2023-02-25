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
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Book;
import com.example.demo.Service.ApiService;

@RestController
public class ApiController {
	@Autowired
	ApiService service;
	
	@PostMapping("/book")
	public boolean add(@RequestBody Book book) {
		return service.addBook(book);
	}
	
	@GetMapping("/book/{id}")
	public Optional<Book> readById(@PathVariable int id){
		return service.getBookById(id);
	}
	
	@GetMapping("/book")
	public List<Book> read(){
		return service.getBook();
	}
	
	@PutMapping("/book/{id}")
	public Book write(@RequestBody Book book) {
		return service.updateBook(book);
	}
	
	@DeleteMapping("/book/{id}")
	public boolean delete(@PathVariable int id) {
		return service.deleteById(id);
	}

	
}
