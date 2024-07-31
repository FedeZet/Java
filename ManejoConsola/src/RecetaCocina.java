import java.util.Scanner;

public class RecetaCocina {
    public static void main(String[] args) {
        // Reto Recetas de Cocina
        System.out.println("*** Recetas de Cocina ***");

        var consola = new Scanner(System.in);

        // Nombre de receta
        System.out.print("Ingresa el nombre de la receta: ");
        var nombreReceta = consola.nextLine();

        // Ingredientes
        System.out.print("Ingresa los ingredientes: ");
        var ingredientes = consola.nextLine();

        // Tiempo de preparación
        System.out.print("Ingresa el tiempo de preparación (min): ");
        var tiempoPreparacion = Integer.parseInt(consola.nextLine());

        // Dificultad
        System.out.print("Ingresa la dificultad (Fácil/Medio/Difícil): ");
        var dificultad = consola.nextLine();

        // Imprimir receta de cocina
        System.out.println("\n--- Receta de Cocina ---");
        System.out.println("\tNombre de receta: " + nombreReceta);
        System.out.println("\tIngredientes: " + ingredientes);
        System.out.println("\tTiempo de preparación: " + tiempoPreparacion + " minutos");
        System.out.println("\tDificultad: " + dificultad);
    }
}
