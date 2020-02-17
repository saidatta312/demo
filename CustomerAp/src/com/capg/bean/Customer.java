package com.capg.bean;

public class Customer {

	public int cid;
	public String cname;
	public double amount;
	
	/*public Customer(int cid, String cname, double amount) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.amount = amount;
	}
*/	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return cid+" "+cname+" "+amount;
	}
	

}
