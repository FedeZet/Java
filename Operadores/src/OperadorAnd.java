public class OperadorAnd {
    public static void main(String[] args) {
        System.out.println("*** Operador And***");

        boolean a = true, b = false, c = true;

        // and (&&): Regresa true si ambos valores son true
        var resultado = a && b;
        System.out.println("resultado a && b = " + resultado); // false
        resultado = a && c;
        System.out.println("resultado a && c = " + resultado); // true

    }
}
