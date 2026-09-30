import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        GestionPedidos gestion = new GestionPedidos();

        int opcion;

        do {

            System.out.println("\n===== PIZZA-TRACK =====");
            System.out.println("1. Registrar Pizza");
            System.out.println("2. Deshacer");
            System.out.println("3. Rehacer");
            System.out.println("4. Mostrar Pedido Actual");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Ingrese el nombre de la pizza: ");
                    String nombre = teclado.nextLine();

                    String[] ingredientes = new String[3];

                    for (int i = 0; i < 3; i++) {
                        System.out.print("Ingrese el ingrediente " + (i + 1) + ": ");
                        ingredientes[i] = teclado.nextLine();
                    }

                    Pizza pizza = new Pizza(nombre, ingredientes);

                    gestion.registrarPedido(pizza);

                    System.out.println("Pedido registrado correctamente.");

                    break;

                case 2:

                    gestion.deshacer();

                    break;

                case 3:

                    gestion.rehacer();

                    break;

                case 4:

                    gestion.mostrarPedidoActual();

                    break;

                case 0:

                    System.out.println("Programa finalizado.");

                    break;

                default:

                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 0);

        teclado.close();
    }
}