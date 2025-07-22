package com.verizon.training.day2;

public class AccountDemo {

	public static void main(String[] args) {
		AccountDemo ad=new AccountDemo();
		
		Account account=new Account();  //instatiation
		//account.acNumber=9878;
		
		//System.out.println(account.);
		
		Account account1=new Account(7898,"kiran",25000.00); 
		System.out.println(Account.bankName);
		System.out.println(account.bankName);
		System.out.println(account1.bankName);
		
		account.deposit(5000);
		//System.out.println(name);
	//	account.se
		System.out.println(account.name);
		account.getBalance();
		account1.deposit(5000);
		account1.getBalance();
	//	System.out.println(account.acNumber);
		
		//System.out.println(account1.acNumber+"  "+account1.name);
		//Account account2=new Account(7348,"rajkiran"); 
		
		//System.out.println(account2.name+"  "+account2.acNumber);
		//System.out.println(account1);
		//account=null;
		//System.gc();
	}

}
