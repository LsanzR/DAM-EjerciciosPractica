// Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 días. Sin años bisiestos

import java.util.Scanner;
public class DiasMesesReales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroDia = pedirDia(input); // Inicializamos la variable con el retorno del metodo pedirDia
        int numeroMes = pedirMes(input); // Inicializamos la variable con el retorno del metodo pedirMes
        int numeroAño = pedirAño(input); // Inicializamos la variable con el retorno del metodo pedirAño
        validarFecha(numeroDia, numeroMes, numeroAño); // Validamos las condiciones que deben tener los dias, meses y años en la fecha para que sea correcta


        input.close();
    }
    // Metodo para solicitar el numero del dia por consola
    public static int pedirDia(Scanner input) {
        System.out.println("Introduce el numero del dia :");
        return input.nextInt();
    }
    // Metodo para solicitar el numero del mes por consola
    public static int pedirMes(Scanner input) {
        System.out.println("Introduce el numero del mes :");
        return input.nextInt();
    }
    // Metodo para solicitar el numero del año por consola
    public static int pedirAño(Scanner input) {
        System.out.println("Introduce el numero del año :");
        return input.nextInt();
    }
    // Metodo para validar si la fecha es correcta, segun la cantidad de dias que contenga un mes
    public static void validarFecha(int numeroDia, int numeroMes, int numeroAño) {
        if (numeroAño == 0) { // Vamos a programar que el año 0 no existe
            System.out.println("La fecha no es correcta.");

        } else if (numeroMes == 2 && (numeroDia >= 1 && numeroDia <= 28)) { // Para febrero que es el mes que tiene 28 dias sin contar años bisiestos.
            System.out.printf("La fecha es correcta: %02d/%02d/%04d%n", numeroDia, numeroMes, numeroAño);

        } else if ((numeroMes == 4 || numeroMes == 6 || numeroMes == 9 || numeroMes == 11) && (numeroDia >= 1 && numeroDia <= 30)) { // Para los meses que contienen 30 dias
            System.out.printf("La fecha es correcta: %02d/%02d/%04d%n", numeroDia, numeroMes, numeroAño);

        } else if ((numeroMes == 1 || numeroMes == 3 || numeroMes == 5 || numeroMes == 7 || numeroMes == 8 || numeroMes == 10 || numeroMes == 12) && (numeroDia >= 1 && numeroDia <= 31)) { // Para los meses que contienen 31 dias
            System.out.printf("La fecha es correcta : %02d/%02d/%04d%n", numeroDia, numeroMes, numeroAño);

        } else {
            System.out.println("Has introducido mal los valores para la fecha");
        }
    }
}
