package com.henlo.human;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	@RequestMapping("/")
	public String greeting(
			@RequestParam(value="name", required=false) String name, 
			@RequestParam(value="last_name", required=false) String last_name,
			@RequestParam(value="times", required=false) int times) {
			
		if(name == null && last_name == null && times == 0) {
			return "Hello, Humane!";
		} else if (name != null && last_name == null) {b 
			return "Hello, " + name + "!";
		} else if (name != null && last_name != null) {
			return "Hello, " + name + " " + last_name + "!";
		}
		return "Hello, Humane!";
	}

}
