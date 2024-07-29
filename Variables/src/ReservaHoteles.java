public class ReservaHoteles {
    public static void main(String[] args) {
        // Reto 4 - Reserva de Hoteles
        System.out.println("*** Sistema de Reserva de Hoteles ***");

        var nombreCliente = "Pedro Sanchez";
        var diasEstancia = 5;
        var tarifaDiaria = 500.00;
        var tieneVistaAlMar = true;

        System.out.println("nombreCliente = " + nombreCliente);
        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("tieneVistaAlMar = " + tieneVistaAlMar);

        // Modificar los datos de las variables
        nombreCliente = "Juan Gomez";
        diasEstancia = 7;
        tarifaDiaria = 300.00;
        tieneVistaAlMar = false;

        System.out.println("\nNuevos datos de la reservación:");
        System.out.println("nombreCliente = " + nombreCliente);
        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("tieneVistaAlMar = " + tieneVistaAlMar);
    }
}
