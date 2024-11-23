import java.util.Scanner;

// 1. Leer 5 números y mostrarlos en el mismo orden introducido.

public class MostrarOrden {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int[] n = new int[5];

    for(int i = 0; i < 5; i++ ) {
      System.out.println("Introduce el " + (i + 1) + " numero: ");
      n[i] = scan.nextInt();
    }
    System.out.println("Has introducido estos numeros: ");
    for(int j=0; j<5; j++) {
      System.out.println(n[j]);
    }


    scan.close();
  }
}
