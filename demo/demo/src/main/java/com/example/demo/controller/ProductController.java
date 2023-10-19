package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Departament;
import com.example.demo.entities.Product;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
	
	/*@GetMapping
	public Departament getObjetics() {
		Departament d1 = new Departament();
		d1.setId(1);
		d1.setName("Tech");
		return d1;
	}*/
	
	//retornando uma lista de objetos
	@GetMapping
	public List<Product> getObjects(){
		Departament d1 = new Departament();
		Departament d2 = new Departament();
		
		Product p1 = new Product(1, "Macbook Pro", 4000, d1);
		Product p2 = new Product(2, "PC Gamer", 5000.0, d1);
		Product p3 = new Product(3, "Pet House", 300, d2);
		
		List<Product> list = Arrays.asList(p1, p2, p3);
		return list;
		}

}
