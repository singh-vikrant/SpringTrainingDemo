package com.vikrant.demo.service;

import java.util.Optional;

import com.vikrant.demo.model.SpringDemo;

public interface SpringDemoService {
	public Iterable<SpringDemo> getAllImage();
	public Optional<SpringDemo> createImage(SpringDemo springDemo); 
	//public Optional<Image> delete(Image image);

}
