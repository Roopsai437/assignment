package org.dxctraining.dao;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dxctraining.entites.*;
import org.dxctraining.exceptions.BookNotFoundException;

public class DaoImpl implements Dao {
	private Map<String,Book>store=new HashMap<>();
	 private int generatedId;

     String generateId(){
        generatedId++;
        String idStr=""+generatedId;
        return idStr;
    }
     @Override
     public Book findById(String id) {
         boolean exists= store.containsKey(id);
         if(!exists){
             throw new BookNotFoundException("Book not found for id="+id);
         }
          Book book=store.get(id);
         return book;
     }
     @Override
     public void add(Book book) {
    	 String id=generateId();
    	 store .put(id,book);
    	 book.setId(id);
    	 
     }
     @Override
     public Book displaybook(String id ) {
    	 Book book=findById(id);
    	 return book;
     }
     @Override
     public Book updateCost(String id,double updatedcost) {
    	 Book book = findById(id);
 		book.setCost(updatedcost);
 		return book;
     }
     
     
     
     
     @Override
     public List<Book> displayallbooks() {
    	 Collection<Book>collection=store.values();
         List<Book>list=new ArrayList<>();
         for ( Book book:collection){
             list.add(book);
         }
         return list;
     }
     @Override
     public void removebook(String id) {
         store.remove(id);
     }
     


}
