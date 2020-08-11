package org.dxctraining.dao;

import java.util.List;

import org.dxctraining.entites.Customer;

public interface Dao {

	public String generateId();
	public List<Customer> findAllcustomers() ;
	public void register(Customer cust) ;
	public Customer updateName(String id, String newName);
	public Customer updateCost(String id, double newCost);
	public Customer findById(String id);
	public void delete(String id);
}
