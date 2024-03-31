package com.productservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productservice.model.Product;
import com.productservice.service.ProductService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {
	public final ProductService productService;
	
	@GetMapping
	public List<Product> getProducts() {
		return productService.getProducts();
	}
	
	@PostMapping
	public Product saveProduct(@RequestBody Product product) {
		return productService.save(product);
	}
}
