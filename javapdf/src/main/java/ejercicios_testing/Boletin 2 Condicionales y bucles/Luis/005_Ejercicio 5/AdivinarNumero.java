/*
Realizar un juego para adivinar un número. Para ello pedir un número N, y luego ir pidiendo
números indicando “mayor” o “menor” según sea mayor o menor con respecto a N. El proceso termina
cuando el usuario acierta.
 */

import java.util.Random;
import java.util.Scanner;


public class AdivinarNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        // Limites inferior y superior para el numero random
        int numeroMinimo = numeroMinimo(input);
        int numeroMaximo = numeroMaximo(input);
        
        // Generar un numero aleatorio dentro del rango minimo y maximo especificado
        int numeroRandom = random.nextInt(numeroMinimo,numeroMaximo + 1);

        // Llamamos al metodo para comprar los numeros
        compararNumeros(numeroRandom, input);
        input.close();
    }
   
    // Metodo para solicitar por pantalla un numero dentro del rango establecido
    public static int pedirNumero(Scanner input, int numeroMinimo, int numeroMaximo) {
        int numero;
        do { 
            System.out.println("Introduce un numero del " + numeroMinimo + " al numero maximo " + numeroMaximo +  " para el juego de adivinar el numero");
            numero = input.nextInt();
            if (numero < numeroMinimo || numero > numeroMaximo) {
                System.out.println("Porfavor introduce un numero que este dentro del rango.");
            }
        } while (numero < numeroMinimo || numero > numeroMaximo);
        return numero;
    }

     // Metodo para establecer un numero maximo en el juego
     public static int numeroMaximo(Scanner input) {
        System.out.println("Introduce el numero maximo en el que se ejecutara el juego de adivinanza");
        return input.nextInt();
    }

     // Metodo para establecer un numero minimo en el juego
     public static int numeroMinimo(Scanner input) {
        System.out.println("Introduce el numero minimo en el que se ejecutara el juego de adivinanza");
        return input.nextInt();
    }
    
    // Metodo para comparar los numeros y permanecer en el bucle si no ha acertado, o salir del bucle si el usuario acierta el numero
    public static void compararNumeros(int numeroRandom, Scanner input) {
        int numero;
        do { 
            numero = pedirNumero(input, numeroRandom, numeroRandom);
            if (numero > numeroRandom) {
                System.out.println("El numero que has introducido es mayor que el numero aleatorio");
            } else {
                System.out.println("El numero que has introducido es menor que el numero aleatorio");
            }
        } while (numero != numeroRandom);

        System.out.println("Has acertado el juego de Adivinar el numero, el numero aleatorio era " + numeroRandom);
    }
}