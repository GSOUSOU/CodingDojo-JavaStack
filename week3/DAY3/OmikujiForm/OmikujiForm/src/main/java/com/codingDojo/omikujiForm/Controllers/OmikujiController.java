package com.codingDojo.omikujiForm.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class OmikujiController {
	@RequestMapping("/omikuji")
	 public String home() {
		return "omikujiForm.jsp";
	}
	// ...
	@RequestMapping(value="/passData", method=RequestMethod.POST)
	public String login(
	    @RequestParam(value="nbr") String nbr,
	    @RequestParam(value="city") String city,
	    @RequestParam(value="person") String person,
	    @RequestParam(value="endeaver") String endeaver,
	    @RequestParam(value="livingthing") String livingthing,
	    @RequestParam(value="message") String message,
	    HttpSession session){
		String omikujiMessage= String.format("In %s years, you will live in %s with %s as your roommate,%s for living.The next time you  see %s, you will have good luck.Also, %s.",
				nbr,city,person,endeaver, livingthing,message);
	    session.setAttribute("omikujiMessage", omikujiMessage);
	    return "redirect:/omikuji/show";
	}
	// ...
	
	
	@RequestMapping("/omikuji/show")
	public String show( HttpSession session,Model model){
		String  finalmessage =(String)session.getAttribute("omikujiMessage");
		model.addAttribute("finalmessage",finalmessage);
		return "omikujishow.jsp";
		
	}

}
