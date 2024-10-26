package com.example.inventory_service.Dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long product_id;
	@Column(nullable = false,columnDefinition = "varchar(100)")
	private String product_name;
	@Column(nullable = false,columnDefinition = "varchar(20)")
	private String product_code;
	@Column(nullable = false,columnDefinition = "varchar(100)")
	private int quantity;

}
