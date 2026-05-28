package com.training.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SelialDemo {



	public static void main(String[] args) throws IOException,ClassNotFoundException{
		Account a1=new Account(12,"sarada");
		System.out.println("before:"+a1.id + "  "+a1.name);
		
		FileOutputStream f1=new FileOutputStream("C:\\Users\\VINOD\\Downloads\\serial");
		ObjectOutputStream o1=new ObjectOutputStream(f1);
		o1.writeObject(a1);
		System.out.println(" object into file serialation is done");
		
		FileInputStream f2=new FileInputStream("C:\\Users\\VINOD\\Downloads\\serial");
		ObjectInputStream o2=new ObjectInputStream(f2);
		Account a2=(Account)o2.readObject();
	
		System.out.println(" file to object deserialation is done");
		System.out.println(a2.id +"  "+a2.name);
		
		

	}

}
