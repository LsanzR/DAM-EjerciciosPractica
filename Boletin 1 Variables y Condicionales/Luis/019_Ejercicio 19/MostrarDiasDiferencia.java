// Pedir dos fechas y mostrar el número de días que hay de diferencia. Suponiendo todos los meses de 30 días

import java.util.Scanner;

public class MostrarDiasDiferencia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Pedimos al usuario los numeros de las primeras fechas
        int dia1 = pedirDia(input);
        int mes1 = pedirMes(input);
        int año1 = pedirAño(input);

        // Pedimos al usuario los numeros de las primeras fechas
        int dia2 = pedirDia(input);
        int mes2 = pedirMes(input);
        int año2 = pedirAño(input);
        
        // Llamamos al metodo que calcula la diferencia de dias entre ambas fechas.
        calcularDiferenciaDias(dia1, dia2, mes1, mes2, año1, año2);

        input.close();
    }

    // Metodo para solicitar por consola el numero del dia
    public static int pedirDia(Scanner input){
        System.out.println("Introduce el numero del dia: ");
        return input.nextInt();
    }

    // Metodo para solicitar por consola el numero del mes
    public static int pedirMes(Scanner input) {
        System.out.println("Introduce el numero del mes: ");
        return input.nextInt();
    }

    // Metodo para solicitar por consola el numero del mes
    public static int pedirAño(Scanner input) {
        System.out.println("Introduce el numero del año");
        return input.nextInt();
    }     

    
    // Metodo con el que calculamos, segun los parametros de entrada de las fechas que ha introducido el usuario, la cantidad de dias de diferencia entre ambas fechas.
    public static int calcularDiferenciaDias(int dia1, int dia2, int mes1, int mes2, int año1, int año2) {
        int total_dias = (dia2 - dia1) + (30 * (mes2 - mes1) + (365 * (año2 - año1)));
        System.out.println("La diferencia de dias entre la primera fecha introducida y la segunda fecha introducida es: " + total_dias);
        return total_dias;
    }
}

