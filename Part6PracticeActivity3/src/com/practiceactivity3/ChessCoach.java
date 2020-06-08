package com.practiceactivity3;

public class ChessCoach implements Coach {

private Fortune fortune;
	
	public ChessCoach(Fortune fortune) {
		this.fortune = fortune;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Daily workout get method.";
	}

	@Override
	public String getDailyFortune() {
		return fortune.getFortune();
	}

}
