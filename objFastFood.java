public class objFastFood {
    private int TipoComida;
    private int Tamano;
    private int Cantidad;
    private Double Precio;
    private Double TotalPagar;
    private int Estadopedido;
    private int Numeropedido;

    public objFastFood(int tipoComida, int tamano, int cantidad, Double precio, int estadopedido,Double totalpagar,
        int numeropedido) {
        TipoComida = tipoComida;
        Tamano = tamano;
        Cantidad = cantidad;
        Precio = precio;
        Estadopedido = estadopedido;
        TotalPagar = totalpagar;
        Numeropedido = numeropedido;
    }

    public objFastFood() {
    }

    public int getTipoComida() {
        return TipoComida;
    }

    public void setTipoComida(int tipoComida) {
        TipoComida = tipoComida;
    }

    public int getTamano() {
        return Tamano;
    }

    public void setTamano(int tamano) {
        Tamano = tamano;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double precio) {
        Precio = precio;
    }

    public int getEstadopedido() {
        return Estadopedido;
    }

    public void setEstadopedido(int estadopedido) {
        Estadopedido = estadopedido;
    }

    public Double getTotalPagar() {
        return TotalPagar;
    }

    public void setTotalPagar(Double totalPagar) {
        TotalPagar = totalPagar;
    }

    public int getNumeropedido() {
        return Numeropedido;
    }

    public void setNumeropedido(int numeropedido) {
        Numeropedido = numeropedido;
    }

}
