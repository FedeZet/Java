import java.util.Scanner;

public class SumaDiagonal {
    public static void main(String[] args) {
        // Reto - Suma en Diagonal de una Matriz
        System.out.println("*** Suma Diagonal de una Matriz ***");

        int renglones, columnas;
        var consola = new Scanner(System.in);

        // Solicitamos los renglones y las columnas al usuario
        System.out.print("Proporciona los renglones de la matriz: ");
        renglones = Integer.parseInt(consola.nextLine());
        System.out.print("Proporciona las columnas de la matriz: ");
        columnas = Integer.parseInt(consola.nextLine());

        var matriz = new int[renglones][columnas];

        // Solicitamos los valores de la matriz al usuario
        for (var ren = 0; ren < renglones; ren++) {
            for (var col = 0; col < columnas; col++) {
                System.out.print("Valor[" + ren + "][" + col + "] = ");
                matriz[ren][col] = Integer.parseInt(consola.nextLine());
            }
        }

        System.out.println(); // Salto de línea

        var sumaDiagonal = 0;

        for (var ren = 0; ren < renglones; ren++) {
            for (var col = 0; col < columnas; col++) {
                if(ren == col) { // Verificamos que el renglón y la columna sean iguales
                    sumaDiagonal += matriz[ren][col]; // Sumamos los valores
                }
            }
        }

        System.out.println("La suma en diagonal de la matriz es: " + sumaDiagonal);
    }
}
