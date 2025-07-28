package day6.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class JdbcDemo {

	public static void main(String[] args)  throws ClassNotFoundException,SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver"); //drivername
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","root");
		
		con.setAutoCommit(false);
		
		Statement st=con.createStatement();
		
	//	st.executeUpdate("create table accounts(id int primary key ,name varchar(20))");
	//	System.out.println(" table created");
		
		PreparedStatement pst=con.prepareStatement
				("insert into accounts values(?,?)");
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=3;i++) {
			int id=sc.nextInt();
			String name=sc.next();
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.execute();
		}
		
		
		ResultSet rs=st.executeQuery("select * from accounts ");
		ResultSetMetaData rsmd =rs.getMetaData();
		System.out.println(rsmd.getColumnCount());
		for(int i=1;i<=rsmd.getColumnCount();i++) {
			System.out.print(rsmd.getColumnName(i)+"   ");
		}
		System.out.println();
		while(rs.next()) {
			System.out.println(rs.getString(1)+"  "+rs.getString(2));
		}
		
		/*
		PreparedStatement pst=con.prepareStatement
				("update accounts set name=? where id=?");
		Scanner sc=new Scanner(System.in);
			int id=sc.nextInt();
			String name=sc.next();
			pst.setInt(2, id);
			pst.setString(1, name);
			pst.execute();
			*/
			
			
		
	//	st.executeUpdate("insert into accounts values(101,'ram')");
	//	st.executeUpdate("insert into accounts values(102,'raj')");
	//	st.executeUpdate("insert into accounts values(103,'ravi')");
		
	//	st.executeUpdate("update accounts set name='ramesh' where id=102");
		
	//	st.executeUpdate("delete from accounts where id=103");
		
	//	con.rollback();
	//	con.commit();
		System.out.println("rows created");         
		
		
	}

}
/*
 * 
 * 
DELIMITER //
create procedure addnum(in a int ,out b int) 
BEGIN
    set b=a*a;
END //
DELIMITER ;


 

CREATE TABLE users (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100)
);

INSERT INTO users VALUES (1, 'John Doe', 'john@example.com');
INSERT INTO users VALUES (2, 'Jane Smith', 'jane@example.com');


DELIMITER //

CREATE PROCEDURE GetUserById(
    IN in_id INT,
    OUT out_name VARCHAR(100),
    OUT out_email VARCHAR(100)
)
BEGIN
    SELECT name, email INTO out_name, out_email
    FROM users
    WHERE id = in_id;
END //

DELIMITER ;


      CallableStatement stmt = con.prepareCall("{call GetUserById(?, ?, ?)}");

	  stmt.setInt(1, 1); // in_id = 1

	  stmt.registerOutParameter(2, Types.VARCHAR); // out_name
	  stmt.registerOutParameter(3, Types.VARCHAR); // out_email

      stmt.execute();

		           
		            String name = stmt.getString(2);
		            String email = stmt.getString(3);

		            System.out.println("User Details:");
		            System.out.println("Name: " + name);
		            System.out.println("Email: " + email);

		      



*/