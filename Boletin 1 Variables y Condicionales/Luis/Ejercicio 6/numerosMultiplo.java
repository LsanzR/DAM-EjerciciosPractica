// Pedir dos números y decir si uno es múltiplo del otro.

import java.util.Scanner;
public class numerosMultiplo {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int numero1 = primerNumero(input); // Inicilizamos la variable numero1 con la llamada al metodo para solicitar un numero al usuario
        int numero2 = segundoNumero(input); // Inicilizamos la variable numero2 con la llamada al metodo para solicitar un numero al usuario
        multiploPrimerNumeroSegundoNumero(numero1, numero2);


        input.close();
    }
    // Metodo con el que solicitamos al usuario el primer numero 
    public static int primerNumero(Scanner input) {
        System.out.println("Porfavor introduce el primer numero");
        int numero = input.nextInt();
        return numero;
    }
    // Metodo con el que solicitamos al usuario el segundo numero 
    public static int segundoNumero(Scanner input) {
        System.out.println("Porfavor introduce el segundo numero");
        int numero = input.nextInt();
        return numero;
    }

    // Metodo con el que vamos a comprobar si el primer numero es multiplo del segundo numero.
    public static void multiploPrimerNumeroSegundoNumero(int numero1, int numero2) {
        // Utilizamos un if-else para saber si es multiplo
        if (numero1 % numero2 == 0) { // Es multiplo si la division del numero1 por el numero2 es igual a 0
            System.out.println("El primer numero " + numero1 + " es multiplo del segundo numero " + numero2);
        } else { // Si no es como el if ejecutamos el siguiente codigo.
            System.out.println("El primer numero " + numero1 +  " no es multiplo del segundo numero " + numero2);
        }
    }
}
