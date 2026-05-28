package com.training.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IODemo {
	public static void main(String[] args) throws IOException {
		//binary stream
		/*
		FileInputStream f1=new FileInputStream("C:\\Users\\VINOD\\Downloads\\intro.txt");
		FileOutputStream f2=new FileOutputStream("C:\\Users\\VINOD\\Downloads\\output.txt");
		int k;
		while( (k=f1.read())!=-1) {
			System.out.print((char)k); //type casting
			f2.write((char)k);
		}
		*/
		//char staream with filterstream 
		FileReader f1=new FileReader("C:\\Users\\VINOD\\Downloads\\intro.txt");
		BufferedReader b1=new BufferedReader(f1);//buffer 
		FileWriter f2=new FileWriter("C:\\Users\\VINOD\\Downloads\\output.txt");
		BufferedWriter b2=new BufferedWriter(f2);
		String line;
		while( (line=b1.readLine())!=null) {
			System.out.println(line); //type casting
			b2.write(line);
		}
		
		
		f1.close();b1.close();
		b2.close();f2.close();
	}
}
