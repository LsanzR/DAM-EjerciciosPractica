//  Pedir un número entre 0 y 99.999, decir si es capicúa.


import java.util.Scanner;


public class NumeroCapicua2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numero = pedirNumero(input); // Variable que almacena el numero introducido por el usuario
    numero = validarNumero(numero, input); // Variable validada y actualizada si es correcta
    int numeroReves =  reverseNumber(numero); // Variable que almacena el numero introducido por el usuario pero puesto del reves
    capicua(numero, numeroReves); // Metodo que nos va a devolver el resultado de si es capicua o no el numero introducido.

    input.close();

        }
    // Metodo para solicitar un numero al usuario
    public static int pedirNumero(Scanner input){
        System.out.println("Porfavor introduce un numero entre 0 y 99999 para saber si es capicua");
        return input.nextInt();
    }
    // Metodo con el que vamos a verificar que el numero introducido esta dentro del rango del ejercicio.
    public static int validarNumero (int numero, Scanner input) {
        while (numero < 0 || numero > 99999) { // Siempre que el numero sea menor a 0 o el numero sea mayor a 99999 lanza error por pantalla y vuelve a solicitar la entrada del numero
            System.out.println("El numero que has introducido no esta en el rango permitido del ejercicio.");
            numero = pedirNumero(input);
        }
        System.out.println("El numero que has introducido es valido para resolver el ejercicio");
        return numero;
     }
     // Metodo para poner del reves un numero
    public static int reverseNumber(int numero) {
        System.out.println("El numero que has introducido es : " + numero);
        int reverse = 0; // Variable que almacena el numero girado
        for (;numero != 0; numero /= 10) { // Bucle que se ejecuta mientras el numero sea diferente 0 y lo divide por 10 en cada iteracion
            int digito = numero % 10; // Variable local que almacena el resultado del modulo 10 del numero
            reverse = reverse * 10 + digito; // Devolvemos la variable como resultado de multiplicar la variable por 10 y sumarle la variable digito.
        }
        System.out.println("El numero del reves es : " + reverse);
        return reverse;
        
    }
    // Metodo para saber si el numero introducido es capicua
    public static void capicua(int numero, int numeroReves) {
        
        if (numero == numeroReves) { // Si el numero introducido es igual al numero del reves, entonces es capicua
            System.out.println("El numero que has introducido si es capicua");
            
        } else { // Si no es capicua lanzamos mensaje.
            System.out.println("El numero que has introducido no es capicua");
            
        }
    }
}