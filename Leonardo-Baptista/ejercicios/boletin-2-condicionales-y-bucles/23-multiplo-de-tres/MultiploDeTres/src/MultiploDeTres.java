import java.util.Scanner;

// 23.Pedir 5 números e indicar si alguno es múltiplo de 3.

public class MultiploDeTres {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    boolean esMultiplo = false;

    for(int i = 1; i<=5; i++) {
      System.out.println("Introduce el " + i + " numero:");
      int n = scan.nextInt();

      if(n % 3 == 0){
        esMultiplo = true;
      }
    }

    if(esMultiplo){
      System.out.println("Hay numeros multiplos de 3");
    } else {
      System.out.println("No hay numero multiplos de 3");
    }

    scan.close();
  }
}
