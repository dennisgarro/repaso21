import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean seguir = true;
        while (seguir) {
            System.out.println("Bienvenido a mi carrito todo bien ");
            System.out.println("Seleccione la Opcion de que desea ");
            System.out.println(
                    " 1) registrar pedidos \n 2) Buscar Pedido \n 3) Modificar Pedido '\n 4) registrar Venta \n 5) salir");
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Vamos a registar pedido");
                    break;
                case 2:
                    System.out.println("Vamos a consultar un pedido");
                    break;
                case 3:
                    System.out.println("Vamos a modificar un pedido");
                    break;
                case 4:
                    System.out.println("Vamos a registar las ventas");
                    break;
                case 5:
                    System.out.println("Salir");
                    seguir = false;
                    break;

                default:
                    System.out.println("esta opcion no existe ");
                    break;
            }
        }
    }
}
