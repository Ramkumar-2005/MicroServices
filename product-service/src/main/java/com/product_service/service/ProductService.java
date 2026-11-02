package com.product_service.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.product_service.entity.Product;
import com.product_service.repository.ProductRepository;

@Service
public class ProductService {

	private final ProductRepository productRepository;

	ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public Product getProduct(Integer id) {
		// TODO Auto-generated method stub
		Optional<Product> op = productRepository.findById(id);
		return op.get();
	}

	public Product insertProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}
	
	public Product update(Product product ) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	public boolean soft_delete(Integer id) {
		// TODO Auto-generated method stub
	Optional<Product>op=	productRepository.findById(id);
     Product product=op.get();
     if(product.getDelete()==false) {
    	 product.setDelete(true);
     }
     productRepository.save(product);
    
		return true;
	}



	

}
