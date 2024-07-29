public class ReglasNombresVariables {
    public static void main(String[] args) {
        // Reglas de nombres de variables
        // Aplicar la notación de camelCase
        String nombreCompleto = "Juan Carlos"; // Correcto y buenas prácticas
        System.out.println("nombreCompleto = " + nombreCompleto);

        // Aplicar la notación de PascalCase (esta sirve para nombre de clases como
        // la clase String, pero NO para variables)
        String NombreCompleto = "Juan Carlos 2"; // Es otra variable y no aplica buenas prácticas
        System.out.println("NombreCompleto = " + NombreCompleto);

        // String nombre-completo = "Juan" // Incorrecto

        String nombre_completo = "Juan"; // Correcto, pero no aplica buenas prácticas
        System.out.println("nombre_completo = " + nombre_completo);

        String _apellido = "Perez"; // Correcto y aceptable
        System.out.println("_apellido = " + _apellido);
        String $apellido = "Juarez"; // Correcto y aceptable
        System.out.println("$apellido = " + $apellido);

        int totPzs = 10; // Correcto, pero no aplica buenas prácticas. No es bueno abreviar
        int totalPiezas = 10; // Correcto y aplica buenas prácticas
        boolean casado = true; // Correcto, pero puede mejorar
        boolean esCasado = true; // Correcto y aplica buenas prácticas
        boolean isCasado = true; // Correcto y aplica buenas prácticas (Recomendado)
        boolean tieneSaldo = true; // Correcto y aplica buenas prácticas
        boolean hasSaldo = true; // Correcto y aplica buenas prácticas (Recomendado)

    }
}
