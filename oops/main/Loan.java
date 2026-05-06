package oops.main;
public abstract class Loan{
	public int emi; //default  ,public 
	public abstract int getEmi(int amount); //without body
	public void show() {
		System.out.println(emi);
		
	}
	
}