package com.customerservice.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.customerservice.model.Product;

@Repository
public class ProductRepository {
	
	List<Product> productList = new ArrayList<>();
	
	public Product save(Product product) {
		productList.add(product);
		return product;
	}
	
	public List<Product> getAll() {
		return productList;
	}
}
