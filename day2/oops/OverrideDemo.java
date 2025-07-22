package com.verizon.training.day2.oops;

//final 
class Ride{
	
	//final 
	void sq(int s) {
		System.out.println("area:"+(s*s));
	}
}

class Mride extends Ride{
	@Override
	void sq(int s) {
		System.out.println("perimeter:"+(4*s));
	}
	
}
class Mride1 extends Mride{
//	final int x=99;
	@Override
	void sq(int s) {
		System.out.println("volume:"+(s*s*s));
	//	System.out.println(++x);
	}
}
public class OverrideDemo {

	public static void main(String[] args) {
		Ride r=new Ride();
		r.sq(5);
		r=new Mride();
		r.sq(5);
		r=new Mride1();
		r.sq(6);

	}

}
