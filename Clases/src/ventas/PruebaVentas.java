package ventas;

public class PruebaVentas {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Ventas ***");

        var producto1 = new Producto("Blusa", 30.0);
        var producto2 = new Producto("Zapatos", 50.0);

        // Primer orden
        var orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        System.out.println(orden1);

        // Segunda orden
        var orden2 = new Orden();
        orden2.agregarProducto(new Producto("Playera", 15.0));
        orden2.agregarProducto(producto1);
        orden2.agregarProducto(producto2);
        System.out.println(orden2);
    }
}
