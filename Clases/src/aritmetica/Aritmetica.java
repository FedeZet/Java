package aritmetica;

public class Aritmetica {
    // Encapsulamiento: Es recomendado utilizar private en los atributos
    private int operando1; // Valor por default = 0
    private int operando2;

    // Sobrecarga de constructores: Tener más de un constructor
    // Constructor vacío: No recomendable
    public Aritmetica() {

    }

    // Método Constructor. Debe nombrarse como la clase
    // No regresa ningún tipo de dato
    // Java lo crea automáticamente, si lo creamos es para agregar más propiedades
    // Manera correcta de utilizar el constructor
    public Aritmetica(int operando1, int operando2) {
        // Cuando se crea un objeto, lo que está
        // dentro del cuerpo del constructor se ejecuta
        System.out.println("Ejecutando constructor");
        this.operando1 = operando1; // Inicializar desde el constructor
        this.operando2 = operando2; // This: Hace referencia a los atributos y métodos de la clase
        System.out.println("Dir. Mem. operador this: " + this); // Apunta al objeto creado
    }

    public void sumar() {
        var resultado = this.operando1 + this.operando2; // This es opcional, pero es una buena práctica
        System.out.println("El resultado de la suma: " + resultado);
    }

    public void restar() {
        var resultado = this.operando1 - this.operando2;
        System.out.println("El resultado de la resta: " + resultado);
    }

    // Getter y Setter de operando1
    public int getOperando1() {
        return this.operando1;
    }
    public void setOperando1(int operando1) {
        this.operando1 = operando1;
    }

    // Getter y Setter de operando2
    public int getOperando2() {
        return this.operando2;
    }
    public void setOperando2(int operando2) {
        this.operando2 = operando2;
    }
}
