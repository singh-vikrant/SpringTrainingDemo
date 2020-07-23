package com.vikrant.demo.service;

import java.util.Optional;

import com.vikrant.demo.model.Image;

public interface ImageService {
	public Iterable<Image> getAllImage();
	public Optional<Image> createImage(Image image); 
	//public Optional<Image> delete(Image image);

}
