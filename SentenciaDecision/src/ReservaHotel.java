import java.util.Scanner;

public class ReservaHotel {
    public static void main(String[] args) {
        // Reto - Sistema de Reserva de Hotel
        System.out.println("*** Sistema de Reserva de Hotel ***");
        var consola = new Scanner(System.in);

        final var TARIFA_DIARIA_SIN_VISTA_MAR = 150.50;
        final var TARIFA_DIARIA_CON_VISTA_MAR = 190.50;

        // Pedimos la información al usuario
        System.out.print("Nombre del cliente: ");
        var clienteNombre = consola.nextLine();
        System.out.print("Días de estadía: ");
        var diasEstadia = Integer.parseInt(consola.nextLine());
        System.out.print("Con vista al mar (true/false)?: ");
        var conVistaAlMar = Boolean.parseBoolean(consola.nextLine());

        // Cálculo del costo de la estadía
        var costo = 0.0;
        if (conVistaAlMar) {
            costo = TARIFA_DIARIA_CON_VISTA_MAR * diasEstadia;
        } else {
            costo = TARIFA_DIARIA_SIN_VISTA_MAR * diasEstadia;
        }

        // Detalles de la reserva
        System.out.printf("""
                %n--------- Detalles de la Reservación ---------
                Cliente: %s
                Días de estadía: %d días
                Habitación con vista al mar: %s
                Costo: $%.2f
                """, clienteNombre, diasEstadia, conVistaAlMar ? "Sí :)" : "No :(", costo);
    }
}
