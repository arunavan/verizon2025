package day3;
import java.util.*;
class Account implements Cloneable{   //cloning
	Integer acNumber;
	String name;
 @Override
	public String toString() {
		return "Account [acNumber=" + acNumber + ", name=" + name + "]";
	}
public Object clone() throws CloneNotSupportedException 
   {
	   return super.clone();//Object - finalize(),clone(),toString()
	   
   }
	public Account(Integer acNumber, String name) {
		super();
		this.acNumber = acNumber;
		this.name = name;
	}
}
public class Demo {
	public static void main(String[] args) throws CloneNotSupportedException{
		Account a1=new Account(1234,"VerizonUSer");
		Account a2=(Account)a1.clone();
		
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a2.getClass());
		
	}
}
