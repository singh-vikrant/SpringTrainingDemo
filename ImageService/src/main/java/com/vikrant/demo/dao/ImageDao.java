package com.vikrant.demo.dao;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vikrant.demo.model.Image;

@Repository
public interface ImageDao extends CrudRepository<Image, UUID>{

}
