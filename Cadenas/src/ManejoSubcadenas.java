public class ManejoSubcadenas {
    public static void main(String[] args) {
        // Tema de subcadenas

        // substring(inicio, fin+1 (opcional))

        var cadena1 = "Hola Mundo";
        System.out.println("cadena1 = " + cadena1);

        // Subcadena de Hola
        var subcadena1 = cadena1.substring(0, 4);
        System.out.println("subcadena1 = " + subcadena1); // Hola

        // Subcadena de Mundo
        // var subcadena2 = cadena1.substring(5, 10);
        var subcadena2 = cadena1.substring(5);
        System.out.println("subcadena2 = " + subcadena2); // Mundo
    }
}
