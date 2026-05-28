package com.training.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

class Product {
	
	Integer id;
	String name;
	public Product(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
	
}
public class ListDemo {

	
	public static void main(String[] args) {

		int a[]= {4,5,6,7}; //static ,
		
	//	Product p[]=new Product[];
		//List ->Collection
		ArrayList<Product> ar=new ArrayList<>(); //
		Product p1=new Product(1,"pen");
		Product p2=new Product(1,"pen");
		ar.add(p1);
		ar.add(p2);
		System.out.println(ar);
		System.out.println("product list====================");
		List<Product> productList=Arrays.asList(new Product(4,"box"),new Product(6,"tin"));
		productList.forEach(p->System.out.println(p));
		
		//ArrayList a1=new ArrayList();
		LinkedList a1=new LinkedList(); //fixed , dynamic ,ordered
		//Stack s=new Stack();
		
		a1.add(34);
		a1.add(2343.32423);
		a1.add("java");
		a1.add(new Date());
		a1.add("java");
		a1.add("java");
		System.out.println(a1);
		
		System.out.println(a1.get(2));
		System.out.println(a1.indexOf("java"));
		System.out.println(a1.lastIndexOf("java"));
		System.out.println(a1.contains(34));
		System.out.println(a1.remove(3));
		
	//	ArrayList a2=new ArrayList();
		LinkedList a2=new LinkedList();
		
		a2.add(78);
		a2.add(56.78);
		a2.add(34);
		a1.addAll(a2);
		
		Object aArray[]=a2.toArray(); //list to Array
	//	Integer i1[]=a2.toArray();
		
		int x[]= {21,13,4};
		
		List x1=Arrays.asList(x); ///array to list
		
		Arrays.sort(x);
		System.out.println(x);
		System.out.println("LinkedList");
		System.out.println(a1);
		//a1.removeAll(a2);
		//a1.retainAll(a2);
		System.out.println(a1.containsAll(a2));
		
		Iterator i=a1.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("enhanced for loop");
		for(Object o:a1)
			System.out.println(o);
		//java8
		System.out.println("using foreach.......");
		a1.forEach(x->System.out.println(x));
		
		//unordered,hashing ,unique
//set
		//HashSet h1=new HashSet();
	//	LinkedHashSet h1=new LinkedHashSet();
		TreeSet h1=new TreeSet();//in build 
		h1.add(9);
		h1.add(3);
		h1.add(49);
		h1.add(12);
		h1.add(3);
		h1.add(5);
		System.out.println(h1);
		h1.forEach(x->System.out.println(x));
		
		
		//Map 
		
			//HashMap<Integer,String> h=new HashMap<>();
	//	LinkedHashMap<Integer,String> h=new LinkedHashMap<>();
		TreeMap<Integer,String> h=new TreeMap<>();
	
		h.put(11, "java");
		h.put(10, "oracle");
		h.put(2, "python");
		System.out.println(h);
		System.out.println(h.get(10));
		System.out.println(h.get(12));
		
		Set keys=h.keySet();
		System.out.println(keys);
		
		
		Collection vals=h.values();
		System.out.println(vals);
		
		Set entries=h.entrySet();
		for(Object d:entries) {
			Map.Entry e=(Map.Entry)d;
			Integer key=(Integer)e.getKey();
			String val=(String)e.getValue();
			System.out.println(key +"   "+ val);
			
		}
		

		
		

	}

}
