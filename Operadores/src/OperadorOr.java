public class OperadorOr {
    public static void main(String[] args) {
        System.out.println("*** Operador Or ***");

        boolean a = true, b = false, c = true, d = false;

        // or (||): Regresa true si cualquiera de los valores es true
        var resultado = a || b; // || carácter pipe
        System.out.println("resultado a || b = " + resultado); // true
        resultado = a || c;
        System.out.println("resultado a || c = " + resultado); // true
        resultado = b || d;
        System.out.println("resultado b || d = " + resultado); // false
    }
}
