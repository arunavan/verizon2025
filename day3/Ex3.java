package day3;

import java.io.FileReader;

public class Ex3 {

	public static void main(String[] args) {
		
		
		
		int a=10;
		int b=0;
		int c;
		int x[]= {5,4,6};
		try{                       //multi catch block
			c=a/b;
			System.out.println("result:"+c);
			System.out.println(x[5]);
		}
		catch(ArrayIndexOutOfBoundsException |ArithmeticException  e)
		{
			e.printStackTrace();
		}//optional
	
		System.out.println("thank you");

	}

}
