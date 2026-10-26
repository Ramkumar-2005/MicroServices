package com.order_service.dto;

import lombok.Data;

@Data
public class Order {

	private Integer order_id;
	private Integer product_id;
	private Integer quantity;
	private Double price;
	private String Status;
}
