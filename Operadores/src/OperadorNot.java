public class OperadorNot {
    public static void main(String[] args) {
        System.out.println("*** Operador Not ***");
        boolean a = false, b = true;
        // Not (!): Invierte el valor lógico
        var resultado = !a;
        System.out.println("resultado !a = " + resultado); // true
        resultado = !b;
        System.out.println("resultado !b = " + resultado); // false
    }
}
