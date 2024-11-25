
// Pedir 15 numeros y escribir la suma total

import java.util.ArrayList;
import java.util.Scanner;

public class Suma15Numeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sumaTotal = 0;
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        System.out.println("Introduce 15 numeros");

        for (int i = 1; i <= 15; i++) {
            int numero = input.nextInt();
            sumaTotal = sumaTotal + numero;
            listaNumeros.add(numero);
        }
        System.out.println("El resultado de la suma de los numeros: " + listaNumeros + " es igual a: " + sumaTotal);
    }
}
