package com.jayantaprofile.profileProject.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class MyController {
	
	@Value("${spring.message}")
	private String msg;
	
	@Value("${spring.author}")
	private String author;
	
	@Value("${student.names}")
	private List<String> names;
	
	@Value("#{${users}}")
	private HashMap<String,String> users;
	
	@GetMapping("hello")
	public String welcome() {
		System.out.println(names.get(1));
		System.out.println(users.get("test1"));
		return msg;
	}
	@GetMapping("author")
	public String author() {

		return author+"he is the best author of India .This is from the github now working in the same here";

	}
	@GetMapping("message")
	public String masg() {

		return "hi sir ji from git hub.....relax";

	}

}
