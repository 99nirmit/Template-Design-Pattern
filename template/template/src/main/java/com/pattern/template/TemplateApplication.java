package com.pattern.template;

import domain.Cricket;
import domain.Football;
import domain.Game;
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
	}

}
