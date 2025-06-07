package com.example.String_templates;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static java.lang.StringTemplate.STR;



@SpringBootApplication
public class StringTemplatesApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringTemplatesApplication.class, args);

		String name= "Juan";
		int age = 30;

		String message = STR."My name is \{name} and I am \{age} years old.";

		System.out.println(message);
	}

}
