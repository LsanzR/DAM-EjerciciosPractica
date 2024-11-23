import java.util.Scanner;

// 21.Pedir 10 números, y mostrar al final si se ha introducido alguno negativo.


public class AlgunoNegativo {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    boolean hayNegativo = false;

    for(int i = 1; i<=10; i++) {
      System.out .println("Introduce el " + i + " numero");
      int n = scan.nextInt();

      if(n < 0) {
        hayNegativo = true;
      }
    }

    if(hayNegativo) {
      System.out.println("Se han introducido numeros negativos.");
    } else {
      System.out.println("No se han introducido numeros negativos.");
    }
    
    scan.close();
  }
}
