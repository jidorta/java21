package com.example.scoped_values;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.ScopedValue;

@SpringBootApplication
public class ScopedValuesApplication {

	private static final ScopedValue<String> USERNAME = ScopedValue.newInstance();

	public static void main(String[] args) {
		SpringApplication.run(ScopedValuesApplication.class, args);

		ScopedValue.where(USERNAME, "Antonio")
				.run(() ->{
					greetUser();
					printUsrnameLenght();

				});


	}

	private static void greetUser(){
		//Añadimos para dar valor al ScopedValue
		System.out.println("Hola" + USERNAME.get() + "!");
	}

	private static void printUsrnameLenght(){
		System.out.println("Tu nombre tiene " + USERNAME.get().length() + "caracteres");
	}

}
