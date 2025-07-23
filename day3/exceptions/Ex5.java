package day3.exceptions;

import java.io.FileReader;
import java.io.IOException;

public class Ex5 {
	static void show() throws InterruptedException,IOException
	{
		Thread.sleep(5000);
		
		FileReader f=new FileReader("C:\\Javatraining\\product.txt");

	}

	public static void main(String[] args) throws InterruptedException,IOException
	{
		
	   Ex5.show();
	
	}

}
