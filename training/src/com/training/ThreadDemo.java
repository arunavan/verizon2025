package com.training;

//java.lang.
//   thread , cuconcurrent , dual 2, 4,8

class Thread1 extends Thread{
	
	public void run() {
		for(int i=0;i<=2;i++) {
		System.out.println("Thread demo1"+Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}

}

class Thread2 implements Runnable{
	public void run() {
		System.out.println("Thread demo2  in runnable "+Thread.currentThread().getName());

	}
}
public class ThreadDemo {

	public static void main(String[] args) { //main
		
		Thread1 t1=new Thread1();  //2
		t1.start();
		Thread1 t2=new Thread1(); //3
		t2.start();
		System.out.println(Thread.activeCount());
		t1.setPriority(Thread.MAX_PRIORITY);
		//t1.suspend();
		//t2.resume();
		//t1.yield();
		Thread2 tr=new Thread2();
		Thread tt =new Thread(tr);
		tt.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Thread.activeCount());
		
	}

}
