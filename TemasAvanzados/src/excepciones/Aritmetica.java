package excepciones;

public class Aritmetica {
    // Manejo de excepción en tiempo de ejecución
//    public static int division(int numerador, int denominador) {
//        if(denominador == 0)
//            throw new RuntimeException("División entre Cero");
//        return numerador / denominador;
//    }

    // Manejo de excepción en tiempo de compilación
    public static int division(int numerador, int denominador) throws Exception {
        if(denominador == 0)
            throw new Exception("División entre Cero");
        return numerador / denominador;
    }
}
