package com.training;

import java.io.File;

//predefined , user defined

// 
public class Demo {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		int marks[]= {4,5,6};
		try {
			File f=new File("");
			//file, db
			try {
			int c=a/b; 
			System.out.println("result="+c);
			}
			catch(ArithmeticException e) {//unchecked runtime
				e.printStackTrace();
			}
			System.out.println(marks[8]);
		
		}
		catch(ArrayIndexOutOfBoundsException e) {
			//System.out.println(e);
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}
		finally{
			//file.close();
			//db.close();
			
		}
		
		//try with multiple 
		
		try {
			//File f=new File("");
			//file, db
			
			int c=a/b;  //1
			System.out.println("result="+c);
			
			System.out.println(marks[8]); //2
		
		}
	
		catch(ArithmeticException e) {
		e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			//System.out.println(e);
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}
		catch(Exception e){
			
		}
		
		//try with multicatch
		try {
			//File f=new File("");
			//file, db
			
			int c=a/b;  //1
			System.out.println("result="+c);
			
			System.out.println(marks[8]); //2
		
		}
	
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
		e.printStackTrace();
		}
		
		//auto closeable 
	//	try(File f=new File("");){
			
		//}

		
		
		System.out.println(" Thank you");
		//
	}
}
