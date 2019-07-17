package com.capgemini.xyz.dao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.xyz.bean.Customer;

public class LoanDaoTest {
	
	Customer cust=new Customer(12324,"trgyt","yhftgh",5454, "hdfh");
	LoanDao dao=new LoanDao();
	

	@Test
public	void getCustId1()
	{
		long custId=dao.insertCust(cust);
		System.out.println(custId);
		assertEquals(12324, custId);
	}

}
