public class FuncionSumar {
    // Definir la función de sumar
    static int sumar(int a, int b) {
        var resultado = a + b; // Esta variable es local a la función
        return resultado;
        // Return: Retorna el valor. Debe coincidir con
        // el tipo de dato que devuelve la función
    }

    public static void main(String[] args) {
        int arg1 = 3, arg2 =8;

        var resultado_funcion = sumar(arg1, arg2);
        System.out.println("resultado_funcion = " + resultado_funcion);

        resultado_funcion = sumar(10, 20);
        System.out.println("resultado_funcion = " + resultado_funcion);

    }
}
