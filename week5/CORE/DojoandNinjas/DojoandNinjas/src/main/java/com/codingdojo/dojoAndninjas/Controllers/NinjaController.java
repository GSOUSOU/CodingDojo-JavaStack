package com.codingdojo.dojoAndninjas.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.dojoAndninjas.Models.Dojo;
import com.codingdojo.dojoAndninjas.Models.Ninja;
import com.codingdojo.dojoAndninjas.Services.DojoService;
import com.codingdojo.dojoAndninjas.Services.NinjaService;

import jakarta.validation.Valid;

@Controller
public class NinjaController {
	@Autowired
	private NinjaService ninjaService;
	@Autowired
	private DojoService dojoService;
	@GetMapping("/ninjas/new")
	public String newNinja(@ModelAttribute("ninja")Ninja ninja,Model m) {
		List<Dojo> alldojos = dojoService.allDojos();
		m.addAttribute("alldojos", alldojos);
		return"/Ninjas/NewNinja.jsp";
	}
	
	@PostMapping("/ninjas")
public String create(@Valid @ModelAttribute("ninja")Ninja ninja,BindingResult result,Model m) {
		 if (result.hasErrors()) {
			 List<Dojo> alldojos = dojoService.allDojos();
				m.addAttribute("alldojos", alldojos);
	            return "/Ninjas/NewNinja.jsp";
	        } else {
	            ninjaService.createNinja(ninja);
	            return "redirect:/ninjas/new";
	        }
	}

}
