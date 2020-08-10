package org.dxctraining.entites;

public class Fictionalbook extends Book {
	private String character;
	public Fictionalbook(String name,double cost,Authour authour,String character) {
		super(name,cost,authour);
		this.character=character;
	}
	public String getCharacter() {
		return character;
	}
	public void setCharacter(String character) {
		this.character = character;
	}
	

}
