public class TiposDatos {
    public static void main(String[] args) {
        // Tipos de datos en Java
        // Enteros (su valor por default es de 0)
        byte tipoByte = 127; // Valor máximo al asignar a un tipo byte: 127
        // byte tipoByte = (byte)128; //
        System.out.println("tipoByte = " + tipoByte); // Atajo soutv para imprimir variables
        short tipoShort = 32000; // Valor máximo al asignar a un tipo short: 32000
        System.out.println("tipoShort = " + tipoShort);
        int tipoInt = 2147483647; // Valor máximo al asignar a un tipo int: 2147483647
        System.out.println("tipoInt = " + tipoInt);
        long tipoLong = 987654312098765432L; // L o l para indicar un tipo long
        System.out.println("tipoLong = " + tipoLong);

        // Punto Flotantes (Valor por default 0.0)
        float tipoFloat = 3.14F; // F o f para indicar un tipo float
        System.out.println("tipoFloat = " + tipoFloat);
        double tipoDouble = 3.1315D; // D o d para indicar un tipo double (opcional)
        System.out.println("tipoDouble = " + tipoDouble);

        // Caracteres (Valor por default 'u\0000')
        char tipoChar = 'A'; // Caracteres del juego unicode https://symbl.cc/es/unicode-table
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 65;
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = '@';
        System.out.println("tipoChar = " + tipoChar);

        // Booleano (Valor por default false)
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);
        tipoBoolean = false;
        System.out.println("tipoBoolean = " + tipoBoolean);

        // Object (Referencia)
        String nombre = null; // Valor por default
        System.out.println("nombre = " + nombre);
        nombre = "Juan Perez";
        System.out.println("nombre = " + nombre);
    }
}
