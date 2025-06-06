package com.example.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureWithExecutor {

    public static void main (String[] args){

        // Creo un executor con 3 hilos
        ExecutorService executor = Executors.newFixedThreadPool(3);

        //Lanzo una tarea asincrona con ese executor
        CompletableFuture<String> future = CompletableFuture.supplyAsync(()-> {
            System.out.println("Ejecutando tarea en el hilo" +Thread.currentThread().getName());
            try{
                Thread.sleep(1000) ;// simulamos una operación larga
            }catch (InterruptedException e){
                throw new IllegalStateException(e);
            }
            return "Resultado de la tarea";
        },executor);

        //Continuo con otra operación cuando termina
        future.thenAccept(resultado -> System.out.println ("Resultado que recibimos: " +resultado));

        //Esperamos a que termine
        future.join();

        //Cerramos el executor
        executor.shutdown();



    }
}
