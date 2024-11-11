// Pedir un unmero entre 0 y 9.999 y decir cuantas cifras tiene.

import java.util.Scanner;

public class contarCifras {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numero = pedirNumero(input);
    comprobarNumero(numero, input);
    int cifras = devolverCifras(numero);
    System.out.println("El numero " + numero + " tiene " + cifras + " cifras");

    
    input.close();
    }
    // Metodo para solicitar un numero comprendido entre 0 y 9.999
    public static int pedirNumero(Scanner input) {
        System.out.println("Introduce un numero comprendido entre 0 y 9.999 : ");
        int numero = input.nextInt();
        return numero;
    }
        // Vamos a comprobar con un metodo que el numero que se ha introducido cumple los requisitos.@interface
        public static void comprobarNumero(int numero, Scanner input){ 
            if (numero >= 0 && numero <= 9999) { // Para comprobar que el numero introducido esta dentro del rango
                System.out.println("El numero es valido.");
            } else { // Si el numero introducido no es correcto, volvemos a pedir que se introduzca un numero valido
                System.out.println("Has introducido un numero que no es correcto. Porfavor vuelve a introducirlo.");
                numero = pedirNumero(input);
                comprobarNumero(numero, input);
            }
        }
        // Metodo con el que vamos a devolver el numero de cifras transformandolo a una cadena de texto y contando su longitud
        public static int devolverCifras (int numero){    
            String numeroStr = Integer.toString(numero);
            return numeroStr.length();
        }
    }



