package com.practiceactivity8;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Update {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Employee.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {								
			int employeeId = 1;
			
			// now get a new session and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			// retrieve employee based on the id: primary key
			Employee myEmployee = session.get(Employee.class, employeeId);
			myEmployee.setFirstName("Hasan");
			
			// commit the transaction
			session.getTransaction().commit();

			// NEW CODE
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			// update company for all employees
			session.createQuery("update Employee set company='Top Java Coders Inc'")
				.executeUpdate();
						
			// commit the transaction
			session.getTransaction().commit();

		}
		finally {
			factory.close();
		}
	}

}





