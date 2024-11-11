// Pedir números hasta que se introduzca uno negativo, y calcular la media.

import java.util.Scanner;
public class CalcularMediaNegativo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        int contador = 0; // Contador de los numeros validos.
        int suma = 0; // Variable para acumular la suma de los numeros

        do { 
            numero = pedirNumero(input, "Introduce un numero para calcular la media. Uno negativo para salir");
            if (numero >= 0) {
                suma += numero; // Acumula la suma de los numeros
                contador++; // Incrementa el contador
            }
            
            
        } while (numero >= 0);
        // Verifica si se han introducido numeros para evitar la division por 0
        if (contador > 0) {
            double media = (double) suma / contador; // Calcula la media asegurando que el resultado sea en decimal
            System.out.printf("La media de todos los números que has introducido es: %.1f%n", media); // Imprime la media con 2 decimales
        } else {
            System.out.println("No has introducido numeros positivos.");
        }
    }
    // Metodo para solicitar al usuario que introduzca los numeros
    public static int pedirNumero(Scanner input, String mensaje) {
        System.out.println(mensaje);
        return input.nextInt();
    }

}
