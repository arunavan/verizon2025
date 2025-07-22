package com.verizon.training.day2;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class StringDemo {

	public static void main(String[] args) {
		
		String name="verizonuser";
		
		String surname=new String("verizonuser"); //immutable
		System.out.println(name.length());
		System.out.println(name.startsWith("v"));
		System.out.println(name.concat(" technologies"));
		System.out.println(name);
		String address="Verizon user, Hyderabad,Telanga,India";
		String tokens[]=address.split("");
		StringTokenizer st=new StringTokenizer(address,",");
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
	
		StringJoiner sj=new StringJoiner(",");
		sj.add("ram");
		sj.add("kumar");
		System.out.println(sj);
		//synchronized
		//StringBuffer sb=new StringBuffer("verizonuser");
		StringBuilder sb=new StringBuilder(name);
		sb.insert(2, " xxxx");
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.delete(2, 6);
		System.out.println(sb);
		System.out.println(sb.reverse());
		String ss=sb.toString();
		
		
		
		
		

	}

}
