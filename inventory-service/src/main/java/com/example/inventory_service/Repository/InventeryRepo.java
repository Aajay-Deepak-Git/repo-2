package com.example.inventory_service.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.inventory_service.Dto.Product;


@Repository
public interface InventeryRepo extends JpaRepository<Product,Integer>{
	
	@Query(value="SELECT * FROM product WHERE product_code IN (:product_code)",nativeQuery = true)
	public List<Product> getproductdata(@Param("product_code") List<String> product_code);


}
