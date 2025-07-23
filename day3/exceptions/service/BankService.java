package day3.exceptions.service;

import day3.exceptions.DepositException;
import day3.exceptions.model.Bank;

public class BankService {
	Bank b=new Bank();
	public void deposit(int amount) throws DepositException {
		if(amount<1000) {
			throw new DepositException("Minimum deposit is 1000/-");
		}
			else
		b.balance=b.balance+amount;
	}
	public void getBalance() {
		System.out.println("Available balance is"+b.balance);
	}
}
