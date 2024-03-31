package com.customerservice.model;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Customer {

    private String name;
    private String surname;
    private String email; 
    private String password; 
    private String phoneNumber;
    private int age;
    private List<Order> orders;

    public Customer(String name, String surname, String email, String password, String phoneNumber, int age) {
    	this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = shaHashCode(password);
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.setOrders(new ArrayList<>());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

    public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
	public void addOrder(Order order) {
		orders.add(order);
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", surname=" + surname + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + "]";
	}

	private String shaHashCode(String password) {
		try {
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            byte[] hashedBytes = md.digest(password.getBytes());

            StringBuilder hexStringBuilder = new StringBuilder();
            for (byte b : hashedBytes) {
                hexStringBuilder.append(String.format("%02x", b));
            }
            return hexStringBuilder.toString();
        } 
		catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Şifreleme hatası: " + e.getMessage());
        }
	}
  
}

