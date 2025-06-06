package com.example.java21_pattern_matching;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Java21PatternMatchingApplication {

	public static void main(String[] args) {
		SpringApplication.run(Java21PatternMatchingApplication.class, args);
		printArea(new Circle(5));
		printArea(new Rectangle(4,6));

	}

	static void printArea(Shape shape){
		switch(shape){

			case Circle c -> System.out.println("Area del circulo : " + Math.PI * c.radius() * c.radius() );
			case Rectangle r -> System.out.println("Area del rectangulo: " + r.length() * r.width());
			default -> throw new IllegalStateException("Forma desconocida");
		}
	}

}
