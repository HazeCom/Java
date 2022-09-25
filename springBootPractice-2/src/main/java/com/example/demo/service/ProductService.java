package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.entity.ProductDTO;
import com.example.demo.exception.ProductException;

@Service
public interface ProductService {
	public Product registerProduct(Product p)throws ProductException;
	public List<Product> getAllProducts()throws ProductException;
	public Product updateProdcut(Product p)throws ProductException;
	public Product deleteProductById(Integer pid)throws ProductException;
	public List<Product> getsProductByCategory(String category)throws
	ProductException;
	public List<ProductDTO> getProductNameQtyPrice() throws
	ProductException;
	}

