package org.dxctraining.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import org.dxctraining.entites.Customer;
import org.dxctraining.exceptions.CustomerNotFoundException;

@Repository

public class DaoImpl implements Dao {
	private Map<String, Customer> store = new HashMap<>();
	private int generatedId ;

	public String generateId() {
		Integer custidInteger = generatedId++;
		String custidString = custidInteger.toString();
		return custidString;
	}

	@Override
	public List<Customer> findAllcustomers() {
		Collection<Customer> values = store.values();
		List<Customer> list = new ArrayList<>();
		for (Customer value : values) {
			list.add(value);
		}
		return list;
	}

	@Override
	public void register(Customer cust) {
		String id = generateId();
		store.put(id, cust);
		
	}

	@Override
	public Customer updateName(String id, String newName) {
		Customer cust = findById(id);
		cust.setCustname(newName);
		return cust;
	}

	@Override
	public Customer updateCost(String id, double newCost) {
		Customer cust = findById(id);
		cust.setCostofroom(newCost);
		return cust;
	}

	@Override
	public Customer findById(String id) {
		Customer cust = store.get(id);
		if (cust == null) {
			throw new CustomerNotFoundException("customer not found for id=" + id);
		}
		return cust;
	}

	@Override
	public void delete(String id) {
		store.remove(id);
	}

}