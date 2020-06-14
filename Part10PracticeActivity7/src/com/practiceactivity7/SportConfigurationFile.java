package com.practiceactivity7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfigurationFile {
		
	@Bean
	public FortuneService happyFortuneService() {
		return new HappyFortuneService();
	}
	
	@Bean
	public Coach chessCoach() {
		ChessCoach chessCoach = new ChessCoach(happyFortuneService());
		
		return chessCoach;
	}
	
}








