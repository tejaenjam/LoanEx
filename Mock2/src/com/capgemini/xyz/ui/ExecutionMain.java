package com.capgemini.xyz.ui;

import java.util.Scanner;

import com.capgemini.xyz.bean.Customer;
import com.capgemini.xyz.bean.Loan;
import com.capgemini.xyz.service.LoanService;

public class ExecutionMain {
	public static void main(String[] args) {
		LoanService service = new LoanService();
		Scanner sc = new Scanner(System.in);
		System.out.println("1: Creation of user account details");
		System.out.println("2: loan menu");
		long custId;
		while (true) {
			int n = sc.nextInt();
			if (n > 0 && n < 3) {
				switch (n) {

				case 1:
					while (true) {
						System.out.println("Enter customer name ");
						String custName = sc.next();
						System.out.println("Enter customer address");
						String address = sc.next();
						System.out.println("Enter customer monile no");
						long mobile = sc.nextLong();
						System.out.println("Enter customer email id");
						String email = sc.next();
						Customer customer = new Customer(custName, address, mobile, email);
						Customer cust = new Customer(custName, address, mobile, email);
						customer = service.validateCustomer(customer);
						if (customer != null) {

							custId = (long) (Math.random() * 10);
							cust = new Customer(custId, custName, address, mobile, email);
							System.out.println(custId);
							
							long t = service.insertCust(cust);
							
							
							System.out.println("Do you want to apply for loan");
							String s = sc.next();
							if (s.equals("yes") || s.equals("YES")) {

								System.out.println("Enter the loan amount");
								double Amount = sc.nextDouble();
								System.out.println("Enter the loan duration");
								int duration = sc.nextInt();
								double calemi = service.calculateEMI(Amount, duration);
								System.out.println(calemi);
								System.out.println("Do you want to apply for the loan");
								s = sc.next();
								Loan loan = new Loan(Amount, custId, duration);
								if (s.equals("yes") || s.equals("YES")) {

									loan = service.applyLoan(loan);
									long loanID = (long) (Math.random() * 10);
									loan = new Loan(loanID, Amount, custId, duration);
									System.out.println("Loan is approved with an Id no: " + loanID);
									System.out.println(loan);
									long calemif = (long) (calemi + Amount);
									System.out.println("loan Amount is " + calemif);
								} else {
									System.out.println(cust);
								}

							} else {
								System.out.println(cust);
							}

						} else {
							System.out.println("Enter valid details");

						}
					}
				}
			}

			else {
				System.out.println("Choose correct option");
			}

		}
	}
}
