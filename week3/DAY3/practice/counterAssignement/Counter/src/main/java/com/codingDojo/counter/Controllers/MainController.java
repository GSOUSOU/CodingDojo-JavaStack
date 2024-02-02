package com.codingDojo.counter.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {
	@RequestMapping("/")
public String index(HttpSession session) {
		
    	// If the count is not already in session
		if (session.getAttribute("count") == null) {
			session.setAttribute("count",0);
		// Use setAttribute to initialize the count in session
		}
		else {
		// increment the count by 1 using getAttribute and setAttribute
			int counter=(int) session.getAttribute("count");
			session.setAttribute("count",++counter);
			
		}
		return "index.jsp";
	}
	
	@RequestMapping("/counter")
public String welcome() {
		
    	
		return "welcome.jsp";
	}
//Ninja Bonus 1: Create a third page that increments the counter by 2.	
	@RequestMapping("/incrementingByTWO")	
public String incrementbyTwo(HttpSession session) {
		
    	// If the count is not already in session
		if (session.getAttribute("count") == null) {
			session.setAttribute("count",2);
		// Use setAttribute to initialize the count in session
		}
		else {
		// increment the count by 1 using getAttribute and setAttribute
			int counter=(int) session.getAttribute("count");
			counter+=2;
			session.setAttribute("count",counter);
			
		}
		return "twoincrement.jsp";
	}
	// reset visit counter ( sorry i don't use a buttom)
	@RequestMapping("/resetcounter")	
public String resetCounter(HttpSession session) {
		
    	session.removeAttribute("count");
		return "resetCounter.jsp";
	}
	
}
