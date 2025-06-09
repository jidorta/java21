# Ejercicios con Novedades de Java 21

Este repositorio contiene ejemplos prácticos de nuevas funcionalidades introducidas en Java 21, organizados por temática.

## Estructura del proyecto

- `virtualthreads/`  
  Ejemplo de uso de hilos virtuales (`Thread.startVirtualThread()`).

- `completablefuture/`  
  Uso de `CompletableFuture` con un `ExecutorService`.

- `patternmatchingswitch/`  
  Uso de interfaces `sealed` y `switch` con pattern matching.
  
-  'Scoped Values'

## Requisitos

- Java 21 instalado
- Maven (opcional, si usas Spring Boot o deseas compilar con `pom.xml`)

## Cómo ejecutar

Desde la raíz del proyecto:

```bash
mvn compile
mvn exec:java -Dexec.mainClass="com.example.java21.virtualthreads.VirtualThreadsExample"

# Scoped Values (Java 21 - Preview)

Este ejemplo muestra cómo utilizar `ScopedValue`, una novedad en Java 21 (en fase preview), para pasar información a métodos sin usar parámetros ni variables de contexto como `ThreadLocal`.

## 🧪 Qué hace

- Define un `ScopedValue<String>` llamado `USERNAME`.
- Lo asocia con el valor `"Juan"` mediante `ScopedValue.where(...)`.
- Ejecuta un bloque de código (`run`) en ese contexto.
- Accede al valor desde diferentes métodos, sin necesidad de pasar argumentos.

## 🧪 String Templates (preview feature - Java 21)

```java
String name = "Juan";
int age = 30;

String message = STR."My name is \{name} and I am \{age} years old.";

System.out.println(message);

### ✅ `SequencedCollection` con List y LinkedHashSet
Java 21 introduce una jerarquía para colecciones ordenadas que permite acceder al primer y último elemento, así como invertir el orden.

- `List.getFirst()`, `getLast()` y `reversed()`
- `LinkedHashSet.reversed()` mantiene orden de inserción inverso

Java 21 permite invertir listas inmutables fácilmente:

```java
List<String> original = List.of("a", "b", "c");
List<String> inversa = original.reversed();