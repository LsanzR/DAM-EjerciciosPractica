// Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.

import java.util.Scanner;

public class ConteoNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero; // Incializamos la variable que va a contener la llamada del metodo
        int contador = 0; // Variable global que va a almacenar las veces que se ha introducido un numero
        do { // Bucle do - while para repetir el ejercicio.
            numero = pedirNumero(input);
            if (numero >= 0) { // Si el numero es mayor que 0, aumentamos en 1 el contador
                contador++;
            } else {
                System.out.println("El numero que has introducido es negativo.Saliendo del ejercicio.");
                break; // Break para salir del statement
            }
        } while (numero >= 0); // Condicion para que el bucle se repita. Si no se cumple, termina el ejercicio y muestra la cantidad de numeros introducidos.
        System.out.println("Se han introducido un total de " + contador + " numeros");

        input.close();
    }

    // Metodo para solicitar por pantalla el numero
    public static int pedirNumero(Scanner input) {
        System.out.println("Introduce un numero: ");
        return input.nextInt();
    }


}
