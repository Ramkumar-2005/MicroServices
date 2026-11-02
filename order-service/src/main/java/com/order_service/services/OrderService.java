package com.order_service.services;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Service;

import com.order_service.client.OrderInterface;
import com.order_service.dto.Order;
import com.order_service.dto.Product;

@Service
@EnableFeignClients
public class OrderService {

	private final OrderInterface client;

	public OrderService(OrderInterface client) {
		this.client = client;
	}

	public Order placeOrder(Integer pid, Integer q) {
		// TODO Auto-generated method stub
		Product p = client.getProduct(pid);

		Order order = new Order();
		order.setProduct_name(p.getName());
		order.setQuantity(q);
		order.setTotal_price(p.getPrice() * q);
		return order;

	}
}
