import java.util.Scanner;

// 09 Pedir dos números y mostrarlos ordenados de mayor a menor.

public class OrdenMayorMenor {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int a,b;

    System.out.println("Introduce el primer numero:");
    a = scan.nextInt();

    System.out.println("Introduce el segundo numero:");
    b = scan.nextInt(); 

    if(a > b) {
      System.out.println( a + " " + b );
    } else {
      System.out.println( b + " " + a );
    }

    scan.close();
  }
}
