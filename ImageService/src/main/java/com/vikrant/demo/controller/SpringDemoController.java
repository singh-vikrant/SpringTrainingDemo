package com.vikrant.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vikrant.demo.model.SpringDemo;
import com.vikrant.demo.service.SpringDemoService;

@RestController
@RequestMapping("/api/v1")
public class SpringDemoController {
	
	private SpringDemoService springDemoService;

	@Autowired
	public SpringDemoController(SpringDemoService springDemoService) {
		super();
		this.springDemoService = springDemoService;
	}
	
	@GetMapping("/images")
	public ResponseEntity<Iterable<SpringDemo>> getAllImage()
	{
		
		return ResponseEntity.status(HttpStatus.OK).body(springDemoService.getAllImage());
	}
	@PostMapping("/images")
	public ResponseEntity<Optional<SpringDemo>> addImage(@RequestBody SpringDemo springDemo)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(springDemoService.createImage(springDemo));
	}
	
	
	
	
	
	
	
	
	
	
	

}
