import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        metodos met = new metodos();
        boolean seguir = true;
        int n = 0, numeropedido = 0;
        System.out.println("Ingrese la dimesion de la matriz");
        n = sc.nextInt();
        objFastFood[][] m = new objFastFood[n][n];
        while (seguir) {
            System.out.println("Bienvenido a mi carrito todo bien ");
            System.out.println("Seleccione la Opcion de que desea ");
            System.out.println(
                    " 1) registrar pedidos \n 2) Buscar Pedido \n 3) Modificar Pedido '\n 4) registrar Venta \n 5) Mostrar Vetas \n 6) salir");
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Vamos a registar pedido");
                    m = met.Ingresarventas(m, sc);
                    break;
                case 2:
                    System.out.println("Vamos a consultar un pedido");
                    System.out.println("Ingrese el numero del pedido");
                    numeropedido = sc.nextInt();
                    objFastFood o = new objFastFood();
                    o = met.Consultarpedido(numeropedido, m);
                    met.MostrarEstadoVetas(o);
                    break;
                case 3:
                    System.out.println("Ingrese el numero del pedido");
                    numeropedido = sc.nextInt();
                    m = met.Modificarpedido(numeropedido, m, sc);

                    break;
                case 4:
                    System.out.println("Ingrese el numero del pedido");
                    numeropedido = sc.nextInt();
                    System.out.println("Vamos a registar las ventas");
                    m = met.registrarVenta(numeropedido, m, sc);
                    break;
                case 5:
                    met.MostrarEstadoVetas(m);
                    break;
                case 6:
                    System.out.println("muchas gracias");
                    seguir = false;
                    break;

                default:
                    System.out.println("esta opcion no existe ");
                    break;
            }
        }
    }
}
