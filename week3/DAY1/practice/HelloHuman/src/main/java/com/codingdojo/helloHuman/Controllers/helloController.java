package com.codingdojo.helloHuman.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
	  @RequestMapping("/")
	    public String greeting(@RequestParam(value="name",required=false) String name,@RequestParam(value="last_name",required=false) String last_name) {
		  if((name!=null)&&(last_name!=null)) {
			
			  return "hello: " + name +" "+last_name;
			  
		  }else
		  return "hello human";
	    }

}
