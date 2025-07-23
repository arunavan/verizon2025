package day3;

import day3.exceptions.Demo;

class super1{
	
}
class  sub1 extends super1{
	
}

interface Loan1{
	class demo{
		
	}
}
public class OuterDemo {
	Integer id;
	
	
	interface loan{
		
	}
	void show() {
		int x;
		
		class Inner2{ //local inner class
			
		}
		Inner2 i2=new Inner2();
		
		
	}
	
	
	void taste() {
		System.out.println("sweet");
	}
	
	class Inner {//inner class  - member inner class
		
		void disp() {
			
		}
		
	}

	public static void main(String[] args) {
		
		OuterDemo.Inner i=new OuterDemo().new Inner();
		i.disp();
		
		OuterDemo oo2=new OuterDemo();
		oo2.taste();
		OuterDemo oo1=new OuterDemo() { //annymous innerclass
			
					void taste() {
							System.out.println("sour");
					}
						};
		oo1.taste();
		
		Demo d=new Demo();
		
	}

}
