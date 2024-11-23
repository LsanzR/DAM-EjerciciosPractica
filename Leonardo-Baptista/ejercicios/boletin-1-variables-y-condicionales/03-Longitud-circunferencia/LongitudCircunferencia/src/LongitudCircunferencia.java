import java.util.Scanner;

// 03. Pedir el radio de una circunferencia y calcular su longitud.

public class LongitudCircunferencia {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    double r, l; // radio y longitud de la circunferencia.
    final double PI = Math.PI;

    System.out.println("Introduce el radio de la circunferencia: ");
    r = scan.nextDouble();

    l = (r*2) * PI; 

    System.out.println("La longitud de la circunferencia es la siguiente: " + l);

    scan.close();

  }
}
