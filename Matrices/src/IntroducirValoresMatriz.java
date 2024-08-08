import java.util.Scanner;

public class IntroducirValoresMatriz {
    public static void main(String[] args) {
        // Introducir valores en una matriz de forma dinámica
        int renglones, columnas;
        var consola = new Scanner(System.in);

        // Definir la matriz
        System.out.print("Proporciona los renglones de la matriz: ");
        renglones = Integer.parseInt(consola.nextLine());
        System.out.print("Proporciona las columnas de la matriz: ");
        columnas = Integer.parseInt(consola.nextLine());

        var matriz = new int[renglones][columnas];

        // Solicitar los valores
        for (var ren = 0; ren < renglones; ren++) {
            for (var col = 0; col < columnas; col++) {
                System.out.print("Valor[" + ren + "][" + col + "] = ");
                matriz[ren][col] = Integer.parseInt(consola.nextLine());
            }
        }

        System.out.println(); // Salto de línea

        // Iterar los valores de la matriz
        for (var ren = 0; ren < renglones; ren++) {
            for (var col = 0; col < columnas; col++) {
                System.out.println("Matriz[" + ren + "][" + col + "] = "
                        + matriz[ren][col]);
            }
        }
    }
}
