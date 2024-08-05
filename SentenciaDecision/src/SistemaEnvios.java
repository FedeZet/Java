import java.util.Scanner;

public class SistemaEnvios {
    public static void main(String[] args) {
        // Reto - Sistema de Envíos
        System.out.println("*** Sistema de Envíos ***");

        final var TARIFA_NACIONAL = 10;
        final var TARIFA_INTERNACIONAL = 20;

        var consola = new Scanner(System.in);
        System.out.print("Ingresa el destino del paquete (nacional/internacional): ");
        var paqueteDestino = consola.nextLine().strip().toLowerCase(); // Elimina cualquier espacio y convierte a minúsculas
        System.out.print("Ingresa el peso del paquete (en kg): ");
        var paquetePeso = Double.parseDouble(consola.nextLine());

        // Solución con ifelse
        /*
        var costoTotal = 0.0;
        if(paqueteDestino.equals("nacional")) {
            costoTotal = TARIFA_NACIONAL * paquetePeso;
        } else if (paqueteDestino.equals("internacional")) {
            costoTotal = TARIFA_INTERNACIONAL * paquetePeso;
        }

        if (costoTotal != 0.0) {
            System.out.printf("El costo de envío del paquete es: $%.2f", costoTotal);
        } else {
            System.out.println("Destino inválido. Ingresa nacional/internacional");
        }

         */

        // Solución con switch
        Double costoTotal = switch (paqueteDestino) {
            case "nacional" -> TARIFA_NACIONAL * paquetePeso;
            case "internacional" -> TARIFA_INTERNACIONAL * paquetePeso;
            default -> {
                System.out.println("Destino inválido. Ingresa nacional/internacional");
                yield null; // Esto devuelve null a la variable costoTotal
            }
        };

        if(costoTotal != null)
            System.out.printf("El costo de envío del paquete es: $%.2f", costoTotal);
    }
}
