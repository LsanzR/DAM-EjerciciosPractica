import java.util.Scanner;

// 02. Pedir el radio de un circulo para calcular su area.

public class AreaCirculo {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    final double PI = Math.PI; // constante del numero PI
    double r, a; // radio y area del circulo.

    // pedimos el radio del circulo al usuario.
    System.out.println("Introduce el radio del circulo: ");
    r = scan.nextDouble();

    a = (Math.pow(r, 2)) * PI;

    System.out.println("El area del circulo es: " + a);

    scan.close();
  }
}
