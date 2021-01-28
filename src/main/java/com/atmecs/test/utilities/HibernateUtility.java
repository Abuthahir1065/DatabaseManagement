package com.atmecs.test.utilities;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.atmecs.test.entity.EmployeeDetails;
import com.atmecs.test.entity.Employee;



public class HibernateUtility {
	

	public static Session getHibernateSession() {
		final SessionFactory factory = new Configuration().addAnnotatedClass(Employee.class).addAnnotatedClass(EmployeeDetails.class)
		        .configure("hibernate.cfg.xml").buildSessionFactory();
		final Session session = factory.openSession();
	    return session;
	}
}
