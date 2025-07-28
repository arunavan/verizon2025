package day6.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
	//	Set<String> set=new HashSet<>();
	//	Set<String> set=new LinkedHashSet<>();
		Set<String> set=new TreeSet<>();
		set.add("solaris");
		set.add("mysql");
		set.add("java");
		set.add("php");
		set.add("python");
		set.add("java");
		set.add("python");
		
		System.out.println(set);
		HashSet set1=new HashSet<>();
		set1.add("oracle");
		set1.add("mongodb");
		set.addAll(set1);
		System.out.println();
		Iterator<String> i=set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
