import java.util.HashMap;
import java.util.Map;

public class Mapas {
    public static void main(String[] args) {
        Map<String, String> persona = new HashMap<>();

        persona.put("nombre", "Diego");
        persona.put("apellido", "Flores");
        persona.put("edad", "31");
        persona.put("edad", "31"); // No se permiten duplicados por el entrySet()

        System.out.println("Valores/Diccionario del mapa:");
        persona.entrySet().forEach(System.out::println);

        persona.put("edad", "35"); // Modificar el valor de la llave existente
        persona.remove("apellido"); // Eliminando la llave
        System.out.println("\nNuevos valores/diccionarios del mapa:");
        persona.entrySet().forEach(System.out::println);

        // Iterar sobre los elementos del mapa por separado
        System.out.println("\nIterando los elementos (llave, valor):");
        persona.forEach((llave, valor) -> System.out.println("Llave: " + llave + ", Valor: " + valor));
    }
}
