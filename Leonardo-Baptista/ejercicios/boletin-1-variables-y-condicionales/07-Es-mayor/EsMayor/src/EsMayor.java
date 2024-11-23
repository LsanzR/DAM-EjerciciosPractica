import java.util.Scanner;

// 07 Pedir dos números y decir cual es el mayor.

public class EsMayor {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int n1, n2;

    System.out.println("Introduce el primer numero: ");
    n1 = scan.nextInt();

    System.out.println("Introduce el segundo numero: ");
    n2 = scan.nextInt();

    if(n1 > n2) {
      System.out.println("El numero mayor es: " + n1);
    } else {
      System.out.println("El numero mayor es: " + n2);
    }

    scan.close();
  }
}
