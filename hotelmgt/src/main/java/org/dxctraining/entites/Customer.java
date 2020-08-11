package org.dxctraining.entites;

public class Customer {
	private String  custid;
	private String custname;
	private double costofroom;

	public Customer(String custid,String custname, double costofroom) {
		this .custid=custid;
		this.custname = custname;
		this.costofroom = costofroom;
		
	}

	

	
	
	public String getCustid() {
		return custid;
	}





	public void setCustid(String custid) {
		this.custid = custid;
	}





	public String getCustname() {
		return custname;
	}





	public void setCustname(String custname) {
		this.custname = custname;
	}





	public double getCostofroom() {
		return costofroom;
	}





	public void setCostofroom(double costofroom) {
		this.costofroom = costofroom;
	}





	@Override
	public int hashCode() {
		int hash = custid.hashCode();
		return hash;
	}

	@Override
	public boolean equals(Object org) {
		if (this == org) {
			return true;
		}

		if (org == null || !(org instanceof Customer)) {
			return false;
		}

		Customer that = (Customer) org;
		boolean isequal = this.custid.equals(that.custid);
		return isequal;
	}

}
