//  Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56 mostrar: cincuenta y seis

import java.util.Scanner;

public class NumeroEscrito {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = pedirNumero(input, "Introduce un numero valido entre 0 y 99");

        if (numero < 0 || numero > 99) { // Si el numero no esta dentro del rango del ejercicio:
            System.out.println("El numero introducido no esta dentro del rango permitido");
        } else {
            System.out.println("El numero escrito es: " + convertirNumeroATexto(numero));
        }
        input.close();
    }
    // Metodo para pedir el numero por pantalla
    public static int pedirNumero(Scanner input, String mensaje) {
        System.out.println(mensaje);
        return input.nextInt();
    }
    // Metodo con el que vamos a convertir el numero en digitos al numero escrito
    public static String convertirNumeroATexto(int numero) {

        String[] unidades = {
            "cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez",
            "once", "doce", "trece", "catorce", "quince", "dieciseis", "diecisiete", "dieciocho", "diecinueve"
        };

        String[] decenas = {
            "", "", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"
        };
        // Si el numero esta dentro de las unidades
        if (numero < 20) {
            return unidades[numero];
        } else if (numero < 30) { // Si el numero esta dentro de la veintena
           return numero == 20 ? "veinte" : "veinti" + unidades[numero % 10];
        } else { // Si el numero esta por encima del 30 inclsive
            int decena = numero / 10;
            int unidad = numero % 10;
            if (unidad == 0) {
                return decenas[decena];
            } else {
                return decenas[decena] + " y " + unidades[unidad];
            }
        }
    }
}
