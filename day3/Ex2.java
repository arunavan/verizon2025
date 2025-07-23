package day3;

import java.io.FileReader;
import java.io.IOException;

public class Ex2 {
public static void main(String[] args) throws IOException{
		
		int a=10;
		int b=0;
		int c;
		int x[]= {5,4,6};
		//db,socket,file
		
		FileReader file=new FileReader("");
		try{
			
			try {
			c=a/b;
			System.out.println("result:"+c);
			}
			catch(ArithmeticException e) {
				//	System.out.println(e);
					e.printStackTrace();
				//	System.out.println(e.getMessage());
				}
			System.out.println(x[5]);
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}//optional
		finally {
			file.close();
		}
		System.out.println("thank you");

	}

}
