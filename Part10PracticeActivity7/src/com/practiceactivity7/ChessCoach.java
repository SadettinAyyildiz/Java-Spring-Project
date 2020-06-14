package com.practiceactivity7;

import org.springframework.stereotype.Component;

@Component
public class ChessCoach implements Coach {

	private FortuneService fortuneService;
			
	public ChessCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Playing chess.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
