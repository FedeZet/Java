import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        // Reto - Sistema de autenticación
        System.out.println("*** Sistema de Autenticación ***");

        final var USUARIO_SISTEMA = "admin";
        final var PASSWORD_SISTEMA = "1234";

        // Pedir datos al usuario
        var consola = new Scanner(System.in);
        System.out.print("Ingresa el usuario: ");
        var usuario = consola.nextLine().strip();
        System.out.print("Ingresa la contraseña: ");
        var password = consola.nextLine().strip();

        // Verificar usuario y contraseña
        // Solución con ifelse
        /*
        if(USUARIO_SISTEMA.equals(usuario) && PASSWORD_SISTEMA.equals(password)) {
            System.out.println("Bienvenido al Sistema!");
        } else if (!(USUARIO_SISTEMA.equals(usuario)) && PASSWORD_SISTEMA.equals(password)) {
            System.out.println("Usuario incorrecta, favor de corregirlo!");
        } else if (USUARIO_SISTEMA.equals(usuario) && !(PASSWORD_SISTEMA.equals(password))) {
            System.out.println("Contraseña incorrecto, favor de corregirlo!");
        } else {
            System.out.println("Usuario y contraseña incorrectos, favor de corregirlos!");
        }
        */

        // Solución con switch
        var mensajeAutenticacion = switch (usuario) {
            case USUARIO_SISTEMA -> {
                if (PASSWORD_SISTEMA.equals(password))
                    yield "Bienvenido al Sistema!";
                else
                    yield "Contraseña incorrecta, favor de corregirlo!";
            }
            default -> {
                if (PASSWORD_SISTEMA.equals(password)) {
                    yield "Usuario incorrecto, favor de corregirlo!";
                } else {
                    yield "Usuario y contraseña incorrectos, favor de corregirlo!";
                }
            }
        };

        System.out.println(mensajeAutenticacion);
    }
}
