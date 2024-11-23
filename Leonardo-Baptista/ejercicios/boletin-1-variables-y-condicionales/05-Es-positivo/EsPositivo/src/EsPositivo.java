import java.util.Scanner;

// 05 Pedir un número e indicar si es positivo o negativo.

public class EsPositivo {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    System.out.println("Introduce un numero positivo o negativo: ");
    int n = scan.nextInt();

    if( n < 0 ) {
      System.out.println("El numero que has introducido es Negativo.");
    } else {
      System.out.println("El numero que has introducido es positivo.");

    }

    scan.close();
  }
}
