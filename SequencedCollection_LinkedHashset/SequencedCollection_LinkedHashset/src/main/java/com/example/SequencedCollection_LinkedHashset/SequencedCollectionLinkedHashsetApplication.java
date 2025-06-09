package com.example.SequencedCollection_LinkedHashset;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.SequencedCollection;
import java.util.SequencedSet;

@SpringBootApplication
public class SequencedCollectionLinkedHashsetApplication {

	public static void main(String[] args) {
		SpringApplication.run(SequencedCollectionLinkedHashsetApplication.class, args);

		SequencedCollection<String> lista  = new ArrayList<>();
		lista.add("uno");
		lista.add("dos");
		lista.add("tres");

		System.out.println("Primero: " + lista.getFirst());
		System.out.println("Ultimo: " + lista.getLast());
		System.out.println("Reversa: " + lista.reversed());

		SequencedSet<String> conjunto = new LinkedHashSet<>();
		conjunto.add("A");
		conjunto.add("B");
		conjunto.add("C");

		System.out.println("Set ordenado: " +conjunto);
		System.out.println("Set reverso: " + conjunto.reversed());
	}

}
