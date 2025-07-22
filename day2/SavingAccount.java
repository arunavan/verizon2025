package com.verizon.training.day2;


class Bank {
	void deposit(int amount){
		int interest=89;
		
	}
}

public class SavingAccount extends  Account{
	
	SavingAccount(){
		System.out.println("child");
	}
	
	void show() {
		System.out.println(acNumber);
	}
	public static void main(String[] args) {
		SavingAccount sa =new SavingAccount();
		Account sa1=new SavingAccount();
		sa.deposit(4000);
		System.out.println(sa.name+"  "+sa.balance+  "  "+sa.acNumber);
	}
}
