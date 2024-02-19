package com.codingdojo.dojoAndninjas.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.dojoAndninjas.Models.Dojo;
import com.codingdojo.dojoAndninjas.Services.DojoService;

import jakarta.validation.Valid;

@Controller
public class DojoController {
	@Autowired
	private DojoService dojoService;
	@GetMapping("/dojos/new")
	public String newDojo(@ModelAttribute("dojo")Dojo dojo) {
		return"/Dojos/NewDojo.jsp";
	}
	
	@PostMapping("/dojos")
public String create(@Valid @ModelAttribute("dojo")Dojo dojo,BindingResult result) {
		 if (result.hasErrors()) {
	            return "/Dojos/NewDojo.jsp";
	        } else {
	            dojoService.createDojo(dojo);
	            return "redirect:/dojos/new";
	        }
	}
	@GetMapping("/dojos/{id}")
	public String showDojo(@PathVariable("id") Long id, Model model) {
		Dojo dojo = dojoService.findDojo(id);
		model.addAttribute("dojo", dojo);
		
		return "/Dojos/showDojo.jsp";
	}

}
