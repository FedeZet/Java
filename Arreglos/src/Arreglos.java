import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
        // --- Arreglos ---
        // 1. Declaramos un arreglo
        int[] enteros; // Los nombres de variables de los arreglos van en plural
        // 2. Inicializar el arreglo (reservamos espacios en memoria)
        enteros = new int[3];
        // Declarar e inicializar un arreglo
        // int[] numeros = new int[2];
        // También se puede usar var, pero se debe inicializar el tipo de variable
        var numeros = new int[2];

        // --- Modificar valores ---
        System.out.println("*** Modificar valores ***");
        var enteros2 = new int[5];

        // Los arreglos tienen índices donde se guardan los valores, estos empiezan en 0
        // y terminan en n-1 (n siendo la longitud reservada en memoria de un arreglo)

        // Modificar un elemento
        // nombreArray[índice] = valor;
        enteros2[0] = 13;
        enteros2[1] = 21;
        enteros2[4] = 62;
        // enteros2[5] = 23; Error: No se puede asignar un valor a un índice inexistente.

        // --- Leer los elementos de un arreglo ---
        System.out.println("Valor 1 = " + enteros2[0]);
        System.out.println("Valor 2 = " + enteros2[1]);
        System.out.println("Valor 3 = " + enteros2[2]); // Valor por default 0
        System.out.println("Valor 5 = " + enteros2[4]);

        // --- Sintaxis Simplificada de Arreglos ---
        System.out.println("\n*** Sintaxis Simplificada ***");
        // int[] enteros3 = {100, 200, 300, 400, 500};
        var enteros3 = new int[]{100, 200, 300, 400, 500}; // Utilizando var

        // Acceder a los elementos del arreglo
        System.out.println("Valor 1 = " + enteros3[0]);
        System.out.println("Valor 2 = " + enteros3[1]);
        System.out.println("Valor 3 = " + enteros3[2]);
        System.out.println("Valor 4 = " + enteros3[3]);
        System.out.println("Valor 5 = " + enteros3[4]);

        // Imprimir el arreglo
        System.out.println("Imprimir el arreglo: " + enteros3); // [I@7291c18f

        // --- Iterar un arreglo ---
        System.out.println("\n*** Iterar un arreglo ***");
        for (var i = 0; i < enteros3.length; i++) {
            System.out.println("Valor del índice: " + i + " = " + enteros3[i]);
        }
    }
}
