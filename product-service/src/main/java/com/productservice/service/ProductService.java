package com.productservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.productservice.model.Product;
import com.productservice.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {
	public final ProductRepository productRepository;
	
	public Product save(Product product) {
		return productRepository.save(product);
	}
	
	public List<Product> getProducts() {
		return productRepository.getProducts();
	}
}
