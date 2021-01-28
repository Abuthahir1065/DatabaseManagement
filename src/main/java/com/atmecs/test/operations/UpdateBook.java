package com.atmecs.test.operations;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionException;
import org.hibernate.Transaction;

import com.atmecs.test.entity.EmployeeDetails;
import com.atmecs.test.entity.Employee;
import com.atmecs.test.utilities.HibernateUtility;

public class UpdateBook {
public  void updateRecord() {
		
	Scanner scan=new  Scanner(System.in);
		final Session session=HibernateUtility.getHibernateSession();
		try {
		    Transaction transaction=session.beginTransaction();
		    
		    
		    System.out.println("Enter Book Id to Update:");
			int id=scan.nextInt();
		    System.out.println("Choose the field you want to modify:\n1.Book Name\n2.Price\n3.Author Name\n");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the value to be Modify :");
				String bookName=scan.next();
				String updateNameQuery="UPDATE Book b SET b.bookName='"+bookName+"' WHERE bookId='"+id+"'";
				session.createQuery(updateNameQuery).executeUpdate();
				break;
			case 2:
				System.out.println("Enter the value to be Modify :");
				String price=scan.next();
				String updateEmailQuery="UPDATE Book b SET b.price='"+price+"' WHERE bookId='"+id+"'";
				session.createQuery(updateEmailQuery).executeUpdate();
				break;
			case 3:
				System.out.println("Enter the value to be Modify :");
				String authorName=scan.next();
				String updateNumberQuery="UPDATE Author a SET a.authorName='"+authorName+"' WHERE bookId='"+id+"'";
				session.createQuery(updateNumberQuery).executeUpdate();
				break;
		
			default:
				System.out.println("Wrong Chocie");
				break;
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
		