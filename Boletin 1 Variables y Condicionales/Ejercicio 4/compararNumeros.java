



// Pedir dos números y decir si son iguales o no.


import java.util.Scanner;
public class compararNumeros {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double numero1 = primerNumero(input);
    double numero2 = segundoNumero(input);
    imprimirComparacion(numero1, numero2);
    input.close();
    }

    public static double primerNumero(Scanner input) {
        System.out.println("Porfavor introduce el primer numero para realizar la comparacion : ");
        double numero1 = input.nextDouble();
        return numero1;
    }

    public static double segundoNumero(Scanner input) {
        System.out.println("Porfavor introduce el segundo numero para realizar la comparacion : ");
        double numero2 = input.nextDouble();
        return numero2;
    }
    public static void imprimirComparacion(double numero1, double numero2) {
        if (numero1 == numero2) {
            System.out.println("Los numeros son iguales");
        } else {
            System.out.println("Los numeros son diferentes");
        }

    }
}
