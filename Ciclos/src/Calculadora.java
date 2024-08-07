import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        // Reto - Calculadora

        // Variables
        double operando1 = 0, operando2 = 0, resultado;

        var consola = new Scanner(System.in);
        var salir = false;

        while(!salir) {
            System.out.print("""
                    *** Calculadora en Java ***
                    1. Suma
                    2. Resta
                    3. Multiplicación
                    4. División
                    5. Salir
                    Elige una opción:\s""");
            var opcion = consola.nextInt();

            // Cada que se elige una opción entre el 1 y el 4, pedir al usuario los valores
            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingrese el valor 1: ");
                operando1 = consola.nextDouble();
                System.out.print("Ingrese el valor 2: ");
                operando2 = consola.nextDouble();
            }

            switch(opcion) {
                case 1 -> { // Suma
                    resultado = operando1 + operando2;
                    System.out.printf("Resultado de suma: %.2f%n%n", resultado);
                }
                case 2 -> { // Resta
                    resultado = operando1 - operando2;
                    System.out.printf("Resultado de resta: %.2f%n%n", resultado);
                }
                case 3 -> { // Multiplicación
                    resultado = operando1 * operando2;
                    System.out.printf("Resultado de multiplicación: %.2f%n%n", resultado);
                }
                case 4 -> { // División
                    if(operando2 != 0) { // Comprobamos que operando2 no sea 0
                        resultado = operando1 / operando2;
                        System.out.printf("Resultado de división: %.2f%n%n", resultado);
                    } else {
                        System.out.println("Error: División por cero.\n");
                    }
                }
                case 5 -> { // Salir
                    System.out.println("Saliendo del programa de Calculadora!");
                    salir = true;
                }
                default -> System.out.println("Opción inválida, selecciona otra opción...\n");
            }
        }
    }
}
