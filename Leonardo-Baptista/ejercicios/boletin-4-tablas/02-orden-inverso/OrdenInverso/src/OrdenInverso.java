import java.util.Scanner;

// 2. Leer 5 números y mostrarlos en orden inverso al introducido.

public class OrdenInverso {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int[] n = new int[5];

    for(int i=0; i<5; i++) {
      System.out.println("Introduce el " + (i + 1) + " numero:");
      n[i] = scan.nextInt();
    }

    System.out.println("Los numeros introducidos son:");
    for(int j=4; j>=0; j--) {
      System.out.println(n[j]);
    }

    scan.close();
  }
}
