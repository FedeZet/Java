package persona;

// Todas las clases de Java heredan de manera directa o indirecta de la clase Object
public class Persona {
    // Reto - Encapsular la clase Persona

    // Atributos
    // Se debe poner el tipo de dato. No se puede usar var
    private static int contadorPersonas = 0; // Atributo estático: No se asocia a los objetos. Solamente a la clase
    private int idPersona;
    private String nombre; // Valor por default null
    private String apellido;

    // Constructor
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        // Asignamos id único con ayuda de la variable estática
        // Incrementar el atributo estático (static)
        this.idPersona = ++Persona.contadorPersonas;
    }

    // Sobreescribimos el método toString() de la clase Object
    @Override
    public String toString() {
        return "Id: " + this.idPersona + ", Nombre: " + this.nombre + ", Apellido: " + this.apellido +
                ", Dir. Mem.: " + super.toString(); // Llamando al método desde la clase Padre (Object)
    }

    // Métodos
    public void mostrarPersona() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public static int getContadorPersonas() {
        return Persona.contadorPersonas;
    }
}
