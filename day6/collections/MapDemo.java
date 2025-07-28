package day6.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		//	Map<Integer,String> map=new LinkedHashMap<>();
	//	Map<Integer,String> map=new TreeMap<>();
	//	Hashtable<Integer,String> map=new Hashtable<>();
		
		map.put(1, "java");
		map.put(3, "java");
		map.put(8, null);
		map.put(9, "oracle");
		map.put(9, "oracle");
		
		map.put(5, "python");
		map.put(6, "mysql");
		map.put(9, "postgres");
	//	map.put(null, "flask");
	//	map.put(null, "spring");
		System.out.println(map);
		Set kset=map.keySet();
		System.out.println(kset);
		
		Collection vals=map.values();
		System.out.println(vals);
		
		Set entries=map.entrySet();
		
		Iterator i=entries.iterator();
		while(i.hasNext()) {  //static 
			Map.Entry e=(Map.Entry)i.next();
			System.out.println(e.getKey() +"   "+e.getValue());
		}
		
		
		
		
		
		
		

	}

}
