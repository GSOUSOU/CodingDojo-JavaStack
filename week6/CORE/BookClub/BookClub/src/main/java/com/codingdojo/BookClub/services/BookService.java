package com.codingdojo.BookClub.services;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.BookClub.models.Book;
import com.codingdojo.BookClub.repositories.BookRepository;

@Service
public class BookService {
	
	private final BookRepository bookRepository;
	
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
 // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    
    public void deleteBook(Long id) {
    	bookRepository.deleteById(id);
    }
//update
    public Book updateBook(Book b){

    		return bookRepository.save(b);
    	
        
    }
}
