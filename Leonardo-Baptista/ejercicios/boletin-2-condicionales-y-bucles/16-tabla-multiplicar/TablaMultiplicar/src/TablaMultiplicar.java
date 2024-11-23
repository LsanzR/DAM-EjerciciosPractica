import java.util.Scanner;

// 16.Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho número.

public class TablaMultiplicar {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n;

    do {
      System.out.println("Introduce un numero entre 0 y 10");
      n = scan.nextInt();
    } while( !(n >= 0 && n <= 10));

    for(int i = 0; i < 11; i++) {
      System.out.println(n + " x " + i + " = " + n*i);
    }

    scan.close();
  }
}
