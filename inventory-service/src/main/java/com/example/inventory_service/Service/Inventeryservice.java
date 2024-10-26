package com.example.inventory_service.Service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.example.inventory_service.Dto.ProductDto;
import com.example.inventory_service.Repository.InventeryRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class Inventeryservice {
	
	private final InventeryRepo repo;
	
	public List<ProductDto> getDataService(List<String> product_code) {
		
		List<ProductDto> data = repo.getproductdata(product_code).stream()
				.map(k -> ProductDto.builder().product_id(k.getProduct_id()).product_code(k.getProduct_code())
						.product_name(k.getProduct_name()).quantity(k.getQuantity()).build())
				.toList();
		
		return data;
		
	}

}
