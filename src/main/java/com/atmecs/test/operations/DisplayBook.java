package com.atmecs.test.operations;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionException;
import org.hibernate.Transaction;

import com.atmecs.test.entity.EmployeeDetails;
import com.atmecs.test.entity.Employee;
import com.atmecs.test.utilities.HibernateUtility;

public class DisplayBook {
	public  void displayRecord() {
		Scanner scan=new Scanner(System.in);
	
	final Session session=HibernateUtility.getHibernateSession();
	try {
	    Transaction transaction=session.beginTransaction();
	    System.out.println("Enter the Id of the Book to Get Details :");
	    int id=scan.nextInt();
	    String query="FROM Book where bookId='"+id+"'"+"";
	    List<Employee> bookList=session.createQuery(query).getResultList();
		System.out.println(bookList);
		
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

