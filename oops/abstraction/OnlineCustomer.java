package oops.abstraction;

import oops.main.Loan;

public class OnlineCustomer {
	
	
	Loan loan;
	
	void show() {
		System.out.println(loan.emi);
		loan.show();
	}
	
	

}