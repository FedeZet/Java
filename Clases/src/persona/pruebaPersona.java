package persona;

public class pruebaPersona {
    public static void main(String[] args) {
        System.out.println("*** Creación de Clase y Objetos de tipo Persona ***");

        System.out.println("Variable estática: " + Persona.getContadorPersonas());

        System.out.println(); // Salto de línea

        // Primer objeto
        var objeto1 = new Persona("Layla", "Acosta"); // Reserva espacio en memoria del tipo de la clase Persona
        objeto1.mostrarPersona(); // Llamamos al método

        System.out.println("Variable estática: " + Persona.getContadorPersonas());
        System.out.println(); // Salto de línea

        // Segundo objeto
        var objeto2 = new Persona("Ian", "Gomez"); // Instanciar la clase
        objeto2.mostrarPersona();

        System.out.println("Variable estática: " + objeto2.getContadorPersonas());
        // Esto NO es buena práctica, se debe llamar al método estático desde la clase y no desde el objeto

        System.out.println("\n*** Método toString() ***");
        // Utilizando el método sobreescrito toString() de la clase Object
        // System.out.println(objeto1.toString());
        System.out.println(objeto1); // Automáticamente, se llama al método toString()
        System.out.println(objeto2);
    }
}
