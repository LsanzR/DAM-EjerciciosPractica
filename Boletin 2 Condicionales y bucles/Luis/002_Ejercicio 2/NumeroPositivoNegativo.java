// Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca un 0.

import java.util.Scanner;
public class NumeroPositivoNegativo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        signoNumero(input);

        input.close();
    }

    public static void signoNumero( Scanner input) {
        int numero;
        do { 
            System.out.println("Introduce un numero mayor al 0. Utiliza el 0 para salir del bucle");
            numero = input.nextInt();
            
            if (numero >= 1) {
                System.out.println("El numero es positivo");
            } else {
                System.out.println("El numero es negativo");
            }
        } while (numero != 0);
    }
}
