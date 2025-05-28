# Tarea 2
# Identificacion y Correccion de Malas Practicas

Para esta tarea se van a utilizar las clases de Java del siguiente repositorio como referencia:
https://github.com/emilybache/GildedRose-Refactoring-Kata/tree/main/Java

## Identificacion de Malas practicas en las clases:
## Clase GildedRose.java
### 1. Codigo con multiples if anidados
### 2. Baja cohesion, la clase realiza multiples tareas
La clase realiza multiples tareas: iteracion, logica de calidad, validacion.
### 3. La escalabilidad y la mantenibilidad se ve afectda
### 4. Repeticion de logica
Validaciones como if (item.quality < 50) o if (item.quality > 0) se repiten varias veces
## Clase Item.java
### 1. Atributos publicos
Se accede y modifica directamente name, sellIn y quality
### 2. Clase sin metodos de comportamiento
La clase unicamente mantiene el estado de los atributos, pero
no contiene nada relaciondo a la logica