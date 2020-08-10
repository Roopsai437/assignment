package org.dxctraining.entites;

public class Itbook extends Book{
	private String language;
	private double version;
	public Itbook(String name,double cost,Authour authour,String language,double version) {
		super(name,cost,authour);
		this.language=language;
		this.version=version;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public double getVersion() {
		return version;
	}
	public void setVersion(double version) {
		this.version = version;
	}
	
	

}
