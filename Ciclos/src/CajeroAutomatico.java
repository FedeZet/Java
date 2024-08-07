import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        // Reto - Cajero Automático

        var saldo = 1000.00;

        var consola = new Scanner(System.in);
        var salir = false;

        while(!salir) {
            System.out.print("""
                    *** Aplicación de Cajero Automático ***
                    Operaciones que puedes realizar:
                    1. Consultar saldo
                    2. Retirar
                    3. Depositar
                    4. Salir
                    Elegir una opción:\s""");
            var opcion = consola.nextInt();

            switch (opcion) {
                case 1 -> System.out.printf("Tu saldo actual es: $%.2f%n%n", saldo);
                case 2 -> {
                    System.out.print("Ingrese el monto a retirar: ");
                    var retirarSaldo = consola.nextDouble();
                    if (retirarSaldo <= saldo) {
                        saldo -= retirarSaldo;
                        System.out.printf("Tu nuevo saldo es: $%.2f%n%n", saldo);
                    } else {
                        System.out.printf("No cuentas con el saldo suficiente. " +
                                "Saldo actual es: $%.2f%n%n", saldo);
                    }
                }
                case 3 -> {
                    System.out.print("Ingrese el monto a depositar: ");
                    var depositarSaldo = consola.nextDouble();
                    saldo += depositarSaldo;
                    System.out.printf("Tu nuevo saldo es: $%.2f%n%n", saldo);
                }
                case 4 -> {
                    System.out.println("Saliendo del cajero automático. Hasta pronto!");
                    salir = true;
                }
                default -> System.out.println("Opción inválida. Selecciona otra opción\n");
            }
        }
    }
}
