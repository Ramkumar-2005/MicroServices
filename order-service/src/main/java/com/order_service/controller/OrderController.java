package com.order_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.order_service.dto.Order;
import com.order_service.services.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

	public final OrderService orderService;

	public OrderController(OrderService orderService) {
		super();
		this.orderService = orderService;
	}

	@GetMapping
	public Order placeOrder(@RequestParam("id") Integer pid, @RequestParam("quantity") Integer q) {
		return orderService.placeOrder(pid, q);

	}

}
