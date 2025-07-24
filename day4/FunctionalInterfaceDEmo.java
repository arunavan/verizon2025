package day4;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
@FunctionalInterface
interface Arith<T>{    //CustomFunctionalInterface
	T operation(T a,T b);
	default void show() {
		System.out.println(" concrete");
	}
}

@FunctionalInterface
interface Vehicle{
	void speed();
	//int milage();
	
	default  void show() { 
		  System.out.println(" default"); 
		  }
	
	static void disp() {
		
		System.out.println(" static ");
	}
	 
}
public class FunctionalInterfaceDEmo implements Vehicle {
	public void speed() {}
	
	public void show() { 
		Vehicle.super.show();
		  System.out.println(" overriden default"); 
		  }
public static void main(String[] args) {
	
		Arith<Integer> arith=(a,b)->a+b;
		System.out.println(arith.operation(4, 5));
		Arith<Double> arith1=(a,b)->a*a-b*b;
		System.out.println(arith1.operation(3.4, 2.5));
		Arith<String> ar2=(a,b)->a.concat(b);
		System.out.println(ar2.operation("Verizon","USer"));
		Consumer<Integer> c1=(a)->System.out.println(a*a);
		c1.accept(10);
		Supplier<Integer> s1=()->  99;
		System.out.println(s1.get());
		Predicate<Integer> p1=(x)->x%2==0;
		System.out.println(p1.test(30));
		Function<Integer,Double> f1=(x)->x*15.56;
		System.out.println(f1.apply(50));
		int[] marks= {56,78,67,89};
		Arrays.sort(marks);
		for(int m:marks)
			System.out.println(m);
		Arrays.parallelSort(marks);
		for(int m:marks)
			System.out.println(m);
		
		FunctionalInterfaceDEmo f=new FunctionalInterfaceDEmo();
		f.show();
		
		Vehicle.disp();
	}
}


/*
 *class ArithImpl implements Arith{
 *
	public int operation(int a,int b) {
		return a+b;
	}
}
public class FunctionalInterfaceDEmo {

	public static void main(String[] args) {
		Arith arith=new ArithImpl();
		System.out.println(arith.operation(4, 5));
		System.out.println(arith.operation(14, 25));
	}

}

 */
