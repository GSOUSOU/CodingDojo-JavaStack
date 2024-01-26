package com.codingdojo.daikichiRoutes.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DaikichiController {
	
	@GetMapping("/daikichi")
	public String welcome() {
		return "Welcome!";
	}
 
	@GetMapping("/daikichi/today")
	public String findLuck() {
		return "Today you will find luck in all your endeavors!";
	}
	
	@GetMapping("/daikichi/tomorrow")
	public String ariseOpportunity() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
}
