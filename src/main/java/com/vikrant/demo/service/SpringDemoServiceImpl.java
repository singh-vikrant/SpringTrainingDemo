package com.vikrant.demo.service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.vikrant.demo.dao.SpringDemoDao;
import com.vikrant.demo.model.SpringDemo;

@Service
@EnableTransactionManagement
public class SpringDemoServiceImpl implements SpringDemoService {
	private SpringDemoDao springDemoDao;

	@Autowired
	public SpringDemoServiceImpl(SpringDemoDao springDemoDao) {
		super();
		this.springDemoDao = springDemoDao;
	}

	@Override
	@Transactional
	public Iterable<SpringDemo> getAllImage() {
	
		return springDemoDao.findAll();

	}

	@Override
	@Transactional
	public Optional<SpringDemo> createImage(SpringDemo springDemo) {
	
		springDemoDao.save(springDemo);
		return Optional.of(springDemo);
	}
	

	@Override
	@Transactional
	public Optional<SpringDemo> updateImage(SpringDemo springDemo,UUID id) {
	
		springDemoDao.save(springDemo).setId(id);
		return Optional.of(springDemo);
	}
}
