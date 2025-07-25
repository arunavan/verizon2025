package day5.unittesting;

public class Loan {
	
	int getEmi(int amount) {
		return amount/12;
	}
	
	double getBalance() {
		return 10000.00;
	}

	  void divide() throws ArithmeticException{
		  int c=10/0;
	  }

}
