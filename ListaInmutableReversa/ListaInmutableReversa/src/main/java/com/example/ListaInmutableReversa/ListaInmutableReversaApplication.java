package com.example.ListaInmutableReversa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ListaInmutableReversaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListaInmutableReversaApplication.class, args);

		List<String> original  = List.of("a","b","c");
		List<String>inversa = original.reversed();

		System.out.println("Original: " + original);
		System.out.println("Inversa: " + inversa);
	}

}
