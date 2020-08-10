package org.dxctraining.service;


import java.util.List;

import org.dxctraining.dao.Dao;
import org.dxctraining.dao.DaoImpl;
import org.dxctraining.entites.Book;
import org.dxctraining.exceptions.InvalidArgumentException;

public class ServiceImpl implements Service {
	private Dao dao=new DaoImpl();
	
	@Override
	public Book displaybook(String id) {
		checkId(id);
		Book book = dao.displaybook(id);
		return book;
	}



	@Override
	public List<Book> displayallbooks() {
		List<Book>list=dao.displayallbooks();
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
	
	public void checkBook(Book book) {
		if(book==null) {
			throw new InvalidArgumentException("Book cant be null");
				
		}
	}
	public void checkCost(double cost) {
	 Double newCost=cost;
	 if(newCost==null) {
		 throw new InvalidArgumentException("cost cant be null");
	 }
	}

	

	@Override
	public Book updateCost(String id,double updatedcost) {
		checkId(id);
		checkCost(updatedcost);
		Book book = dao.updateCost(id, updatedcost);
	    return book;
	}

	@Override
	public void add(Book book) {
		checkBook(book);
		dao.add(book);
		
	}

	@Override
	public void remove(String id) {
	  checkId(id);	
	  dao.removebook(id);		
	}


}
