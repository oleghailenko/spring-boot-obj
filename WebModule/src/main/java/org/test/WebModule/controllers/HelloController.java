package org.test.WebModule.controllers;

import org.example.Module1.Module1Class;
import org.example.Module2.Module2Class;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Autowired
	Module1Class m1;
	@Autowired
	Module2Class m2;
	
	@RequestMapping("/hello")
	public String hello(){
		return m1.sayHello() + " " + m2.sayHello();
	}
	
}
