
// Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien...

import java.util.Scanner;

public class CorregirNotaSwitchEnteros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int numero = pedirNumero(input); // Variable que almacena el numero introducido por el usuario
        numero = validarNumero(numero, input); // Actualizamos y validamos la variable que contiene el numero
        System.out.println(corregirNmero(numero)); // Imprimimos por pantalla el resultado segun la nota


        input.close();
    }
    // Solicitamos al usuario una nota entre el 0 y el 10 SOLO ENTEROS
    public static int pedirNumero(Scanner input){
        System.out.println("Introduce un numero valido entre 0 y 10");
    return input.nextInt();
    }
    // Metodo ara validar que el numero introducido es correcto para el ejercicio
    public static int validarNumero(int numero, Scanner input) {
        while (numero < 0 || numero > 10) { // Si el numero no esta dentro de este rango volvemos a solicitarlo por pantalla
            System.out.println("El numero que has introducido no esta en el rango del ejercicio");
            numero = pedirNumero(input);
        } // Si es valido, continuamos el ejercicio
        System.out.println("El numero que has introducido es valido para resolver el ejercicio");
        return numero;
    }
    // Metodo para devolver el resultado del ejercicio
    public static String corregirNmero(int numero) {
        String nota = ""; // Variable que va a almacenar el resultado de la nota
        // Switch con el que vamos a trabajar los diferentes casos posibles de las notas. Siempre trabajando con enteros.
        switch (numero) {
            case 0,1,2,3,4 -> nota = "INSUFICIENTE";
            case 5 -> nota = "SUFICIENTE";
            case 6 -> nota = "BIEN";
            case 7,8 -> nota = "NOTABLE";
            case 9,10 -> nota = "SOBRESALIENTE";
            default -> nota = "Nota no valida";
        }
        return nota;
    }
}