import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        // Reto - Sistema de Autenticación
        System.out.println("*** Sistema de Autenticación ***");
        var consola = new Scanner(System.in);

        final var USUARIO_VALIDO = "admin";
        final var PASSWORD_VALIDO = "1234";

        System.out.print("Ingresa el usuario: ");
        var usuarioIngresado = consola.nextLine();
        System.out.print("Ingresa la contraseña: ");
        var passwordIngresado = consola.nextLine();

        var sonDatosCorrectos =
                usuarioIngresado.equals(USUARIO_VALIDO) && passwordIngresado.equals(PASSWORD_VALIDO);
        System.out.println("Datos son correctos?: " + sonDatosCorrectos);
    }
}
