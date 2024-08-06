public class NumerosImpares {
    public static void main(String[] args) {
        // Reto - Números impares
        System.out.println("*** Números Impares ***");

        var contador = 0;

        do {
            if (contador % 2 != 0)
                System.out.print(contador + " ");
            contador++;
        } while (contador <= 20);
    }
}
