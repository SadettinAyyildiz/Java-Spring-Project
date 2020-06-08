package com.practiceactivity3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
				
		Coach theCoach = context.getBean("chessCoach", Coach.class);
		Coach theCoach2 = context.getBean("chessCoach", Coach.class);
		
		boolean result = (theCoach == theCoach2);
		
		System.out.println(result);
		System.out.println("theCoach: " + theCoach);
		System.out.println("theCoach2: " + theCoach2);
	
		context.close();
	}

}
