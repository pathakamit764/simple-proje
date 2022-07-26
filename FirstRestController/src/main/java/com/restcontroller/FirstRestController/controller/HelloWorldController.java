package com.restcontroller.FirstRestController.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	//using get method and hello-world as URI  
	
	@RequestMapping(method=RequestMethod.GET, path="/hello-world")  
	public String helloworld() {
		return "Hello World";
	}

}
