public class OperadorTernario {
    public static void main(String[] args) {
        System.out.println("*** Operador Ternario ***");

        // Sintaxis
        // condición ? exp1 (true): exp2 (false)

        // Determinar si un número es par o no
        var numero = 4;
        var resultado = (numero % 2 == 0) ? "par" : "impar";
        System.out.println("El número " + numero + " es " + resultado);

        // Calcular si es mayor de edad
        var edad = 18;
        var esMayorEdad = (edad >= 18) ? "eres mayor de edad" : "no eres mayor de edad";
        System.out.println("\nTienes " + edad + ", " + esMayorEdad);

        // Valor positivo, negativo o cero (operador ternario anidado)
        numero = 0;
        resultado = (numero > 0) ? "positivo" : (numero < 0) ? "negativo" : "cero";
        System.out.println("\nEl número " + numero + " es " + resultado);
    }
}
