import java.util.Scanner;

// 3. Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.

public class ParOImpar {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n;

    System.out.println("Introduce un numero: ");
    n = scan.nextInt();

    while(n != 0){
      if(n % 2 == 0){
        System.out.println("Numero par");
        System.out.println("Introduce otro numero: ");
        n = scan.nextInt();
      } else if(n % 2 != 0) {
        System.out.println("Numero impar");
        System.out.println("Introduce otro numero: ");
        n = scan.nextInt();
      } else {
        System.out.println("Error!");
      }
    }

    scan.close();

  }
}
