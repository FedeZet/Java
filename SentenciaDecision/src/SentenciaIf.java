public class SentenciaIf {
    public static void main(String[] args) {
        // Uso de la sentencia if
        var edad = 10;

        if(edad >= 18) {
            // Bloque de código a ejecutar
            // si la condición1 == true
            System.out.println("Eres mayor de edad");
        } else if (edad >= 13 && edad <= 17) {
            // Bloque de código a ejecutar
            // si la condición2 == true
            System.out.println("Eres un adolescente");
        } else {
            // Bloque de código a ejecutar
            // si la condición == false
            System.out.println("Eres un niño");
        }
    }
}
