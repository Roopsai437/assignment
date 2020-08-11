package org.dxctraining.ui;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import java.util.List;



import org.dxctraining.entites.Customer;
import org.dxctraining.exceptions.CustomerNotFoundException;
import org.dxctraining.exceptions.InvalidArgumentException;
import org.dxctraining.service.Service;
import org.dxctraining.service.ServiceImpl;

@Component
public class HotelUi {
	@Autowired
    private Service service;

	 @PostConstruct
	private void runapp() {
		try {
			Customer cust1 = new Customer("c1","subash", 8000);
			Customer cust2 = new Customer("c2","sai", 2000);
			Customer cust3 = new Customer("c3","gopi", 9000);
			
			service.add(cust1);
			service.add(cust2);
			service.add(cust3);
			
			service.updateName(cust3.getCustid(), "pillagopi");
			display(service.findById("c2"));
			Customer fetched = service.findById("c1");
			service.updateCost("c3", 500);
			display(fetched);
			showAll();
		} catch (InvalidArgumentException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		catch (CustomerNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		catch (Exception e) {
			e.printStackTrace();
			System.out.println("some thing went wrong");
		}
	}

	public void showAll() {
		List<Customer> list = service.findAllcustomers();
		for (Customer cust : list) {
			display(cust);
		}
	}

	public void display(Customer cust) {
		System.out.println("Customer id :" + cust.getCustid() + " customer name : " + cust.getCustname() + " Room Cost : "
				+ cust.getCostofroom());

	}
}