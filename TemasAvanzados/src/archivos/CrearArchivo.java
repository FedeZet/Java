package archivos;

import java.io.File; // io: input - output
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CrearArchivo {
    public static void main(String[] args) {
        var nombreArchivo = "mi_archivo.txt";
        var archivo = new File(nombreArchivo);

        try {
            if (archivo.exists()) {
                System.out.println("El archivo, ya existe");
            } else {
                // Creamos el archivo
                var salida = new PrintWriter(new FileWriter(archivo));
                salida.close(); // Este método es importante para que se guarde el archivo en el disco duro
                System.out.println("Se ha creado el archivo en nuestro disco duro");
            }
        } catch(IOException e) {
            System.out.println("Ocurrió un error al crear un archivo: " + e.getMessage());
            e.getStackTrace();
        }
    }
}
