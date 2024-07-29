public class Cadenas {
    public static void main(String[] args) {
        System.out.println("*** Manejo de Cadenas en Java ***");

        var cadena1 = "Hola";
        System.out.println("cadena1 = " + cadena1);
        // Creando un objeto de la clase String (esto no es necesario, pero se puede).
        var cadena2 = new String("Mundo");
        System.out.println("cadena2 = " + cadena2);
        // Concatenación
        var cadena3 = cadena1 + " " + cadena2;
        System.out.println("cadena3 = " + cadena3);
        // Cadena de múltiples líneas (text block)
        var cadena4 = """
                Este es un texto
                multilínea
                más líneas
                """;
        System.out.println("cadena4 = " + cadena4);
    }
}
