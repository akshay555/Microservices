package com.mservice.msample.controller;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mservice.msample.bean.HelloBean;

@RestController
public class HelloController {

	@GetMapping(path="/hello-world")
	public String helloworld() {
		System.out.println("Hello");
		return "Hello World";
	} 
	
	
	@GetMapping(path="/hello-world-bean/path-varible/{name}")
	public HelloBean helloworldBean(@PathVariable String name) {
		return new HelloBean(String.format("Hello-world %s", name));
	} 
	
	
	
}
