import java.util.Scanner;

public class metodos {
    public objFastFood[][] Ingresarventas(objFastFood[][] m, Scanner sc) {
        int TipoComida = 0;
        int Tamano = 0;
        int Cantidad = 0;
        Double Precio = 0.0;
        int Estadopedido = 0;
        Double totalPagar = 0.0;
        int numeropedido = 1;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {

                System.out.println("Ingrese tl tipo de comida");
                System.out.println("1) Perro");
                System.out.println("2) Hamburgesa");
                System.out.println("3) Salchipapas");
                System.err.println("4) Perra");
                TipoComida = sc.nextInt();
                System.out.println("De que tamaño");
                System.out.println("1) grande");
                System.out.println("2) mediano");
                System.out.println("3) pequeño");
                Tamano = sc.nextInt();
                System.out.println("Ingredse la cantidad");
                Cantidad = sc.nextInt();
                System.out.println("ingrese el precio unitario");
                Precio = sc.nextDouble();
                totalPagar = Precio * Cantidad;
                Estadopedido = 0;
                objFastFood o = new objFastFood(TipoComida, Tamano, Cantidad, Precio, Estadopedido, totalPagar,
                        numeropedido);
                numeropedido++;
                m[i][j] = o;

            }
        }
        return m;
    }

    public objFastFood Consultarpedido(int numeropedido, objFastFood[][] m) {
        objFastFood o = new objFastFood();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j].getNumeropedido() == numeropedido) {
                    o = m[i][j];
                }
            }
        }
        return o;
    }

    public objFastFood[][] Modificarpedido(int numeropedido, objFastFood[][] m, Scanner sc) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j].getNumeropedido() == numeropedido) {
                    System.out.println("Ingrese tl tipo de comida");
                    System.out.println("1) Perro");
                    System.out.println("2) Hamburgesa");
                    System.out.println("3) Salchipapas");
                    System.err.println("4) Perra");
                    m[i][j].setTipoComida(sc.nextInt());
                    System.out.println("De que tamaño");
                    System.out.println("1) grande");
                    System.out.println("2) mediano");
                    System.out.println("3) pequeño");
                    m[i][j].setTamano(sc.nextInt());
                    System.out.println("Ingredse la cantidad");
                    m[i][j].setCantidad(sc.nextInt());
                    System.out.println("ingrese el precio unitario");
                    m[i][j].setPrecio(sc.nextDouble());
                    m[i][j].setTotalPagar(m[i][j].getPrecio() * m[i][j].getCantidad());

                }
            }

        }
        return m;
    }

    public objFastFood[][] registrarVenta(int numeropedido, objFastFood[][] m, Scanner sc) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j].getNumeropedido() == numeropedido && m[i][j].getEstadopedido() == 0) {
                    m[i][j].setNumeropedido(1);
                } else {
                    System.out.println("Ese pedido ya se despacho ");
                    break;
                }
            }
        }
        return m;
    }

    public void MostrarEstadoVetas(objFastFood[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                switch (m[i][j].getTipoComida()) {
                    case 1:
                        System.out.println("1) Perro");
                        break;
                    case 2:
                        System.out.println("2) Hamburgesa");
                        break;
                    case 3:
                        System.out.println("3) Salchipapas");
                        break;

                    default:
                        System.err.println("4) Perra");
                        break;
                }
                switch (m[i][j].getTamano()) {
                    case 1:
                        System.out.println("grande");
                        break;
                    case 2:
                        System.out.println("mediano");
                        break;

                    default:
                        System.out.println("pequeño");
                        break;
                }
                System.out.println("Cantidad : " + m[i][j].getCantidad());
                System.out.println("precio Unidad : " + m[i][j].getPrecio());
                System.out.println("Total a pagar: " + m[i][j].getTotalPagar());
                if (m[i][j].getEstadopedido() == 1) {
                    System.out.println("venta realizada");
                } else {
                    System.out.println("pedido pendiente");
                }
            }
        }
    }

    public void MostrarEstadoVetas(objFastFood o) {

        switch (o.getTipoComida()) {
            case 1:
                System.out.println("1) Perro");
                break;
            case 2:
                System.out.println("2) Hamburgesa");
                break;
            case 3:
                System.out.println("3) Salchipapas");
                break;

            default:
                System.err.println("4) Perra");
                break;
        }
        switch (o.getTamano()) {
            case 1:
                System.out.println("grande");
                break;
            case 2:
                System.out.println("mediano");
                break;

            default:
                System.out.println("pequeño");
                break;
        }
        System.out.println("Cantidad : " + o.getCantidad());
        System.out.println("precio Unidad : " + o.getPrecio());
        System.out.println("Total a pagar: " + o.getTotalPagar());
        if (o.getEstadopedido() == 2) {
            System.out.println("venta realizada");
        } else {
            System.out.println("pedido pendiente");
        }

    }
}
