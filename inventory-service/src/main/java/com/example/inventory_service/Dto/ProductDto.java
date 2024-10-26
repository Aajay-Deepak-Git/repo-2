package com.example.inventory_service.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {

	private Long product_id;
	private String product_name;
	private String product_code;
	private int quantity;
}
