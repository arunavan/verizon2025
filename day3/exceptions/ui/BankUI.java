package day3.exceptions.ui;

import java.util.Scanner;

import day3.exceptions.DepositException;
import day3.exceptions.service.BankService;

public class BankUI {

	public static void main(String[] args) throws DepositException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to bank");
		System.out.println("Enter amount to be deposited");
		int amount=sc.nextInt();
		BankService bs=new BankService();
		bs.deposit(amount);
		bs.getBalance();
	}

}
