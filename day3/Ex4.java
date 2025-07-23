package day3;

import java.io.FileReader;
import java.io.IOException;

public class Ex4 {

	public static void main(String[] args) throws IOException{
		
		int x[]= {5,4,6};
		//db,socket,file
		
		//auto closeable with try-with resource
		try (FileReader file=new FileReader("");){
			
		//file.read
		
			System.out.println(x[5]);
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
	
		System.out.println("thank you");



	}

}
