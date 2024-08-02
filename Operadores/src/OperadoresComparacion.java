public class OperadoresComparacion {
    public static void main(String[] args) {
        System.out.println("*** Operadores de Comparación/Relacionales ***");

        int a = 3, b = 2;

        // Igualdad ==
        var resultado = a == b; // Se puede agregar paréntesis (a == b), en este caso no es necesario
        System.out.println("resultado a == b = " + resultado); // true
        // Distinto !=
        resultado = a != b;
        System.out.println("resultado a != b = " + resultado); // false
        // Mayor que >
        resultado = a > b;
        System.out.println("resultado a > b = " + resultado); // true
        // Mayor o igual que >=
        resultado = a >= b;
        System.out.println("resultado a >= b = " + resultado); // true
        // Menor que <
        resultado = a < b;
        System.out.println("resultado a < b = " + resultado); // false, si fueran iguales seria true
        // Menor o igual que <=
        resultado = a <= b;
        System.out.println("resultado a <= b = " + resultado); // false, si fueran iguales seria true
    }
}
