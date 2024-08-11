public interface Traductor {
    // public y abstract por default
    void traducir();

    // Métodos con implementación por default
    default void iniciarTraductor() {
        System.out.println("Iniciando traductor...");
    }
}

// No es una herencia (extends), es una implementación
class Ingles implements Traductor {
    @Override // Opcional, ya que es una implementación
    public void traducir() {
        System.out.println("Traduzco a inglés");
    }
}

class Frances implements Traductor {
    public void traducir() {
        System.out.println("Traduzco a fránces");
    }

    @Override // Esta si es una sobrescritura
    public void iniciarTraductor() {
        System.out.println("Iniciando traductor al fránces...");
    }
}

class PruebaTraductor {
    public static void main(String[] args) {
        Traductor ingles = new Ingles();
        ingles.iniciarTraductor(); // Se hereda este método
        ingles.traducir();

        // Traductor a fránces
        Traductor frances = new Frances();
        frances.iniciarTraductor();
        frances.traducir();
    }
}