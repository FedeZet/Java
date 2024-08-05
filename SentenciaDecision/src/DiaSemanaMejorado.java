public class DiaSemanaMejorado {
    public static void main(String[] args) {
        System.out.println("*** Día de la Semana con Sentencia Switch Mejorada ***");

        var dia = 2; // Suponiendo que 1 es lunes, 2 martes, 3 miércoles, etc.

        switch (dia) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miércoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Día inválido " + dia);
        }
    }
}
