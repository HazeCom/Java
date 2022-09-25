package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Product;
import com.example.demo.entity.ProductDTO;
import com.example.demo.exception.ProductException;
import com.example.demo.repository.ProductDao;

public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDao dao; 
	
	@Override
	public Product registerProduct(Product p) throws ProductException {
		if(p==null) throw new ProductException("Please provide product details");
		return dao.save(p);
	}

	@Override
	public List<Product> getAllProducts() throws ProductException {
		List<Product> products = dao.findAll();
		if(products.isEmpty()) throw new ProductException("Table is empty");
		return products;
	}

	@Override
	public Product updateProdcut(Product p) throws ProductException {
		dao.findById(p.getProductid()).orElseThrow(()->new ProductException("No prodcut found to update"));
		return dao.save(p);
	}

	@Override
	public Product deleteProductById(Integer pid) throws ProductException {
		Product product = dao.findById(pid).orElseThrow(()->new ProductException("No product found to delete"));
		dao.delete(product);
		return product;
	}

	@Override
	public List<Product> getsProductByCategory(String category) throws ProductException {
		List<Product> products = dao.findByCategory(category);
		if(products.isEmpty()) throw new ProductException("No product with the given id could be found");
		return products;
	}

	@Override
	public List<ProductDTO> getProductNameQtyPrice() throws ProductException {
		
		return null;
	}

}
