import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miércoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sábado");
        miLista.add("Domingo");
//        miLista.add("Domingo"); // Permite elementos duplicados
//        miLista.add(123123); // Al utilizar los <> se especifica el tipo de dato a utilizar

        for(String elemento : miLista) {
            System.out.println("Día de la semana: " + elemento);
        }

        // Funciones Lambda (función anónima de un código muy compacto) - Programación funcional
        miLista.forEach(elemento -> {
            System.out.println("Elemento: " + elemento);
        });

        // Método de referencia
        miLista.forEach(System.out::println);

        List<String> nombres = Arrays.asList("Pedro", "Ivonne", "Nohemi");
        System.out.println("\nLista de Nombres:");
        nombres.forEach(System.out::println);
    }
}
