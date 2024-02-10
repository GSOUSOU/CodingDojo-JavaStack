package com.codingdojo.burgerTracker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.burgerTracker.models.Burger;
import com.codingdojo.burgerTracker.services.BurgerService;

import jakarta.validation.Valid;

@Controller
public class BurgerController {
	@Autowired 
 BurgerService burgerService;
	 @RequestMapping("/")
public String index(@ModelAttribute("burger") Burger burger, Model model ) {
		 List <Burger> burgers = burgerService.allBurgers();
		 model.addAttribute("burgers", burgers);
		 return "/Burgers/index.jsp";
	 }
	 @PostMapping("/burgers")
	    public String create(@Valid @ModelAttribute("burger") Burger burger, BindingResult result, Model model) {
	        if (result.hasErrors()) {
	        	List<Burger> burgers = burgerService.allBurgers();
				model.addAttribute("burgers", burgers);
	            return "/Burgers/index.jsp";
	        } else {
	        	burgerService.addBurger(burger);
	            return "redirect:/";
	        }
	    }
}
