public class InmutabilidadCadenas {
    public static void main(String[] args) {
        // Inmutabilidad de Cadenas

        // Los String en Java son inmutables, lo que significa que no
        // pueden ser modificados una vez creados.
        // Cada vez que reasignamos una variable String, en vez de eliminarse
        // en memoria el dato, se cambia la referencia en la variable. Hasta
        // que el recolector de basura de Java elimine el dato en memoria heap.

        var cadena1 = "Hola";
        System.out.println("cadena1 = " + cadena1);

        var cadena2 = cadena1;
        cadena1 = "Adios";

        System.out.println("cadena1 modificado = " + cadena1); // Adios
        System.out.println("cadena2 = " + cadena2); // Hola
    }
}
