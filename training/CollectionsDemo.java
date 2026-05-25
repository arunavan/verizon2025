package com.training.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

@FunctionalInterface 
interface arith<T>{//lamda with Generics
	T op(T a,T b);
}
public class CollectionsDemo {
	
	/*public int sum(int a,int b) {
		return a+b;
	}
*/
	public static void main(String[] args) {
		
	//	CollectionsDemo c=new CollectionsDemo();
	//	System.out.println(c.sum(4, 5));
		
		arith<Integer> a1=(a,b)->a+b;
		System.out.println(a1.op(4,5));
		arith<Double> a2=(a,b)->a-b;
		System.out.println(a2.op(43.23,56.78));
		arith<Long> a3=(a,b)->a*b;
		System.out.println(a3.op(20l,30l));
		
		Consumer<Integer> c1=(a)->System.out.println("Square;"+(a*a));
		
		c1.accept(3);
		
		Supplier<Integer> s1=()->99;
		System.out.println(s1.get());
		
		Predicate<Integer> p1=(n)->n%2==0;
		System.out.println(p1.test(4));
		
		Function<Integer,Integer> f1=(n)->n*n;
		System.out.println(f1.apply(12));
		
		
		
		
		
	//lambda  
		
		List<Integer> list=Arrays.asList(10,12,12,12,4,20,2,3,5,6);
		
		for(Object o:list)
			System.out.println(o);
		
		Iterator i=list.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		//java8 lambda
		list.forEach(n->System.out.println(n));
		
		//streaming operation, intermideo, terminal,parallel 
		System.out.println("filetr====");
       // list.stream().filter(n->n>5).filter(n->n%2==0).distinct().map(x->x*x).limit(3).forEach(x->System.out.println(x));
		
      //  list.stream().distinct().sorted().forEach(x->System.out.println(x));
        
        Long count=list.stream().filter(x->x%2==0).count();
        System.out.println("even Count:"+count);
        
        List<Integer> above10List=list.stream().filter(n->n>10).collect(Collectors.toList());
       above10List.forEach(x->System.out.println(x));

	}

}
