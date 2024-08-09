package ventas;

public class Orden {
    private final int idOrden;
    private static int contadorOrdenes;
    private final Producto[] productos;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto) {
        if(this.contadorProductos < Orden.MAX_PRODUCTOS)
            this.productos[this.contadorProductos++] = producto;
        else
            System.out.println("Se ha superado el máximo de productos: " + Orden.MAX_PRODUCTOS);
    }

    private double calcularTotal() {
        double total = 0;
        for(var i = 0; i < this.contadorProductos; i++) {
            var producto = this.productos[i];
            total += producto.getPrecio(); // total = total + producto.getPrecio();
        }
        return total;
    }

    public void mostrarOrden() {
    }

    @Override
    public String toString() {
        var totalOrden = this.calcularTotal();
        StringBuilder resultado = new StringBuilder("Id Orden: " + this.idOrden + "\n"
                + "\tTotal de la Orden: $" + totalOrden + "\n"
                + "\tProductos de la Orden:" + "\n");
        for(var i = 0; i < this.contadorProductos; i++) {
            resultado.append("\t\t").append(this.productos[i]).append("\n");
        }
        return resultado.toString();
    }
}
