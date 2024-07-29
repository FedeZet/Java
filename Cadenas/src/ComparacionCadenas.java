public class ComparacionCadenas {
    public static void main(String[] args) {
        // Comparación de Cadenas (pool de String)

        // El pool de strings en Java es una zona de memoria que almacena literales de String.
        // Si un String literal ya existe en el pool, se reutiliza en lugar de crear un
        // nuevo objeto, ahorrando memoria y mejorando el rendimiento.

        var cadena1 = "Java";
        var cadena2 = "Java";
        var cadena3 = new String("Java"); // Se crea un nuevo objeto en memoria

        // Comparación de cadenas (==), comparan la referencia en memoria
        System.out.print("cadena1 es igual en referencia a cadena2: ");
        System.out.println(cadena1 == cadena2); // true

        // Comparación de cadena1 con cadena3 (referencia)
        System.out.print("cadena1 es igual en referencia a cadena3: ");
        System.out.println(cadena1 == cadena3); // false

        // Comparar contenido usaremos el método equals.
        // Este es el método correcto para comparar datos en String
        System.out.print("cadena1 es igual en contenido a cadena3: ");
        System.out.println(cadena1.equals(cadena3)); // true
    }
}
