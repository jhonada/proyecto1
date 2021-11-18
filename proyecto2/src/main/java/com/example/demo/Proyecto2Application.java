package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.demo.entitys.Products;

@SpringBootApplication
public class Proyecto2Application implements CommandLineRunner{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	public static void main(String[] args) {
		SpringApplication.run(Proyecto2Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		String sql = "SELECT * FROM Asesores";
		List<Products> products = jdbcTemplate.query(sql, 
				BeanPropertyRowMapper.newInstance(Products.class));
		products.forEach(System.out :: println);
	}

}
