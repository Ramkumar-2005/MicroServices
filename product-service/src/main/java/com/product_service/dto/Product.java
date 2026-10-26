package com.product_service.dto;

import lombok.Data;

@Data
public class Product {
	
	private Integer id;
	private String name;
	private Integer price;
	private Integer order_id;

}
