public class Funciones {

    // Las funciones se conocen como métodos.
    // Un método es un bloque de código que realiza una tarea
    // específica y se puede llamar desde otras partes del programa.
    // Los métodos permiten reutilizar el código y organizarlo de manera más estructurada.

    // La estructura básica de un método en Java incluye:
    // 1. Modificadores de acceso:
    // Indican quién puede acceder al método (por ejemplo, "public", "private", "protected").
    // 2. "static": Indica que el método pertenece a la clase y no a instancias individuales.
    // 3. Tipo de retorno: Indica el tipo de dato que devolverá el método.
    // Si no devuelve ningún valor, se utiliza "void".
    // 4. Nombre del método:
    // Debería ser descriptivo y seguir las convenciones de nomenclatura de Java.
    // 5. Parámetros: Opcionalmente, se pueden definir parámetros que el método acepta,
    // especificando sus tipos y nombres.
    // 6. Cuerpo del método: Contiene el código que define lo que hace el método.

    // Creando la función
    static void saludar(String mensaje) {
        // Cuerpo de la función
        System.out.println("Mensaje: " + mensaje);
    }

    public static void main(String[] args) {
        // Llamar a la función.
        // Dato: Al llamar a una función, donde van
        // los parámetros se les considera argumentos.
        // Parámetros: Es la información que recibe la función
        // Argumento: Es la información que se envía desde la llamada de la función
        saludar("Hola desde Java");
        saludar("Adiós");
    }
}
