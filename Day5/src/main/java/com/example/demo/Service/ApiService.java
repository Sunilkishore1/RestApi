package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Book;
import com.example.demo.Repositories.BookRepo;

@Service
public class ApiService {
	@Autowired
	BookRepo repository;
	
	public boolean addBook(Book book) {
		repository.save(book);
		return true;
	}
	
	public Optional<Book> getBookById(int id){
		return repository.findById(id);
	}
	
	public List<Book> getBook(){
		return repository.findAll();
	}
	
	public Book updateBook(Book book) {
		Book updated=repository.save(book);
		return updated;
	}
	
	public boolean deleteById(int id) {
		repository.deleteById(id);
		return true;
	}
}
