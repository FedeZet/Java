package archivos;

import java.nio.file.Files; // nio: New Input-Output
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.List;

public class LeerTodo {
    public static void main(String[] args) {
        var nombreArchivo = "mi_archivo.txt";
        try {
            // Leer todas las líneas del archivo (nueva manera)
            List<String> lineas = Files.readAllLines(Paths.get(nombreArchivo));
            System.out.println("Contenido del archivo:");
//            for(String linea : lineas) {
//                System.out.println(linea);
//            }
            // Lambda
            lineas.forEach(System.out::println);
        } catch(Exception e) {
            System.out.println("Error al leer todo el archivo: " + e);
            e.getStackTrace();
        }
    }
}
