public class NumerosInversos {
    public static void main(String[] args) {
        System.out.println("*** Números Inversos ***");

        var contador = 10;
        do {
            System.out.print(contador-- + " ");
        } while (contador >= 0);
    }
}
