public class OperadoresUnarios {
    public static void main(String[] args) {
        System.out.println("*** Operadores Unarios ***");
        int a = 3, b = -2, resultado;
        var c = true;

        // Operador unario + (positivo) [opcional]
        resultado = +a; // 3
        System.out.println("resultado = " + resultado);

        // Operador unario - (negativo)
        resultado = -a; // -3
        System.out.println("resultado = " + resultado);

        // Operadores unarios incremento/decremento
        // Pre-incremento
        a = 3;
        resultado = ++a; // Primero se incrementa el valor y después se usa la variable
        System.out.println("resultado ++a = " + resultado);
        System.out.println("a ya se incremento = " + a);
        // Post-incremento
        a = 3;
        resultado = a++; // Primero se usa la variable y después se incrementa
        System.out.println("resultado a++ = " + resultado); // 3
        System.out.println("a en este momento se incrementa = " + a); // 4

        // Pre-decremento
        resultado = --b; // Primero se decrementa el valor y después se usa la variable
        System.out.println("resultado --b = " + resultado); // -3
        System.out.println("b ya se decremento = " + b); // -3

        // Post-decremento
        b = -2;
        resultado = b--; // Primero se usa la variable y después se decrementa
        System.out.println("resultado b-- = " + resultado); // -2
        System.out.println("b en este momento se decrementa = " + b); // -3

    }
}
