import java.util.Scanner;

public class TicketVenta {
    public static void main(String[] args) {
        System.out.println("*** Generación ticket de venta ***");
        var consola = new Scanner(System.in);

        System.out.print("Precio carne: ");
        var precioCarne = Double.parseDouble(consola.nextLine());
        System.out.print("Precio pan: ");
        var precioPan = Double.parseDouble(consola.nextLine());
        System.out.print("Precio lechuga: ");
        var precioLechuga = Double.parseDouble(consola.nextLine());
        System.out.print("Precio tomate: ");
        var precioTomate = Double.parseDouble(consola.nextLine());
        System.out.print("Aplicar algún descuento (%)?: ");
        var descuentoPorcentaje = Integer.parseInt(consola.nextLine());

        // Cálculo del subtotal (sin impuestos)
        var subtotal = precioCarne + precioPan + precioLechuga + precioTomate;

        // Aplicar descuento
        var descuento = subtotal * (descuentoPorcentaje/100.0);

        // Subtotal con descuento
        var subtotalConDescuento = subtotal - descuento;

        // Cálculo con impuestos (16%)
        var impuesto = subtotalConDescuento * 0.16;

        // Cálculo total de la compra (con impuestos)
        var costoTotalCompra = subtotalConDescuento + impuesto;

        // Imprimir el ticket de venta
        System.out.printf("""
                %nTicket de Venta
                -------------------------------
                Subtotal: $%.2f
                Descuento: $%.2f (%d%%)
                Impuesto (16%%): $%.2f
                Costo total de la compra: $%.2f
                """, subtotal, descuento, descuentoPorcentaje, impuesto, costoTotalCompra);
    }
}
