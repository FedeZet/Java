package aritmetica;

public class PruebaAritmetica {
    public static void main(String[] args) {
        System.out.println("*** Ejemplo Aritmética ***");

        // Creando el primer objeto
        var aritmetica1 = new Aritmetica(5, 7); // Llamar método constructor de la clase
        // aritmetica1.operando1 = 5;
        // aritmetica1.operando2 = 7;
        // Obteniendo los valores obteniendo el método Getter
        System.out.println("Atributo operando1: " + aritmetica1.getOperando1());
        // Modificando los valores con el método Setter
        aritmetica1.setOperando1(10);
        aritmetica1.setOperando2(15);
        aritmetica1.sumar();
        aritmetica1.restar();
        System.out.println("Dir. Mem. obj1: " + aritmetica1);

        System.out.println(); // Salto de línea

        /*
        // Creamos el segundo objeto. Con el constructor vacío
        var aritmetica2 = new Aritmetica(); // Llamando al constructor vacío de la clase
        aritmetica2.operando1 = 12;
        aritmetica2.operando2 = 16;
        aritmetica2.sumar();
        aritmetica2.restar();

        System.out.println(); // Salto de línea

        // Modificar los valores
        aritmetica2.operando1 = 10;
        aritmetica2.operando2 = 15;
        aritmetica2.sumar();
        aritmetica2.restar();

        System.out.println(); // Salto de línea

         */

        // Creamos el tercer objeto.
        var aritmetica3 = new Aritmetica(12, 16);
        aritmetica3.sumar();
        System.out.println("Dir. Mem. obj3: " + aritmetica3);
    }
}
