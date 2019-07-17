package com.capgemini.xyz.bean;

public class Loan{
	private long loanID;
  private double loanAmount;
  private long custId;
  private int duration;
private double amount;
public Loan(double amount, int duration) {
	// TODO Auto-generated constructor stub
	this.amount=amount;
	this.duration=duration;
	
}
public Loan(long loanID, double amount, long custId, int duration) {
	super();
	this.loanID=loanID;
	this.amount=amount;
	this.custId=custId;
	this.duration=duration;
	// TODO Auto-generated constructor stub
}
public Loan(double amount, long custId, int duration) {
	// TODO Auto-generated constructor stub
	super();
	this.amount=amount;
	this.custId=custId;
	this.duration=duration;
	
}
public long getLoanID() {
	return loanID;
}
public void setLoanID(long loanID) {
	this.loanID = loanID;
}
public double getLoanAmount() {
	return loanAmount;
}
public void setLoanAmount(double loanAmount) {
	this.loanAmount = loanAmount;
}
public long getCustId() {
	return custId;
}
public void setCustId(long custId) {
	this.custId = custId;
}
public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}
  @Override
public String toString() {
	// TODO Auto-generated method stub
	return "loanid =" + loanID +"  " +amount+ "  " +custId+ " " + duration;
}
}
