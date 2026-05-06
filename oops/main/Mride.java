package oops.main;
class Ride{   //method override , dynamic poly
	void sq(int s) {
		System.out.println("area:"+(s*s));
	}
}
public class Mride extends Ride{
	void sq(int s) {
		System.out.println("Perimeter:"+(4*s));
	}
	public static void main(String[] args) {
		 Ride r=new Ride();
		 r.sq(5);
		// Mride m=new Mride();
		// m.sq(5);
		 r=new Mride();
		 r.sq(5);
	}

}
