//  Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos.

import java.util.Scanner;

public class SumInputNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int suma = 0; // Variable que almacena la suma de los numeros
        int numero; 
        do { // Bucle do-while para sumar todos los numeros hasta que se ingrese el numero 0
            System.out.println("Introduzca un numero: ");
            numero = pedirNumero(input);
            suma = suma + numero;
            
        } while (numero != 0);
            System.out.println("La suma de todos los numeros que has introduco es: " + suma);


        input.close();
    }
    // Metodo con el que solicitamos el numero a traves de la pantalla al usuario.
    public static int pedirNumero(Scanner input) {
        return input.nextInt();
    }
    
}
