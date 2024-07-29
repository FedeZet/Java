public class MasConcatenacionCadenas {
    public static void main(String[] args) {
        // Más formas de concatenar cadenas en Java
        var cadena1 = "Hola";
        var cadena2 = "Mundo";

        // 1ra Forma - Método común
        var cadena3 = cadena1 + " " + cadena2;
        System.out.println("cadena3 = " + cadena3);

        // 2da Forma - Método concat
        cadena3 = cadena1.concat(" ").concat("Mundo");
        System.out.println("cadena3 usando concat = " + cadena3);

        // 3ra Forma - Método StringBuilder
        var constructorCadena = new StringBuilder();
        // constructorCadena.append(cadena1);
        // constructorCadena.append(" ");
        // constructorCadena.append(cadena2);
        constructorCadena.append(cadena1).append(" ").append(cadena2);
        var resultado = constructorCadena.toString();
        System.out.println("resultado con StringBuilder = " + resultado);

        // 4ta Forma - Método StringBuffer
        var stringBuffer = new StringBuffer();
        // stringBuffer.append(cadena1);
        // stringBuffer.append(" ");
        //stringBuffer.append(cadena2);
        stringBuffer.append(cadena1).append(" ").append(cadena2);
        resultado = stringBuffer.toString();
        System.out.println("resultado con StringBuffer = " + resultado);

        // 5to Forma - Método join
        resultado = String.join(" ", cadena1, cadena2, "Adiós!");
        System.out.println("resultado con join = " + resultado);
    }
}
