# Pizza-Track

## Objetivo

Realizar un programa en Java para manejar pedidos de una pizzería usando pilas y las operaciones de Deshacer y Rehacer.

## Descripción

Pizza-Track permite registrar pizzas, deshacer el último pedido y volver a hacerlo.

El programa utiliza dos pilas:

* **Pila principal:** guarda los pedidos activos.
* **Pila secundaria:** guarda temporalmente los pedidos que se deshacen.

Las pilas fueron realizadas manualmente utilizando nodos y listas enlazadas.

## ¿Qué es una pila?

Una pila es una estructura donde el último elemento que entra es el primero que sale.

Esto se conoce como **LIFO (Last In, First Out)**.

Por ejemplo, si registro tres pizzas:

```text
Pizza 1
Pizza 2
Pizza 3 ← última registrada
```

Al hacer `pop()`, primero sale la Pizza 3.

## Undo y Redo

Cuando registro una pizza, se utiliza `push()` para agregarla a la pila principal.

Cuando hago **Deshacer**, se utiliza `pop()` para sacar el último pedido de la pila principal y se guarda en la pila secundaria.

Cuando hago **Rehacer**, se saca el pedido de la pila secundaria y se vuelve a colocar en la pila principal.

Si después de deshacer registro una pizza nueva, se limpian los pedidos de la pila secundaria y ya no se puede rehacer el pedido anterior.

## Métodos utilizados

La clase `Pila` utiliza:

* `push()`: agrega un pedido.
* `pop()`: retira el pedido de la cima.
* `peek()`: muestra el pedido de la cima sin retirarlo.
* `isEmpty()`: verifica si la pila está vacía.

## Estructura del proyecto

* `Pizza.java`: contiene la información de la pizza y sus 3 ingredientes.
* `Nodo.java`: representa cada nodo de la lista enlazada.
* `Pila.java`: contiene la implementación de la pila.
* `GestionPedidos.java`: maneja las operaciones de Undo y Redo.
* `Main.java`: contiene el menú del programa.
* `.gitignore`: evita subir archivos `.class`.
* `capturas/`: contiene las capturas de la ejecución.

## Menú

```text
1. Registrar Pizza
2. Deshacer
3. Rehacer
4. Mostrar Pedido Actual
0. Salir
```

Al registrar una pizza se solicita el nombre y exactamente 3 ingredientes.

La opción **Mostrar Pedido Actual** utiliza `peek()` para mostrar solamente el pedido que está en la cima.

## Cómo ejecutar

Desde la terminal, dentro de la carpeta del proyecto:

```text
javac *.java
java Main
```

## Prueba realizada

Se probó el programa registrando pizzas, mostrando el pedido actual, haciendo Deshacer y Rehacer.

También se probó que al hacer Deshacer y después registrar una pizza nueva, no sea posible Rehacer el pedido anterior.

## Capturas

Las capturas de la ejecución se encuentran en la carpeta `capturas/`.

## Video de sustentación

**Enlace del video:** Pendiente de agregar.

## Autor

Alvaro Guzman
