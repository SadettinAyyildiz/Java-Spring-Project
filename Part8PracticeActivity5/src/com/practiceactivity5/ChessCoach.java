package com.practiceactivity5;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;


@Component
public class ChessCoach implements Coach {

	@Autowired
	private FortuneService fortuneService;

	public ChessCoach() {
		System.out.println("Constructor work.");
	}
		
	@Override
	public String getDailyWorkout() {
		return "Play chess!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

    

}
