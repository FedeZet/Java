public class Matrices {
    public static void main(String[] args) {
        // --- Definimos una matriz ---
        // int[][] matriz = new int[2][3];
        // var matriz = new int[renglones][columnas]
        final var RENGLONES = 2;
        final var COLUMNAS = 3;

        var matriz = new int[RENGLONES][COLUMNAS];

        // --- Modificamos los valores de la matriz ---
        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;

        // --- Accedemos a los valores ---
        System.out.println("*** Acceder a los valores ***");
        System.out.println("Valor 1 [0][0] = " + matriz[0][0]);
        System.out.println("Valor 1 [1][1] = " + matriz[1][1]);
        System.out.println("Valor 1 [1][2] = " + matriz[1][2]);

        // --- Recorrer una matriz ---
        System.out.println("\n*** Recorrer una matriz ***");
        // 1. Ciclo externo. Recorrer los renglones
        for(var ren = 0; ren < RENGLONES; ren++) {
            // 2. Ciclo interno. Recorrer las columnas
            for(var col = 0; col < COLUMNAS; col++) {
                System.out.println("Valor[" + ren + "][" + col + "] = " + matriz[ren][col]);
            }
        }

        // --- Sintaxis Simplificada ---
        System.out.println("\n*** Sintaxis Simplificada ***");
        var matriz2 = new int[][]{
                {100, 200, 300},
                {400, 500, 600}
        };

        for (var ren = 0; ren < matriz2.length; ren++) {
            for (var col = 0; col < matriz2[ren].length; col++) {
                System.out.println("Valor[" + ren + "][" + col + "] = " + matriz2[ren][col]);
            }
        }
    }
}
