import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ordenarTresNumeros2 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    ArrayList<Integer> numeros = new ArrayList();
    // Llamar al metodo para pedir numeros
    pedirNumeros(input, numeros);

    // Ordenar el ArrayList de menor a mayor
    Collections.sort(numeros); // Ordenamos el ArrayList de menor a mayor numero
    System.out.println("El ArrayList con los numeros ordenados es: " + numeros); // Imprimimos el resultado del ArrayList ordenado

   }
   // Metodo que va a pedir la cantidad de numeros que va a contener el ArrayList y cuales van a ser esos numeros.
   public static void pedirNumeros(Scanner input, ArrayList<Integer> listaNumeros) {
    System.out.println("Cuantos numeros vas a introducir? : "); 
    int cantidad = input.nextInt(); // Cantidad de numeros que va a contener el ArrayList

    for (int i = 0; i < cantidad; i++) { // Bucle en el que vamos a pedir que por cada iteracion agregue el numero al array siempre que el numero del indice del bucle no supere a la cantidad de numeros que va a contener el ArrayList
        System.out.println("Porfavor, introduce un numero: ");
        int numero = input.nextInt();
        listaNumeros.add(numero); // Agregamos el numero al ArrayList
    }
   }
}