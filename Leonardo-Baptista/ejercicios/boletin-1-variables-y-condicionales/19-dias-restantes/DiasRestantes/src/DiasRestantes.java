import java.util.Scanner;

// 19.Pedir dos fechas y mostrar el número de días que hay de diferencia. Suponiendo todos los meses de 30 días.

public class DiasRestantes {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);


    System.out.println("Introduce la primera fecha: ");

    System.out.println("Introduce un dia valido: ");
    int diaF1 = scan.nextInt();

    System.out.println("Introduce un mes valido: ");
    int mesF1 = scan.nextInt();

    System.out.println("Introduce un año valido: ");
    int añoF1 = scan.nextInt();


    System.out.println("Introduce la segunda fecha: ");

    System.out.println("Introduce un dia valido: ");
    int diaF2 = scan.nextInt();

    System.out.println("Introduce un mes valido: ");
    int mesF2 = scan.nextInt();

    System.out.println("Introduce un año valido: ");
    int añoF2 = scan.nextInt();

    int diasRestantes = ((añoF2 - añoF1) * 365) + ((mesF2 - mesF1) * 30) + (diaF2 - diaF1);

    System.out.println(diasRestantes);

    scan.close();
  }
}
