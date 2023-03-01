package com.shubham.springbootrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.shubham.springbootrest.controller.library;
import com.shubham.springbootrest.repository.libraryrepository;
  
@SpringBootApplication
public class SpringbootrestApplication implements CommandLineRunner{
	@Autowired
	libraryrepository repository;
	public static void main(String[] args) {
		SpringApplication.run(SpringbootrestApplication.class, args);
	}
	@Override
	public void run(String[] args) 
	{
		library lib=repository.findById("fdsefr343").get();
		System.out.println(lib.getAuthor());
	}

}
