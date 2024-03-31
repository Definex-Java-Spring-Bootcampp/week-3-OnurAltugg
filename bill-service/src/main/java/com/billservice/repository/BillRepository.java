package com.billservice.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.billservice.model.Bill;
import com.billservice.model.Product;

@Repository
public class BillRepository {
	List<Bill> bills = new ArrayList<Bill>();
	
	public List<Product> save(List<Product> products) {
		bills.add(new Bill(products));
		return products;
	}
	
	public List<Bill> getBills() {
		return bills;
	}
}
