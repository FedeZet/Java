import java.util.Scanner;

public class MayorDeDosNumeros {
    public static void main(String[] args) {
        // Reto - Mayor de dos números
        System.out.println("*** El mayor de dos números ***");

        // Pedir información al usuario
        var consola = new Scanner(System.in);
        System.out.print("Ingresa el primer número entero: ");
        var numero1 = Integer.parseInt(consola.nextLine());
        System.out.print("Ingresa el segundo número entero: ");
        var numero2 = Integer.parseInt(consola.nextLine());

        // Verificar el número mayor
        if (numero1 > numero2) {
            System.out.println("El número " + numero1 + " es mayor al número " + numero2);
        } else if (numero2 > numero1) {
            System.out.println("El número " + numero2 + " es mayor al número " + numero1);
        } else {
            System.out.println("Los números son iguales");
        }
    }
}
