// Pedir dos números y decir cual es el mayor.

import java.util.Scanner;
public class numeroMayor {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int numero1 = primerNumero(input);
        int numero2 = segundoNumero(input);
        esEsMayor(numero1, numero2);

        input.close();
    }

    public static int primerNumero(Scanner input) {
        System.out.println("Introduce el primer numero de la comparacion");
        int numero = input.nextInt();
        return numero;
    }

    public static int segundoNumero(Scanner input) {
        System.out.println("Introduce el segundo numero de la comparacion");
        int numero = input.nextInt();
        return numero;
    }


    public static void esEsMayor(int numero1, int numero2) {
        if (numero1 > numero2) {
            System.out.println("El primer numero " + numero1 + " es mayor que el segundo numero " + numero2);
        } else if(numero1 < numero2) {
            System.out.println("El primer numero " + numero1 + " es menor que el segundo numero " + numero2);
        }
    }
}
