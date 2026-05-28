package com.training;
class Callme {
	synchronized	void call( String msg) {
			System.out.print( "[" + msg );
			try {
		              	Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println("]");
 }
}

class Caller implements Runnable {
	String msg;
	Callme target;
	Caller(){}

 Caller (Callme target, String s) {
	this.target = target;
	this.msg = s;
	Thread t = new Thread( this);
	t.start( );

	
}
 public void run() {
	 target.call(msg);
 }
}

class SynchroDemo {
	public static void main (String args[ ] ) 
	{
	Callme t = new Callme( );
	System.out.println(" thread started.....");
	Caller obj1 = new Caller( t, "hello");
	Caller obj2 = new Caller( t, "syncronized");
	Caller obj3 = new Caller( t, "world");
	 
     }

}