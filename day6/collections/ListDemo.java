package day6.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class ListDemo {

	public static void main(String[] args) {
		
		//Vector<Integer> a=new Vector<>();
	List<Integer> a=new ArrayList<>();
		a.add(45);
		a.add(46);
		a.add(78);
		a.add(31);
		a.add(46);
		a.add(78);
		a.add(31);
		
		a.add(4);
		a.add(7);
		a.add(341);
		a.add(7);
		System.out.println(a);
		System.out.println(a.get(2));
		System.out.println(a.size());
		System.out.println(a.contains(46));
		System.out.println(a.remove(4));
		a.set(2, 999);
		System.out.println(a.indexOf(7));
		System.out.println(a.lastIndexOf(7));
		
		for(int i=0;i<a.size();i++)
			System.out.println(a.get(i));
		
		for(Integer x:a )
			System.out.println(x);
		
		a.stream().forEach(System.out::println);
		
		Iterator i=a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		LinkedList a1=new LinkedList<>();
		a1.add(90);
		a1.add(78);
		a1.add(80);
	
		System.out.println(" sorce arraylist ");
		System.out.println(a);
		a.addAll(a1);
		System.out.println(a);
		
		//a.removeAll(a1);
		//a.retainAll(a1);
		System.out.println(a.containsAll(a1));
		
		System.out.println(a);
		
	//	a.clear();
	
		
		Stack<Integer> s=new Stack<>();
		s.push(4);
		s.push(2);
		s.push(8);
		System.out.println(s);
		System.out.println(s.pop());
		
		
		
		
		

	}

}
