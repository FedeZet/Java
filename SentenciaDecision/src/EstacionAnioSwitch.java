import java.util.Scanner;

public class EstacionAnioSwitch {
    public static void main(String[] args) {
        // Reto - Estación del Año con Switch
        System.out.println("*** Estación del Año con Switch ***");

        // Pedir información al usuario
        var consola = new Scanner(System.in);
        System.out.print("Proporciona un mes (valor número entre 1 y 12): ");
        var mes = Integer.parseInt(consola.nextLine());

        // Verificar la estación del mes con la sintaxis switch mejorada
        var estacion = switch (mes) {
            case 1, 2, 12 -> "Verano";
            case 3, 4, 5 -> "Otoño";
            case 6, 7, 8 -> "Invierno";
            case 9, 10, 11 -> "Primavera";
            default -> "Desconocida"; // En esta estructura switch se debe agregar el default
        };

        // Imprimir el resultado
        System.out.printf("La estación del mes %d es %s", mes, estacion);
    }
}
