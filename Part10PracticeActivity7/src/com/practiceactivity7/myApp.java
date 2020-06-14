package com.practiceactivity7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class myApp {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context = new 
				AnnotationConfigApplicationContext(SportConfigurationFile.class);
		
		// get the bean from spring container
		Coach theCoach = context.getBean("chessCoach", Coach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());

		// call a method on the bean
		System.out.println(theCoach.getDailyFortune());

		// close the context
		context.close();
		
	}

}


