package com.productservice.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.productservice.model.Product;

@Repository
public class ProductRepository {
	
	List<Product> products = new ArrayList<>();
	
	public List<Product> getProducts() {
		return products;
	}
	
	public Product save(Product product) {
		products.add(product);
		return product;
	}

}
