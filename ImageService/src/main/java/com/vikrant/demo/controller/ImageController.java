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

import com.vikrant.demo.model.Image;
import com.vikrant.demo.service.ImageService;

@RestController
@RequestMapping("/api/v1")
public class ImageController {
	
	private ImageService imageService;

	@Autowired
	public ImageController(ImageService imageService) {
		super();
		this.imageService = imageService;
	}
	
	@GetMapping("/images")
	public ResponseEntity<Iterable<Image>> getAllImage()
	{
		
		return ResponseEntity.status(HttpStatus.OK).body(imageService.getAllImage());
	}
	@PostMapping("/images")
	public ResponseEntity<Optional<Image>> addImage(@RequestBody Image image)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(imageService.createImage(image));
	}
	
	
	
	
	
	
	
	
	
	
	

}
