package com.codingdojo.helloHuman.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
 @RequestMapping("/")
 public String greeting(@RequestParam(value="name", required=false) String name,
		 @RequestParam(value="last_name", required=false) String last_name,
		 @RequestParam(value="times", required=false) Integer times) {
	  String response="";
	  if (name!=null) {
	       if(times>0) {
			 for(int i=0; i<times; i++) {
				
				 response+= "hello " +name +" "+last_name+" ";
				 } 
				 
		   }else {
			 response= "nothing to print check times prarameter";
		    }
	 return response;
	 }else
	return "Hello human ";
	 
 }
}
