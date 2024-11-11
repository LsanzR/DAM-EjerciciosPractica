import java.util.Scanner;


public class MostrarDiasDiferencia2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicitamos al usuario la primera fecha
        System.out.println("Introduce la primera fecha: ");
        int[] fecha1 = pedirFecha(input);

        // Solicitamos al usuario la segunda fecha
        System.out.println("Introduce la segunda fecha: ");
        int[] fecha2 = pedirFecha(input);

        // Calculamos y mostramos la diferencia en dias
        int diferenciaDias = calcularDiferenciaDias(fecha1[0], fecha2[0], fecha1[1], fecha2[1], fecha1[2], fecha2[2]);
        System.out.println("La diferencia de dias entre ambas fechas es: " + diferenciaDias);


        input.close();
    }
    public static int[] pedirFecha(Scanner input) {
        int[] fecha = new int[3];
        fecha[0] = pedirNumero(input, "Introduce el numero del dia (1-30)", 1, 30);
        fecha[1] = pedirNumero(input, "Introduce el numero del mes (1-12)", 1, 12);
        fecha[2] = pedirNumero(input, "Introduce el numero del año, POSITIVO", 1, Integer.MAX_VALUE);
        return fecha;

    }
    // Metodo con el que pedimos el numero y aplicamos las condiciones para saber si el numero esta dentro del rango del ejercicio.
    public static int pedirNumero(Scanner input, String mensaje, int min, int max) {
        int numero; // Declaramos variable local que contiene el numero
        do { 
            System.out.println(mensaje);
            numero = input.nextInt();
            if (numero < min || numero > max) {
                System.out.println("Valor fuera de rango.");
            }
        } while (numero < min || numero > max);
        return numero;
    }
    // Metodo con el que calculamos el total de dias a partir de la fecha y los restamos entre ambos. El resultado de la resta es un valor absoluto, sin simbolo.
    public static int calcularDiferenciaDias(int dia1, int dia2, int mes1, int mes2, int año1, int año2) {
        int totalDias1 = dia1 + (mes1 * 30) + (año1 * 365); // Numnero total de dias de la primera fecha
        int totalDias2 = dia2 + (mes2 * 30) + (año2 * 365); // Numero total de dias de la segunda fecha
        return Math.abs(totalDias2 - totalDias1); // Valor absoluto de la resta de ambas fechas
    }
}
