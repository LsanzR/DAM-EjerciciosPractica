//  Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo.

import java.util.Scanner;

public class MostrarCuadradoNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double numero;

       do {
            System.out.println("Introduce un numero positivo. Utiliza uno negativo para salir del ejercicio");
            numero = input.nextDouble();

            if (numero >= 0) {
                double cuadrado = Math.pow(numero, 2);
                System.out.println("El numero" + numero + " al cuadrado es: " + cuadrado);
            }
       } while (numero >= 0);
        System.out.println("Numero negativo ingresado, saliendo del ejercicio");
        input.close();

       
    }
 }
    
