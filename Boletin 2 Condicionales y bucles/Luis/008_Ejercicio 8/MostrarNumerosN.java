// Pedir un numero N, y mostrar todos los numeros del 1 al N


import java.util.Scanner;

public class MostrarNumerosN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroN = pedirNumero(input, "Introduce un numero para mostrar todos los valores entre 1 y ese numero");

        for (int i = 1; i <= numeroN; i++) { // Bucle for en el que iteramos en cada indice desde 1 hasta numeroN
            System.out.println(i);
        }

    }
    // Metodo para solicitar al usuario el numeroN del ejercicio
    public static int pedirNumero(Scanner input, String mensaje){
        System.out.println(mensaje);
        return input.nextInt();
    }
 }


