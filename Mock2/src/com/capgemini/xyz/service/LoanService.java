package com.capgemini.xyz.service;

import java.util.regex.Pattern;

import com.capgemini.xyz.bean.Customer;
import com.capgemini.xyz.bean.Loan;
import com.capgemini.xyz.dao.LoanDao;

public class LoanService {
LoanDao dao=new LoanDao();
	public Customer validateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		String add=customer.getAddress();
		String custname=customer.getCustName();
		long mno=customer.getMobile();
		String mno1=Long.toString(mno);
		if ((Pattern.matches("[A-Z][a-z A-Z]*", add)) && (Pattern.matches("[A-Z][a-z A-Z]*",custname)) &&  (mno1.matches("[6-9][0-9]{9}")))
		return customer;
		else
			return null;
	}
	public long insertCust(Customer cust) {
		// TODO Auto-generated method stub
		
		long l=dao.insertCust(cust);
		return l;
	}
	public double calculateEMI(double amount, int duration) {
		// TODO Auto-generated method stub
		double r=9.5/100;
		double l=amount*r*(1+r)*duration/((1+r)*duration-1);
		return l;
	}
	public Loan applyLoan(Loan loan) {
		// TODO Auto-generated method stub
		loan=dao.applyLoan(loan);
		return loan;
	}
	
}
