// Pedir dos números y mostrarlos ordenados de mayor a menor.

import java.util.ArrayList;
import java.util.Collections;
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
        // Creamos un ArrayList para almacenar posteriormente los numeros.
        ArrayList<Integer> arrayNumeros = new ArrayList<>();
        
        // Implementamos los valores a la lista
        arrayNumeros.add(numero1);
        arrayNumeros.add(numero2);

        System.out.println("La lista desordenada es: " + arrayNumeros);
        Collections.sort(arrayNumeros); // Utilizamos la libreria Collections y la funcion sort para ordenar los valores que tiene el ArrayList
        System.out.println("La lista ordenada es: " + arrayNumeros);
        
        //

        }
    }


