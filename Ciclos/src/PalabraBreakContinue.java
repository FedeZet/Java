public class PalabraBreakContinue {
    public static void main(String[] args) {
        System.out.println("*** Break y Continue ***");

        // Ejemplo break, imprimir solo el primer número par
        System.out.println("Palabra break");
        for (var numero = 1; numero < 10; numero++) {
            if(numero % 2 == 0) {
                System.out.print(numero + " ");
                break; // Termina con las iteraciones del for
            }
        }

        // Ejemplo continue, imprimir solo números pares e ignorar los impares
        System.out.println("\nPalabra continue");
        for (var numero = 1; numero < 10; numero++) {
            if(numero % 2 == 1) { // Números impares
                continue; // Saltamos a la siguiente iteración
            }
            System.out.print(numero + " "); // Números pares
        }
    }
}
