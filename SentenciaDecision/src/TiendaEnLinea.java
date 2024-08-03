import java.util.Scanner;

public class TiendaEnLinea {
    public static void main(String[] args) {
        // Reto - Sistema de tienda en línea con descuento
        System.out.println("*** Tienda en Línea con Descuento ***");
        var consola = new Scanner(System.in);

        final var MONTO_COMPRA_DESC = 1000;

        System.out.print("Cuál es el monto de tu compra?: ");
        var montoCompra = Double.parseDouble(consola.nextLine());

        System.out.print("Eres miembro de la tienda (true/false): ");
        var miembroTienda = Boolean.parseBoolean(consola.nextLine());

        var descuento = 0;

        if (montoCompra >= MONTO_COMPRA_DESC && miembroTienda) {
            descuento = 10;
        } else if (miembroTienda) {
            descuento = 5;
        }

        if (descuento != 0) {
            var montoDescuento = montoCompra * (descuento/100.0);
            var totalConDescuento = montoCompra - montoDescuento;
            System.out.printf("""
                    %nFelicidades, has obtenido un descuento del %d%%
                    Monto de la compra: $%.2f
                    Monto del descuento: $%.2f
                    Monto final de la compra con descuento: $%.2f
                    """, descuento, montoCompra, montoDescuento, totalConDescuento);
        } else {
            System.out.printf("""
                    %nNo obtuviste ningún tipo de descuento
                    Te invitamos a hacerte miembro de la tienda
                    Monto de la compra: $%.2f
                    """, montoCompra);
        }
    }
}
