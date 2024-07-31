import java.util.Random;
import java.util.Scanner;

public class GeneradorIDUnico {
    public static void main(String[] args) {
        // Reto - Crear un sistema para generar un ID único
        System.out.println("*** Sistema Generador de ID Único ***");

        // Obtener datos por consola
        var consola = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        var nombre = consola.nextLine();
        System.out.print("Ingresa tu apellido: ");
        var apellido = consola.nextLine();
        System.out.print("Ingresa tu año de nacimiento (YYYY): ");
        var anioNacimiento = consola.nextLine();

        // Obtener los dos primeros caracteres del nombre y convertirlos a mayúsculas
        var nombreID = nombre.toUpperCase().substring(0,2);
        // Obtener los dos primeros caracteres del apellido y convertirlos a mayúsculas
        var apellidoID = apellido.toUpperCase().substring(0,2);
        // Obtener los dos últimos caracteres del año de nacimiento
        var anioNacimientoID = anioNacimiento.substring(2,4);

        // Generar un número aleatorio entre 1 y 9999
        var random = new Random();
        var numeroID = random.nextInt(9999) + 1;

        System.out.printf("""
                %nHola %s,
                \tTu nuevo número de identificación (ID) generado por el sistema es:
                \t%s%s%s%04d
                \tFelicidades!
                """, nombre, nombreID, apellidoID, anioNacimientoID, numeroID);
    }
}
