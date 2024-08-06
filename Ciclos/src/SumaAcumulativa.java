public class SumaAcumulativa {
    public static void main(String[] args) {
        System.out.println("*** Suma Acumulativa ***");

        final var MAXIMO = 15;
        var acumuladorSuma = 0;

        // Iterar los valores
        var numero = 1; // Contador

        while(numero <= MAXIMO) {
            // Imprimir lo que se va a sumar
            System.out.println("(acumuladorSuma + numero) -> "
                    + acumuladorSuma + " + " + numero);

            // Imprimir la suma parcial acumulada
            System.out.println("Suma parcial acumulada: " + acumuladorSuma + "\n");

            // Realizar la suma acumulativa
            acumuladorSuma += numero++; // acumuladorSuma = acumuladorSuma + numero++

        }
        System.out.println("Suma de los primeros " + MAXIMO + " números = " + acumuladorSuma);
    }
}
