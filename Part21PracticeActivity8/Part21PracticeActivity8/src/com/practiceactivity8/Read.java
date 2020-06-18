package com.practiceactivity8;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Read {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Employee.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {			
			// create a employee object
			Employee tempEmployee = new Employee("Mehmet", "Kuzey", "Softtech");
			
			// start a transaction
			session.beginTransaction();
			
			// save the employee object
			System.out.println(tempEmployee);
			session.save(tempEmployee);
			
			// commit transaction
			session.getTransaction().commit();
			
			// find out the employee's id: primary key
			System.out.println("Saved employee. Generated id: " + tempEmployee.getId());
			
			// now get a new session and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			// retrieve employee based on the id: primary key
			System.out.println("\nGetting employee with id: " + tempEmployee.getId());
			
			Employee myEmployee = session.get(Employee.class, tempEmployee.getId());
			
			System.out.println("Get complete: " + myEmployee);
			
			// commit the transaction
			session.getTransaction().commit();
		}
		finally {
			factory.close();
		}
	}

}





