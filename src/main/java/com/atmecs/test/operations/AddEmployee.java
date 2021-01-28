package com.atmecs.test.operations;


import org.hibernate.Transaction;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionException;


import com.atmecs.test.entity.Employee;
import com.atmecs.test.entity.EmployeeDetails;
import com.atmecs.test.entity.EmployeeSkills;
import com.atmecs.test.utilities.HibernateUtility;

public class AddEmployee {

//public  void addRecord() {
	public static void main(String[] args) {
		
	
	Scanner scan=new  Scanner(System.in);
	final Session session=HibernateUtility.getHibernateSession();
	try {
	    Transaction transaction=session.beginTransaction();

		System.out.println("Enter the number of records you want to insert :");
		int recordCount=scan.nextInt();
		for(int i=1;i<=recordCount;i++)
		{
			System.out.println("Enter the details of Employee :"+i);
			System.out.println("Enter Employee Name :");
			String name=scan.next();
		
			System.out.println("Enter email:");
			
			String email=scan.next();
			System.out.println("Enter project Name : ");
			String projectname=scan.next();
			
			System.out.println("Enter the role :");
		     String role=scan.next();
			EmployeeDetails employeedetails=new EmployeeDetails();
			employeedetails.setEmployee(new Employee(name, email));
			employeedetails.setRole(role);
			employeedetails.setProjectname(projectname);
		
			
		
			session.save(employeedetails);
			
		}
		transaction.commit();
		}
	catch(SessionException e)
	{
		System.out.println(e);
	}
	finally {
		session.close();
	}
}
}
