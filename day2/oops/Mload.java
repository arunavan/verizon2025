package com.verizon.training.day2.oops;

public class Mload {//static , compiletime
	
	 void area(int s) {
		 System.out.println("area of square:"+(s*s));
	 }
	
	 void area(int l,int b) {
		 System.out.println("area of react:"+(l*b));
	 }
	 void area(double r) {
		 System.out.println("area of circle:"+(3.142*r*r));
	 }

	public static void main(String[] args) {
		Mload m=new Mload();
		m.area(4);
		m.area(6,4);
		m.area(4.89);
		

	}

}
