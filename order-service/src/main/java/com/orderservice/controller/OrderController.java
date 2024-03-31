package com.orderservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orderservice.model.Order;
import com.orderservice.model.Product;
import com.orderservice.service.OrderService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/orders")
public class OrderController {
	public final OrderService orderService;
	
	@GetMapping
	public List<Order> getOrders() {
		return orderService.getOrders();
	}
	
	@PostMapping
	public Order save(@RequestBody List<Product> products) {
		return orderService.save(products);
	}
}
