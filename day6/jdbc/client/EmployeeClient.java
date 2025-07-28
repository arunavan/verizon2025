package day6.jdbc.client;


import java.sql.SQLException;

import day6.jdbc.model.Employee;
import day6.jdbc.service.EmployeeService;
import day6.jdbc.service.EmployeeServiceImpl;



public class EmployeeClient {


	public static void main(String[] args) throws SQLException,ClassNotFoundException{
		
       EmployeeService es=new EmployeeServiceImpl();
       
		//adding/inserting
		es.insertEmployee(new Employee(141,"Verizon123","Verizon123@ey.com"));
		es.insertEmployee(new Employee(142,"Verizon223","Verizon123@ey.com"));
		es.insertEmployee(new Employee(143,"Verizon323","Verizon123@ey.com"));
		//listing
		es.getAllEmployees().stream().forEach(e->System.out.println(e));;
		
		

	}

}
