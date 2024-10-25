// Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien...

import java.util.Scanner;

public class CorregirNotaIfElseEnteros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = pedirNumero(input);
        numero = validarNumero(numero, input);
        System.out.println(corregirNmero(numero));


        input.close();
    }
    // Solicitamos al usuario una nota entre el 0 y el 10
    public static int pedirNumero(Scanner input){
        System.out.println("Introduce un numero valido entre 0 y 10");
    return input.nextInt();
    }
    
    public static int validarNumero(int numero, Scanner input) {
        while (numero < 0 || numero > 10) {
            System.out.println("El numero que has introducido no esta en el rango del ejercicio");
            numero = pedirNumero(input);
        }
        System.out.println("El numero que has introducido es valido para resolver el ejercicio");
        return numero;
    }
    // Metodo para devolver la nota del ejercicio
    public static String corregirNmero(int numero) {
        String nota = ""; // Variable que va a almacenar el resultado de la nota
        // If else-if anidado para devolver el resultado del ejercicio segun la nota
        if (numero < 5) {
            nota = "Nota: Insuficiente";
        } else if (numero >= 5 && numero < 6){
            nota = "Nota: Suficiente";
        } else if (numero >= 6 && numero < 7) {
            nota = "Nota: Bien";
        } else if (numero >= 7 && numero < 9) {
            nota = "Nota: Notable";
        } else if (numero >= 9 && numero <= 10) {
            nota = "Nota: Sobresaliente";
        }
        return nota;
    }
}