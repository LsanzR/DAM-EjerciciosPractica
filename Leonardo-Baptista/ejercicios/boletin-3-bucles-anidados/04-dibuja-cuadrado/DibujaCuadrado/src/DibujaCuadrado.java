import java.util.Scanner;

// 4. Dibuja un cuadrado de n elementos de lado utilizando *.

public class DibujaCuadrado {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int n;

    System.out.println("Introduce el numero de * que quieres que contenga el cuadrado: ");
    n = scan.nextInt();

    for(int i = 0; i<n; i++) {
      System.out.print("* ");
      for(int j = 1; j<n; j++){
        System.out.print("* ");
      }
      System.out.print("\n");
    }
    scan.close();
  }
}
