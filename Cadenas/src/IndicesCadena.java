public class IndicesCadena {
    public static void main(String[] args) {
        // Manejo de índices en una cadena
        var cadena1 = "Hola Mundo";

        // La secuencia de índices empieza en 0 y
        // termina en n-1 (n: total de carácteres en la cadena)

        // Recuperar el primer carácter de la cadena
        var primerCaracter = cadena1.charAt(0);
        System.out.println("primerCaracter = " + primerCaracter); // Recuperar el carácter H

        // Recuperar el último carácter de la cadena (en la posición 9)
        var ultimoCaracter = cadena1.charAt(9);
        System.out.println("ultimoCaracter = " + ultimoCaracter);

        // Ejercicio: Imprimir la letra "M" de la cadena
        var letraM = cadena1.charAt(5);
        System.out.println("letraM = " + letraM);
    }
}
