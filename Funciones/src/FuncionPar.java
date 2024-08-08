import java.util.Scanner;

public class FuncionPar {

    // Función para saber si un número es par
    static boolean esPar(int numero) {
        /*
        if(numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
        */

        //return (numero % 2 == 0) ? true : false;
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.print("Proporciona un valor numérico: ");
        var numero = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println("Numero par?: " + esPar(numero));
    }
}
