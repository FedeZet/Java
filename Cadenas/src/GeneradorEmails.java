public class GeneradorEmails {
    public static void main(String[] args) {
        System.out.println("*** Reto: Generador de Emails ***");

        var nombre = "Federico Coelho";
        var empresa = "FedeZet";
        var dominio = "dev";

        // Imprimimos los datos
        System.out.println("nombre = " + nombre);
        System.out.println("empresa = " + empresa);
        System.out.println("dominio = " + dominio);

        // Convertir el nombre a minúsculas y reemplazar los espacios por . (puntos)
        var nombreEmail = nombre.toLowerCase().replace(' ', '.');

        // Agregamos un @, convertimos el nombre de la empresa en minúsculas, eliminamos los espacios
        // agregamos un punto y el dominio
        var empresaEmail = new StringBuilder();
        empresaEmail.append("@")
                .append(empresa.toLowerCase().replace(" ", ""))
                .append(".")
                .append(dominio);

        // Juntamos nombreEmail y empresaEmail
        var email = nombreEmail + empresaEmail;

        // Imprimimos el email
        System.out.println("email = " + email);
    }
}
