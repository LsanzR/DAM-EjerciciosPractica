// Pedir una nota numérica entera entre 0 y 10, y mostrar dicha nota de la forma: cero, uno, dos, tres...

import java.util.Scanner;
public class NotaNumericaEnPalabra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nota = pedirNota(input, "Introduce la nota numerica (0-10)", 0, 10);
        System.out.println(gestorNota(nota));
    
        input.close();
    }

    // Metodo para pedir la nota del ejercicio
    public static int pedirNota(Scanner input, String mensaje, int min, int max) {
        int numero;
        while (true) {
            System.out.println(mensaje);
            try {
                numero = Integer.parseInt(input.nextLine());
                if (numero >= min || numero <= max) {
                    return numero;
                } else {
                    System.out.println("Valor fuera del rango del ejercicio");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Introduce un numero valido.");
            }
        }
    }
    // Gestionamos los casos con un swift para cada una de las posibilidades del ejercicio y una posibilidad default en caso de fallo.
    public static String gestorNota(int nota) {
        String notaPalabra = "";
        switch (nota) {
            case 1 -> notaPalabra = "Uno";
            case 2 -> notaPalabra = "Dos";
            case 3 -> notaPalabra = "Tres";
            case 4 -> notaPalabra = "Cuatro";
            case 5 -> notaPalabra = "Cinco";
            case 6 -> notaPalabra = "Seis";
            case 7 -> notaPalabra = "Siete";
            case 8 -> notaPalabra = "Ocho";
            case 9 -> notaPalabra = "Nueve";
            case 10 -> notaPalabra = "Diez";

            default -> System.out.println("El numero no esta dentro del rango permitido");
        }
        return notaPalabra;

    }
}