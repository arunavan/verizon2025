package com.verizon.training.day2;

public class Account {
	 Integer acNumber;
	public String name;
	protected Double balance;
	
	
	
	public Integer getAcNumber() {
		return acNumber;
	}
	public void setAcNumber(Integer acNumber) {
		this.acNumber = acNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static String getBankName() {
		return bankName;
	}
	public static void setBankName(String bankName) {
		Account.bankName = bankName;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public static String bankName="ICICI";
	public Account(){
		System.out.println("parent");
		acNumber=1234;
		name="Ram";
		balance=10000.00;
	}
	public Account(Integer acNumber) {
		this.acNumber = acNumber;
	}
	public Account(Integer acNumber, String name) {
	
		this.acNumber = acNumber;
		this.name = name;
	}
	public Account(Integer acNumber, String name, Double balance) {
	
		this.acNumber = acNumber;
		this.name = name;
		this.balance = balance;
	}
	void deposit(int amount){
		int interest=89;
		balance=balance+amount;
	}
	public void getBalance() {
		System.out.println("Balance:"+balance+"  ");
	}
public static void main(String[] args) {

	Account account=new Account();  //instatiation
	Account account1=new Account(7898,"kiran",25000.00); 
	System.out.println(Account.bankName);
	System.out.println(account.bankName);
	System.out.println(account1.bankName);
	
	account.deposit(5000);
	//System.out.println(name);
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

