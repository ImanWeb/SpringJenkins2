package com.javatechnie.jenkins.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello Iman 30 Sep 2019";
	}

}
