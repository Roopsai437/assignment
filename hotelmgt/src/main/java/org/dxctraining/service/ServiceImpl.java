package org.dxctraining.service;


import java.util.List;

import org.dxctraining.dao.Dao;
import org.dxctraining.dao.DaoImpl;
import org.dxctraining.entites.Customer;
import org.dxctraining.exceptions.InvalidArgumentException;

public class ServiceImpl implements Service {
	private Dao dao=new DaoImpl();
	
	@Override
	public Customer findById(String id) {
		checkId(id);
		Customer cust = dao.findById(id);
		return cust;
	}



	@Override
	public List<Customer> findAllcustomers() {
		List<Customer>list=dao.findAllcustomers();
		return list;
	}

	
	
	public void checkId(String id) {
		int idno=Integer.parseInt(id);
		if (idno < 1) {
			throw new InvalidArgumentException("id cant be negative, id passed="+id);
		}
	}

	public void checkName(String name) {
		if (name == null || name.isEmpty()) {
			throw new InvalidArgumentException("name cant be null or empty");
		}
	}

	
	public void checkcustomer(Customer customer) {
		if(customer==null) {
			throw new InvalidArgumentException("customer cant be null");
				
		}
	}
	public void checkCost(double cost) {
		Double newCost = cost;
		if (newCost == null) {
			throw new InvalidArgumentException("cost cant be null");
		}
	}
	@Override
	public Customer updateName(String id, String newName) {
		checkId(id);
		checkName(newName);
		Customer cust = dao.updateName(id, newName);
		return cust;
	}
	

	@Override
	public Customer updateCost(String id,double updatedcost) {
		checkId(id);
		checkCost(updatedcost);
		Customer book = dao.updateCost(id, updatedcost);
	    return book;
	}

	@Override
	public void add(Customer cust) {
		checkcustomer(cust);
		dao.register(cust);
		
	}

	@Override
	public void remove(String id) {
	  checkId(id);	
	  dao.delete(id);		
	}


}
