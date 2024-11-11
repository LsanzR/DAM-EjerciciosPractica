


// Pedir dos números y decir si son iguales o no.


import java.util.Scanner;
public class compararNumeros {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double numero1 = primerNumero(input); // Solicitamos al usuario que introduzca el primer numero de la comparacion a traves del metodo.
    double numero2 = segundoNumero(input); // Solicitamos al usuario que introduzca el segundo numero de la comparacion a traves del metodo.
    imprimirComparacion(numero1, numero2); // Metodo que compara los dos numeros introducidos por el usuario.
    input.close(); // Cerramos la lectura del terminal.
    }
    // Metodo con el que solicitamos al usuario que introduzca el primer numero
    public static double primerNumero(Scanner input) {
        System.out.println("Porfavor introduce el primer numero para realizar la comparacion : ");
        double numero1 = input.nextDouble();
        return numero1;
    }
    // Metodo con el que solicitamos al usuario que introduzca el segundo numero.
    public static double segundoNumero(Scanner input) {
        System.out.println("Porfavor introduce el segundo numero para realizar la comparacion : ");
        double numero2 = input.nextDouble();
        return numero2;
    }
    // Metodo con el que realizamos la comparacion de ambos numeros.
    public static void imprimirComparacion(double numero1, double numero2) {
        // la comparacion la realizamos a traves de un if-else.
        if (numero1 == numero2) { // Si son iguales :
            System.out.println("Los numeros son iguales");
        } else { // Si no :
            System.out.println("Los numeros son diferentes");
        }

    }
}
