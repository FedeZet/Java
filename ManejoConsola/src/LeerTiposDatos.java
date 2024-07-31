import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {
        // Leer distintos tipos de datos
        var consola = new Scanner(System.in);
        // Leer un tipo int
        System.out.print("Ingresa tu edad: ");
        var edad = consola.nextInt();
        System.out.println("edad = " + edad);

        // Leer un tipo double
        System.out.print("Ingresa tu altura: ");
        var altura = consola.nextDouble();
        System.out.println("altura = " + altura);

        // Consumimos el carácter de salto de línea, los métodos nextInt y nextDouble no
        // consumen el carácter de salto de línea, por eso no es recomendable utilizarlos
        // pero si aún así se desea usarlo, es recomendable utilizar el siguiente método:
        consola.nextLine();

        // Leer un tipo String
        System.out.print("Ingresa tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);

        // Conversión de datos - Recomendado, para no usar nextInt y nextDouble

        // Convertir a Int
        System.out.print("Proporciona un valor entero: ");
        // var enteroString = consola.nextLine();
        // var entero = Integer.parseInt(enteroString); // Convertir un String a int
        var entero = Integer.parseInt(consola.nextLine());
        System.out.println("entero = " + entero);

        // Convertir a Float
        System.out.print("Proporciona un valor flotante: ");
        var flotante = Float.parseFloat(consola.nextLine());
        System.out.println("flotante = " + flotante);

        // Clases para conversiones
        // Double.parseDouble();
        // Boolean.parseBoolean();
    }
}
