public class TiendaLinea {
    public static void main(String[] args) {
        // Reto 3 - Tienda en línea (Detalle Producto)
        System.out.println("*** Tienda en línea (Detalle Producto) ***");

        String nombreProducto = "Laptop Asus";
        double precioProducto = 20000.0;
        int cantidadDisponible = 30;
        boolean disponibleVenta = true;

        // Imprimir el valor del producto
        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precioProducto = " + precioProducto);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("disponibleVenta = " + disponibleVenta);

        // Modificar los valores del producto
        nombreProducto = "Laptop Lenovo";
        precioProducto = 18000.00;
        cantidadDisponible = 10;
        disponibleVenta = false;

        // Imprimir los nuevos valores del producto
        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precioProducto = " + precioProducto);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("disponibleVenta = " + disponibleVenta);

    }
}
