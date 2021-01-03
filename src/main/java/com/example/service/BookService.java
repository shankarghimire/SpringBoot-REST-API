package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.entity.Book;

@Component
public class BookService {

	private static List<Book>listBook = new ArrayList<>();
	static {
		listBook.add(new Book(101, "Java Complete Guide","Mr. Harry"));
		listBook.add(new Book(102, "Spring Boot Complete Guide","Mr. ABC"));
		listBook.add(new Book(103, "Spring Web MVC","XYZ"));
	}
	
	//Methods to extract all books
	public List<Book>getAllBooks(){
		return listBook;
	}
	
	//Method to extract a single Book
	public Book getBookById(int id) {
		Book book = null;
		//Method I:
		book = listBook.stream().filter(e->e.getId()==id).findFirst().get();
		//Method II:
//		for(Book b: listBook) {
//			if(id == b.getId()) {
//				book = b;
//				break;
//			}
//		}
		return book;
	}
	
}
