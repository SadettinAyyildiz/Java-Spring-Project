package com.practiceactivity4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach theCoach = context.getBean("chessCoach", Coach.class);

		System.out.println(theCoach.getDailyWorkout());
						
		context.close();

	}

}
