import java.util.Scanner;

// 04 Pedir dos números y decir si son iguales o no.

public class SonIguales {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n1, n2;

    System.out.println("Introduce el primer numero: ");
    n1 = scan.nextInt();

    System.out.println("Introduce el segundo numero: ");
    n2 = scan.nextInt();

    if(n1 == n2) {
      System.out.println("Los numero son iguales");
    } else {
      System.out.println("Los numero son completamente diferentes");
    }

    scan.close();

  }
}
