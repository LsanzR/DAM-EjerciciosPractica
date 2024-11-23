import java.util.Scanner;

// 8. Pedir un número N, y mostrar todos los números del 1 al N.

public class MostrarNumero {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n;

    System.out.println("Introduce un numero: ");
    n = scan.nextInt();

    for(int i = 1; i <= n; i++) {
      System.out.println(i);
    }

    scan.close();
  }
}
