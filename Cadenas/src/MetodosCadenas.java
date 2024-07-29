public class MetodosCadenas {
    public static void main(String[] args) {
        // Métodos de cadenas
        var cadena1 = "Hola Mundo";

        // Obtener la longitud de la cadena
        var longitud = cadena1.length();
        System.out.println("longitud = " + longitud); // 10

        // Reemplazar caracteres
        var nuevaCadena = cadena1.replace('o', 'a');
        System.out.println("nuevaCadena = " + nuevaCadena); // Hala Munda

        // Convertir a mayúsculas
        var mayusculas = cadena1.toUpperCase();
        System.out.println("mayusculas = " + mayusculas); // HOLA MUNDO

        // Convertir a minúsculas
        System.out.println("minusculas = " + cadena1.toLowerCase()); // hola mundo

        // Eliminar espacios al inicio y al final de una cadena
        var cadena2 = " Leo Reyes ";
        System.out.println("cadena2 con espacios = " + cadena2); // " Leo Reyes "
        System.out.println("cadena2 sin espacios = " + cadena2.trim()); // "Leo Reyes"
    }
}
