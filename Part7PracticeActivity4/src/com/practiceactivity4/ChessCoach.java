package com.practiceactivity4;

import org.springframework.stereotype.Component;

@Component
public class ChessCoach implements Coach {

	public ChessCoach() {
		System.out.println("Chess Coach constructor.");
	}
		
	@Override
	public String getDailyWorkout() {
		return "ChessCoach class getDailyWorkout method.";
	}

}
