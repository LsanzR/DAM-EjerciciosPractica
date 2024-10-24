



// Pedir un número e indicar si es positivo o negativo.



import java.util.Scanner;

public class compararSignoNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double numero = solicitarNumero(input); // Inicializamos la variable numero con el metodo para solicitar el numero.
        imprimirSignoNumero(numero); // Comparamos el signo del numero con la variable numero.
        input.close(); // Cerramos la lectura de la consola.
    }

    // Metodo para solicitar al usuario un numero
    public static double solicitarNumero(Scanner input) {
        System.out.println("Por favor introduce un número, ya sea positivo o negativo: ");
        return input.nextDouble();
    }

    // Metodo con el que comparamos el numero para saber si es positivo o negativo.
    public static void imprimirSignoNumero(double numero) {
        // Comparamos el numero con un if-else if, ya que 0 lo consideramos neutro.
        if (numero < 0) {
            System.out.println("El número que has introducido es negativo.");
        } else if(numero > 0) {
            System.out.println("El número que has introducido es positivo.");
        } else { // Consideramos el 0 como un valor neutro, ni positivo ni negativo.
            System.out.println("El numero que has introducido es neutro.");
        }
    }
}
