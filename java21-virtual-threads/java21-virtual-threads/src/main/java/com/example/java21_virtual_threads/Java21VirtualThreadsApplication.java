package com.example.java21_virtual_threads;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Java21VirtualThreadsApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(Java21VirtualThreadsApplication.class, args);
		for (int i =0; i < 10; i++){
			int finalI = i;
			Thread vt = Thread.startVirtualThread(() -> System.out.println("Hola desde Virtual Thread" + finalI ));
			vt.join();
		}
		// Espera un poco para salir los mensajes.
	  Thread.sleep(500);
    }
}
