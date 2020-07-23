package com.vikrant.demo;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vikrant.demo.dao.SpringDemoDao;
import com.vikrant.demo.model.SpringDemo;

@SpringBootApplication
public class SpringDemoServiceApplication implements CommandLineRunner{
	private SpringDemoDao springDemoDao;

	@Autowired
	public SpringDemoServiceApplication(SpringDemoDao springDemoDao) {
		super();
		this.springDemoDao = springDemoDao;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		springDemoDao.save(new SpringDemo(UUID.randomUUID(), "vikrant-url-1") );
		springDemoDao.save(new SpringDemo(UUID.randomUUID(),"vikrant-url-2"));
		springDemoDao.save(new SpringDemo(UUID.randomUUID(),"vikrant-url-3"));
	}

}
