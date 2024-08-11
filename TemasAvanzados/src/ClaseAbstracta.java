public class ClaseAbstracta {
    public static void main(String[] args) {
        // FiguraGeometrica figuraGeometrica = new FiguraGeometrica(); // No se puede instanciar
        FiguraGeometrica figuraGeometrica = new Rectangulo();
        figuraGeometrica.dibujar();
        figuraGeometrica = new Circulo();
        figuraGeometrica.dibujar();
    }
}


// Clase abstracta
abstract class FiguraGeometrica { // No se puede instanciar (no se pueden crear objectos)
    public abstract void dibujar();
}

class Rectangulo extends FiguraGeometrica {
    // Implementación, no necesita la etiqueta Override ya que se implementa y no se sobreescribe
    public void dibujar() {
        System.out.println("Se dibuja un rectángulo");
    }
}

class Circulo extends FiguraGeometrica {
    public void dibujar() {
        System.out.println("Se dibuja un círculo");
    }
}