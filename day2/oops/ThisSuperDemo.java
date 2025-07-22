package com.verizon.training.day2.oops;

//this, super


class Parent{
	String city;
	Parent(){
		city="hyderabad";
	}
	void show() {
		System.out.println(" parent show");
	}
}
class Child extends Parent{
	int x,y;
	String name;
	String city;
	Child(){
		super();
		x=10;
		city="Chennai";
		
	}
	public Child(int y) {
		this();
		this.y = y;
	}
	public Child(String name) {
		this();
		this.name = name;
	}
	
	void show() {
		System.out.println("child show");
		System.out.println(this.city="  "+super.city);
	}
	void disp() {
		this.show();
		super.show();
	}
	
	
}
public class ThisSuperDemo {

	public static void main(String[] args) {
		
		Child c=new Child(30);
		System.out.println(c.y+"  "+c.city);
		c.show();
		/*
		System.out.println(c.x +"  "+c.y);
		Child c1=new Child("Raj");
		System.out.println(c1.x +"  "+c1.y+"  "+c1.name);
		*/
	}

}
