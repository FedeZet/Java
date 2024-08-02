public class PrecedenciaOperadores {
    public static void main(String[] args) {
        // Precedencia de Operadores en Java:
        // 1. Paréntesis y Corchetes
        // 2. Operadores unarios -, ++, --
        // 3. Operadores aritméticos *, / y %
        // 4. Operadores aritméticos + y -
        // 5. Relacionales <, <=, >, >=
        // 6. Equivalencia == y !=
        // 7. Lógicos && y ||
        // 8. Asignación =, +=, -=, *=, etc.

        var a = 12 / 3 + 2 * 3 - 1;
        System.out.println("a = " + a);
        // Expresión (de izquierda a derecha)
        // Paso 1. Division 12 / 3 = 4
        // Paso 2. Multiplicación 2 * 3 = 6
        // Paso 3. Suma 4 + 6 = 10
        // Paso 4. Resta 10 - 1 = 9
    }
}
