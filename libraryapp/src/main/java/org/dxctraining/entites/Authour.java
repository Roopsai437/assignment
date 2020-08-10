package org.dxctraining.entites;

public class Authour {
	 private int id;
     private String aname;
          
     public Authour(int id,String aname) {
    	 this.id=id;
    	 this.aname=aname;
    	 
     }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}
}
