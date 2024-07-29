public class Variables {
    public static void main(String[] args) {
        // Variables
        int edad = 31; // El tipo int sirve para números enteros
        double precio = 300.40; // El tipo de variable double sirve para números decimales
        boolean disponible = true; // Solamente se puede asignar estos valores: true/false
        char genero; // Declarar variable
        genero = 'M'; // Asignar variable | M = Masculino / F = Femenino
        // a una variable char solo se le puede asignar un carácter

        // Acceder a la variable
        System.out.println(edad);

        // Modificar el valor
        edad = 35; // Se sobreescribe el valor de la variable a 35
        System.out.println(edad);

        // Imprimir el resto de las variables
        System.out.println(precio);
        System.out.println(disponible);
        System.out.println(genero);
    }
}
