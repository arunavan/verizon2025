package day6.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.util.Scanner;

public class CallablceDemo {

	public static void main(String[] args)  throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver"); //drivername
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","root");
		System.out.println(" enter number");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		
		CallableStatement cst=con.prepareCall
				( "{  CALL addnum(?,?) } ");
		cst.setInt(1, x);
		cst.registerOutParameter(2, Types.INTEGER);
		cst.execute();
		int result=cst.getInt(2);
		System.out.println(" REsult:"+result);
		
	

	}

}

/*
 
 
DELIMITER //
create procedure addnum(in a int ,out b int) 
BEGIN
    set b=a*a;
END //
DELIMITER ;


*/