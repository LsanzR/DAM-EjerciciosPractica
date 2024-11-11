// Pedir el radio de una circunferencia y calcular su longitud.
import java.util.Scanner;
public class calcularLongitud {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Llamadas a los metodos del ejercicio
        double radio = pedirRadio(input);
        imprimirLongitud(radio);
        // Cerramos la lectura de la consola.
        input.close();
    }
    // Metodo con el que solicitamos al usuario el radio.
    public static double pedirRadio(Scanner input) {
        System.out.println("Porfavor introduce el radio de la circunferencia para calcular su longitud : ");
        double radio = input.nextDouble();
        return radio;

    }
    // Metodo con el que calculamos a partir del radio la longitud del circulo
    public static void imprimirLongitud(double radio) {
        final double pi = Math.PI;
        double longitud = 2 * pi * radio;
        System.out.println("La longitud del circulo es : " + longitud);


    }
}
