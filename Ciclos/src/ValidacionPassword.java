import java.util.Scanner;

public class ValidacionPassword {
    public static void main(String[] args) {
        System.out.println("*** Validación de Password ***");

        var consola = new Scanner(System.in);

        System.out.print("Ingresa un password (de al menos 6 caracteres): ");
        var password = consola.nextLine();

        while (password.length() < 6) {
            System.out.println("El password no cumple con los requisitos. " +
                    "Debe tener al menos 6 caracteres");

            System.out.print("Ingresa un nuevo valor de password: ");
            password = consola.nextLine();
        }
        System.out.println("El valor de password es válido: " + password);
    }
}
