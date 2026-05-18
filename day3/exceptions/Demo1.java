package com.training;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


class DepositException extends Exception{
	DepositException(String s){
		super(s);
		
	}
	
}
public class Demo1 {

	void show() throws IOException ,ClassNotFoundException
	{//checked ,compiletime
		
	//	FileInputStream f=new FileInputStream("product.txt");
	  //  Class.forName("com.training.Account");
	}
	
	public static void main(String[] args) throws IOException ,ClassNotFoundException,DepositException
	{
		Demo1 d=new Demo1();
		d.show();
		String s="sharada";
		System.out.println(s.length());//runtime
		int amount=1999;
		if(amount<1000)
			throw new DepositException("minimum deposit is 1000");
		else
			System.out.println("Thanks for using service");
	}

}
