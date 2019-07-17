package com.capgemini.xyz.dao;

import java.util.HashMap;

import com.capgemini.xyz.bean.Customer;
import com.capgemini.xyz.bean.Loan;

public class LoanDao {
	HashMap<Long, Customer> hm;
	 long custId;
	 long loanID;
	public LoanDao()
	{
		hm=new HashMap<Long, Customer>();
	}

//	public long insertCust(long custId) {
//		// TODO Auto-generated method stub
//	hm.get(customer,cutId);
//		long t=cust.getCustId();
//		return t;1
	
//	}

	public long insertCust(Customer cust) {
	this.custId=cust.getCustId();
	hm.put(custId, cust);
	
	if(hm.containsKey(custId))
	{
		return custId;
	}
	else
	{
	return 0;
	}

	}

	public Loan applyLoan(Loan loan) {
		// TODO Auto-generated method stu

		return loan;
	}

}
