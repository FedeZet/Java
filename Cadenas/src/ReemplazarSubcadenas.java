public class ReemplazarSubcadenas {
    public static void main(String[] args) {
        // Reemplazar subcadena
        var cadena = "Hola Mundo";
        System.out.println("cadena = " + cadena);

        // Reemplazar "Mundo" por "a todos"
        var nuevaCadena = cadena.replace("Mundo", "a todos");
        System.out.println("nuevaCadena = " + nuevaCadena);

        // Reemplazar la subcadena "Hola" a "Adiós"
        nuevaCadena = cadena.replace("Hola", "Adiós");
        System.out.println("nuevaCadena = " + nuevaCadena);
    }
}
