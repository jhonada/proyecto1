package com.example.demo.rest;


import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import com.example.demo.entitys.Products;
@RestController
@RequestMapping("/proyecto2")
public class ProductsREST {
	
	
	/*@GetMapping(path = "/producto1")
	public ResponseEntity<List<Products>> getProducts(){
		
		return ResponseEntity.ok();
	}
	*/
	
	//@GetMapping(path = "/saludar")
	public String Hola() {
		
		return "Hola Mundo";
	}

}
