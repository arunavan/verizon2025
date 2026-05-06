package oops.main;

public class Mload {//static poly
	
	
	void area(int s) {
		System.out.println("Sq:"+(s*s));
	}
	void area(int l,int r) {
		System.out.println("Rect:"+(l*r));
	}
	
	void area(double r) {
		System.out.println("circle:"+(3.142*r*r));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mload ml=new Mload();
		ml.area(5);
		ml.area(5,6);
		ml.area(5.6);
	}

}
