package com.practiceactivity6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class ReadFile implements FortuneService {
	

	private Random myRandom = new Random();

	private String fileName = "/Users/sadettinayyildiz/eclipse-workspace/Part9PracticeActivity6/src/datafile.txt";
	private List<String> data;
	String flag;
	
	public ReadFile() {

		System.out.println("Iside read file constructor.");
		
	}
	
	
	@Override
	public String getFortune() {
		int random = myRandom.nextInt(data.size());
		String returnData = data.get(random);
		return returnData;
	}

	@PostConstruct
	public void readFileMethod() {

		File filePath = new File(fileName);

		data = new ArrayList<String>();

		try (BufferedReader bufferReader = new BufferedReader(
				new FileReader(filePath))) {

			while ((flag = bufferReader.readLine()) != null) {
				data.add(flag);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	

}
