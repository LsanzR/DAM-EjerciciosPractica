import java.util.Scanner;

// 12.Pedir un número y calcular su factorial.

public class CalcularFactorial {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Introduce un numero: ");
    int n = scan.nextInt();


    for(int i = n-1; i > 0; i--) {
      n *= i;
    }

    System.out.println("El factorial es el siguiente: " + n);



    scan.close();
  }
}
