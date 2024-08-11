public class ArgumentosVaraibles {
    public static void main(String[] args) {
        // imprimirNumeros(1, 2, 3, 4, 5, 6, 7); // Variables Arguments (VarArgs)
        variosParametros("Karla", 10, 20, 30); // Los VarArgs deben ir como últimos argumentos
    }

    private static void variosParametros(String nombre, int... numeros) {
        System.out.println("Nombre: " + nombre);
        imprimirNumeros(numeros);
    }

    private static void imprimirNumeros(int... numeros) { // De manera interna esto se convierte en arreglo
        for(var i = 0; i < numeros.length; i++)
            System.out.print(numeros[i] + " ");
    }
}
