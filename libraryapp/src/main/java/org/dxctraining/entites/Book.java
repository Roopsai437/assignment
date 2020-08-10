package org.dxctraining.entites;

public class Book {
	private String id;
	private String name;
	private double cost;
	private Authour authour;

	public Book(String name, double cost, Authour authour) {
		this.name = name;
		this.cost = cost;
		this.authour=authour;
	}

	public Authour getAuthour() {
		return authour;
	}

	public void setAuthour(Authour authour) {
		this.authour = authour;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

}
