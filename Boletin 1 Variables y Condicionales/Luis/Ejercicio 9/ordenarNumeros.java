// Pedir dos números y mostrarlos ordenados de mayor a menor.




import java.util.Arrays;
import java.util.Scanner;
public class ordenarNumeros {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        int numero1 = primerNumero(input);
        int numero2 = segundoNumero(input);
        unificarYOrdenarNumeros(numero1, numero2);
        input.close();
    }
    // Solicitar al usuario el primer numero a traves de la consola
    public static int primerNumero(Scanner input){
        System.out.println("Porfavor introduce el primer numero");
        int numero = input.nextInt();
        return numero;
    }
    // Solicitar al usuario el primer numero a traves de la consola
    public static int segundoNumero(Scanner input) {
        System.out.println("Porfavor introduce el primer numero");
        int numero = input.nextInt();
        return numero;
    }
    // Metodo para unificar y ordenar el array de menor numero a mayor numero
    public static void unificarYOrdenarNumeros (int numero1, int numero2) {
        // Inicializamos el array con un index = 2
        int[] numeros = new int[2];
        
        // Implementamos los valores a la lista
        numeros[0] = numero1;
        numeros[1] = numero2;
        System.out.println("La lista sin estar ordenada es: " + Arrays.toString(numeros));
        
        // Ordenar numeros utilizando Arrays.toString(array) porque si no lo hiciesemos asi, lo que nos devuelve por consola es la ubicacion de la memoria donde esta alojado este array.
        Arrays.sort(numeros);
       System.out.println("Array ordenado : " + Arrays.toString(numeros));

        }
    }


