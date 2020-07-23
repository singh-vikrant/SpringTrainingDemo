package com.vikrant.demo.service;

import java.util.Optional;
import java.util.UUID;

import com.vikrant.demo.model.SpringDemo;

public interface SpringDemoService {
	public Iterable<SpringDemo> getAllImage();
	public Optional<SpringDemo> createImage(SpringDemo springDemo); 
	public Optional<SpringDemo> updateImage(SpringDemo springDemo,UUID id);

}
