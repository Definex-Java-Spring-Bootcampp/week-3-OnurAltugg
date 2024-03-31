package com.orderservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.orderservice.model.Order;
import com.orderservice.model.Product;
import com.orderservice.repository.OrderRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderService {
	public final OrderRepository orderRepository;
	
	public List<Order> getOrders() {
		return orderRepository.getOrders();
	}
	
	public Order save(List<Product> products) {
		return orderRepository.save(products);
	}
}
