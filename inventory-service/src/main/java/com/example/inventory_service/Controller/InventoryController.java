package com.example.inventory_service.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.inventory_service.Dto.ProductDto;
import com.example.inventory_service.Service.Inventeryservice;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {
	
	private final Inventeryservice service;
	
//	url -  http://localhost:8083/api/inventory/productdata?product_code=NS1602024,UNI2024,SPL2024,R152024,CBL2024,DK2024
	@GetMapping("/productdata")
	public List<ProductDto> inventaryController(@RequestParam("product_code") List<String> prodcut_code) {
		
		return  service.getDataService(prodcut_code);
	}

}
