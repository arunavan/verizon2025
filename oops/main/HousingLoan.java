package oops.main;

class HousingLoan extends Loan{
	public int getEmi(int amount) {
		return (amount*1000)/8;
	}
}