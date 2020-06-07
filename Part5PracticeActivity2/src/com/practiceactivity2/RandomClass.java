package com.practiceactivity2;

import java.util.Random;

public class RandomClass implements Fortune {
	
	private Random random = new Random();

	
		private String[] data = {"Random 1", "Random 2", "Random 3"};
					
		@Override
		public String getFortune() {
			
			int x = random.nextInt(data.length);
			
			String theFortune = data[x];
			
			return theFortune;
		}

}
