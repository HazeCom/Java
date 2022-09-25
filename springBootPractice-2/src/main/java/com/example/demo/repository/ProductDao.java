package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Product;
import com.example.demo.entity.ProductDTO;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer>{
	public List<Product> findByCategory(String category);
	
	public List<Product> findTop2ByPrice(Double price);
	
	@Query("select new com.example.demo.entity.ProductDTO()")
	public List<ProductDTO> getNameQtyPrice();
}
