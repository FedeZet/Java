import java.util.Scanner;

public class IntroducirValoresArreglo {
    public static void main(String[] args) {
        // --- Introducir valores a un arreglo ---
        System.out.println("\n*** Introducir valores a un arreglo ***");
        var consola = new Scanner(System.in);

        System.out.print("Proporciona el largo del arreglo: ");
        var largoArreglo = Integer.parseInt(consola.nextLine());

        // Creamos de manera dinámica el arreglo
        var enteros = new int[largoArreglo];

        // Solicitar los valores del arreglo
        for(var i = 0; i < enteros.length; i++) {
            System.out.print("Proporciona enteros[" + i + "] = ");
            enteros[i] = Integer.parseInt(consola.nextLine());
        }
        // Imprimir los valores del arreglo
        System.out.println("\nImpresión del arreglo: ");
        for (var i = 0; i < enteros.length; i++) {
            System.out.println("enteros[" + i + "] = " + enteros[i]);
        }
    }
}
