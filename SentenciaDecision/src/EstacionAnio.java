import java.util.Scanner;

public class EstacionAnio {
    public static void main(String[] args) {
        // Reto - Estación del Año
        System.out.println("*** Estación del Año ***");

        // Pedir información al usuario
        var consola = new Scanner(System.in);

        System.out.print("Proporciona un mes (valor número entre 1 y 12): ");
        var mes = Integer.parseInt(consola.nextLine());

        // Verificar la estación del mes
        var estacion = "Desconocida";

        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "Verano";
        } else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "Otoño";
        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "Invierno";
        } else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "Primavera";
        }

        // Imprimir el resultado
        System.out.printf("La estación del mes %d es %s", mes, estacion);
    }
}
