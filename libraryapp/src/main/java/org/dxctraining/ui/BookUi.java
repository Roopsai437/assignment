package org.dxctraining.ui;

import java.util.List;

import org.dxctraining.entites.Authour;
import org.dxctraining.entites.Book;
import org.dxctraining.entites.Fictionalbook;
import org.dxctraining.entites.Itbook;
import org.dxctraining.exceptions.BookNotFoundException;
import org.dxctraining.exceptions.InvalidArgumentException;
import org.dxctraining.service.Service;
import org.dxctraining.service.ServiceImpl;

public class BookUi {
	private Service service = new ServiceImpl();
	public static void main(String args[]) {
		BookUi r=new BookUi();
		r.runapp();
	
	}
	private void runapp() {
		try {
		Authour author1=new Authour(1,"suppu");
		
		Authour author2=new Authour(2,"sai");
		
		Book book1=new Itbook("completejava",937,author1,"java",1.0);
		service.add(book1);
		Book book2=new Itbook("complete python",937,author1,"python",1.0);
		service.add(book2);
		Book book3=new Fictionalbook("RRR",937,author2,"BHeem");
		service.add(book3);
		Book book4=new Fictionalbook("Bahubali",937,author2,"sividu");
		service.add(book4);
		
		Book fetched=service.displaybook("2");
		service.updateCost("1", 800);
		service.remove("3");
		display(fetched);
		displayAll();
		}catch(InvalidArgumentException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		catch(BookNotFoundException e) {
			 e.printStackTrace();
			 System.out.println(e.getMessage());
		}
		
		catch(Exception e) {
		 e.printStackTrace();
		 System.out.println("some thing went wrong");
		}
	}
	public void displayAll() {
		List<Book> list = service.displayallbooks();
		for (Book book : list) {
			display(book);
		}
	}
	public void display(Book book) {
		if (	book instanceof Itbook) {
			
		Itbook book1=(Itbook)book;
System.out.println("name=" +book1.getName()+"  cost="+book1.getCost()+"  autour id="+book1.getId()+"   written by"+book1.getAuthour()+"  language" +book1.getLanguage()+"  version"+book1.getVersion());
		
	}
		if (	book instanceof Fictionalbook) {
			
			Fictionalbook book1=(Fictionalbook)book;
	System.out.println("name=" +book1.getName()+"  cost="+book1.getCost()+"  autour id="+book1.getId()+"   written by"+book1.getAuthour()+"  character" +book1.getCharacter());
			
		}
}
}