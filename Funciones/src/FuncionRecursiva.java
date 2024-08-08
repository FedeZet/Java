public class FuncionRecursiva {
    // Imprimir 1 al 5 usando función recursiva
    static void funcionRecursiva(int numero) {
        // Caso base
        if(numero == 1)
            System.out.print(numero + " ");
        else {
            // Caso recursivo
            // System.out.print(numero + " "); Descendente
            funcionRecursiva(numero - 1);
            System.out.print(numero + " "); // Ascendente
        }
    }

    public static void main(String[] args) {
        funcionRecursiva(5);
    }
}
