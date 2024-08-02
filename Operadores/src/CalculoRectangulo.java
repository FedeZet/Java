import java.util.Scanner;

public class CalculoRectangulo {
    public static void main(String[] args) {
        // Reto - Calcular el área y el perímetro de un rectángulo
        System.out.println("*** Calcular el área y el perímetro de un rectángulo ***");
        var consola = new Scanner(System.in);

        System.out.print("Escribe la base del rectángulo: ");
        var baseRectangulo = Integer.parseInt(consola.nextLine());
        System.out.print("Escribe la altura del rectángulo: ");
        var alturaRectangulo = Integer.parseInt(consola.nextLine());

        // Realizar el cálculo del área del rectángulo
        var areaRectangulo = baseRectangulo * alturaRectangulo;
        System.out.println("El área del rectángulo es: " + areaRectangulo);

        // Realizar el cálculo del perímetro del rectángulo
        var perimetroRectangulo = 2 * (baseRectangulo + alturaRectangulo);
        System.out.println("El perímetro del rectángulo es: " + perimetroRectangulo);
    }
}
