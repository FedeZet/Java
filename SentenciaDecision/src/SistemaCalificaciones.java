import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String[] args) {
        // Reto - Sistema de Calificaciones
        System.out.println("*** Sistema de Calificaciones ***");

        // Pedir información al usuario
        var consola = new Scanner(System.in);
        System.out.print("Ingrese una calificación numérica del 1 al 10: ");
        var califNum = Double.parseDouble(consola.nextLine());
        var calificacion = "";

        // Comprobar cual es la calificación en letra
        if (califNum >= 9 && califNum <= 10) {
            calificacion = "A";
        } else if (califNum >= 8 && califNum < 9) {
            calificacion = "B";
        } else if (califNum >= 7 && califNum < 8) {
            calificacion = "C";
        } else if (califNum >= 6 && califNum < 7) {
            calificacion = "D";
        } else if (califNum >= 0 && califNum < 6) {
            calificacion = "F";
        } else {
            calificacion = "Valor desconocido";
        }

        // Imprimir calificación
        System.out.printf("Calificación %.1f es equivalente a %s",
                califNum, calificacion);
    }
}
