package com.pattern.decorator;

import domain.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DecoratorApplication {

	public static void main(String[] args) {

//		Coffee Application

		Coffee coffee = new SimpleCoffee();
		System.out.println(coffee.description() + " $" + coffee.cost());

		coffee = new MilkDecorator(coffee);
		System.out.println(coffee.description() + " $" + coffee.cost());

		coffee = new SugarDecorator(coffee);
		System.out.println(coffee.description() + " $" + coffee.cost());

		System.out.println();

//		Pizza Application

		Pizza pizza = new PlainPizza();
		System.out.println(pizza.descriptionO() + " $" + pizza.cost());

		Pizza pizza1 = new CheesePizza(pizza);
		System.out.println(pizza1.descriptionO() + " $" + pizza1.cost());

		Pizza pizza2 = new PeppironPizza(pizza);
		System.out.println(pizza2.descriptionO() + " $" + pizza2.cost());
	}

}
