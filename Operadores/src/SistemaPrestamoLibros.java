import java.util.Scanner;

public class SistemaPrestamoLibros {
    public static void main(String[] args) {
        System.out.println("*** Sistema prestamos de libros ***");

        final var DISTANCIA_PERMITIDA_KM = 3;
        var consola = new Scanner(System.in);

        System.out.print("Cuentas con credencial de estudiante? (true/false): ");
        var tieneCredencial = Boolean.parseBoolean(consola.nextLine());
        System.out.print("Cuántos kilómetros vives de la biblioteca?: ");
        var distanciaBibliotecaKm = Integer.parseInt(consola.nextLine());

        var esElegiblePrestamo =
                tieneCredencial || distanciaBibliotecaKm <= DISTANCIA_PERMITIDA_KM;

        System.out.println("Eres elegible para prestamo de libros?: " + esElegiblePrestamo);
    }
}
