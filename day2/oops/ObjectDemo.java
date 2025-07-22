package com.verizon.training.day2.oops;

public class ObjectDemo {
  String cname;
  String location;
  
 	public ObjectDemo(String cname, String location) {
	this.cname = cname;
	this.location = location;
    }
 	@Override
	public String toString() {
		return "cname=" + cname + ", location=" + location ;
	}
  public void finalize(){
	  cname=null;
	  location=null;
  }
  public boolean equals(Object o) {
	  ObjectDemo oo=(ObjectDemo)o;
	  boolean flag=false;
	  if(this.cname.equals(oo.cname)  && this.location.equals(oo.location))
		  flag=true;
	  
	  return flag;
		  
  }
  

	public static void main(String[] args) {
		ObjectDemo o=new ObjectDemo("Verizon","Hyderabad");
		System.out.println(o);
		
		ObjectDemo o1=new ObjectDemo("Verizon","Hyderabad");
		
		System.out.println(o.equals(o1));
		
	}



	
}
