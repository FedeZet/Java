package excepciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        try {
            var resultado = Aritmetica.division(10, 2);
            System.out.println("resultado = " + resultado);
        } catch (Exception e) { // Solo se ejecuta cuando hay un error
            System.out.println("Ocurrió un error: " + e);
        }
        finally { // Opcional, siempre se ejecuta aunque haya un error o no
            System.out.println("Se reviso la división entre cero");
        }
    }
}
