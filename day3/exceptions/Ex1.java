package day3.exceptions;
public class Ex1 {
public static void main(String[] args) {
		
		int a=10;
		int b=0;
		int c;
		int x[]= {5,4,6};
		try{System.out.println(x[5]);
			c=a/b;
			System.out.println("result:"+c);
			
		}
		
		catch(ArithmeticException e) {
		//	System.out.println(e);
			e.printStackTrace();
		//	System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("thank you");

	}

}
