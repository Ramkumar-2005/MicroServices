package com.product_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product_service.dto.Product;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	
	    @PostMapping("/insert")
		public Product insert(@RequestBody Product product) {
			return product;
			
		}
		 
	    @GetMapping("/fetch/{id}")
		public Product fetchbyid(Product product ,@PathVariable Integer id) {
	    	if(product.getId()==id) {
	    		return product;
	    	}
			return null;
			
		}


}
