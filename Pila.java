public class Pila {

    private Nodo cima;

    public Pila() {
        cima = null;
    }

    // Verifica si la pila está vacía
    public boolean isEmpty() {
        return cima == null;
    }

    // Agrega una pizza en la parte superior de la pila
    public void push(Pizza pizza) {

        Nodo nuevo = new Nodo(pizza);

        // El nuevo nodo apunta al que anteriormente estaba en la cima
        nuevo.siguiente = cima;

        // Ahora el nuevo nodo se convierte en la cima
        cima = nuevo;
    }

    // Retira y devuelve la pizza que está en la cima
    public Pizza pop() {

        if (isEmpty()) {
            return null;
        }

        Pizza pizza = cima.pizza;

        // La cima pasa al siguiente nodo
        cima = cima.siguiente;

        return pizza;
    }

    // Permite ver la pizza de la cima sin retirarla
    public Pizza peek() {

        if (isEmpty()) {
            return null;
        }

        return cima.pizza;
    }

    // Muestra todas las pizzas de la pila
    public void mostrar() {

        if (isEmpty()) {
            System.out.println("No hay pedidos.");
            return;
        }

        Nodo actual = cima;

        while (actual != null) {

            actual.pizza.mostrar();

            System.out.println("--------------------");

            actual = actual.siguiente;
        }
    }
}