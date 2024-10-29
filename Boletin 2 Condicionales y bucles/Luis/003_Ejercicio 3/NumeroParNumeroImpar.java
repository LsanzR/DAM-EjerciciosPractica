// Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.

import java.util.Scanner;

public class NumeroParNumeroImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero; // Inicializamos la variable que contendra el resultado de la llamada al metodo
        do { // Bucle do - while Primero ejecutamos el bucle una iteracion y luego comprobamos la condicion del bucle
            numero = pedirNumero(input); // Damos valor a la variable numero
            if (numero != 0) { // Si el numero es diferente de 0 realizamos el bucle
                String variableParImpar = parImpar(numero, input);
                System.out.println(variableParImpar);
            } else { // Si introduce 0, ejecutamos por pantalla una frase
                System.out.println("Saliendo del ejercicio");
            }
        } while (numero != 0); // Condicion del bucle 
        input.close();
        
    }
    // Metodo con el que se solicita el numero a traves de pantalla
    public static int pedirNumero(Scanner input) {
        System.out.println("Introduce un numero para saber si es par o impar. Introduce 0 para salir del ejercicio");
        return input.nextInt();
    }
    // Metodo con el que vamos a resolver si el numero es par o impar
    public static String parImpar(int numero, Scanner input){
        if (numero % 2 == 0) {
            return "El numero " + numero + " es par";
        } else {
            return "El numero " + numero + " es impar";
        }
     }
}
