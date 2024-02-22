package com.codingdojo.BookClub.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.BookClub.models.Book;
import com.codingdojo.BookClub.models.User;
import com.codingdojo.BookClub.services.BookService;
import com.codingdojo.BookClub.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class BookController {
	@Autowired
	private BookService bookService;
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/books")
    public String index(Model model,HttpSession s) {
		
		   	//Route guard
   
    	   Long userId = (Long)s.getAttribute("user_id");
    	 
    	    if(userId == null) {
    	    	return "redirect:/";
    	    }else {
    	    User loggedUser = userService.findUser(userId);
    	   List<Book> books = bookService.allBooks();
    	  // System.out.println(books);
    			model.addAttribute("books", books);
    			model.addAttribute("loggedUser",loggedUser);
    			return "/Books/bookslist.jsp";}
    
    }
	
	@GetMapping("/book/new")
    public String newBook(@ModelAttribute("book") Book book,Model m,HttpSession s) {
    	//Route guard
    Long userId =(Long)s.getAttribute("user_id");
    if(userId == null) {
    	return "redirect:/";
    }
		
    	return "Books/formBook.jsp";
    }
	 @PostMapping("/createbook")
	    public String create(@Valid @ModelAttribute("book") Book book, BindingResult result, HttpSession s) {
	    Long userId = (Long)s.getAttribute("user_id");
	    User loggedUser = userService.findUser(userId);
	    	
	    	if (result.hasErrors()) {
	            return "/books/formBook.jsp";
	        } else {
	        	book.setPostedby(loggedUser);
	        bookService.createBook(book);
	    	return "redirect:/books";
	        }
	    }
	// show book
	    @GetMapping("/books/{id}")
	    public String showBook(@PathVariable("id") Long id,Model model,HttpSession s) {
	    	Long userId = (Long)s.getAttribute("user_id");
		    User loggedUser = userService.findUser(userId);
		    	
	    	Book book = bookService.findBook(id);
	    	model.addAttribute("loggedUser",loggedUser);
	    	model.addAttribute("book", book);
	    	return "/Books/show.jsp";
	    }
	    // edit
	    @RequestMapping("/book/{id}/edit")
	    public String edit(@PathVariable("id") Long id, Model model) {
	        Book book = bookService.findBook(id);
	        model.addAttribute("id", id);
	        model.addAttribute("book", book);
	        return "/Books/edit.jsp";
	    }
	    @PutMapping(value="/book/{id}")
	    public String update(@Valid @ModelAttribute("book") Book book, BindingResult result, HttpSession s) {
	        if (result.hasErrors()) {
	   
	            return "/books/edit.jsp";
	        } else {
	        	Long userId = (Long)s.getAttribute("user_id");
			    User loggedUser = userService.findUser(userId);
	        	book.setPostedby(loggedUser);
	        	bookService.updateBook(book);
	            return "redirect:/books";
	        }
	    }
	    
	    @DeleteMapping(value="/books/{id}")
	    public String destroy(@PathVariable("id") Long id) {
	        bookService.deleteBook(id);
	        return "redirect:/books";
	    }
}
