public class Constantes {
    public static void main(String[] args) {
        System.out.println("*** Constantes en Java ***");

        final var DIAS_SEMANA = 7;
        System.out.println("DIAS_SEMANA = " + DIAS_SEMANA);
        // DIAS_SEMANA = 8; Error: No se le puede reasignar un dato a una variable final

        final var PI = 3.1416;
        System.out.println("PI = " + PI);
        System.out.println("Math.PI = " + Math.PI);

        final var MENSAJE_BIENVENIDA = "Bienvenido/a a la Universidad Java";
        System.out.println("MENSAJE_BIENVENIDA = " + MENSAJE_BIENVENIDA);

        final var MINUTOS_POR_SEGUNDO = 60;
        System.out.println("MINUTOS_POR_SEGUNDO = " + MINUTOS_POR_SEGUNDO);

        // La nomenclatura de las variables final son en mayúsculas separadas por un _ (guion bajo)
    }
}
