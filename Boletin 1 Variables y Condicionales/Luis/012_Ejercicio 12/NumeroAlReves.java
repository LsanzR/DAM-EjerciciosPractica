// Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés.

import java.util.Scanner;


public class NumeroAlReves {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numero = pedirNumero(input); // Inicializamos la variable numero a la solicitud de que el usuario ingrese un numero valido
    validarNumero(numero, input); // Llamamos al metodo que comprueba que el numero es valido
    invertirNumero(numero); // Llamamos al metodo que invierto el numero
    System.out.println("El numero invertido es : " + invertirNumero(numero));
}
// Metodo con el que solicitamos un numero entre 0 y 9999
public static int pedirNumero(Scanner input) {
    System.out.println("Introduce un numero valido: ");
    int numero = input.nextInt();
    return numero;
    }
    // Validamos que el numero cumple con las condiciones del ejercicio, estar en rango de 0 a 9999, si no es asi, vuelve a solicitarse
    public static void validarNumero (int numero, Scanner input) {
       if (numero >= 0 && numero <= 9999) {
        System.out.println("El numero que has introducido es valido para el ejercicio");
       } else {
        System.out.println("Has introducido un numero fuera del rango permitido. Vuelve a intenarlo.");
        numero = pedirNumero(input);
        validarNumero(numero, input);
       }
    }

    // Metodo con el que invertimos el numero, 
    public static int invertirNumero(int numero) {
        int invertido = 0;
        while (numero > 0) {
            int ultimoDigito = numero % 10; // El ultimo digito del resultado del modulo 10 del numero
            invertido = (invertido * 10) + ultimoDigito; 
            numero = numero / 10;
        }
        return invertido;

    }
}
