package day4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		int a[]= {4,5,6,7,8};
		System.out.println(" ===for loop");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		
		System.out.println("enhanced for ");
		for(int x: a)
			System.out.println(x);
		
		System.out.println( "for each method");
		Arrays.stream(a).forEach(x->System.out.println(x));
		
		List<Integer> list=Arrays.asList(5,52,6,7,8,6,7,6,4,9);
		
		for( Integer x:list)
			System.out.println(x);
		System.out.println(" list ...");
		list.forEach(x->System.out.println(x));
		list.stream().forEach(x->System.out.println(x));
		System.out.println(" distinct elements");
		list.stream().distinct().limit(3).map(y->y*y)
		.filter(x->x%2==0).forEach(x->System.out.println(x));
		
		List<String> names=Arrays.asList("Sathwik","Vishal","Tanisha","Akshat","Sam","Indu","Arun");
		
		names.stream().filter(n->n.startsWith("A")).filter(x->x.length()>4).forEach(System.out::println);
		
		long count=list.stream().filter(x->x%2==0).count();
		
		System.out.println(count);
		
		List<String> list1=names.stream().filter(x->x.length()>=5).collect(Collectors.toList());
		list.stream().sorted().forEach(x->System.out.println(x));

		list.stream().sorted(Collections.reverseOrder()).forEach(x->System.out.println(x));
		Optional<Integer> second=list.stream().sorted(Collections.reverseOrder()).skip(1).findFirst();
		System.out.println(second.get());
	}

}









/*
int[] numbers = {1, 2, 3, 4, 5};
Arrays.stream(numbers)
      .filter(n -> n % 2 == 0) // Filter even numbers
      .forEach(System.out::println);

*/