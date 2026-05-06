package oops.main;

public class VehicleLoan extends Loan{
	
	public  int getEmi(int amount) {
			return amount*1000/8;
		}
}
