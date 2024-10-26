// Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo todos los meses de 30 días.

import java.util.Scanner;

public class FechaCorrecta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creamos el objeto input de la clase Scanner para leer el terminal
        int dia = pedirDia(input);
        dia = validarNumerosDias(dia, input);  // Validamos y actualizamos el valor de la variable dia

        int mes = pedirMes(input);
        mes = validarNumerosMes(mes, input); // Validamos y actualizamos el valor de la variable mes

        int año = pedirAño(input);
        año = validarNumeroAño(año, input); // Validamos y actualizamos el valor de la variable mes

        System.out.printf("La fecha que has introducido es: %02d/%02d/%04d%n", dia, mes, año); // printf para aplicar el formato de dos digitos a los dias y los meses en caso de que sean inferiores a numeros de dos digitos.

        input.close();
    }
    // Metodo con el que solicitamos el dia del dia
    public static int pedirDia(Scanner input) {
        System.out.println("Introduce un numero entre el rago 1 a 30 para los dias");
        return input.nextInt();
    }
    // Metodo con el que solicitamos el numero del mes
    public static int pedirMes(Scanner input) {
        System.out.println("Introduce un numero entre el rango 1 a 12 para los meses");
        return input.nextInt();
    }
    // Metodo con el que solicitamos el numero del año 
    public static int pedirAño(Scanner input) {
        System.out.println("Introduce un numero positivo para el año, siendo el año maximo el actual (2024)");
        return input.nextInt();
    }

    // Metodo para validar que el numero de los dias esta dentro del rango del ejercicio
    public static int validarNumerosDias(int dia, Scanner input) {
        while (dia <= 0 || dia >= 30) {
            System.out.println("Has introducido un numero de dia incorrceto. Solo se acepta el rango del numero 1 al numero 30");
            System.out.print("Vuelve a introducirlo en un formato correcto: ");
            dia = pedirDia(input);
        }
        return dia;
    }

    // Metodo para validar que el numero del mes esta dentro del rango permitido
    public static int validarNumerosMes(int mes, Scanner input) {
        while (mes <= 0 || mes >= 12) {
            System.out.println("Has introducido un numero de mes incorrecto. Solo se acepta un rango de 1 a 12.");
            System.out.println("Vuelve a introducirlo en un formato correcto");
            mes = pedirMes(input);
        }
        return mes;
        }
        
    // Metodo para validar que los años estan dentro del rango logico permitido. 
    public static int validarNumeroAño(int año, Scanner input) {
        while (año < 0 || año > 2024) {
            System.out.println("Has introducido un numero del año incorrecto. Solo se acepta un numero dentro del rango 0 a 2024 incluidos.");
            System.out.println("Vuelve a introducirlo en un formato correcto");
            año = pedirAño(input);
        }
        return año;
    }
} 
