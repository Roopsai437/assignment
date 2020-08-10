package org.dxctraining.dao;

import java.util.List;

import org.dxctraining.entites.Book;

public interface Dao {

	Book findById(String id);
	 public void add(Book book);
	Book displaybook(String id );
	List<Book> displayallbooks();
	public Book updateCost(String id,double newCost);
	void removebook(String id); 
}
