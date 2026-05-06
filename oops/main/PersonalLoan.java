package oops.main;

class PersonalLoan extends Loan{
	public  int getEmi(int amount) {
		//System.out.println(emi);
		//show();
		return (amount*1000)/10;
	}
}