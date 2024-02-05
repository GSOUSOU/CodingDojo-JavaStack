package com.codingDojo.ninjaGoldGame.Controllers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class GoldController {

	@RequestMapping("/")
	public String index(HttpSession session,
			@RequestParam(value="formType",required=false) String formType) {
		
		int gold=0;
		ArrayList <String> activities= new ArrayList <String>();
		SimpleDateFormat sdf = new SimpleDateFormat("MMMM d Y h:mm a");
		
		if(session.getAttribute("gold")==null) {
			session.setAttribute("gold", gold);
			session.setAttribute("activities", activities);
		}else {
			gold = (int) session.getAttribute("gold");
			activities = (ArrayList<String>) session.getAttribute("activities");
		}
		
		
		if ("farm".equals(formType)) {
			//activities.add("form ACTIVITY");
			//session.setAttribute("activities", activities);
			int randomnumber = new Random().nextInt(11)+10;
			gold+=randomnumber;
			activities.add("You entered a farm and earned "+randomnumber+" gold. ("+sdf.format(new Date())+")");
			session.setAttribute("activities", activities);
			session.setAttribute("gold", gold);
			return "redirect:/";
			
		}
		if ("cave".equals(formType)) {
			//activities.add("CAVE ACTIVITY");
			//session.setAttribute("activities", activities);
			int randomnumber = new Random().nextInt(6)+5;
			gold+=randomnumber;
			activities.add( "You entered a cave and earned "+randomnumber+" gold. ("+sdf.format(new Date())+")");
			session.setAttribute("activities", activities);
			session.setAttribute("gold", gold);
			return "redirect:/";
			
		}if ("house".equals(formType)) {
			//activities.add("house ACTIVITY");
			//session.setAttribute("activities", activities);
			int randomnumber = new Random().nextInt(3)+2;
			gold+=randomnumber;
			activities.add( "You entered a house and earned "+randomnumber+" gold. ("+sdf.format(new Date())+")");
			session.setAttribute("activities", activities);
			session.setAttribute("gold", gold);
			return "redirect:/";
		}if ("quest".equals(formType)) {
			int randomnumber = new Random().nextInt(101)-50;
			if(randomnumber>=0) {
				gold+=randomnumber;
				activities.add( "You entered a  and earned "+randomnumber+" gold. ("+sdf.format(new Date())+")");
				session.setAttribute("activities", activities);
				session.setAttribute("gold", gold);
				return "redirect:/";
			}else {
			gold+=randomnumber;
			activities.add( "You failed a quest  and  you losed "+randomnumber+" gold ouch. ("+sdf.format(new Date())+")");
			session.setAttribute("activities", activities);
			session.setAttribute("gold", gold);
			return "redirect:/";
			}
		}if ("spa".equals(formType)) {
			int randomnumber = new Random().nextInt(16)+5;
			gold-=randomnumber;
			activities.add( "You entered a spa and losed "+randomnumber+" gold. ("+sdf.format(new Date())+")");
			session.setAttribute("activities", activities);
			session.setAttribute("gold", gold);
			return "redirect:/";
		}if("reset".equals(formType)) {
			 session.invalidate();
		}
		
		return "index.jsp";
	}
	@RequestMapping("/activities")
	public String activities() {
				return "activities.jsp";
		
	}
}
