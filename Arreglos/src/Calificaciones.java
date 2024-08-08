import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        // Reto - Calificaciones
        System.out.println("*** Promedio de Calificaciones ***");

        var consola = new Scanner(System.in);

        // Pedimos al usuario la cantidad de calificaciones
        System.out.print("Cuántas calificaciones deseas agregar?: ");
        var cantCalificaciones = Integer.parseInt(consola.nextLine());

        var calificaciones = new int[cantCalificaciones];

        // Pedimos al usuario que ingrese el valor de cada calificación
        for(var i = 0; i < calificaciones.length; i++) {
            System.out.print("Calificaciones[" + i + "] = ");
            calificaciones[i] = Integer.parseInt(consola.nextLine());
        }

        var sumaCalificaciones = 0;

        // Sumamos todas las calificaciones
        for(var i = 0; i < calificaciones.length; i++) {
            sumaCalificaciones += calificaciones[i]; // sumaCalificaciones = sumaCalificaciones + calificaciones[i];
        }

        // Hacemos el promedio de las calificaciones
        var promedio = sumaCalificaciones / calificaciones.length;

        System.out.println("\nPromedio de las Calificaciones: " + promedio);
    }
}
