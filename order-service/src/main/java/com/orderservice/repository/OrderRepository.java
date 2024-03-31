package com.orderservice.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.orderservice.model.Order;
import com.orderservice.model.Product;

@Repository
public class OrderRepository {
	
	List<Order> orders = new ArrayList<>();
	
	public List<Order> getOrders() {
		return orders;
	}
	
	public Order save(List<Product> products) {
		Order order = new Order();
		products.forEach(product -> order.addProduct(product));
		order.generateBill();
		orders.add(order);
		return order;
	}
	
	
}
