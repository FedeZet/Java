public class NumerosParesFor {
    public static void main(String[] args) {
        // Reto - Números pares con for
        System.out.println("*** Números Pares usando ciclo For ***");

        for (var i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
