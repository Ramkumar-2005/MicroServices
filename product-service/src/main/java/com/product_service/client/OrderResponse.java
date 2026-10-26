package com.product_service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.order_service.dto.Order;

@FeignClient(
	name="order-service",
	url="http://localhost:6001")
		
public interface  OrderResponse {

	@GetMapping("/orders/orderDetails/{id}")
	public void getOrderDetails(@RequestBody Order order,@PathVariable Integer id);
}
