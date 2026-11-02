package com.product_service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product_service.entity.Product;
import com.product_service.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	

	

	private final ProductService productService;

	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@GetMapping("/{id}")
	public com.product_service.entity.Product getProduct(@PathVariable("id") Integer pid) {
		return productService.getProduct(pid);

	}

	@PostMapping()
	public Product insert(@RequestBody Product product) {
		return productService.insertProduct(product);

	}
	
	@PatchMapping("/soft_delete/{id}")
	public ResponseEntity<String> soft_delete(@PathVariable Integer id) {
		
		if( productService.soft_delete(id)==false) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok("record_deleted");

	}

}
