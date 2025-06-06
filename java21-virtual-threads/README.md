# Ejercicios con Novedades de Java 21

Este repositorio contiene ejemplos prácticos de nuevas funcionalidades introducidas en Java 21, organizados por temática.

## Estructura del proyecto

- `virtualthreads/`  
  Ejemplo de uso de hilos virtuales (`Thread.startVirtualThread()`).

- `completablefuture/`  
  Uso de `CompletableFuture` con un `ExecutorService`.

- `patternmatchingswitch/`  
  Uso de interfaces `sealed` y `switch` con pattern matching.

## Requisitos

- Java 21 instalado
- Maven (opcional, si usas Spring Boot o deseas compilar con `pom.xml`)

## Cómo ejecutar

Desde la raíz del proyecto:

```bash
mvn compile
mvn exec:java -Dexec.mainClass="com.example.java21.virtualthreads.VirtualThreadsExample"