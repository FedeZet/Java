public class ForEach {
    public static void main(String[] args) {
        int edades[] = {5, 10, 30, 45};

        // For Each (Recorrido de cada elemento)
        // Ya no tenemos acceso al índice
        // edad es la referencia al valor de edades[]
        for(int edad : edades) {
            System.out.println("edad = " + edad);
        }
    }
}
