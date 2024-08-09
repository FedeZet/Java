package animales;

// Herencia

// Clase Padre (Superclase)
public class Animal {
    // protected: No se puede llamar desde otras clases (otros paquetes). Solamente en la misma clase
    protected void comer() {
        System.out.println("Como muchas veces al día");
    }

    protected void dormir() {
        System.out.println("Duermo muchas horas");
    }

    protected void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

// Clase Hija (subclase) que extiende de la clase padre Animal
class Perro extends Animal {
    // Sobrescritura. Se debe utilizar la misma firma para poder sobreescribir un método
    @Override // Anotación que significa que se está sobrescribiendo un método
    protected void dormir() {
        System.out.println("Duermo 15 horas al día");
        System.out.println("Método de la clase Padre: ");
        super.dormir(); // Acceder al método de la clase Padre
    }

    @Override
    protected void hacerSonido() {
        System.out.println("El perro hace wuaf");
    }
}

class Gato extends Animal {
    @Override
    protected void hacerSonido() {
        System.out.println("El gato hace miaw");
    }
}

class PruebaAnimal {

    // Método Polimorfico
    static void imprimirSonido(Animal animal) {
        animal.hacerSonido();
    }

    public static void main(String[] args) {
        System.out.println("*** Ejemplo de Herencia ***");

        System.out.println("Clase Padre, soy un Animal");
        var animal1 = new Animal();
        animal1.comer();
        animal1.dormir();
        // animal1.hacerSonido(); Error: Esta clase no ha sido definido en la clase padre, solo en la clase hija

        System.out.println("\nClase Hija, soy un Perro");
        var perro1 = new Perro();
        perro1.comer();
        perro1.dormir(); // Método dormir() sobreescrito en la clase Perro
        perro1.hacerSonido();

        System.out.println("\n*** Polimorfismo ***");
        // var animal = new Animal();
        // var animal = new Perro();
        var animal = new Gato();
        imprimirSonido(animal);
    }
}