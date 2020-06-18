package com.practiceactivity8;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Create {

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
			Employee tempEmployee = new Employee("Ali", "Veli", "Softtech");
			
			// start a transaction
			session.beginTransaction();
			
			// save the employee object
			session.save(tempEmployee);
			
			// commit transaction
			session.getTransaction().commit();
;
		}
		finally {
			factory.close();
		}
	}

}





