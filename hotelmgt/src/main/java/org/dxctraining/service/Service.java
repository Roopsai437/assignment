package org.dxctraining.service;


import java.util.List;

import org.dxctraining.entites.Customer;

public interface Service {
	
	public Customer findById(String id);
	public List<Customer> findAllcustomers();
	public Customer updateName(String id, String newName);
	public Customer updateCost(String id,double newCost);
	public void add(Customer book);
	public void remove(String id);
}
