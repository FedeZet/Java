import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanzas {
    public static void main(String[] args) {
        // Reto - Juego de adivinanzas
        System.out.println("*** Juego de Adivinanzas ***");

        var consola = new Scanner(System.in);
        var random = new Random();

        // Variables
        final var NUMERO_SECRETO = random.nextInt(50) + 1;
        final var INTENTOS_MAXIMOS = 5;
        var intentos = 0;
        var adivinanza = 0;

        while (NUMERO_SECRETO != adivinanza && intentos < INTENTOS_MAXIMOS) {
            System.out.print("Adivina el número secreto (1-50): ");
            adivinanza = consola.nextInt();

            // Agregar una ayuda para orientar al jugador
            if (adivinanza < NUMERO_SECRETO)
                System.out.println("El número secreto es mayor");
            else if (adivinanza > NUMERO_SECRETO)
                System.out.println("El número secreto es menor");

            // Incrementamos la variable de intentos
            intentos++;
        }

        if (adivinanza == NUMERO_SECRETO) {
            System.out.printf("""
                %nFelicidades!, el número secreto era: %d
                Tus intentos fueron: %d
                """, NUMERO_SECRETO, intentos);
        } else {
            System.out.printf("""
                    %nLo siento!, has agotado tus intentos máximos: %d
                    El número secreto era: %d%n
                    """, INTENTOS_MAXIMOS, NUMERO_SECRETO);
        }
    }
}
