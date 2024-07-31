package com.pattern.template;

import domain.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TemplateApplication {

	public static void main(String[] args) {

		//		Cricket Game Project
		Game game =  new Cricket();
		game.play();
		System.out.println();

		Game game1 = new Football();
		game1.play();

		System.out.println("_________________________________________________________");

//		Data Processer Project

		DataProcesser dataProcesser = new TextDataProcesser();
		dataProcesser.process();

		DataProcesser dataProcesser1 = new ExcelDataProcesser();
		dataProcesser1.process();
	}

}
