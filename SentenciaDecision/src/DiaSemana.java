public class DiaSemana {
    public static void main(String[] args) {
        System.out.println("*** Día de la Semana con Sentencia Switch ***");

        var dia = 7; // Suponiendo que 1 es lunes, 2 martes, 3 miércoles, etc.

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Día inválido");
        }
    }
}
