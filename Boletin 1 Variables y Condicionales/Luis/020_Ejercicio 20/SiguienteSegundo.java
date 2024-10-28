// Pedir una hora de la forma hora, minutos y segundos, y mostrar la hora en el segundo siguiente.

import java.util.Scanner;

public class SiguienteSegundo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] horaActual = pedirHoraCompleta(input); // Pedimos por pantalla la hora actual en hora, minutos y segundos
        int[] horaSiguiente = calcularSegundoSiguiente(horaActual); // Calculamos a partir de horaActual cual es la hora en el siguiente segundo
        System.out.printf("La hora actual es: %02d:%02d:%02d%n",horaActual[0],horaActual[1],horaActual[2]); // Mostramos por pantalla la hora actal
        System.out.printf("La hora en el segundo siguiente es: %02d:%02d:%02d%n",horaSiguiente[0],horaSiguiente[1],horaSiguiente[2]); // Mostramos por pantalla la hora en el segundo siguiente


        input.close();
    }
    // Metodo con el que vamos a solicitar por pantalla rellenar los campos de hora, minutos y segundos.
    public static int[] pedirHoraCompleta(Scanner input) {
        int[] hora = new int[3];

        // Pedimos la hora, los minutos y los segundos con minimos y maximos
        hora[0] = pedirNumero(input, "Introduce la hora (0-23)", 0, 23);
        hora[1] = pedirNumero(input, "Introduce los minutos (0-59)", 0, 59);
        hora[2] = pedirNumero(input, "Introduce los segundos (0-59)",0 ,59);

        return hora;
        
     }
     // Metodo con el que pedimos el numero y aplicamos las condiciones para saber si el numero esta dentro del rango del ejercicio.
     public static int pedirNumero(Scanner input, String mensaje, int min, int max) {
        int numero;
        while (true) {
            System.out.println(mensaje); 
            try {
                numero = Integer.parseInt(input.nextLine()); // Se lee y se convierte el numero a entero
                if (numero >= min && numero <= max) {
                    return numero; // Devuelve el numero si esta dentro del rango aceptado por el ejercicio.
                } else {
                    System.out.println("Valor fuera del rango");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Introduce un numero valido.");
            }
        }
    }
    // Metodo para calcular la hora en el siguiente segundo
    public static int[] calcularSegundoSiguiente(int[] horaActual) {
        int horas = horaActual[0];
        int minutos = horaActual[1];
        int segundos = horaActual[2];

        // Aumentamos los segundos de uno en uno
        segundos++;
        
        // Comprobamos si hay que ajustar los minutos y las horas
        if (segundos == 60) {
            segundos = 0;
            minutos++;
            if (minutos == 60) {
                minutos = 0;
                horas++;
                if (horas == 24) {
                    horas = 0; // Despues de las 23:59:59 se pasa a 0 media noche
                }
            }
        }
        return new int[]{horas,minutos,segundos};
    }

}
