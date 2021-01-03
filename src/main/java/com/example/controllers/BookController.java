package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Book;
import com.example.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	//@ResponseBody
	//@RequestMapping(value="/books", method=RequestMethod.GET)
	@GetMapping("/books")
	public List<Book>  getBooks() {	
		return this.bookService.getAllBooks();
	}
	
	@GetMapping("/book/{id}")
	public Book getBookById(@PathVariable("id") int id) {
		return this.bookService.getBookById(id);
	}

}
