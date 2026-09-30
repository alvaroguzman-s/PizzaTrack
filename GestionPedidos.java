public class GestionPedidos {

    private Pila pilaPrincipal;
    private Pila pilaSecundaria;

    public GestionPedidos() {
        pilaPrincipal = new Pila();
        pilaSecundaria = new Pila();
    }

    // Registra una pizza en la pila principal
    public void registrarPedido(Pizza pizza) {
        pilaPrincipal.push(pizza);

        // Al registrar un nuevo pedido se limpian los pedidos
        // que estaban disponibles para rehacer
        while (!pilaSecundaria.isEmpty()) {
            pilaSecundaria.pop();
        }
    }

    // Deshace el último pedido
    public void deshacer() {

        if (pilaPrincipal.isEmpty()) {
            System.out.println("No hay pedidos para deshacer.");
            return;
        }

        Pizza pizza = pilaPrincipal.pop();
        pilaSecundaria.push(pizza);

        System.out.println("Pedido deshecho correctamente.");
    }

    // Recupera el último pedido deshecho
    public void rehacer() {

        if (pilaSecundaria.isEmpty()) {
            System.out.println("No hay pedidos para rehacer.");
            return;
        }

        Pizza pizza = pilaSecundaria.pop();
        pilaPrincipal.push(pizza);

        System.out.println("Pedido rehecho correctamente.");
    }

    // Muestra el pedido que está actualmente en la cima
    public void mostrarPedidoActual() {

        Pizza pizza = pilaPrincipal.peek();

        if (pizza == null) {
            System.out.println("No hay pedidos activos.");
        } else {
            System.out.println("\n--- PEDIDO ACTUAL ---");
            pizza.mostrar();
        }
    }
}