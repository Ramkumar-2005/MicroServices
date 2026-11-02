package com.order_service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.order_service.dto.Product;

@FeignClient(name = "product-service")
public interface OrderInterface {

	@GetMapping("/products/{pid}")
	public Product getProduct(@PathVariable("pid") Integer id);

	
}
