//abstraction

//sub - implementation for abstract
package oops.main;



public class Demo {

	public static void main(String[] args) {
       System.out.println("demo");
       
     //  Loan l ; //object cant be created
      // l=new PersonalLoan();
     //  l=new HousingLoan();
       //static binding
       Loan l=new HousingLoan();
      System.out.println(l.getEmi(6000));
      l=new PersonalLoan();
      System.out.println(l.getEmi(6000));
      
       
       
	}

}
