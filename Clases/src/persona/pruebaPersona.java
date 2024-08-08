package persona;

public class pruebaPersona {
    public static void main(String[] args) {
        System.out.println("*** Creación de Clase y Objetos de tipo Persona ***");

        // Primer objeto
        var objeto1 = new Persona("Layla", "Acosta"); // Reserva espacio en memoria del tipo de la clase Persona
        objeto1.mostrarPersona(); // Llamamos al método

        System.out.println(); // Salto de línea

        // Segundo objeto
        var objeto2 = new Persona("Ian", "Gomez"); // Instanciar la clase
        objeto2.mostrarPersona();
    }
}
