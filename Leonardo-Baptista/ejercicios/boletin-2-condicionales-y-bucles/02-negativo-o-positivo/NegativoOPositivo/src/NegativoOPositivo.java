import java.util.Scanner;

// Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca un 0.

public class NegativoOPositivo {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n;

    System.out.println("Introduce un numero: ");
    n = scan.nextInt();

    while(n != 0) {

      if(n >= 0){
        System.out.println("Numero positivo");
        System.out.println("Introduce otro numero: ");
        n = scan.nextInt();
      } else if(n < 0 ) {
        System.out.println("Numero negativo");
        System.out.println("Introduce otro numero: ");
        n = scan.nextInt();
      } else {
        System.out.println("Error!");
      }
      
    }

    scan.close();
  }
}
