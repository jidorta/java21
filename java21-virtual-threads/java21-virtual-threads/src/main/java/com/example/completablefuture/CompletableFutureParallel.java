package com.example.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureParallel {
    public static void main(String[] args){
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        CompletableFuture<String> futuro1 = CompletableFuture.supplyAsync(()-> {
            dormir(100);
            return "Uno";
        }, executorService);

        CompletableFuture<String> futuro2 = CompletableFuture.supplyAsync(()->{
            dormir(500);
            return "Dos";
        }, executorService);

        CompletableFuture.allOf(futuro1,futuro2)
                .thenRun(()->{
                    try{
                        System.out.println("Completados " + futuro1.get() + " ," + futuro2.get());
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }).join();
        executorService.shutdown();
    }

    private static void dormir(int milisegundos){
        try{
            Thread.sleep(milisegundos);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
