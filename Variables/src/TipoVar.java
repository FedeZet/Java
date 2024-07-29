public class TipoVar {
    public static void main(String[] args) {
        System.out.println("*** Uso de var en Java ***");

        // Sin el uso de var
        String nombre1 = "Juan";
        System.out.println("nombre1 = " + nombre1);

        // Con el uso de var
        var nombre2 = "Carlos"; // Se infiere el tipo String
        System.out.println("nombre2 = " + nombre2);

        // Definir otras variables usando var
        var edad = 30; // Se infiere el tipo int
        System.out.println("edad = " + edad);
        var sueldo = 5000.5F; // Se infiere el tipo float
        System.out.println("sueldo = " + sueldo);
        var esCasado = false; // Se infiere el tipo boolean
        System.out.println("esCasado = " + esCasado);
        esCasado = true;
        System.out.println("esCasado = " + esCasado);
        // esCasado = "No"; Salta error al querer inferir un tipo distinto al que se inicializo

        // Se debe definir un valor
        // var precio; Error: Debemos asignar un valor desde la inicialización

        // Se debe inferir el tipo de dato
        // var apellido = null; Se debe inferir un tipo de dato válido (String, int, boolean, etc.)


    }
}
